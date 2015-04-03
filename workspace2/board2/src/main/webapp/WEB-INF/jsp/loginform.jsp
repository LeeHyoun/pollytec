<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html >
<html>
<head>
	<meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>로그인</title>
    <!-- Bootstrap -->
    <link href="/board/css/bootstrap.min.css" rel="stylesheet">
	<!-- jquery -->
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
	<script src="/board/js/bootstrap.min.js"></script>
</head>

<body>
<div class="col-xs-12 col-sm-offset-3 col-sm-8 col-md-offset-3 col-md-8 col-lg-offset-3 col-lg-8 ">
	<div class="panel panel-success">
	<div class="panel-heading">
       <h3 class="panel-title"><strong>LOGIN</strong></h3>
    </div>
        <div class="panel-body">
			<form class="form-horizontal" method="post" action="login">
			  <div class="form-group">
			    <label  class="col-sm-2 control-label">USER ID</label>
			    <div class="col-sm-10">
			      <input type="text" class="form-control" name="id" placeholder="USER ID">
			    </div>
			  </div>
			  <div class="form-group">
			    <label  class="col-sm-2 control-label">Password</label>
			    <div class="col-sm-10">
			      <input type="password" class="form-control" name="passwd" placeholder="Password">
			    </div>
			  </div>
			  <div class="form-group">
			    <div class="col-sm-offset-2 col-sm-10">
			      <div class="checkbox">
			        <label>
			          <input type="checkbox" name="checkid"> Remember me
			        </label>
			      </div>
			    </div>
			  </div>
			  <div class="form-group">
			    <div class="col-sm-offset-2 col-sm-10">
			      <button type="submit" class="btn btn-success">Login</button>
			    </div>
			  </div>
			</form>
		</div>
	</div>
</div>
</body>
</html>