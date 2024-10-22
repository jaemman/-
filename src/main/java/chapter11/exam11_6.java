package chapter11;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@WebServlet("/11-6")
public class exam11_6 extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		RequestDispatcher rs=req.getRequestDispatcher("chapter11/trycatch.jsp");
		rs.forward(req, resp);
				
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			int num1=Integer.parseInt(req.getParameter("num1"));
			int num2=Integer.parseInt(req.getParameter("num2"));
			req.setAttribute("num1", num1);	
			req.setAttribute("num2", num2);
		try {						
				System.out.println(num1/num2);
				}catch (Exception e) {
					
					RequestDispatcher rs=req.getRequestDispatcher("chapter11/trycatch_error.jsp");
					rs.forward(req, resp);
				}
		
	}
	
	
}
