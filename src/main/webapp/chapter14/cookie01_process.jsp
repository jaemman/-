<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="jakarta.servlet.http.Cookie"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		String id=(String)request.getAttribute("id");
		if(id.equals("admin")){
			out.println("쿠키 생성이 성공했습니다.<br>");
			out.println(id+"님 환영합니다!<br>");	
		}else{
			out.println("쿠키 생성에 실패하셨습니다<br>");
		}
	
		
	%>
	
	========================================================<br>

	<%
		Cookie[] cookies=request.getCookies();
		out.println("현재 지정된 쿠키의 갯수"+cookies.length+"<br>");
		out.println("===============================================<br>");
		
		for(int i=0;i<cookies.length;i++){
			out.println("설정된 쿠키의 속성 이름"+cookies[i].getName()+"<br>");
			out.println("설정된 쿠키의 속성 값"+cookies[i].getValue()+"<br>");
			out.println("====================================<br>");
		}
		
	%>


	
</body>
</html>