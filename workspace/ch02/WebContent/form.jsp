<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

<form method="post" action="/ch02/FormServlet">
	text :  <input type="text" name="value1"><br>
	암호 :  <input type="password" name="value2"><br>
	
	checkbox1 : <input type="checkbox" name="value3" value="1"><br>
	checkbox2 : <input type="checkbox" name="value3" value="2" checked="checked"><br>
	
	radio1 : <input type="radio" name="value4" value="r1"><br>
	radio2 : <input type="radio" name="value4" value="r2" checked="checked"><br>
	
	<select name="value5">
	<option value="1">a</option>
	<option value="2">b</option>
	</select><br>
	
	<textarea name="value6" rows="5" cols="50"></textarea><br>
	
	<input type="submit" value="확인">
	<input type="reset" value="취소">
</form>
</body>
</html>