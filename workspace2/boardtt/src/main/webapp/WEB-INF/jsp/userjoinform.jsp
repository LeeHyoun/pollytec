<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
	<title>회원가입</title>
<!-- Bootstrap -->
    <link href="/board/css/bootstrap.min.css" rel="stylesheet">
	<script src="/board/js/bootstrap.min.js"></script>
	<!-- jquery -->
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
</head>
<body>
	<form class = "col-md-6 col-md-offset-3" method="post" action="/board/userjoin">
	<h1>회원가입</h1>
		ID : <input type="text" name="idtxt"><br>
		PW : <input type="password" name="pwtxt"><br>
		이름: <input type="text" name="nametxt"><br>
		생년 <select name="birthyy"><option value="1990">1990</option><option value="1991">1991</option></select>
		생월 <select name="birthmm"><option value="1">1</option><option value="15">15</option><option value="30">30</option></select><br>
		e-mail <input type="text" name="emailtxt"> @ <select name="emailselect"><option value="1">naver.com</option><option value="2">gmail.com</option></select><br>
		<input type="submit" value="확인">
	</form>

</body>
</html>