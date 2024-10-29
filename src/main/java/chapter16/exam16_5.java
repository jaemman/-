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
@WebServlet("/16-5")
public class exam16_5 extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		exam16_repo ex16=exam16_repo.getInstance();
		ArrayList arr=ex16.selectmem();
		req.setAttribute("arr", arr);
		RequestDispatcher rs=req.getRequestDispatcher("chapter16/select2.jsp");
		rs.forward(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		

	}
}