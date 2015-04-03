<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
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
</head>

<body>
	<div class="col-xs-12 col-sm-offset-3 col-sm-5 col-md-offset-3 col-md-5 col-lg-offset-3 col-lg-5">
	<h1>메모 리스트</h1>
	<c:forEach items="${memoList }" var="memo" varStatus="status">
		<div class="panel panel-danger">
	      <div class="panel-heading">
	      	<label>${memo.title }</label>
	      </div>
	      <div class="panel-body">
	        <label>${memo.content }</label><br>
	      </div>
	      <div align="right">
			<span class="glyphicon glyphicon-calendar"></span>
			<label class="label label-info">${memo.regdate }</label>
	      </div>
	    </div>
	    <p></p>
	</c:forEach>
	
	<a href="memoform.jsp">메모 등록</a>
	</div>
</body>
</html>