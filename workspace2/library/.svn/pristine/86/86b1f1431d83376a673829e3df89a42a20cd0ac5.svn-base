<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title></title>

<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.1/css/bootstrap.min.css">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.1/css/bootstrap-theme.min.css">
<link rel="stylesheet"
	href="//code.jquery.com/ui/1.11.4/themes/smoothness/jquery-ui.css">
</head>
<body>
	<div>
		<center><h3>도서 리스트</h3></center>
	</div>
	<br>
	<table class="table table-hover">
		<thead>
			<tr>
				<th>번호</th>
				<th>이름</th>
				<th>연락처</th>
				<th>대여상태</th>
				<th>대여확인</th>
			</tr>
		</thead>

		<tbody>
			<c:forEach items="${list }" var="Book">
				<tr>
					<th></th>
					<td></td>
					<td></td>
					<td></td>
					<td><button class="btn btn-default">확인</button></td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
	<div style="float: right; margin-right: 130px">
	<input type="button" class="btn btn-default" onclick="window.close()" value="취소">
	</div>
</body>
</html>