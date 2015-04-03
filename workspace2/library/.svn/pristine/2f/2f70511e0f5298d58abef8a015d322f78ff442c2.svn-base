<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="./css/sun/managermain.css">
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
   
 });  
 
 
 /* 유효성검사 */
	function check1(){
		
		if(document.form1.noticetitle.value==""){
			alert("제목을 입력해주세요");
			document.getElementById("noticetitle").focus();
			return false;
		}
		if(document.form1.noticecontent.value==""){
			alert("내용을 입력해주세요");
			document.form1.noticecontent.focus();
			return false;
		}
		
		document.form1.submit();
	} 
 
 function check2(){
		if(confirm("정말 삭제 하시겠습니까?")== true){
			location.href='delete?noticeseqseq=${noticedto.noticeseq}';
		}else {
			return;
		}
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
	 		<button type="button" class="btn btn-default" onclick="location.href='managerMain';">관리자</button>
	 		<button type="button" class="btn btn-default" onclick="location.href='managerMain';">공지사항</button>
		</div>
		<!-- 오른쪽상단메뉴끝 -->
		<div  class="panel panel-default">
	<!-- header시작 -->
  	<div id="header" class="panel-heading" style="background: url(images/main.PNG);background-size: 100% 100%;">
	  	
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
				<div class="topnav"><a href="mgr">인사 관리</a></div>
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
  	  	
		 <div id="notice">
			  <h3>공지사항</h3>
			  <!-- 게시판 글하나보기 폼 -->
				<div class="row">
			  	<div class="col-xs-12 col-sm-offset-3 col-sm-5 col-md-offset-3 col-md-5  col-lg-6">
			  	<form id="form1" class="form-horizontal" name="form1" method="POST" action="update" >
			  		제목      : <input type="text" class="form-control" id="noticetitle" name="noticetitle" placeholder="${noticedto.noticetitle}" ><br>
			  		작성자    : <input type="text" class="form-control" id="mgrname" name="mgrname" placeholder="${noticedto.mgrname}" disabled><br>
			  		작성자ID : <input type="text" class="form-control" id="mgrid" name="mgrid" placeholder="${noticedto.mgrid}" disabled><br>
			  		작성일    : <input type="text" class="form-control" id="noticedate" name="noticedate" placeholder="${noticedto.noticedate}" disabled><br>  		
			  		내용      : <textarea class="form-control" id="noticecontent" name="noticecontent"  rows="8" cols="" >${noticedto.noticecontent}</textarea>
			  		 <input type="hidden" name="noticeseq" value="${noticedto.noticeseq}" />
			  	</form>
			  		
				  		 <input id="btn" type="button" onclick="check1();" class="btn btn-warning" value="수정">
				  		
			  		 <input id="btn"  type="button" onclick="location.href='managerMain';" class="btn btn-warning" value="목록보기">
			  	</div>
			  	</div>
			  
		  </div>
  	  	  
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
