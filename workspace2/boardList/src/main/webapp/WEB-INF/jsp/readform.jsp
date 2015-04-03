<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html >
<html>
<head>
<meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>글쓰기</title>
    <!-- Bootstrap -->
    <link href="/boardList/css/bootstrap.min.css" rel="stylesheet">
	<!-- jquery -->
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
	<script src="/boardList/js/bootstrap.min.js"></script>	
	<script src="http://code.jquery.com/jquery-1.10.2.js"></script>
		
	<style type="text/css">
		#replyBtn {
			margin-left: 300px;
		}
	</style>
		
	<script type="text/javascript">
		$(function () {
			$("#titlecheck").hide();
			$("#contentcheck").hide();
			
			$("#readupdate").on("click",function() {
				var title = $("#title").val();
				var content = $("#content").val();
				
				if(title == ""){
					$("#titlecheck").show();
				}else {
					$("#titlecheck").hide();
				}
				
				if(content == ""){
					$("#contentcheck").show();
				}else {
					$("#contentcheck").hide();
				}
				
				if(content != "" || title != ""){
					$("#frm").submit();
				}
			});
			
			/* 리플 달기 */
			$("#replyBtn").click(function(){
				alert("리플달기");
				var content = $("#content").val();
				var boardSeq = $("#boardSeq").val();
				if(content != ''){
					// /board/replyWrite 에 post방식으로 전달.
					// alert(content + "," + boardSeq);
					$.ajax({
						  type: "POST",
						  url: '/boardList/writeReply',
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
	<div class="col-xs-8 col-sm-offset-3 col-sm-5 col-md-offset-3 col-md-5 col-lg-offset-3 col-lg-5 top100">
	<div class="panel panel-success">
	<div class="panel-heading">
       <h3 class="panel-title"><strong>작성자 : ${dto.userId}</strong></h3>
    </div>
        <div class="panel-body">
			<form id="frm" class="form-horizontal" method="post" action="readupdate">
			  <div class="form-group">
			    <label class="col-sm-2 control-label">글 제목</label>
			    <div class="col-sm-10">
			      <input id="title" type="text" class="form-control" name="title" placeholder="글 제목을 입력" value="${dto.title }">
			      <div id="titlecheck" class="control-label" align="center" >!!! 제목을 입력하세요!!!</div>
			    </div>
			  </div>
			  <div class="form-group">
			    <label class="col-sm-2 control-label">글 내용</label>
			    <div class="col-sm-10">
			      <textarea id="content" class="form-control" name="content" placeholder="글 내용을 입력하세요">${dto.content }</textarea>
			      <div id="contentcheck" class="control-label" align="center">!!! 내용을 입력하세요!!</div>
			    </div>
			  </div>
			  <div class="form-group">
			    <div class="col-sm-offset-2 col-sm-10" align="right">
			    	<input type="hidden" name="seq" value="${dto.seq}">
			    	<input type="hidden" name="userId" value="${dto.userId}">
			    	<input type="hidden" name="page" value="${page}">
			    	<button  id="readupdate" class="btn btn-success" >글수정</button>
			    	<a href="list"><button class="btn btn-success" >글목록</button></a>
			    	<!-- <a href="javascript:history.go(-1);"><button class="btn btn-success" >글목록</button></a> -->
			    </div>
			  </div>
			</form>
		</div>
		
		<div class="panel-body">
			<c:if test="${sessionScope.logininfo.name == null}">
				로그인이 필수입니다. 댓글달려면!!
				<a href="loginform">로그인</a> &nbsp;&nbsp;
			</c:if>
			
			<c:if test="${sessionScope.logininfo.name != null}">
				<form id="replyfrm" method="post" >
					<div class="form-group has-warning">
					  <label class="control-label" for="content"><strong class="panel-title">이름 : ${sessionScope.logininfo.name}</strong></label>
					  <input class="btn btn-success" type="button" id="replyBtn" value="댓글등록">
					  <textarea class="form-control" id="content" name="content" cols="40" rows="2"></textarea>
					  <input type="hidden" id="boardSeq" name="boardSeq" value="${dto.seq}">
					</div>
				</form>
			</c:if>
			
			<div id="replys" class="form-group has-warning">
				  <label class="control-label" for="content"><strong class="panel-title">이름 : </strong></label>
				  <textarea class="form-control" id="content" name="content" cols="40" rows="2"></textarea>
				  <input type="hidden" id="boardSeq" name="boardSeq" value="${dto.seq}">		  
			</div>
			
		</div>
	</div>
</div>
</body>
</html>