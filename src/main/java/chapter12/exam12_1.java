package chapter12;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@WebServlet("/12-1")
public class exam12_1 extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		RequestDispatcher rs=req.getRequestDispatcher("chapter12/filter01.jsp");
		rs.forward(req, resp);
				
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			String name=req.getParameter("name");
			
			req.setAttribute("name", name);
			RequestDispatcher rs=req.getRequestDispatcher("chapter12/filter01_process.jsp");
			rs.forward(req, resp);
	}
	
	
}
