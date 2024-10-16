<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form name="loginForm" action="8-2" method="post" id="LoginForm">
	<p> 아이디:<input type="text" name="id" id="id">
	<p> 비밀번호:<input type="password" name="passwd" id="passwd">
	<p> <input type="button" value="전송" id="butt" >
	
	</form>
	
	<script type="text/javascript">
	
	let butt=document.querySelector("#butt");
	let pw=document.querySelector("#passwd");
	let id=document.querySelector("#id");
	butt.addEventListener("click",checkLogin)
	function checkLogin(){
		let form=document.querySelector("#LoginForm")	
		if(id.value==""){
			alert("아이디를 입력해주세욧");
			id.focus();
			return false;
		}else if(pw.value==""){
			alert("비번을 입력하세욧");
			pw.focus();
			return false;
		}
		form.submit();
		
	}
	
	
	</script>
</body>
</html>