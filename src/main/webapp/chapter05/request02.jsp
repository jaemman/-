<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table border=1>
	<%
		Enumeration en=request.getHeaderNames();
		
	while(en.hasMoreElements()){
			String headerName=(String) en.nextElement();
			String headerValue=request.getHeader(headerName);
		
	%>
	<tr>
	<td><%=headerName %></td> <td> <%=headerValue %></td> <br>
	<tr>
	<%
		}
	%>
	</table>
</body>
</html>