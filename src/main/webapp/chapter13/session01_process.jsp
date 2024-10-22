<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	<h4>-------세션 삭제 전---------</h4>
	<%
		session=request.getSession(false);
		String name;
		String value;
		int i=0;
		
		Enumeration en=session.getAttributeNames();
		while(en.hasMoreElements()){
			i++;
			name=en.nextElement().toString();
			value=session.getAttribute(name).toString();
			out.println("설정된 세션의 속성 이름["+i+"]"+name+"<br>");
			out.println("설정된 세션의 속성 값 ["+i+"]"+value+"<br>");
		}
	
		
		String id=(String)session.getAttribute("id");	
		String pw=(String)session.getAttribute("pw");
		
		int time=session.getMaxInactiveInterval()/60;
		
		out.println("세션 유효시간"+time+"분 <br>");
		session.setMaxInactiveInterval(60*60);
		time=session.getMaxInactiveInterval();
		out.println("바꾼 세션 유효시간"+time+"<br>");
		
		String seid=session.getId();
		long last=session.getLastAccessedTime();
		long start=session.getCreationTime();
		long used=(last-start)/6000;
		out.println(seid+"<br>");	
		out.println(used+"<br>");
		out.println(start+"<br>");
		out.println(last+"<br>");
	if(id.equals("admin")&&pw.equals("1234")){
	%>	
	<p><%=id %>	
	<p><%=pw %>
	
	<%
	} else{
		out.println("세션 설정에 실패하셨습니다.");
	}
	session.removeAttribute("id");
	%>
	
	<h4>-------------id 삭제 후------------</h4>
	
	<%
		String name2;
		String value2;
		Enumeration en2=session.getAttributeNames();
		while(en2.hasMoreElements()){
			name2=en2.nextElement().toString();
			value2=session.getAttribute(name2).toString();
			out.println(name2+"<br>");
			out.println(value2+"<br>");
		}
		session.invalidate();
	%>
	
	<h4>------------세션 삭제 후---------- </h4>
	<%
			if(request.isRequestedSessionIdValid()){
				out.print("세션이 유효하다.");
			}else{
				out.print("세션이 유효하지 않다.");
			}
	
	%>
	
</body>
</html>