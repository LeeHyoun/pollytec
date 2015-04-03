<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
		if("${pageCount}" == 0){
			$("#paging").hide();
		}
		if("${ipg}" == 1){
			$("#beforePage").hide();
		}
		if("${ipg}" == "${pageCount}"){
			$("#nextPage").hide();
		}

	});
</script>

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
					<li><a href="mgrUsrList">회원 리스트</a></li>
					<li><a href="mgrUsrStList">회원 통계</a></li>
					<li><a href="mgrQnaList">1:1 질의 응답</a></li>
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
				<form class="form-inline" role="form" action="mgrUsrSearch">
					<div class="form-group">
						<select name="searchCondition" class = " form-control"	>
							<option value="ID">아이디</option>
							<option value="name">이름</option>
						</select>
						<input type="text" name="searchWord" class=" form-control" placeholder="검색어를 입력하세요">
						<input type="submit" class="btn btn-default" value="검색">
					</div> 
				</form>
	  	  		<table class="table table-hover" width="700">
					<tr class="success" >
						<td>번호</td>
						<td>이름</td>
						<td>ID</td>
						<td>성별</td>
						<td>E-Mail</td>
						<td>휴대폰번호</td>
					</tr>
				
					<c:forEach items="${usrlist}" var="usr">
					<tr>
						<td>${usr.rownum}</td>
						<td><a href="mgrusrupdate?usrId=${usr.usrId}">${usr.usrName }</a> </td>
						<td><a href="mgrusrupdate?usrId=${usr.usrId}">${usr.usrId}</a> </td>
						<td>${usr.usrGender} </td>
						<td>${usr.usrEmail} </td>
						<td>${usr.usrMobile} </td>	
					</tr>	
					</c:forEach>
				</table>
				<br> <br>
				<nav>
				<ul class="pagination" id="paging">
					<li id="beforePage">
						<a href="mgrUsrList?pg=${ipg-1}" aria-label="Previous">
						<span aria-hidden="true">&laquo;</span>
						</a>
					</li>
					<c:forEach begin="1" end="${pageCount}" step="1" var="ipg">
						<li><a href="mgrUsrList?pg=${ipg}">${ipg}</a></li>
						<c:if test="${ipg != 0}">
							<c:set var="pageCount" value="${ipg+1}" />
						</c:if>
					</c:forEach>

					<li id="nextPage">
						<a href="mgrUsrList?pg=${ipg+1}" aria-label="Next">
						<span aria-hidden="true">&raquo;</span>
						</a>
					</li>

				</ul>
				</nav>
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