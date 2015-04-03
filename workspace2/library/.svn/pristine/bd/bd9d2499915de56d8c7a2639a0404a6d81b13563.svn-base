<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>도서 등록</title>

<link rel="stylesheet" 	href="./css/sun/managermain.css">
<link rel="stylesheet"	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.1/css/bootstrap.min.css">
<link rel="stylesheet"	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.1/css/bootstrap-theme.min.css">
<script	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.1/js/bootstrap.min.js"></script>
<script src="http://code.jquery.com/jquery-1.10.2.min.js"></script>

<link rel="stylesheet" href="//code.jquery.com/ui/1.11.4/themes/smoothness/jquery-ui.css">
<script src="//code.jquery.com/jquery-1.10.2.js"></script>
<script src="//code.jquery.com/ui/1.11.4/jquery-ui.js"></script>
<link rel="stylesheet" href="/resources/demos/style.css">

<script>
  $(function() {
    $("#datepicker").datepicker({
    	dateFormat: "yy/mm/dd"
    });
  });
</script>

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
</script>
<script language = "javascript">
function check(){
	if(document.addBook.bookTitle.value==""){
		alert("제목을 입력해주세요.");
		document.addBook.bookTitle.focus();
		return false;
	}
	
	if(document.addBook.bookWriter.value==""){
		alert("저자를 입력해주세요.");
		document.addBook.bookWriter.focus();
		return;
	}
	if(document.addBook.bookCallnumber.value==""){
		alert("청구번호를 입력해주세요.");
		document.addBook.bookCallnumber.focus();
		return;
	}
	if(document.addBook.bookImg.value==""){
		alert("이미지를 등록 해주세요.");
		document.addBook.bookImg.focus();
		return;
	}
	
	if(document.addBook.bookState.value==""){
		alert("도서상태를 입력 해주세요.");
		document.addBook.bookState.focus();
		return;
	}
	
	if(document.addBook.datepicker.value==""){
		alert("발행년도를 선택 해주세요.");
		document.addBook.datepicker.focus();
		return;
	}
	
	if(document.addBook.bookCompany.value==""){
		alert("출판사를 입력 해주세요.");
		document.addBook.bookCompany.focus();
		return;
	}
	if(document.addBook.bookIsbn.value==""){
		alert("Isbn를 입력 해주세요.");
		document.addBook.bookIsbn.focus();
		return;
	}
	ch=document.addBook.bookIsbn.value;
	if(!(ch>='0' && ch<='9')&&(ch>='a' && ch<='z')){
		alert("Isbn을 숫자로 입력 해주세요.(13자리)");
		document.addBook.bookIsbn.focus();
		return;
	}
	
	if(document.addBook.bookIsbn.value.length!=13){
		alert("Isbn을 입력 해주세요.(13자리)");
		document.addBook.bookIsbn.focus();
		document.addBook.bookIsbn.select();
		return;
	}
	
	
	bookPrice=document.addBook.bookPrice.value;
	if(!(bookPrice>='0' && bookPrice<='9')){
		alert("가격을 숫자로 입력 해주세요.");
		document.addBook.bookPrice.focus();
		document.addBook.bookPrice.select();
		return;
	}
	
	if(document.addBook.bookContent.value==""){
		alert("내용을 입력 해주세요.");
		document.addBook.bookContent.focus();
		return;
	}
	document.addBook.submit();
}
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
					<li><a href="/baeboJSP/mgradd.jsp">직원 등록</a></li>
				</ul>
			</li>
			<li class="navi_set">
				<div class="topnav"><a href="duelist">도서 관리</a></div>
				<ul class="subnav">
					<li><a href="duelist">도서 반납</a></li>
					<li><a href="rentlist">도서 대여</a></li>
					<li><a href="booklist">도서 리스트</a></li>
					<li><a href="bookstats">도서 통계</a></li>
					<li><a href="addbook">도서 등록</a></li>
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
  	<div style="float: right; width: 80%;" >
			<form action="write" method="POST" name="addBook">
				<h1>도서등록</h1>
				<table class="table table-hover" >
					<tr>
						<td>제목</td>
						<td><input type="text" name="bookTitle" id="bookTitle"></td>
						<td>발행년도</td>
						<td><input type="text" id="datepicker" name="bookBringout" ></td>
					</tr>
					<tr>
						<td>저자</td>
						<td><input type="text" name="bookWriter" id="bookWriter"></td>
						<td>장르</td>
						<td>
							<select name="genreCode">
									<option value="1">소설</option>
									<option value="2">교육</option>
									<option value="3">참고서</option>
									<option value="4">잡지</option>
									<option value="5">컴퓨터</option>
							</select> 
						</td>
					</tr>
					<tr>
						<td>입고방법</td>
						<td><input type="radio" id="stored" name="bookStored" value="구매" checked="checked" > 구매 
							<input type="radio" id="stored" value="기증" name="bookStored">기증 </td>
						<td>출판사</td>
						<td><input type="text" name="bookCompany" id="bookCompany"></td>
					</tr>
					<tr>
						<td>청구번호</td>
						<td><input type="text" name="bookCallnumber" id="bookCallnumber"></td>
						<td>ISBN</td>
						<td><input type="text" name="bookIsbn" id="bookIsbn" maxlength = "13"></td>
					</tr>
					<tr>
						<td>이미지</td> 
						<td><input type="file" name="bookImg" id="bookImg"></td>
						<td>가격</td>
						<td><input type="text" name="bookPrice" id="bookPrice">원</td>
					</tr>
					<tr>
						<td>도서상태</td>
						<td><input type="text" name="bookState" id="bookState"></td>
						<td>내용</td>
						<td><textarea cols="25" rows="5" type="text" name="bookContent" id="bookContent"></textarea></td>
					</tr>
					<tr align="right">
						<td colspan="4" style="width: 440px;" >
							<input type="button" class="btn btn-default" onclick="check()" value="등록">
							<input type="button" class="btn btn-default" value="취소">
						</td>
					</tr>	
				</table>
			</form>
			</div>
  	  	
  	  <div style="float: left;">  <!-- id="links" -->
			          <h2>도서 관리</h2>
			          <ul>
			            <li><a href="duelist">도서 반납</a></li>
			            <li><a href="rentlist">도서 대여</a></li>
			            <li><a href="booklist">도서 리스트</a></li>
			            <li><a href="bookstats">도서 통계</a></li>
			            <li><a href="addbook">도서 등록</a></li>
			          </ul>
			</div>
	   <div style="clear: both;">&nbsp;</div>
  	  	</div>
  	 <!-- 오른쪽 주메뉴 내용 끝 -->
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
</body>
</html>