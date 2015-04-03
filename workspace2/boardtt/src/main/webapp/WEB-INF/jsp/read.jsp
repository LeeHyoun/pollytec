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
		$("#replyBtn").click(function(){
			var content = $("#content").val();
			var boardSeq = $("#boardSeq").val();
			if(content != ''){
				// /board/replyWrite 에 post방식으로 전달.
				// alert(content + "," + boardSeq);
				$.ajax({
					  type: "POST",
					  url: '/board/replyWrite',
					  dataType: 'json',
					  data: {'content':content, 'boardSeq': boardSeq},
					  success: function(data){
							alert(data.seq);
							$("#replys").append('<div>이름 : ${sessionScope.logininfo.name} <br>' + content + '</div>');
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
<h1>read!!</h1>
<br><br>

seq : ${board.seq }<br>
title :	${board.title }<br>
작성자 : ${board.userName }<br>
등록일 : ${board.regdate }<br>
조회수 : ${board.readCount }<br>
내용 : <pre>${board.content }</pre>

<a href="javascript:history.go(-1);">리스트보기</a>&nbsp;&nbsp;
<br><br>

<c:if test="${sessionScope.logininfo != null}">
<form method="post" >
이름 : ${sessionScope.logininfo.name}<br>
<textarea id="content" name="content" cols="40" rows="3"></textarea>
<input type="button" id="replyBtn" value="댓글등록">
<input type="hidden" id="boardSeq" name="boardSeq" value="${board.seq }">
</form>
</c:if>
<c:if test="${sessionScope.logininfo == null}">
로그인이 필수입니다. 댓글달려면!!
<a href="/board/loginform">로그인</a> &nbsp;&nbsp;
</c:if>

<div id="replys">
	<div>
		이름 : 홍길동<br>
		블라블라 <br>
		2015/01/22 20:50
	</div>
</div>

	
</body>
</html>