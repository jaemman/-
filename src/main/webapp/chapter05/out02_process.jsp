<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		String x=(String)request.getAttribute("id");
		String y=(String)request.getAttribute("pw");
	
	%>
	
	<p> 아이디 :<%out.print(x); %>
	<p> 비밀번호 :<%out.print(y); %>
</body>
</html>