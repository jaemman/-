<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"  %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
	int a=(int)request.getAttribute("num1"); 
	int b=(int)request.getAttribute("num2");
	%>
	<% try{%><%=a/b %> 
	
	<%} catch(Exception exception){ %><p><%=exception %>
	<p><%=exception.getClass().getName()%>
	<p><%=exception.getMessage() %>
	<%} %>
</body>
</html>