<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="ko">
<head>
<meta charset="UTF-8">
<title>글쓰기</title>

<link rel="stylesheet" href="./css/sun/main.css">
<link rel="stylesheet" href="./css/baedo/width.css">
<link rel="stylesheet" href="/resources/demos/style.css">
<link rel="stylesheet"
	href="//code.jquery.com/ui/1.11.4/themes/smoothness/jquery-ui.css">

<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.1/css/bootstrap.min.css">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.1/css/bootstrap-theme.min.css">
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.1/js/bootstrap.min.js"></script>

<script src="//code.jquery.com/jquery-1.10.2.js"></script>
<script src="//ajax.googleapis.com/ajax/libs/jquery/1/jquery.min.js"></script>
<script src="//cdn.poesis.kr/post/popup.min.js"></script>
<script src="//code.jquery.com/ui/1.11.4/jquery-ui.js"></script>



<script>
	$(function() {
		$("#datepicker").datepicker({
			dateFormat : "yy/mm/dd"
		});
		$("#datepicker2").datepicker({
			dateFormat : "yy/mm/dd"
		});

		$("#postcodify_search_button").postcodifyPopUp({});

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
		<c:if test="${not empty sessionScope.manager && divide == '2'}"> 
		<div id="loginbox">
			  <form class="form-horizontal" name="loginform2" method="POST" action=logout>
				  <div id="insa" class="form-group">
				  	<img alt="" src="images/user.png">
				    <label for="" class="col-sm-8 control-label">${manager.mgr_name }</label>
				  </div>
				  <div id="loginbtn" class="form-group">
				    <div class="col-sm-offset-2 col-sm-8">
				    	<input type="hidden" name="usrId" value="${sessionScope.usr }">
				      <button type="button" class="btn btn-default" onclick="logout();" >Log Out</button>
				    </div>
				  </div>
				  <div id="joinbtn" class="form-group">
				    <div class="col-sm-offset-2 col-sm-8">
				       <a href="usrinfo?usrId=${manager.mgr_id}&usrPw=${manager.mgr_pw}">
				      	<button type="button" class="btn btn-default">My Page</button></a>
				    </div>
				  </div>
			  </form>
		</div> 
		</c:if>
		<!-- 로그인박스끝 -->

		<!-- 주메뉴시작 -->
		<div id="menu">
			<!-- ///////////// id 추가///////////////////////////////////-->
			<li class="navi_set" id="libManage">
				<div class="topnav" ><a href="mainLibrary">도서관 관리</a></div>
				<ul class="subnav">
					<li><a href="mainLibrary">도서관 소개</a></li>
					<li><a href="useLibrary">도서관 안내</a></li>
					<li><a href="comeLibrary">오시는 길</a></li>
				</ul>
			</li>
			<!-- ///////////// id 추가///////////////////////////////////-->
			<li class="navi_set" id="dataSearch">
				<div class="topnav"><a href="bookSearch">자료검색</a></div>
				<ul class="subnav">
					<li><a href="genre">장르</a></li>
					<li><a href="titlesearch">제목</a></li>
					<li><a href="writersearch">저자</a></li>
				</ul>
			</li>
			<!-- ///////////// id 추가///////////////////////////////////-->
			<li class="navi_set" id="community">
				<div class="topnav"><a href="boardqna">커뮤니티</a></div>
				<ul class="subnav">
					<li><a href="boardqna">자주묻는 질문</a></li>
					<li><a href="boardlist">자유 게시판</a></li>
				</ul>
			</li>
		</div>
		<!-- 주메뉴끝 -->

		</div>
		<!-- header끝 -->

		<!-- body 시작-->
		<form id="form1" class="form-horizontal" name="form1" method="POST" action="boardupdate" >
		<div id="body" class="panel-body">
			<!-- 게시판 글쓰기 폼 -->
			<div id="posts">
				<div class="table table-hover">
					<div class = "col-lg-8 col-lg-offset-1">
								제목   : <input type="text" class="form-control" id="title" name="boardTitle"  value="${board.boardTitle}"><br>
								작성자   : <input type="text" class="form-control" id="usrId" name="usrId" value= "${board.usrId }"  readonly="readonly"><br>
								작성일  : <input type="text" class="form-control" id="boardDate" name="boardDate" value="${calsave}"  readonly="readonly"><br>
								내용  : <textarea class="form-control" id="noticecontent" name="boardContent"  rows="8" cols="" >${board.boardContent }</textarea><br>
											
										<input type="hidden" name="boardSeq" value="${board.boardSeq}" />
											
										<input id="btn" type="submit" class="btn btn-warning" value="수정완료">
				  		 				<input id="btn"  type="button" onclick="location.href='boardlist';" class="btn btn-warning" value="목록보기">		
					</div>
				</div>
		</form>
			</div>
		

			<!-- 왼쪽 주메뉴 시작 -->
			<div id="links">
				<ul>
					<li>
						<h2>커뮤니티</h2>
						<ul>
					<li><a href="boardqna">자주묻는 질문</a></li>
					<li><a href="boardlist">자유 게시판</a></li>
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