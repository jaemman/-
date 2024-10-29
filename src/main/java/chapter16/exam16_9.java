package chapter16;

import java.io.IOException;
import chapter16.exam16_repo;
import java.sql.*;
import java.util.ArrayList;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@WebServlet("/16-9")
public class exam16_9 extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		RequestDispatcher rs=req.getRequestDispatcher("chapter16/delete02.jsp");
		rs.forward(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String id=req.getParameter("id");
		String pass=req.getParameter("pass");
		String name=req.getParameter("name");
		String[] member= {id,pass,name};
		System.out.println(member);
		exam16_repo ex16=exam16_repo.getInstance();
		ex16.deletemem(member);		
		resp.sendRedirect("16-5");
	}
}