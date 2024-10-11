package chapter05;

import java.io.IOException;

import jakarta.security.auth.message.callback.PrivateKeyCallback.Request;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@WebServlet("/5-1")
public class exam05_1 extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("포스트 접근");
		String id=req.getParameter("id");
		String pass=req.getParameter("passwd");
		req.setAttribute("id", id);
		req.setAttribute("pass", pass);
		RequestDispatcher ds=req.getRequestDispatcher("/chapter05/request01_process.jsp");
		ds.forward(req, resp);
	}

}
