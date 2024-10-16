<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form name="loginForm" action="8-4" method="post" id="form">
	<p> 아이디:<input type="text" name="id" id="id">
	<p> 비밀번호:<input type="password" name="passwd" id="passwd">
	<p> <input type="button" value="전송" id="sub" >
	</form>
	<script type="text/javascript">
	
	
	let butt=document.querySelector("#sub");
	butt.addEventListener("click",checkLogin);
	function checkLogin(){
		let form=document.querySelector("#form")
		let id=document.querySelector("#id");
		let pw=document.querySelector("#passwd");	
		for(i=0; i<id.value.length;i++){
			let ch=id.value.charAt(i);
			
			if((ch<'a'||ch>'z')&&(ch>'A'||ch<'Z')&&(ch>'0'||ch<'9')){
				alert("아이디는 영문 소문자만 입력 가능하다.");
				id.select();
				return;
			}
		}
		
		if(isNaN(pw.value)){
			alert("비밀번호는 숫자만 입력 가능합니다!")
			pw.select();
			return;
		}
		form.submit();
	}
	
	</script>
</body>
</html>