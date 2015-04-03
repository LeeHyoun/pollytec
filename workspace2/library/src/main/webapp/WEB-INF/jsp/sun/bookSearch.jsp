<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!doctype html>
<html lang="en">
 <head>
  <meta charset="UTF-8">
  <meta name="Generator" content="EditPlus®">
  <meta name="Author" content="">
  <meta name="Keywords" content="">
  <meta name="Description" content="">
  <title>Document</title>
<link rel="stylesheet" href="./css/sun/main.css">
 <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.1/css/bootstrap.min.css">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.1/css/bootstrap-theme.min.css">
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.1/js/bootstrap.min.js"></script>
<script src="http://code.jquery.com/jquery-1.10.2.min.js"></script>
<script type="text/javascript">
$(document).ready(function(){  
	   $(".subnav").hide();
	  $(".topnav").hover(function() {                    
	   $(this).parent().find(".subnav").slideDown('normal').show();                   
	   $(this).parent().hover(function() {  
	   }, function(){  
	    $(this).parent().find(".subnav").slideUp('fast');                
	   });  
	  });  
	  
	  
	  $("#libraryinfo").css("display", "block");
	  $("#libManageContent").css("display", "none");
	  $("#libraryuse").css("display", "none"); 
	  $("#leftSub1").css("display", "none");
	  $("#leftSub2").css("display", "block");
	  $("#leftSub3").css("display", "none");
	  
	///////////////////////////도서관관리를 누를때
	 $("#libManage").click(function(){
		$("#libraryinfo").css("display", "block");
		$("#libManageContent").css("display", "none");
		$("#libraryuse").css("display", "none");
		$("#leftSub1").css("display", "block");
		$("#leftSub2").css("display", "none");
		$("#leftSub3").css("display", "none");
	 });
	///////////////////////////자료검색을 누를때
	  $("#dataSearch").click(function(){
		$("#libraryinfo").css("display", "none");
		$("#libManageContent").css("display", "none");
		$("#libraryuse").css("display", "none");
		$("#leftSub1").css("display", "none");
		$("#leftSub2").css("display", "block");
		$("#leftSub3").css("display", "none");
	  });
	/////////////////////////커뮤니티를 누를때
	  $("#community").click(function(){
			$("#libraryinfo").css("display", "none");
			$("#libManageContent").css("display", "none");
			$("#libraryuse").css("display", "none");
			$("#leftSub1").css("display", "none");
			$("#leftSub2").css("display", "none");
			$("#leftSub3").css("display", "block");
		  });
	   
});  

function login() {
	document.loginform.submit();
} 
function login2(){
 document.getElementById("inputid").focus();
}

function logout() {
 document.loginform2.submit();
}
</script>
<style type="text/css">


