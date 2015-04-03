<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>writeform.jsp</title>
<script src="http://code.jquery.com/jquery-1.10.2.js"></script>
<script type="text/javascript">
	$(document).ready(function () {
		$('#title_msg').hide();
		$('#content_msg').hide();
		
		$('#okBtn').click(function(){
			var title = $('#title').val();
			var content = $('#content').val();
			if(title == ''){
				//alert('제목을 입력!! 부탁합니다.');
				$('#title_msg').show();
			}else{
				$('#title_msg').hide();
			}
			if(content == ''){
				$('#content_msg').show();
			}else{
				$('#content_msg').hide();
			}
			if(title != '' && content != ''){
				$('#writeform').submit();
			}
		});
	});
</script>
</head>
<body>
<form method="post" action="/board/write" id="writeform">
이름 : ${sessionScope.logininfo.name}<br>
title : <input type="text" id="title" name="title"><br>
<div id="title_msg" style="color: red;">제목을 입력하세요.</div>
content : <textarea id="content" name="content" cols="50" rows="6"></textarea>
<div id="content_msg" style="color: red;">내용을 입력하세요.</div>
<br>
<input type="button" id="okBtn" value="확인">

</form>
</body>
</html>