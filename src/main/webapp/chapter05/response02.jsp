<%@page import="org.apache.catalina.connector.Response"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<p>이 페이지는 5초마다 새로고쳐짐</p>
	<% 
		response.setIntHeader("Refresh", 5);
	%>
	<p><%= (new java.util.Date()) %>
</body>
</html>