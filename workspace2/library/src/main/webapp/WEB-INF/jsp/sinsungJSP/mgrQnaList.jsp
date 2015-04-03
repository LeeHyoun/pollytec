<%@ page language="java" contentType="text/html; charset=UTF-8"  pageEncoding="UTF-8"%>
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

<script src="//code.jquery.com/jquery-1.10.2.js"></script>
<script src="//ajax.googleapis.com/ajax/libs/jquery/1/jquery.min.js"></script>
<script src="//cdn.poesis.kr/post/popup.min.js"></script>
<script src="//code.jquery.com/ui/1.11.4/jquery-ui.js"></script>
<link rel="stylesheet" href="//code.jquery.com/ui/1.11.4/themes/smoothness/jquery-ui.css">

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

<script type="text/javascript">
//페이지 이동
function fn_movePage(val){
    $("input[name=page]").val(val);
    $("form[name=frm]").attr("method", "get");
    $("form[name=frm]").attr("action","mgrQnaList").submit();
}
</script>

</head>


<body>
		<form name="frm">
			<input type="hidden" name="page">
		</form>
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
			<form class="form-horizontal" role="form" action="">
				<div class = "col-md-3">
					<select class = " form-control"	>
						<option>검색조건</option>
						<option>아이디</option>
						<option>이름</option>
					</select>
				</div>
				<div class="col-md-4">
					<input type="text" class=" form-control" placeholder="검색어를 입력하세요">
				</div>
				<div>
					<button type="submit" class="btn btn-default">검색</button>
				</div> 
			</form>
			
  	  		<table class="table table-hover" width="700">
			<tr class="success">
				<td>번호</td>
				<td>제목</td>
				<td>ID</td>
				<td>작성자</td>
				<td>답변여부</td>
				<td>작성일</td>
			</tr>
			
			<c:if test="${bookPageDTO.pageCount != 0 }">
				<c:forEach items= "${qnalist}" var="qna">
				<tr>
					<td>${qna.qnaSeq} </td>
					<td><a href="mgrQnaInfo?usrId=${qna.usrId}">${qna.qnaTitle} </a></td>
					<td>${qna.usrId}</td>
					<td>${qna.usrName } </td>
					<td>${qna.qnaState} </td>
					<td>${qna.qnaDate}</td>			
				</tr>
				</c:forEach>
			</c:if>
			</table>
			<br/> <br/>		
		  <!-- 페이지 처리 -->
			    
			<div align="center">
					<nav>
					  <ul class="pagination" >
					  	<c:if test="${bookPageDTO.page>BLOCK }">
						    <li>
						    	<a href="javascript:fn_movePage(1)" aria-label="Previous">
						        	<span aria-hidden="true">&laquo;</span>
						      	</a>
						    </li>
						    <li>
							    <a href="javascript:fn_movePage('${bookPageDTO.prevPage-1}')" aria-label="Previous">
							      	<span aria-hidden="true">이전</span>
							    </a>
						    </li>
					    </c:if>
					   
				    	<c:forEach var="i" begin="${bookPageDTO.prevPage }" end="${bookPageDTO.nextPage }" step="1">
				    		<li><a href="javascript:fn_movePage('${i }')">${i }</a></li>
						</c:forEach>
					    
					   	<c:if test="${bookPageDTO.nextPage < bookPageDTO.pageCount }">
						    <li>
							    <a href="javascript:fn_movePage('${bookPageDTO.nextPage+1}')" aria-label="Previous">
							     	<span aria-hidden="true">다음</span>
							    </a>
						    </li>
						
						    <li>
							    <a href="javascript:fn_movePage('${bookPageDTO.pageCount}')" aria-label="Next">
							       	<span aria-hidden="true">&raquo;</span>
							    </a>
						    </li>
					    </c:if>
					  </ul>
					</nav>
				</div>
					
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