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
		
	</style>
		
	<script type="text/javascript">
		$(function () {
			$("#titlecheck").hide();
			$("#contentcheck").hide();
			
			$("#write").on("click",function() {
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
		});
	</script>
</head>

<body>
	<div class="col-xs-8 col-sm-offset-3 col-sm-8 col-md-offset-3 col-md-6 col-lg-offset-3 col-lg-6 top100">
	<div class="panel panel-success">
	<div class="panel-heading">
       <h3 class="panel-title"><strong>작성자 :  ${sessionScope.logininfo.name} </strong></h3>
    </div>
        <div class="panel-body">
			<form id="frm" class="form-horizontal" method="post" action="write">
			  <div class="form-group">
			    <label class="col-sm-2 control-label">글 제목</label>
			    <div class="col-sm-10">
			      <input id="title" type="text" class="form-control" name="title" placeholder="글 제목을 입력">
			      <div id="titlecheck" class="control-label" align="center" >!!! 제목을 입력하세요!!!</div>
			    </div>
			  </div>
			  <div class="form-group">
			    <label class="col-sm-2 control-label">글 내용</label>
			    <div class="col-sm-10">
			      <textarea id="content" class="form-control" name="content" placeholder="글 내용을 입력하세요"></textarea>
			      <div id="contentcheck" class="control-label" align="center">!!! 내용을 입력하세요!!</div>
			    </div>
			  </div>
			  <div class="form-group">
			    <div class="col-sm-offset-2 col-sm-10">
			      <button  id="write" class="btn btn-success" >글등록</button>
			    </div>
			  </div>
			</form>
		</div>
	</div>
</div>
</body>
</html>