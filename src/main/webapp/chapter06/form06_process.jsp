<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.*" import="java.io.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table border="1">
		<tr>
			<th> 요청 파라미터 이름</th>
			<th> 요청 파라미터 값 </th>
		</tr>
		<%
			request.setCharacterEncoding("utf-8");
			
		
			Enumeration paramNames=request.getParameterNames();
			while(paramNames.hasMoreElements()){
				String name=(String)paramNames.nextElement();
				out.print("<tr><td>"+name+"</td>\n");
				String paramvalue=request.getParameter(name);
				out.println("<td>"+ paramvalue +"</td></tr>\n");
				
			}
				
		%>
	
	
	
	</table>
</body>
</html>