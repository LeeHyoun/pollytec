<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>삭제하시겠습니까?</title>
<script> 
	function Open(){ 
		opener.parent.location='booklist'; 
		window.close(); 
	} 
</script> 
</head>
<body>
<center>
<br>

<form action="deletebook" method="POST">
	<label style="color: red; font-size: 30px;"><strong>정말 삭제 하시겠습니까?</strong></label>
	<p></p>
	<input type="hidden" name="bookNo" value="${Book.bookNo }">
	<input type="hidden" name="page" value="${bookPageDTO.page }">
	<button type="submit" class="btn btn-default" onclick="Open();">확인</button>
	<button type="button" class="btn btn-default" onclick="window.close();">취소</button>
	</center>
</form>
</body>
</html>