package chapter07;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.util.*;
import java.io.*;
import com.oreilly.*;
import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;
@WebServlet("/7-2")
public class exam07_2 extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		RequestDispatcher rs=req.getRequestDispatcher("chapter07/fileupload02.jsp");
		rs.forward(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String save = req.getServletContext().getRealPath("img");
		MultipartRequest multi=new MultipartRequest(req,save,5*1024*1024,"utf-8",new DefaultFileRenamePolicy());
		
		System.out.println(save);
		
		String name1=multi.getParameter("name1");
		String subject1=multi.getParameter("subject1");
		String filename1=multi.getFilesystemName("filename1");
		String name2=multi.getParameter("name2");
		String subject2=multi.getParameter("subject2");
		String filename2=multi.getFilesystemName("filename2");
		String name3=multi.getParameter("name3");
		String subject3=multi.getParameter("subject3");
		String filename3=multi.getFilesystemName("filename3");
		
		req.setAttribute("name1",name1);
		req.setAttribute("subject1", subject1);
		req.setAttribute("filename1", filename1);
		req.setAttribute("name2",name2);
		req.setAttribute("subject2", subject2);
		req.setAttribute("filename2", filename2);
		req.setAttribute("name3",name3);
		req.setAttribute("subject3", subject3);
		req.setAttribute("filename3", filename3);
		
		RequestDispatcher rs=req.getRequestDispatcher("chapter07/fileupload02_process.jsp");
		rs.forward(req, resp);
	}

}
