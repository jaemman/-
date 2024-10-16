package chapter08;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@WebServlet("/8-3")
public class exam08_3 extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		RequestDispatcher rs=req.getRequestDispatcher("chapter08/validation03.jsp");
		rs.forward(req, resp);
		System.out.println("도착.get");
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("도착.post");
		String x=req.getParameter("id");
		String y=req.getParameter("passwd");
		String z=req.getParameter("name");
		req.setAttribute("id", x);
		req.setAttribute("pw", y);
		req.setAttribute("name", z);
		RequestDispatcher rs=req.getRequestDispatcher("chapter08/validation03_process.jsp");
		rs.forward(req, resp);
	}

}
