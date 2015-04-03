<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>read</title>
<script src="http://code.jquery.com/jquery-1.10.2.js"></script>
<script type="text/javascript">
	$(document).ready(function () {
		$("#readBtn").click(function(){
			var readFormSeq = $("#readFormSeq").val();
			if(readFormSeq != ''){
				// /board/replyWrite 에 post방식으로 전달.
				// alert(content + "," + boardSeq);
				$.ajax({
					  type: "GET",
					  url: '/board/read.api',
					  dataType: 'json',
					  data: {'seq':readFormSeq},
					  success: function(data){
							console.log(data);
							$("#titleData").html(data.title);
							$("#contentData").html(data.content);
					  },
					});
			}else{
				alert('내용을 입력하세요.');
			}
		});
	});
</script>
</head>
<body>
<form id="readForm">
<input type="text" name="seq" id="readFormSeq">
<input type="button" id="readBtn" value="가져와!">
</form>

<div>
	<div id="titleData"></div>
	<div id="contentData"></div>
	
</div>


</body>
</html>