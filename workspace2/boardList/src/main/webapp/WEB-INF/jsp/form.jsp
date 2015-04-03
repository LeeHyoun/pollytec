<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %> 
<!DOCTYPE html >
<html>
<head>
<meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>회원가입</title>
    <!-- Bootstrap -->
    <link href="/board/css/bootstrap.min.css" rel="stylesheet">
	<!-- jquery -->
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
	<script src="/board/js/bootstrap.min.js"></script>
</head>

<body>

<div class="col-xs-8 col-sm-offset-3 col-sm-8 col-md-offset-3 col-md-8 col-lg-offset-3 col-lg-8 ">
	<div class="panel panel-success">
		<div class="panel-heading">
	       <h3 class="panel-title"><strong>CREATE MEMBER</strong></h3>
	    </div>
	        <div class="panel-body">
				<form:form modelAttribute="user" autocomplete="off" method="POST" action="userform">
				  <div class="form-group">
				    <label  class="col-sm-2 control-label">NAME</label>
				    <div class="col-sm-10">
				      <form:input path="name"/>
				    </div>
				  </div>
				  <div class="form-group">
				    <label  class="col-sm-2 control-label">AGE</label>
				    <div class="col-sm-10">
				      <form:input path="age"/>
				    </div>
				  </div>			  
				  <div class="form-group">
				    <label class="col-sm-2 control-label">성별</label>
				    <div class="col-sm-10">
				      남<form:radiobutton path="gender" value="male"  />
					  여<form:radiobutton path="gender" value="female"/>
				    </div>
				  </div>
				  <div class="form-group">
				    <label  class="col-sm-2 control-label">Email</label>
				    <div class="col-sm-10">
				     <form:input path="email"/>
				    </div>
				  </div>
				  <div class="form-group">
				    <div class="col-sm-offset-2 col-sm-10">
				      <button id="write" type="submit" class="btn btn-info">Create</button>
				    </div>
				  </div>
				</form:form>
			</div>
	</div>
</div> 
</body>
</html>