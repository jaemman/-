<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table border="1">
		<tr>
			<th width="100">이름</th>
			<th width="100">제목</th>
			<th width="200">파일</th>
			
		</tr>
		
		<%
			out.print("<tr><td>" +request.getAttribute("name1")+"</td>");
			out.print("<td>" +request.getAttribute("subject1")+"</td>");
			out.print("<td>"+request.getAttribute("filename1")+"</td></tr>\n");
			out.print("<tr><td>" +request.getAttribute("name2")+"</td>");
			out.print("<td>" +request.getAttribute("subject2")+"</td>");
			out.print("<td>"+request.getAttribute("filename2")+"</td></tr>\n");
			out.print("<tr><td>" +request.getAttribute("name3")+"</td>");
			out.print("<td>" +request.getAttribute("subject3")+"</td>");
			out.print("<td>"+request.getAttribute("filename3")+"</td></tr>\n");
		%>
		
	</table>
</body>
</html>