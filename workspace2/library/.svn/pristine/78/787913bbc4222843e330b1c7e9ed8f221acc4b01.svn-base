<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="./css/philho/community.css">
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
	
	function check(){
		
		if(document.form1.searchValue.value==""){
			alert("검색어를 입력해주세요");
			document.getElementById("searchValue").focus();
			return false;
			}
				document.form1.submit();
		}
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
		<div id="body" class="panel-body">
			<!-- 커뮤니티 -->
			<div id="posts">
				<div id="boards">
					
					<div class="col-lg-15 col-lg-offset-6">
				<tr>
				<td colspan="3" align="right">
				<form id="form1" name="form1" method="post" action="boardsearch">
			      		<select name="searchFiled" style="height: 27px;">
							<option value="">전체</option>
							<option value="boardtitle">제목</option>
							<option value="boardid">작성자</option>
						</select>
						<input type="text" name="searchValue"  />
						<input id="btn" type="button" onclick="check();" value="검색" />
						<!-- <input type="submit" value="검색" /> -->
				</form>
						</td>
						</tr> 
						</div>
					<div class="col-lg-12 col-lg-offset-1">
						<table class="table table-striped">
							<tr class="active">
								<td>번호</td>
								<td>제목</td>
								<td>작성자</td>
								<td>작성일</td>
								<td>조회수</td>
							</tr>

							<c:forEach items="${list }" var="board">
								<tr>
									<td>${board.boardSeq }</td>
									<td><a href="boardread?boardSeq=${board.boardSeq}">${board.boardTitle }</a></td>
									<td>${board.usrId }</td>
									<td>${board.boardDate }</td>
									<td>${board.boardCount }</td>
								</tr>
							</c:forEach>
						</table>

						<!-- 페이지 처리 -->
						<div class="row">
							<div class="col-lg-12 col-lg-offset-3">
								<nav>
								<ul class="pagination">
									<li><a href="boardlist?pg=${ipg-1}"
										aria-label="Previous"> <span aria-hidden="true">&laquo;</span>
									</a></li>
									<c:forEach begin="1" end="${pageCount}" step="1" var="ipg">
										<li><a href="boardlist?pg=${ipg}">${ipg}</a></li>
										<c:if test="${ipg != 0}">
											<c:set var="pageCount" value="${ipg+1}" />
										</c:if>
									</c:forEach>
									<li><a href="boardlist?pg=${ipg+1}"
										aria-label="Previous"> <span aria-hidden="true">&raquo;</span>
									
											<a href="/library/boardwriteform?usrId=${usr.usrId}" name="usrId">글쓰기</a>

									</li>
								</ul>
								</nav>
							</div>
						</div>
					</div>
				</div>

				<%-- <div id = "boards">
  	  			 <form class="form-horizontal">
  	  			 <table class="table table-hover">
					<tr class="danger">
						<td>번호</td>
						<td>제목</td>
						<td>날짜</td>
						<td>작성자</td>
						<td>조회수</td>
					</tr>
					<c:forEach items="${list}" var="board">
						<tr>
							<td>${board.seq }</td>
							<td><a href="/board/read?seq=${board.seq}">${board.title }</a></td>
							<td>${board.userName }</td>
							<td>${board.regdate }</td>
							<td>${board.readCount }</td>
						</tr>
					</c:forEach>
				</table>
  	  			 </form> 	  	
  	  	</div> --%>
			</div>
			<!-- 커뮤니티 끝 -->

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