<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<title>회원 통계 List</title>

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
		
		$("#chooseCondition").attr("disabled",true);
		$("#contentCondition").attr("disabled",true);
		
		$("input[name=condition]").change(function(){
			if($("input:radio[name=condition]:radio[value='search']").is(":checked")){
				$("#chooseCondition").attr("disabled",false);
				$("#contentCondition").attr("disabled",false);
				$("#rankCondition").attr("disabled",true);
			}else{
				$("#chooseCondition").attr("disabled",true);
				$("#contentCondition").attr("disabled",true);
				$("#rankCondition").attr("disabled",false);
			}
		});
		
		if("${sc.rank}" == "11"){
			$("#pagination2").hide();
		};
		if("${sc.rank}" == "10" || "${sc.rank}" == "5"){
			$("#pagination1").hide();
			$("#pagination2").hide();
		};
	
		
		
		

	});
</script>

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
			
				<form class="form-horizontal" role="form" action="searchStList" method="post">
					<div align="center">
						<input type="radio" name="condition" value="rent" id="condition" checked>대여 
						<input type="radio" name="condition" value="due" id="condition">반납
						<input type="radio" name="condition" value="overdue" id="condition">연체
						<input type="radio" name="condition" value="harm" id="condition">훼손
						<input type="radio" name="condition" value="miss" id="condition">분실
						<input type="radio" name="condition" value="notreturn" id="condition">미반납
						<input type="radio" name="condition" value="search" id="condition">검색
					</div>
					<div align="center">
						<input type="radio" name="sort" value="asc" checked>오름차순
						<input type="radio" name="sort" value="desc">내림차순
						<label>순위</label><select name="rank" id="rankCondition"><option value="11">ALL</option><option value="10" selected>10</option><option value="5">5</option></select>
					</div>
					<!-- <div align="center">
						<input type="radio" name="term" value="ever">전체
						<input type="radio" name="term" value="period">기간
					</div>
					
					<div align="center">
						<input type="text" name="first" id="datepicker">
						<input type="text" name="last" id="datepicker2">
					</div> -->
					
					<div align="center">
						<select name="searchCondition" id="chooseCondition"><option selected value="name">이름</option><option value="ID">ID</option></select>
						<input type="text" name="searchContent" id="contentCondition">
						<input type="submit" value="검색">
					</div>
				</form>
				
				<table class="table table-hover table-condensed">
					<tr>
						<td>번호</td>
						<td>이름</td>
						<td>ID</td>
						<td>대여</td>
						<td>정상반납</td>
						<td>연체</td>
						<td>훼손</td>
						<td>분실</td>
						<td>미반납</td>
					</tr>
					<c:forEach items="${usrlist}" var="usr">
					<tr>
						<td>${usr.rownum}</td>
						<td><a href="mgrUsrStInfo?usrId=${usr.usrId}">${usr.usrName}</a></td>
						<td><a href="mgrUsrStInfo?usrId=${usr.usrId}">${usr.usrId}</a></td>
						<td>${usr.usrRent}</td>
						<td>${usr.usrDue}</td>
						<td>${usr.usrOverDue}</td>
						<td>${usr.usrHarm}</td>
						<td>${usr.usrMiss}</td>
						<td>${usr.usrNotReturn}</td>
					</tr>
					</c:forEach>
					
				</table>
				<br> <br>
				
				<nav id="paging">
				
				<c:if test="${sc.rank == '11'}"> 
				<ul class="pagination" id="pagination1">
					<li id="beforePage">
						<a href="searchStListPage?pg=${ipg-1}&condition=${sc.firstCondition}&sort=${sc.secondCondition}&rank=${sc.rank}" aria-label="Previous" >
						<span aria-hidden="true">&laquo;</span>
						</a>
					</li>
					<c:forEach begin="1" end="${pageCount}" step="1" var="ipg">
						<li id="choosePage"><a href="searchStListPage?pg=${ipg}&condition=${sc.firstCondition}&sort=${sc.secondCondition}&rank=${sc.rank}">${ipg}</a></li>
						<c:if test="${ipg != 0}">
							<c:set var="pageCount" value="${ipg+1}" />
						</c:if>
					</c:forEach>

					<li id="nextPage">
						<a href="searchStListPage?pg=${ipg+1}&condition=${sc.firstCondition}&sort=${sc.secondCondition}&rank=${sc.rank}" aria-label="Next" >
						<span aria-hidden="true">&raquo;</span>
						</a>
					</li>

				</ul>
				</c:if>
				
				<ul class="pagination" id="pagination2">
					<li id="beforePage">
						<a href="mgrUsrStList?pg=${ipg-1}" aria-label="Previous" >
						<span aria-hidden="true">&laquo;</span>
						</a>
					</li>
					<c:forEach begin="1" end="${pageCount}" step="1" var="ipg">
						<li id="choosePage"><a href="mgrUsrStList?pg=${ipg}">${ipg}</a></li>
						<c:if test="${ipg != 0}">
							<c:set var="pageCount" value="${ipg+1}" />
						</c:if>
					</c:forEach>

					<li id="nextPage">
						<a href="mgrUsrStList?pg=${ipg+1} " aria-label="Next" >
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