package chapter08;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@WebServlet("/8-2")
public class exam08_2 extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		RequestDispatcher rs=req.getRequestDispatcher("chapter08/validation02.jsp");
		rs.forward(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String x=req.getParameter("id");
		String y=req.getParameter("passwd");
		req.setAttribute("id",x);
		req.setAttribute("pass", y);
		RequestDispatcher rs=req.getRequestDispatcher("chapter08/validation02_process.jsp");
		rs.forward(req, resp);
	}

}