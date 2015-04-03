<%@ page language="java" contentType="text/html; charset=UTF-8"  pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
	<head>
	    <meta charset="utf-8">
	    <meta http-equiv="X-UA-Compatible" content="IE=edge">
	    <meta name="viewport" content="width=device-width, initial-scale=1">
	    <title>memo</title>
	    <!-- Bootstrap -->
	    <link href="css/bootstrap.min.css" rel="stylesheet">
		<!-- jquery -->
		<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
		<script src="js/bootstrap.min.js"></script>
		
		<style type="text/css">
			
		</style>
	  </head>
	
	<body>
	  	<!-- 글등록 폼 -->
	  	<div class="row">
			<div class="col-xs-12 col-sm-offset-3 col-sm-5 col-md-offset-3 col-md-5 col-lg-offset-3 col-lg-5">
			<h1>메모 등록</h1>
			<form method="post" action="/MemoServlet">
				
				<input type="text" class="form-control" name="title" 
												placeholder="제목을 입력하세요.">
				<textarea rows="5" class="form-control" name="content" 
									placeholder="내용을 입력하세요."></textarea>
				<div align="right" class="col-xs-12">
					<button  type="submit" class="btn btn-success">등록</button>
				</div>
			</form>
			</div>
		</div>
	</body>
</html>