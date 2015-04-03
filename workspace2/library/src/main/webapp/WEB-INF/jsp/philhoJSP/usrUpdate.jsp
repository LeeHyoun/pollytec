<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="ko">
<head>
<meta charset="UTF-8">
<title>내 정보</title>

<link rel="stylesheet" href="./css/sun/main.css">
<link rel="stylesheet" href="./css/baedo/width.css">
<link rel="stylesheet" href="/resources/demos/style.css">
<link rel="stylesheet" href="//code.jquery.com/ui/1.11.4/themes/smoothness/jquery-ui.css">

<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.1/css/bootstrap.min.css">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.1/css/bootstrap-theme.min.css">
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.1/js/bootstrap.min.js"></script>

<script src="//code.jquery.com/jquery-1.10.2.js"></script>
<script src="//ajax.googleapis.com/ajax/libs/jquery/1/jquery.min.js"></script>
<script src="//cdn.poesis.kr/post/popup.min.js"></script>
<script src="//code.jquery.com/ui/1.11.4/jquery-ui.js"></script>



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

	});
</script>



<style type="text/css">
td {
	width: 90px;
}
</style>
</head>
<body>
	<div id="mainimg">
		<a href="superMainLibrary"><img alt="" src="images/mainlogo1.PNG"></a>
	</div>
	<!-- 오른쪽상단메뉴시작 -->
	<div class="btn-group" role="group" aria-label="...">
		<button type="button" class="btn btn-default"
			onclick="location.href='superMainLibrary';">Home</button>
		<!-- <button type="button" class="btn btn-default">Login</button>
	 		<button type="button" class="btn btn-default">회원가입</button>
	 		<button type="button" class="btn btn-default" onclick="location.href='managerMain';" >관리자</button> -->
	</div>
	<!-- 오른쪽상단메뉴끝 -->
	<div class="panel panel-default">
		<!-- header시작 -->
		<div id="header" class="panel-heading"
			style="background: url(images/main.PNG);">

			<!-- 로그인했을때 보이게.. -->
			<div id="loginbox">
				<form class="form-horizontal">
					<div id="insa" class="form-group">
						<img alt="" src="images/user.png"> 
						<label for="" class="col-sm-8 control-label">${usr.usrName }</label>
					</div>
					<div id="logoutbtn" class="form-group">
						<div class="col-sm-offset-2 col-sm-8">
							<input type="button" class="btn btn-default" value="Log Out">
						</div>
					</div>
					<div id="mypagebtn" class="form-group">
						<div class="col-sm-offset-2 col-sm-8">
							<input type="button" class="btn btn-default" value="My Page">
						</div>
					</div>
				</form>
			</div>
			<!-- 로그인박스끝 -->

			<!-- 주메뉴시작 -->
			<div id="menu">
				<li class="navi_set">
					<div class="topnav">
						<a href="#">도서관 관리</a>
					</div>
					<ul class="subnav">
						<li><a href="#">도서관 안내</a></li>
						<li><a href="#">도서관 소개</a></li>
						<li><a href="#">오시는 길</a></li>
					</ul>
				</li>
				<li class="navi_set">
					<div class="topnav">
						<a href="#">자료검색</a>
					</div>
					<ul class="subnav">
						<li><a href="#">장르</a></li>
						<li><a href="#">제목</a></li>
						<li><a href="#">저자</a></li>
					</ul>
				</li>
				<li class="navi_set">
					<div class="topnav">
						<a href="#">커뮤니티</a>
					</div>
					<ul class="subnav">
						<li><a href="#">자주묻는 질문</a></li>
						<li><a href="#">자유 게시판</a></li>
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
				<form class="form-horizontal" role="form" method="POST" action="usrUpdateOk">
					<h1>내 정보</h1>
					<table class="table table-hover">
						<tr class="success">
							<td>*아이디</td>
							<td><input type="text" name="usrId" value="${usr.usrId }" readonly="readonly"></td>
							<td><input type="button" class="btn btn-default" name="btn" value="중복체크"></td>
							
							<td></td>
						</tr>
						<tr>
							<td>*비밀번호</td>
							<td><input type="password" name="usrPw" value="${usr.usrPw }" ></td>
							<td>*비밀번호 확인</td>
							<td><input type="password" value="${usr.usrPw }" ></td>
						</tr>
						<tr>
							<td>*이름</td>
							<td><input type="text" name="usrName" value="${usr.usrName }" disabled></td>
							<td>*E-mail</td>
							<td><input type="email" name="usrEmail" value="${usr.usrEmail }" ></td>
						</tr>
						<tr>
							<td>*생년월일</td>
							<td><input type="text" id="datepicker" name="usrBirth" value="${usr.usrBirth }" ></td>
							<td>*성별</td>
							<td>
							${usr.usrGender }
					<!-- 			남 <input type="radio" id="gender" value="M" name="usrGender" > 
								여 <input type="radio"id="gender" value="F" name="usrGender"> -->
								
							</td>
						<tr>
							<td>*핸드폰</td>
							<td>
							<select name="usrMobile"  id="usrMobile" >
									<option value="010">010</option>
									<option value="011">011</option>
									<option value="016">016</option>
									<option value="019">019</option>
							 </select><script language='javascript'>document.getElementById('usrMobile').value="${usr.usrMobile }";</script>
								 - <input type="text" name="usrMobile1" maxlength="4" style="width: 50px;" value="${usr.usrMobile1 }" >
								 - <input type="text" name="usrMobile2" maxlength="4" style="width: 50px;" value="${usr.usrMobile2 }" >
							</td>
							<td>*집전화</td>
							<td>
							<select name="usrHp" id="usrHp" >
									<option value="02">02</option>
									<option value="031">031</option>
									<option value="032">032</option>
									<option value="054">054</option>
							 </select><script language='javascript'>document.getElementById('usrHp').value="${usr.usrHp }";</script>
								- <input type="text" name="usrHp1" maxlength="4" style="width: 50px;" value="${usr.usrHp1 }" > 
								- <input type="text" name="usrHp2" maxlength="4" style="width: 50px;" value="${usr.usrHp2 }" >
							</td>
						</tr>
						<tr>
							<td>*우편번호</td>
							<td colspan="3">
								<input type="text" name="zipcode1" class="postcodify_postcode6_1" value="${zipCode1 }" id="width50" /> &ndash;
								<input type="text" name="zipcode2" class="postcodify_postcode6_2" value="${zipCode2 }" id="width50" />
								<input type="button" value="검색" id="postcodify_search_button"><br />
								<br /></td>
						</tr>
						<tr>
							<td>*주소</td>
							<td colspan="3">
								<input type="text" name="usrAddr1" class="postcodify_address" value="${usrAddr1 }" id="width400" /><br />
							</td>
						</tr>
						<tr>
							<td>*나머지주소</td>
							<td colspan="3">
								<input type="text" name="usrAddr2" value="${usr.usrAddr2 }" id="width400" style="width: 340px;" /><br />
							</td>
						</tr>
					</table><br/>
					<div class="form-group">
						<div class="col-lg-offset-3 col-lg-10">
						
						 <%--  	 <a href="usrUpdateOk?usrId=${usr.usrId}&usrPw=${usr.usrPw}"> --%>
							<input type="submit" class="btn btn-default" value="확인"> 
							<!-- <input type="submit" value="확인"> -->
								&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
							<a href="superMainLibrary"><button type="button" class="btn btn-default">뒤로</button></a>
						</div>
					</div>
				</form>
			</div>
			<!-- 회원가입 끝 -->

			<!-- 왼쪽 주메뉴 시작 -->
			<div id="links">
				<ul>
					<li>
						<h2>회원가입</h2>
						<ul>
							<li><a href="#">아이디 찾기</a></li>
							<li><a href="#">비밀번호 찾기</a></li>
						</ul>
					</li>
				</ul>
			</div>
			<div style="clear: both;">&nbsp;</div>
			<!-- 왼쪽 주메뉴 끝 -->
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