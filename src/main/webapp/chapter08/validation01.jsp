<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form name="loginForm" >
	<p> 아이디:<input type="text" name="id" id="id">
	<p> 비밀번호:<input type="password" name="passwd" id="passwd">
	<p> <input type="submit" value="전송" id="submit" >
	
	</form>
	
	<script type="text/javascript">
	var submit=document.querySelector("#submit");
	submit.addEventListener("click",checkForm);
	
	function checkForm(){
		
		alert("아이디 : "+document.querySelector("#id").value +"\n"+"비밀번호 :" +document.querySelector("#passwd").value)
		console.log("aaa")
	}


</script>
	
</body>
</html>