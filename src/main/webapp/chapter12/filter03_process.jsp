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
		String id=(String)request.getAttribute("id");
		String pass=(String)request.getAttribute("pass");
		String message=(String)request.getAttribute("message");
	%>
	<p><%=message %>
	<p>아이디:<%=id %>
	<p>비번:<%=pass %>
</body>
</html>