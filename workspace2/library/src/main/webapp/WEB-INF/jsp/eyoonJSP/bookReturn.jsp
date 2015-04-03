<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>도서 상태 체크</title>
<script type="text/javascript">
function State(){
		if(confirm("상태를 처리 하시겠습니까?"))
		{

			alert('상태가 처리 되었습니다.');
			opener.parent.location='rentlist'; 
			window.close(); 
			return true;
			
		}
		else{
			return false;
		}
	}
	
</script>
</head>
<body>
<center>
도서 상태 체크 
<br>

<form action="updateReturn" method="POST">
	
	<input type="radio" name="dueState" value="정상" checked>정상
	<input type="radio" name="dueState" value="훼손" >훼손
	<input type="radio" name="dueState" value="분실" >분실
	<input type="radio" name="dueState" value="미납" >미납
	<input type="hidden" name="rentNo" value="${rentNo}">
	<p></p>
	<textarea name="dueRecord" rows="5" cols="30"></textarea>
	<br>
	<button type="submit" class="btn btn-default" onclick="return State()">확인</button>
	<button type="button" class="btn btn-default" onclick="window.close()">취소</button>
</form>
</center>
</body>
</html>