<%@page import="chapter16.exam16_5"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.*" import="jakarta.servlet.http.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%	
		ArrayList arr=(ArrayList)request.getAttribute("arr");
		for(int i=0;i<arr.size();i++){
			String member[]=(String[])arr.get(i);
			out.println(member[0]);
			out.println(member[1]);
			out.println(member[2]+"<br>");
		}
	%>
	
</body>
</html>