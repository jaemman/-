<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<p> 사용자명:<%=request.getRemoteUser() %>
	<p> 인증방법:<%=request.getAuthType() %>
	<p> 인증한 사용자명이 역할명 "manager"에 속하나?
	<%=request.isUserInRole("manager") %>
	<p> 인증한 사용자명이 역할명 "guest"에 속하나?
	<%=request.isUserInRole("guest") %>
</body>
</html>