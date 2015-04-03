<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>form</title>
</head>
<body>
<form method="post" action="formact">
name : <input type="text" name="name"><br>
age : <input type="text" name="age"><br>
gender: 남 <input type="radio" value="male" name="gender">/ 여<input type="radio" value="female" name="gender"><br>
email : <input type="text" name="email"><br>
<input type="submit" value="확인">
</form>
</body>
</html>