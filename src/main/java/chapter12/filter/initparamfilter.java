package chapter12.filter;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.FilterConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;

public class initparamfilter implements Filter{

		private FilterConfig filterConfig=null;

	

	@Override
	public void init(FilterConfig filterConfig) throws ServletException 
	{
		
		System.out.println("Filter02 초기화");
		this.filterConfig=filterConfig;
	}
	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)throws IOException, ServletException 
	{
	System.out.println("filter02 실행");
	
	String id=request.getParameter("id");
	String passwd=request.getParameter("passwd");
		
	String param1=filterConfig.getInitParameter("param1");	
	String param2=filterConfig.getInitParameter("param2");
	
	String message;
	
	response.setCharacterEncoding("utf-8");
	response.setContentType("text/html; cahrset=utf-8");
	PrintWriter writer=response.getWriter();
	
	if(id.equals(param1)&&passwd.equals(param2)) {
		message="로그인 성공했습니다";
		request.setAttribute("message",message);
		System.out.println("로그인성공");
	}else {
		message="로그인 실패했습니다" ;
		request.setAttribute("message",message);
		System.out.println("로그인실패");
	}
	writer.println(message);
	
	chain.doFilter(request, response);
	}
	@Override
	public void destroy() 
	{
		System.out.println("filter02 해제");
		
	}
}
