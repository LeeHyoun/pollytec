<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>회원가입</title>

</head>
<body>
	<form method="post" action="/addMember/AddMem">
		아이디 :		<input type="text" name="id"><br>
		비밀번호 :	<input type="password" name="pwd"><br>
		이름 :		<input type="text" name="name"><br>
		이메일 :		<input type="text" name="email"><br>
		
		생년월일 :
		<select name="selYear">
		<%for(int i=2015; i >= 1950; i--){
			%>
			<option value="<%=i%>"><%=i%></option>년
			<% 
		}//for%>
		</select>
		<select name="selMonth">
		<%for(int i=1; i <= 12; i++){
			%>
			<option value="<%=i%>"><%=i%></option>월
			<% 
		}//for%>
		</select>
		
		<br>
		성별 : 
		<input type="radio" name="zender" value="M">남자
		<input type="radio" name="zender" value="F" checked="checked">여자
		<br>
		<input type="submit" value="확인">
		<input type="reset" value="취소">
	</form>
</body>
</html>