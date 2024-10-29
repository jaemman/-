<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.sql.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		Connection conn=null;
		try{
			
		String url="jdbc:mysql://localhost:3306/bookkk";
		String id="root";
		String pass="1234";
		
		Class.forName("com.mysql.jdbc.Driver");
		conn=DriverManager.getConnection(url,id,pass);
		out.println("데이터베이스 연결 성공!");
		
		}
		catch(SQLException e){out.println("데이터베이스 연결 실패<br>");
			out.println(e.getMessage());}
		finally{
			if(conn!=null){
				conn.close();
			}
			if(conn==null){
				out.println("비었는디");
			}
		}
	%>
</body>
</html>