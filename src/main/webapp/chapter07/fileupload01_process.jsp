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
		String name=(String)request.getAttribute("name");
		String subj=(String)request.getAttribute("subject");
		String file=(String)request.getAttribute("file");
	%>
	
	
	<p> 이름:<%=name %>
	<p> 제목:<%=subj %>
	<p> 파일:<%=file %>
	<img src="img/<%=file %>" >	
</body>
</html>