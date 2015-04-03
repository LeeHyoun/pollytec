<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="./css/sun/main.css">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.1/css/bootstrap.min.css">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.1/css/bootstrap-theme.min.css">
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.1/js/bootstrap.min.js"></script>
<script src="http://code.jquery.com/jquery-1.10.2.min.js"></script>
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
  	<div id="header" class="panel-heading" style="background: url(images/main.PNG);background-size: 100% 100%;">
	  	
		<!-- 로그인박스시작 -->
		<div class="loginbox2">
			  <form class="form-horizontal">
				  <div id="insa" class="form-group">
				  	<img alt="" src="images/user.png">
				    <label for="" class="col-sm-8 control-label">${sessionScope.manager.mgr_name} 님 환영</label>
				  </div>
				  <div id="logoutbtn" class="form-group">
				    <div class="col-sm-offset-2 col-sm-8">

				      <input type="button" class="btn btn-default" id="logoutbtn2" value="Log Out">

				      <input type="button" class="btn btn-default" value="Log Out">

				    </div>
				  </div>
			  </form>
		</div>
		<!-- 로그인박스끝 -->
		
		
		
		<!-- 주메뉴시작 -->
		<div id="menu">
			<li class="navi_set" id="libManage">
				<div class="topnav"><a href="mgr">인사 관리</a></div>
				<ul class="subnav">
					<li><a href="#">경영 지원부</a></li>
					<li><a href="#">직원 등록</a></li>
				</ul>
			</li>
			<li class="navi_set" id="dataSearch">
				<div class="topnav"><a href="duelist">도서 관리</a></div>
				<ul class="subnav">
					<li><a href="duelist">도서 반납</a></li>
					<li><a href="rentlist">도서 대여</a></li>
					<li><a href="booklist">도서 리스트</a></li>
					<li><a href="bookstats">도서 통계</a></li>
					<li><a href="addbook">도서 등록</a></li>
				</ul>
			</li>
			<li class="navi_set" id="community">
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


				<form class="form-horizontal" method="post" action="namesearch"
					role="form">
					<div class="col-md-5">
						<input type="text" name="name" class="form-control"
							placeholder="검색하실 이름을 입력하세요.">
					
					</div>
					<div class="col-md-2">
						<input type="submit" value="확인" class="btn btn-success">
					</div>
				</form>


				<table class="table table-hover" width="700">
					<tr class="success">
						<td>no</td>
				<td>부서</td>
				<td>이름</td>
				<td>ID</td>
				<td>생년월일</td>
				<td>직급</td>
				<td>증명</td>
					</tr>
					<c:forEach items="${list }" var="manager">
						<tr>
							<td width="30">${manager.rowno }</td>
							<td width="120">${manager.dept_name }</td>
							<td width="80">${manager.mgr_name }</td>

							<td width="120"><a href="modify?id=${manager.mgr_id}">${manager.mgr_id }</a></td>
							<td width="200">${manager.mgr_birth }</td>
							<td width="100">${manager.rank_name }</td>
							<td width="50"><a href="report?id=${manager.mgr_id}"><img
								src="https://cdn4.iconfinder.com/data/icons/ballicons-2-free/100/669348-letter-32.png"></a></td>


						</tr>
					</c:forEach>
				</table>
				
				<nav>
				<ul class="pagination">
					<li><a href="mgr?pg=${ipg-1}" aria-label="Previous"> <span
							aria-hidden="true">&laquo;</span>
					</a></li>
					<c:forEach begin="1" end="${pageCount}" step="1" var="ipg">
						<li><a href="mgr?pg=${ipg}">${ipg}</a></li>
						<c:if test="${ipg != 0}">
							<c:set var="pageCount" value="${ipg+1}" />
						</c:if>
					</c:forEach>

					<li><a href="mgr?pg=${ipg+1}" aria-label="Next"> <span
							aria-hidden="true">&raquo;</span>
					</a></li>

				</ul>
				</nav>
			</div>
			<!-- 오른쪽 주메뉴 내용 끝 -->

			<!-- 왼쪽 주메뉴 시작 -->

  	  	<div id="leftSub1" class="links">
				<ul>
					<li>
						<h2>
							<a href="mgr">인사관리</a>
						</h2>
						<ul style="background: url(images/img10.gif) repeat-x;">
							<li style="background: url(images/img03.gif) repeat-x left bottom;"><a href="mspart">경영지원부</a></li>
							<li style="background: url(images/img03.gif) repeat-x left bottom;"><a href="qcpart">품질관리팀</a></li>
							<li style="background: url(images/img03.gif) repeat-x left bottom;"><a href="fmpart">시설관리팀</a></li>
							<li style="background: url(images/img03.gif) repeat-x left bottom;"><a href="etcpart">기타</a></li>
						</ul>
						<h2>
							<a href="mgradd">직원 등록</a>
						</h2>
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