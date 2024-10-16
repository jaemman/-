<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form name="loginForm" action="8-5" method="post" id="LoginForm">
	<p> 아이디:<input type="text" name="id" id="id">
	<p> 비밀번호:<input type="password" name="passwd" id="pass">
	<p> 이름:<input type="text" name="name" id="name">
	<p> 연락처:<select name="phone1" id="phone1">
		<option value="010">010</option>
		<option value="011">011</option>
		<option value="016">016</option>
		<option value="017">017</option>
	</select>-<input type="text" name="phone2" id="phone2">-<input type="text" name="phone3" id="phone3">
	<p> 이메일:<input type="email" name="email">
	<p> <input type="button" value="전송" id="butt" >
	</form>
	<script type="text/javascript">
		let but=document.querySelector("#butt");
		but.addEventListener("click",checkMember);
		function checkMember(){
			let regExpId=/^[a-z|A-Z|ㄱ-ㅎ|ㅏ-ㅣ|가-힣]/;
			let regExpName=/^[가-힣]*$/;
			let regExpPasswd=/^[0-9]*$/;
			let regExpPhone=/^\d{3}-\d{3,4}-\d{4}$/;
			
			let form=document.querySelector("#LoginForm");
			
			let id=document.querySelector("#id").value;
			let pw=document.querySelector("#pass").value;
			let name=document.querySelector("#name").value;
			let phone=document.querySelector("#phone1").value+"-"+document.querySelector("#phone2").value+"-"+document.querySelector("#phone3").value;
			
			if(!regExpId.test(id)){
				alert("아이디는 문자로 시작해라");
				id.select();
				return;
			}
			if(!regExpName.test(name)){
				alert("이름은 한글만 입력해라");
				return;
			}
			if(!regExpPasswd.test(pw)){
				alert("비번은 숫자만 입력해라");
				return;
			}
			if(!regExpPhone.test(phone)){
				alert("연락처 입력 확인해라");
				return;
			}
			form.submit();
		}
	
	
	</script>
</body>
</html>