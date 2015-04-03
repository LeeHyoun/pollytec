<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<title>회원 통계 상세</title>

<link rel="stylesheet" href="./css/sun/main.css">
<link rel="stylesheet" href="./css/sun/managermain.css">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.1/css/bootstrap.min.css">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.1/css/bootstrap-theme.min.css">
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.1/js/bootstrap.min.js"></script>
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

		$('#returnBtn').click(function() {
			location.replace('mgrUsrStList');
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
				<div>
				<table class="table">
					<tr>
						<td width = "25%">
							<label >ID: </label>
							<label class="usrId">${usr.usrId}</label>
						</td>
						<td width = "40%">
							<label>이름: </label>
							<label class="usrName">${usr.usrName}</label>
						</td>
						<td width = "35%">
							<label>휴대폰 번호: </label>
							<label class="usrMobile">${usr.usrMobile}</label>
						</td>
					</tr>
				</table>
					
					
					
					
					
					
				</div>
				<div class="panel panel-default">
					<div class="panel-heading">
						<label>대여: </label>
						<label>${usrSt.usrRent} 권</label>
						<button type="button"  onclick="location.href='usrRentInfo?usrId=${usr.usrId}'"> More + </button>
					</div>
					 <table class="table">
					 	<tr>
					 		<td>번호</td>
					 		<td>제목</td>
					 		<td>저자</td>
					 		<td>출판사</td>
					 		<td>대여날짜</td>
					 	</tr>
					 	<c:forEach items="${rentlist}" var="rent">
					 	<tr>
					 		<td>${rent.rownum}</td>
					 		<td>${rent.bookTitle }</td>
					 		<td>${rent.bookWriter }</td>
					 		<td>${rent.bookCompany }</td>
					 		<td>${rent.rentDay }</td>
					 	</tr>
					 	</c:forEach>
					 </table>
				</div>
				
				<div class="panel panel-default">
					<div class="panel-heading">
						<label>정상반납: </label>
						<label>${usrSt.usrDue}권</label>
						<button type="button"  onclick="location.href='usrDueInfo?usrId=${usr.usrId}'"> More + </button>
					</div>
					 <table class="table">
					 	<tr>
					 		<td>번호</td>
					 		<td>제목</td>
					 		<td>저자</td>
					 		<td>출판사</td>
					 		<td>반납날짜</td>
					 	</tr>
					 	<c:forEach items="${duelist}" var="due">
					 	<tr>
					 		<td>${due.rownum}</td>
					 		<td>${due.bookTitle }</td>
					 		<td>${due.bookWriter }</td>
					 		<td>${due.bookCompany }</td>
					 		<td>${due.dueReturnDay }</td>
					 	</tr>
					 	</c:forEach>
					 </table>
				</div>
				
				<div class="panel panel-default">
					<div class="panel-heading">
						<label>연체: </label>
						<label>${usrSt.usrOverDue}권</label>
						<button type="button"  onclick="location.href='usrOverDueInfo?usrId=${usr.usrId}'"> More + </button>
					</div>
					 <table class="table">
					 	<tr>
					 		<td>번호</td>
					 		<td>제목</td>
					 		<td>저자</td>
					 		<td>출판사</td>
					 		<td>연체기간</td>
					 	</tr>
					 	<c:forEach items="${overduelist}" var="overdue">
					 	<tr>
					 		<td>${overdue.rownum}</td>
					 		<td>${overdue.bookTitle }</td>
					 		<td>${overdue.bookWriter }</td>
					 		<td>${overdue.bookCompany }</td>
					 		<td>${overdue.dueOverDue }</td>
					 	</tr>
					 	</c:forEach>
					 </table>
				</div>
				
				<div class="panel panel-default">
					<div class="panel-heading">
						<label>훼손: </label>
						<label>${usrSt.usrHarm}권</label>
						<button type="button"  onclick="location.href='usrHarmInfo?usrId=${usr.usrId}'"> More + </button>
					</div>
					 <table class="table">
					 	<tr>
					 		<td>번호</td>
					 		<td>제목</td>
					 		<td>저자</td>
					 		<td>출판사</td>
					 		<td>훼손내역</td>
					 	</tr>
					 	<c:forEach items="${harmlist}" var="harm">
					 	<tr>
					 		<td>${harm.rownum}</td>
					 		<td>${harm.bookTitle }</td>
					 		<td>${harm.bookWriter }</td>
					 		<td>${harm.bookCompany }</td>
					 		<td>${harm.dueRecord }</td>
					 	</tr>
					 	</c:forEach>
					 </table>
				</div>
				
				<div class="panel panel-default">
					<div class="panel-heading">
						<label>분실: </label>
						<label>${usrSt.usrMiss}권</label>
						<button type="button"  onclick="location.href='usrMissInfo?usrId=${usr.usrId}'"> More + </button>
					</div>
					 <table class="table">
					 	<tr>
					 		<td>번호</td>
					 		<td>제목</td>
					 		<td>저자</td>
					 		<td>출판사</td>
					 		<td>분실날짜</td>
					 	</tr>
					 	<c:forEach items="${misslist}" var="miss">
					 	<tr>
					 		<td>${miss.rownum}</td>
					 		<td>${miss.bookTitle }</td>
					 		<td>${miss.bookWriter }</td>
					 		<td>${miss.bookCompany }</td>
					 		<td>${miss.dueReturnDay }</td>
					 	</tr>
					 	</c:forEach>
					 </table>
				</div>
				
				<div class="panel panel-default">
					<div class="panel-heading">
						<label>미반납: </label>
						<label>${usrSt.usrNotReturn}권</label>
						<button type="button"  onclick="location.href='usrNotReturnInfo?usrId=${usr.usrId}'"> More + </button>
					</div>
					 <table class="table">
					 	<tr>
					 		<td>번호</td>
					 		<td>제목</td>
					 		<td>저자</td>
					 		<td>출판사</td>
					 		<td>대여날짜</td>
					 	</tr>
					 	<c:forEach items="${notreturnlist}" var="notreturn">
					 	<tr>
					 		<td>${notreturn.rownum}</td>
					 		<td>${notreturn.bookTitle }</td>
					 		<td>${notreturn.bookWriter }</td>
					 		<td>${notreturn.bookCompany }</td>
					 		<td>${notreturn.rentDay }</td>
					 	</tr>
					 	</c:forEach>
					 </table>
				</div>
				<button id="returnBtn"> 돌아가기 </button>
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