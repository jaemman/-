package chapter06;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@WebServlet("/6-1")
public class exam06_1 extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		RequestDispatcher rs=req.getRequestDispatcher("chapter06/form01.jsp");
		rs.forward(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String a=req.getParameter("id");
		String b=req.getParameter("passwd");
		String c=req.getParameter("sex");
		String[] d= {req.getParameter("phone1"),req.getParameter("phone2"),req.getParameter("phone3")};
		String[] e= req.getParameterValues("hobby");
		String f=req.getParameter("comment");
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		for(int i=0;i<d.length;i++) {
			System.out.print(d[i]);
		}
		System.out.println();
		for(int i=0;i<e.length;i++) {
			if(e[i]!=null) {
				System.out.println(e[i]);
			}
		}
		System.out.println(f);
	}

}