</style>
</head>
<body>
		<div id="mainimg"><a href="superMainLibrary"><img alt="" src="images/mainlogo1.PNG"></a></div>
	  	<!-- 오른쪽상단메뉴시작 -->
	  	<div class="btn-group" role="group" aria-label="...">
	  		<button type="button" class="btn btn-default" onclick="location.href='superMainLibrary';">Home</button>
	 		<c:if test="${empty sessionScope.usr}">
		 		<button type="button" class="btn btn-default" onclick="login2();">Login</button>
		 		<button type="button" class="btn btn-default">회원가입</button>
		 		<button type="button" class="btn btn-default" onclick="location.href='managerMain';" >관리자</button>
	 		</c:if>
		</div>
		<!-- 오른쪽상단메뉴끝 -->
	<div  class="panel panel-default">
	<!-- header시작 -->
  	<div id="header" class="panel-heading" style="background: url(images/main.PNG);background-size: 100% 100%;">
	  	
		
		<!-- 로그인 안했을때 로그인박스시작 -->
		<c:if test="${empty sessionScope.usr }">
		<div id="loginbox">
			<input type="radio" name="divide" value="1" checked>회원
			<input type="radio" name="divide" value="2">관리자</br></br>
			  <form id="loginform" class="form-horizontal" name="loginform" method="POST" action="usrlogin">
				  <div class="form-group">
				    <label for="inputId" class="col-sm-3 control-label">ID</label>
				    <div class="col-sm-5">
				      <input type="text" id="inputid" class="form-control" name="usrId"  placeholder="ID">
				    </div>
				  </div>
				  <div class="form-group">
				    <label for="inputPassword" class="col-sm-3 control-label">Password</label>
				    <div class="col-sm-5">
				      <input type="password" id="inputPassword" class="form-control" name="usrPw" placeholder="Password">
				    </div>
				    <div id="loginbtn" class="form-group">
					    <div class="col-sm-offset-2 col-sm-9">
					      <input type="button" class="btn btn-default" onclick="login();" value="Log in">
					    </div>
				  	  </div>
				  </div>
				  
				  <div  id="rememberid" class="form-group">
				    <div class="col-sm-offset-1 col-sm-12">
				      <div class="checkbox">
				        <label>
				          <input type="checkbox">ID기억
				        </label>
				      </div>
				    </div>
				  </div>
				  <div id="btns">
				  	<a href="#">회원가입</a>
					<a href="#">아이디</a>/<a href="#">비밀번호찾기</a>
				  </div>
			  </form>
		</div>
	    </c:if>
		
		<!-- 로그인했을때 보이게.. -->

		<c:if test="${not empty sessionScope.usr }"> 

		<div id="loginbox2">
			  <form class="form-horizontal" name="loginform2" method="POST" action="logout">
				  <div id="insa" class="form-group">
				  	<img alt="" src="images/user.png">
				    <label for="" class="col-sm-8 control-label">${usr.usrName} 님</label>
				  </div>
				  <div id="loginbtn" class="form-group">
				    <div class="col-sm-offset-2 col-sm-8">
				    	<input type="hidden" name="usrId" value="${sessionScope.usr }">
				      <button type="button" class="btn btn-default" onclick="logout();" >Log Out</button>
				    </div>
				  </div>
				  <div id="joinbtn" class="form-group">
				    <div class="col-sm-offset-2 col-sm-8">
				      <button type="submit" class="btn btn-default">My Page</button>
				    </div>
				  </div>
			  </form>
		</div> 
		</c:if> 
		<!-- 로그인박스끝 -->
		
		<!-- 주메뉴시작 -->
		<div id="menu">
			<li class="navi_set" id="libManage">
				<div class="topnav" ><a href="mainLibrary">도서관 관리</a></div>
				<ul class="subnav">
					<li><a href="mainLibrary">도서관 소개</a></li>
					<li><a href="useLibrary">도서관 안내</a></li>
					<li><a href="comeLibrary">오시는 길</a></li>
				</ul>
			</li>
			<li class="navi_set" id="dataSearch">
				<div class="topnav"><a href="bookSearch">자료검색</a></div>
				<ul class="subnav">
					<li><a href="genre">장르</a></li>
					<li><a href="titlesearch">제목</a></li>
					<li><a href="writersearch">저자</a></li>
				</ul>
			</li>
			<li class="navi_set" id="community">
				<div class="topnav"><a href="#">커뮤니티</a></div>
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
  	  	
		<div id="libraryinfo" class="posts">
  	  		<h3>신작도서</h3>
  	  		
		  	<div  style="clear:both;"></div>
			  <!-- 신작도서 이미지 시작 -->
			  
			  <c:forEach items="${getimglist}" var="getimglist">
				  <div  style="width: 140px; height: 110px; overflow: hidden; margin-left:-20px;" class="col-sm-4 col-md-3 bookimg">
				    <div class="thumbnail">
				      <a href="detailbook?bookno=${getimglist.bookNo}"><img src="images/book/${getimglist.bookImg}" alt="..." style="width: 110px; height: auto;"></a>
				    </div>
				  </div>
		 	  </c:forEach>
			 
			  <!-- 신작도서 이미지 끝 -->
			<div class="posts" style="margin-right:1px;margin-top:10px; "> 
			<%--   <h3>Best도서</h3>
  	  		
		  	<div  style="clear:both;"></div>
			  <!-- Best도서 이미지 시작 -->
			  <c:forEach items="${getimglist}" var="getimglist">
				  <div   class="col-sm-4 col-md-3 bookimg" style="margin-left:-20px;">
				    <div class="thumbnail">
				      <a href="detailbook?bookno=${getimglist.bookNo}"><img src="images/book/${getimglist.bookImg}" alt="..."></a>
				    </div>
				  </div>
		 	  </c:forEach>
			  <!-- Best도서 이미지 끝 --> --%>
  	  
  	  	
  	  
  	  	<div id="libraryuse" class="posts">
  	  		<img  alt="" src="">
  	  		<p>도서대출 규정</p>
				<p>도서대출은 회원증을 소지한 본인만 가능</p>
				<p>대출권수 및 기간 : 1인 7권 14일 (1회 연장가능(반납예정일로부터 7일), 단 예약도서는 연장불가)</p>
				<p>대출연장신청 : 반납예정일 하루 전 또는 반납예정일 당일 가능</p>
			<p>도서연체 규정</p>
				<p>연체일수에 해당하는 일수 만큼 대출 정지</p>
			<p>반납</p>
				<p>자료실 이용시간 이후에는 무인자동반납기 또는 반납함에 반납가능</p>
			<p>문의</p>
				<p>중앙도서관 : ☎ 390-8866</p>
  	  	</div>
  	  	<div id="libManageContent" class="posts">
  	  		<img  alt="" src="images/way.PNG">
  	  		<p>지하철 /도보</p>
			<p>8호선 - 산성역 하차 1번 출구 - 남한산성 방향으로 약 250m 직진</p>
			<p>버스 /도보</p>
			<p>시외버스 - 성남 모란지하터미널 하차 지하철 잠실행 승차 후 산성역 하차후 남한산성 방향으로 약 250m 직진</p>
			<p>성남시내버스 - 2,2-1번, 5, 9, 31, 88, 88-1번 50번</p>
				<p>산성동 버스종점 하차</p>
				<p>대학정문앞 하차</p>
				<p>신흥동 주공아파트 하차후 남한산성 방향으로 약 300m 직진</p>
			<p>서울~성남 4420번 - 신흥동 주공아파트 하차후 남한산성 방향으로 약 300m 직진</p>
  	  	</div>
  	  	</div>
  	  	<!-- 오른쪽 주메뉴 내용 끝 -->
  	  	</div>
  	  	<!-- 왼쪽 주메뉴 시작 -->
  	  	<div>
	    <div id="leftSub2" class="links">
	      <ul>
	        <li>
	          <h2>자료 검색</h2>
	          <ul style="background: url(images/img10.gif) repeat-x;">
	            <li style="background: url(images/img03.gif) repeat-x left bottom;"><a href="genre">장르</a></li>
	            <li style="background: url(images/img03.gif) repeat-x left bottom;"><a href="titlesearch">제목</a></li>
	            <li style="background: url(images/img03.gif) repeat-x left bottom;"><a href="writersearch">저자</a></li>
	          </ul>
	        </li>
	      </ul>
	    </div>
	    <div style="clear: both;">&nbsp;</div>
	    
	    <div id="leftSub3" class="links">
	      <ul>
	        <li>
	          <h2>커뮤니티</h2>
	          <ul style="background: url(images/img10.gif) repeat-x;">
	            <li style="background: url(images/img03.gif) repeat-x left bottom;"><a href="#">자주묻는질문</a></li>
	            <li style="background: url(images/img03.gif) repeat-x left bottom;"><a href="#">자유게시판</a></li>
	          </ul>
	        </li>
	      </ul>
	    </div>
	    <div style="clear: both;">&nbsp;</div>
	    </div>
	    <!-- 왼쪽 주메뉴 끝 -->
	    
  	</div>
  	
  	<!-- body끝 -->
  	<!-- footer시작 -->
  	<div id="footer" class="panel-footer">
  		<div id="mainlogo"><img alt="" src="images/mainlogo.png"></div>
  		<p id="mainname"><span>NewStarLibrary</span></p>
  		<p>[461-711] 경기도 성남시 수정구 수정로 398</p> 
		<p>전화 : 031)739-4000 팩스 : 교학처 031)749-3375 행정처 031)749-3374 산학협력처 031)735-2098</p>
		<p>COPYRIGHT 2015 BY nine people</p>
  	</div>
  	<!-- footer끝 -->
	</div>
</body>
</html>
    