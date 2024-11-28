<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="/mini.gg/resources/css/login.css">
<script src="/mini.gg/resources/js/jquery-3.7.1.min.js"></script>
<script src="/mini.gg/resources/js/myJS.js"></script>
<script>

</script>
</head>

<div class="banner">
     <a href="/mini.gg">
     <img src="/mini.gg/resources/images/mini.gg.logo.png" style="width: 120px; height: 30px;" >
     </a>
</div>

<body>
	<header>
	
	</header>
	<section>
		<div align="center">
			<br>
			<hr>
			<h2>로그인</h2>
			<hr>
			<br>
			<form name="loginForm" action="/mini.gg/loginProcess.do" method="post"
			 	  onsubmit="return checkForm()">
				<table>
					<tr>
						<th>아이디</th>
						<td>
						<input type="text" id="id-name" name="id-name" placeholder="ID를 입력하세요" required>
					</tr>
					<tr>
						<th>비밀번호</th>
						<td>
							<input type="text" id="pw-name" name="pw-name" placeholder="PWD를 입력하세요" required>
						</td>
					</tr>
				</table>
				<br>
				<input type="submit" value="로그인" >
			</form>
		</div>
	</section>
	<footer>

	</footer>
</body>
</html>