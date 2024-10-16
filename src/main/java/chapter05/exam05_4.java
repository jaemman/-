package chapter05;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@WebServlet("/5-4")
public class exam05_4 extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("utf-8");
		String id=req.getParameter("id");
		String pass=req.getParameter("passwd");
		//전처리
		System.out.println(id);
		System.out.println(pass);
		if(id.equals("관리자")&&pass.equals("1234")) {
			resp.sendRedirect("chapter05/response01_success.jsp");
			//redirect로 바로 jsp와 연결이 안되기때문에 컨트롤러로 이동이 되어야 한다. 잘못된 코드임.
		}else {
			resp.sendRedirect("chapter05/response01_failed.jsp");
		}
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doPost(req, resp);
	}

}
