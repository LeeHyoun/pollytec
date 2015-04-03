<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>대여리스트</title>

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
    	dateFormat: "yy.mm.dd"
    });
    
    $("#datepicker2").datepicker({
    	dateFormat: "yy.mm.dd"
    });
    
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
	
	//페이지 이동
    function fn_movePage(val){
        $("input[name=page]").val(val);
        $("form[name=frm]").attr("method", "get");
        $("form[name=frm]").attr("action","rentlist").submit();
    }
	
  	//검색 버튼
    function fn_search(){
       
    	$("input[name=searchDateStart]").val($("#datepicker").val());
    	$("input[name=searchDataEnd]").val($("#datepicker2").val());
  		
        $("input[name=searchFiled]").val($("#searchS").val());
        $("input[name=searchValue]").val($("#searchI").val());
   
        $("input[name=page]").val("1");
        $("form[name=frm]").attr("method", "GET");
        $("form[name=frm]").attr("action","rentlist").submit();
    }
	
</script>

<script type="text/javascript">
function bookReturn(seq){
    var win = window.open("dueReturn?rentNo="+seq,"Return", "width=370px, height=180px,scrollbars=no,left=750,top=400;");
    popup.focus();
    // POST방식으로 SUBMIT
    var frm = document.form.frm;
    frm.method = "post";
    frm.target = "Return";
    frm.action = "dueReturn";
    frm.submit();  
}
/* function bookReturn(){
	window.opent("dueReturn","Return","width=370px, height=180px")
	popup.focus();
} */
</script>
<script type="text/javascript">
function bookRent(){
	window.open("bookRent","rent", "width=850px, height=700px,scrollbars=no,left=200,top=100;");
	popup.focus();
}
</script>

</head>

<body>
	<div id="mainimg">
		<a href="superMainLibrary"><img src="images/mainlogo1.PNG"></a>
	</div>
	<!-- 오른쪽상단메뉴시작 -->
	<div class="btn-group" role="group" aria-label="...">
		<button type="button" class="btn btn-default"
			onclick="location.href='superMainLibrary';">Home</button>
		<button type="button" class="btn btn-default"
			onclick="location.href='managerMain';">관리자</button>
		<button type="button" class="btn btn-default"
			onclick="location.href='managerMain';">공지사항</button>
	</div>
	<!-- 오른쪽상단메뉴끝 -->
	<div class="panel panel-default">
		<!-- header시작 -->
		<div id="header" class="panel-heading"
			style="background: url(images/main.PNG);">

			<!-- 로그인박스시작 -->
			<div id="loginbox">
				<form class="form-horizontal">
					<div id="insa" class="form-group">
						<img alt="" src="images/user.png"> <label class="col-sm-8 control-label">관리자님 환영</label>
					</div>
					<div id="logoutbtn" class="form-group">
						<div class="col-sm-offset-2 col-sm-8">
							<input type="button" class="btn btn-default" value="Log Out">
						</div>
					</div>
				</form>
			</div>
			<!-- 로그인박스끝 -->
			
<!-- ############################################################################################### -->
			<!-- 주메뉴시작 -->
			<div id="menu">
				<li class="navi_set">
					<div class="topnav">
						<a href="#">인사 관리</a>
					</div>
					<ul class="subnav">
						<li><a href="#">경영 지원부</a></li>
						<li><a href="#">직원 등록</a></li>
					</ul>
				</li>
				<li class="navi_set">
					<div class="topnav">
						<a href="duelist">도서 관리</a>
					</div>
					<ul class="subnav">
						<li><a href="duelist">도서 반납</a></li>
						<li><a href="rentlist">도서 대여</a></li>
						<li><a href="booklist">도서 리스트</a></li>
						<li><a href="bookstats">도서 통계</a></li>
						<li><a href="addbook">도서 등록</a></li>
					</ul>
				</li>
				<li class="navi_set">
					<div class="topnav">
						<a href="#">회원 관리</a>
					</div>
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
<!-- --------------------------------------------------------------------------------------------------- -->
	
	<div id="body" class="panel-body">
	<form name="frm">	
		<input type="hidden" name="page" /><!-- //페이지 번호 -->
		<input type="hidden" name="rentNo" /><!-- //페이지 번호 -->
    	<input type="hidden" name="searchFiled" value="${bookPageDTO.searchFiled }" /><!-- //검색조건 -->
    	<input type="hidden" name="searchValue" value="${bookPageDTO.searchValue }" /><!-- //검색어 -->
    	<input type="hidden" name="searchDateStart" value="${bookPageDTO.searchDateStart }" />
    	<input type="hidden" name="searchDataEnd" value="${bookPageDTO.searchDateEnd }" />	    	
 	</form>
		<div id="posts" style="float:right; width: 80%;">
		<h3>대여 리스트</h3>
			<br>
			<table class="table table-hover" style="font-size: 11px;">
		     <thead>
		     <tr>
	      		<td colspan="5" align="right" ><p></p>날짜검색
	      			<input type="text" id="datepicker" /><strong>~</strong><input type="text" id="datepicker2" />
	      		</td>

	      		<td colspan="5" align="right">
		      		<select id="searchS" style="height: 27px;" >
						<option value="">전체</option>
						<option value="usr_name">회원이름</option>
						<option value="usr_id">회원ID</option>
						<option value="book_title">도서제목</option>
					</select> 
					<input type="text"  id="searchI" value="${bookPageDTO.searchValue }"/>
					<input type="submit" value="검색" onclick="fn_search();"/>
				</td>
		      </tr>
		      	 	<tr>
		               <th>대여번호</th>
		               <th>도서제목</th>
		               <th>대여일자</th>
		               <th>반납일자</th>
		               <th>대여상태</th>
		               <th>회원아이디</th>
		               <th>회원이름</th>
		               <th>핸드폰번호</th>
		               <th>예약상태</th>
		               <th>반납</th>
            		</tr>
		      </thead>
		      <tbody>
		      <!-- 레코드 출력 -->
		      <c:if test="${bookPageDTO.pageCount == 0 }">
		      	<tr >
		          <td colspan="6" align="center" style="color: red;"><b>레코드가 없습니다.</b></td>
		        </tr>
		      </c:if>
		      
		      <c:if test="${bookPageDTO.pageCount != 0 }">
			      <c:forEach items="${list }" var="Rent" varStatus="status">
			        <tr>
				      <th>${Rent.rentNo}</th>
				      <td>${Rent.bookTitle}</td>
				      <td>${Rent.rentDay}</td>
				      <td>${Rent.rentDueday}</td>
				      <td>${Rent.rentState}</td>
				      <td>${Rent.usrId}</td>     
				      <td>${Rent.usrName}</td>
				      <td>${Rent.usrMobile}</td>
				      <td>${Rent.rentBooking}</td>
				 <c:if test="${Rent.rentFlag != 1 }">
				      <td>
						<input type="button"  value="반납" onclick="bookReturn(${Rent.rentNo})"/>
					  </td>
				  </c:if>
			        </tr>
			     </c:forEach>
			   </c:if> 
		      </tbody>
		    </table>
		    <button class="btn btn-default btn-lg" style="float: right; margin-left: 50px;" onclick="bookRent()">대여    
		    </button>

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
				
				
			</div>	<!-- end 페이징 -->
			
			
				<!-- 왼쪽 주메뉴 시작 -->
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
			    <!-- 왼쪽 주메뉴 끝 -->
  	  	<!-- 오른쪽 주메뉴 내용 끝 -->			
  	<!-- #body end -->
  	  	</div>
<!-- --------------------------------------------------------------------------------------------------- -->

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
</body>
</html>
