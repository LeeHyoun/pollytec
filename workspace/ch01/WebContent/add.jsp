<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>POST 방식</title>
</head>
<body>
	<form method="POST" action="/ch01/AddServlet">
		<input type="text" name="value1"><br>
		<input type="text" name="value2"><br>
		
		<input type="submit" value="post">
	</form>
</body>
</html>