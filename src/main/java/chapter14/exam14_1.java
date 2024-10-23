package chapter14;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
@WebServlet("/14-1")
public class exam14_1 extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		RequestDispatcher rs=req.getRequestDispatcher("chapter14/cookie01.jsp");
		rs.forward(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String id=req.getParameter("id");
		String pw=req.getParameter("pw");
		
		if(id.equals("admin")&&pw.equals("1234")) {
			Cookie cookid=new Cookie("id",id);
			Cookie cookpw=new Cookie("pw",pw);
			resp.addCookie(cookid);
			resp.addCookie(cookpw);
			}
			req.setAttribute("id", id);
		RequestDispatcher rs=req.getRequestDispatcher("chapter14/cookie01_process.jsp");
		rs.forward(req, resp);
	}

}
