<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<jsp:useBean id="person" class="chapter04.person" />
	<jsp:setProperty name="person" property="id" value="20230824" />
	<jsp:setProperty name="person" property="name" value="홍홍홍" />
	<jsp:getProperty name="person" property="id" />
	<jsp:getProperty name="person" property="name"/>
</body>
</html>