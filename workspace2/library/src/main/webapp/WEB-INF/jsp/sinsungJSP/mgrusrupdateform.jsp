<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<title>Insert title here</title>
<link rel="stylesheet" href="./css/sun/main.css">
<link rel="stylesheet" href="./css/sun/managermain.css">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.1/css/bootstrap.min.css">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.1/css/bootstrap-theme.min.css">
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.1/js/bootstrap.min.js"></script>
<script src="http://code.jquery.com/jquery-1.10.2.min.js"></script>

<script src="//code.jquery.com/jquery-1.10.2.js"></script>
<script src="//ajax.googleapis.com/ajax/libs/jquery/1/jquery.min.js"></script>
<script src="//cdn.poesis.kr/post/popup.min.js"></script>
<script src="//code.jquery.com/ui/1.11.4/jquery-ui.js"></script>
<link rel="stylesheet" href="//code.jquery.com/ui/1.11.4/themes/smoothness/jquery-ui.css">

<script>
$(function() {
  $("#datepicker").datepicker({
  	dateFormat: "yy/mm/dd"
  });
  $("#datepicker2").datepicker({
  	dateFormat: "yy/mm/dd"
  });
  
  $("#postcodify_search_button").postcodifyPopUp({
	}); 
  
});
</script>

<script type="text/javascript">

	$(document).ready(function() {
		$(".subnav").hide();
		$(".topnav").hover(function() {
			$(this).parent().find(".subnav").slideDown('normal').show();
			$(this).parent().hover(function() {
			}, function() {
				$(this).parent().find(".subnav").slideUp('fast');
			});
		});
		$("#idCheck").hide();
		$("#pwCheck").hide();
		$("#nameCheck").hide();
		$("#emailCheck").hide();
		$("#zipCheck").hide();
		
		$('#returnBtn').click(function () {
			location.replace('mgrUsrList');
		 });

	});
</script>
<style type="text/css">


</style>

</head>


