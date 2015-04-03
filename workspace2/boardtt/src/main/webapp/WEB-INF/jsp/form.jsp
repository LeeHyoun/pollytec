<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>form</title>
</head>
<body>
<form:form modelAttribute="user" autocomplete="off" 
	method="post" action="formact">
name : <form:input path="name"/><br>
<form:errors path="name"/><br>
age : <form:input path="age"/><br>
<form:errors path="age"/><br>
gender: 남 <form:radiobutton path="gender" value="male"/>
/ 여 <form:radiobutton path="gender" value="female"/><br>
<form:errors path="gender"/><br>
email : <form:input path="email"/><br>
<form:errors path="email"/><br>
<input type="submit" value="확인">
</form:form>
</body>
</html>