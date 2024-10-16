<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form name="loginForm" action="8-3" method="post" id="LoginForm">
	<p> 아이디:<input type="text" name="id" id="id">
	<p> 비밀번호:<input type="password" name="passwd" id="pass">
	<p> 이름:<input type="text" name="name" id="name">
	<p> <input type="button" value="전송" id="butt" >
	</form>
	
	<script type="text/javascript">
	let submit=document.querySelector("#butt");
	submit.addEventListener("click",checkLogin);
	function checkLogin(){
		let name=document.querySelector("#name");
		let id=document.querySelector("#id");
		let pw=document.querySelector("#pass");
		let form=document.querySelector("#LoginForm");
		console.log("ii");
		if(id.value.length<4||id.value.length>12){
			alert("아이디는 4~12자 이내로 입력 가능하다.");
			return;
		}
		if(!isNaN(name.value.substr(0,1))){
			alert("이름은 숫자로 시작할 수 없습니다!");
			
			return;
		}
		if(pw.value<4){
			alert("비밀번호는 4글자 이상이여야 한다.");
			
			return;
		}
		form.submit();
		console.log("oo")
	}
	
	
	
	</script>
</body>
</html>