<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	
	<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>회원 목록</title>
<link rel="stylesheet" href="./css/sun/managermain.css">
<link rel="stylesheet"	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.1/css/bootstrap.min.css">
<link rel="stylesheet"	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.1/css/bootstrap-theme.min.css">
<script	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.1/js/bootstrap.min.js"></script>
<script src="http://code.jquery.com/jquery-1.10.2.min.js"></script>

<link rel="stylesheet" href="//code.jquery.com/ui/1.11.4/themes/smoothness/jquery-ui.css">
<script src="//code.jquery.com/jquery-1.10.2.js"></script>
<script src="//code.jquery.com/ui/1.11.4/jquery-ui.js"></script>
<link rel="stylesheet" href="/resources/demos/style.css">

<script type="text/javascript">
	function usrId(id,usrName,usrMobile,usrBirth,usrAddr1,usrAddr2,usrEmail) {
		//alert(id+" "+usrName+" "+usrMobile);
		 
		$('#usrId', opener.document.frm).val(id);
		$('#usrName', opener.document.frm).val(usrName);
		$('#usrMobile', opener.document.frm).val(usrMobile);
		$('#usrBirth', opener.document.frm).val(usrBirth);
		$('#usrAddr1', opener.document.frm).val(usrAddr1);
		$('#usrAddr2', opener.document.frm).val(usrAddr2);
		$('#usrEmail', opener.document.frm).val(usrEmail);

		self.close();
	}
</script>
</head>

<body>
	<center>
	<h3>회원목록</h3>
	<br>
	<table class="table">
		<thead>
			<tr>
				<th>이름</th>
				<th>연락처</th>
				<th>대여상태</th>
				<th>대여확인</th>
			</tr>
		</thead>
		<tbody>
	      <c:forEach items="${list }" var="Rent" varStatus="status">
	        <tr>
		      <td>${Rent.usrName},${Rent.usrId }</td>
		      <td>${Rent.usrMobile}</td>
		      <c:if test="${Rent.rentFlag == 1}">
		      	<td><strong style="color: blue;">대여가능</strong></td>
		      	<td><input type="button" value="대여" onclick="usrId('${Rent.usrId}','${Rent.usrName}',
		      		'${Rent.usrMobile}','${Rent.usrBirth}','${Rent.usrAddr1 }','${Rent.usrAddr2 }','${Rent.usrEmail }')" ></td>
		      </c:if>
		      <c:if test="${Rent.rentFlag == 0}">
		      	<td><strong style="color: red;">대여불가</strong> </td>
		      	<td></td>
		      </c:if>	
	        </tr>
	      </c:forEach>
		</tbody>
	</table>
	</center>
</body>
</html>