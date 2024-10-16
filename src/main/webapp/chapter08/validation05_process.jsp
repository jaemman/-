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
		String pw=(String)request.getAttribute("pw");
		String name=(String)request.getAttribute("name");
		String email=(String)request.getAttribute("email");
		String phone1=(String)request.getAttribute("phone1");
		String phone2=(String)request.getAttribute("phone2");
		String phone3=(String)request.getAttribute("phone3");
		
	%>
	<p><%=id %>
	<p><%=pw %>
	<p><%=name %>
	<p><%=email %>
	<p><%=phone1 %>-<%=phone2 %>-<%=phone3 %>
</body>
</html>