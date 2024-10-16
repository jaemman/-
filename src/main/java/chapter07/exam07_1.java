package chapter07;

import java.io.IOException;
import java.util.Enumeration;

import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@WebServlet("/7-1")
public class exam07_1 extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		RequestDispatcher rs=req.getRequestDispatcher("chapter07/fileupload01.jsp");
		rs.forward(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//전처리
		String save = req.getServletContext().getRealPath("img");
		MultipartRequest multi=new MultipartRequest(req,save,5*1024*1024,"utf-8",new DefaultFileRenamePolicy());
		//직접 하나씩 처리하는 경우
		String name=multi.getParameter("name");
		String subject=multi.getParameter("subject");
		String file=multi.getFilesystemName("filename");
		
		req.setAttribute("name", name);
		req.setAttribute("subject",subject);
		req.setAttribute("file", file);
		//다같이 처리하는 경우
		System.out.println(save);
		
		RequestDispatcher rs=req.getRequestDispatcher("chapter07/fileupload01_process.jsp");
		rs.forward(req, resp);
	}

}