<body>
		<div id="mainimg"><a href="superMainLibrary"><img alt="" src="images/mainlogo1.PNG"></a></div>
	  	<!-- 오른쪽상단메뉴시작 -->
	  	<div class="btn-group" role="group" aria-label="...">
	  		<button type="button" class="btn btn-default" onclick="location.href='superMainLibrary';">Home</button>
	 		<button type="button" class="btn btn-default" onclick="location.href='managerMain';">관리자</button>
	 		<button type="button" class="btn btn-default" onclick="location.href='managerMain';">공지사항</button>
		</div>
		<!-- 오른쪽상단메뉴끝 -->
		<div  class="panel panel-default">
	<!-- header시작 -->
  	<div id="header" class="panel-heading" style="background: url(images/main.PNG);">
	  	
		<!-- 로그인박스시작 -->
		<div id="loginbox">
			  <form class="form-horizontal">
				  <div id="insa" class="form-group">
				  	<img alt="" src="images/user.png">
				    <label for="" class="col-sm-8 control-label">관리자님 환영</label>
				  </div>
				  <div id="logoutbtn" class="form-group">
				    <div class="col-sm-offset-2 col-sm-8">
				      <input type="button" class="btn btn-default" value="Log Out">
				    </div>
				  </div>
			  </form>
		</div>
		<!-- 로그인박스끝 -->
		
		<!-- 주메뉴시작 -->
		<div id="menu">
			<li class="navi_set">
				<div class="topnav"><a href="#">인사 관리</a></div>
				<ul class="subnav">
					<li><a href="#">경영 지원부</a></li>
					<li><a href="#">직원 등록</a></li>
				</ul>
			</li>
			<li class="navi_set">
				<div class="topnav"><a href="due">도서 관리</a></div>
				<ul class="subnav">
					<li><a href="#">도서 반납</a></li>
					<li><a href="#">도서 대여</a></li>
					<li><a href="#">도서 리스트</a></li>
					<li><a href="#">도서 통계</a></li>
					<li><a href="#">도서 등록</a></li>
				</ul>
			</li>
			<li class="navi_set">
				<div class="topnav"><a href="#">회원 관리</a></div>
				<ul class="subnav">
					<li><a href="#">회원 리스트</a></li>
					<li><a href="#">회원 통계</a></li>
					<li><a href="#">1:1 질의 응답</a></li>
				</ul>
			</li>
		</div>
		<!-- 주메뉴끝 -->
		
	</div>
	<!-- header끝 -->

		<!-- body 시작-->

		<div id="body" class="panel-body">
			<!-- 오른쪽 주메뉴 내용시작 -->
			<div id="posts">
				<form:form modelAttribute="usr" autocomplete="off"  class="form-horizontal"  method="post" action="usrupdate">
				
					<h1>회원수정</h1>
				
					<table class="table table-hover">
						<tr>
							<td width = "20%">아이디</td>
							<td width = "40%"><form:input path="usrId" id="usrid"/></td>
							<td width = "20%"><input type="button" class="btn btn-default" name="btn"
								value="중복체크"></td>
							<td width = "20%"></td>
						</tr>
						<tr id="idCheck">
							<td></td>
							<td>
								아이디를 입력해주세요.
							</td>
							<td></td><td></td>
						</tr>
						<tr>
							<td>비밀번호</td>
							<td><form:password path="usrPw" id="pw1" /></td>
							<td></td><td></td>
						</tr>
						<tr>
							<td>비밀번호 확인</td>
							<td><input type="password" id="pw2"></td>
							<td></td><td></td>
						</tr>
						<tr id="pwCheck">
							<td></td>
							<td>
								비밀번호가 일치 하지 않습니다.
							</td>
							<td></td>
							<td></td>
						</tr>
						<tr>
							<td>이름</td>
							<td><form:input path="usrName"/></td>
							<td></td>
							<td></td>
						</tr>
						<tr id="nameCheck">
							<td></td>
							<td>
								이름을 입력해주세요.
							</td>
							<td></td>
							<td></td>
						</tr>
						<tr>
							<td>E-mail</td>
							<td><form:input path="usrEmail"/></td>
							<td></td>
							<td></td>
						</tr>
						<tr id="emailCheck">
							<td></td>
							<td>
								이메일이 형식에 맞지 않습니다.
							</td>
							<td></td>
							<td></td>
						</tr>
						<tr>
							<td>생년월일</td>
							<td><form:input path="usrBirth" id="datepicker"/></td>
							<td>성별 
							<form:radiobutton path="usrGender" value="M"/> 남 
							<form:radiobutton path="usrGender" value="F"/> 여
							</td>
							<td></td>
						</tr>
						<tr>
							<td>핸드폰</td>
							<td><form:select path="usrMobile1">
							<form:option value="010">010</form:option>
							<form:option value="011">011</form:option>
							<form:option value="016">016</form:option>
							<form:option value="019">019</form:option>
							</form:select>
							  - <form:input path="usrMobile2" maxlength="4" style="width: 50px;"/>
							  - <form:input path="usrMobile3" maxlength="4" style="width: 50px;"/>
							</td>
							<td></td>
							<td></td>
						</tr>
						<tr>
							<td>집전화</td>
								<td><form:select path="usrHp1">
								<form:option value="02">02</form:option>
								<form:option value="031">031</form:option>
								<form:option value="032">032</form:option>
								</form:select>
								  - <form:input path="usrHp2" maxlength="4" style="width: 50px;"/>
								  - <form:input path="usrHp3" maxlength="4" style="width: 50px;"/>
								</td>
								<td></td>
								<td></td>
						</tr>
						<tr>
							<td>우편번호</td>
							<td colspan="3">
								<input type="text" name="zipcode1" class="postcodify_postcode6_1" value="${zipCode1 }"  style="width: 50px;" />-
								<input type="text" name="zipcode2" class="postcodify_postcode6_2" value="${zipCode2 }"  style="width: 50px;"/>
								<input type="button" value="검색" id="postcodify_search_button">
							</td>
							<td></td>
							<td></td>
						</tr>
						<tr id="zipCheck">
							<td></td>
							<td>우편번호를 입력해주세요.</td>
						</tr>
						<tr>
							<td>주소</td>
							<td colspan="3">
								<input type="text" name="usrAddr" class="postcodify_address" value="${usrAddr }" /><br />
							</td>
							<td></td>
							<td></td>
						</tr>
						<tr>
							<td>나머지주소</td>
							<td colspan="3"><form:input path="usrAddr2"/></td>
							<td></td>
							<td></td>
						</tr>
					</table>
					<br /> <br />
					<div class="form-group">
						<div class="col-lg-offset-3 col-lg-10">
							<input type="submit" class="btn btn-default" id="updateBtn" value ="수정">
							&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 
							<button type="button" class="btn btn-default" id="returnBtn">취소</button>
						</div>
					</div>
				</form:form>
			</div>

			<!-- 회원수정 끝 -->
			<!-- 왼쪽 주메뉴 시작 -->
			<div id="links">
				<ul>
					<li>
						<h2>회원 관리</h2>
						<ul>
							<li><a href="mgrUsrList">회원 리스트</a></li>
							<li><a href="mgrUsrStList">회원 통계</a></li>
							<li><a href="mgrQnaList">1:1 질의 응답</a></li>
						</ul>
					</li>
				</ul>
			</div>

			<!-- 왼쪽 주메뉴 끝 -->

			<div style="clear: both;">&nbsp;</div>
		</div>




		<!-- body끝 -->
		<!-- footer시작 -->
		<div id="footer" class="panel-footer">
			<div id="mainlogo">
				<img alt="" src="images/mainlogo.png">
			</div>
			<p id="mainname">
				<span>NewStarLibrary</span>
			</p>
			<p>[461-711] 경기도 성남시 수정구 수정로 398</p>
			<p>전화 : 031)739-4000 팩스 : 교학처 031)749-3375 행정처 031)749-3374 산학협력처
				031)735-2098</p>
			<p>COPYRIGHT 2015 BY nine people</p>
		</div>
		<!-- footer끝 -->
	</div>
</body>
</html>