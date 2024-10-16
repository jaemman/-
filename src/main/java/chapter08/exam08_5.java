package chapter08;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@WebServlet("/8-5")
public class exam08_5 extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		RequestDispatcher rs=req.getRequestDispatcher("chapter08/validation05.jsp");
		rs.forward(req, resp);
		
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String a=req.getParameter("id");
		String b=req.getParameter("passwd");
		String c=req.getParameter("name");
		String d=req.getParameter("email");
		String e=req.getParameter("phone1");
		String f=req.getParameter("phone2");
		String g=req.getParameter("phone3");
		
		req.setAttribute("id", a);
		req.setAttribute("pw", b);
		req.setAttribute("name", c);
		req.setAttribute("email", d);
		req.setAttribute("phone1", e);
		req.setAttribute("phone2", f);
		req.setAttribute("phone3", g);
		
		RequestDispatcher rs=req.getRequestDispatcher("chapter08/validation05_process.jsp");
		rs.forward(req, resp);
	}

}
