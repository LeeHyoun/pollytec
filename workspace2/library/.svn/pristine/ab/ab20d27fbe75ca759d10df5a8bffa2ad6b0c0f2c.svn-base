<%@ page language="java" contentType="text/html; charset=UTF-8"
   pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<title>Insert title here</title>
<link rel="stylesheet" href="./css/sun/main.css">
<link rel="stylesheet" href="./css/sun/managermain.css">
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
   
 //페이지 이동
   function fn_movePage(val){
       $("input[name=page]").val(val);
       $("form[name=frm]").attr("method", "get");
       $("form[name=frm]").attr("action","booklist").submit();
   }
	
 	//검색 버튼
   function fn_search(){
      
   	$("input[name=searchDataStart]").val($("#datepicker").val());
   	$("input[name=searchDataEnd]").val($("#datepicker2").val());
 		
       $("input[name=searchFiled]").val($("#searchS").val());
       $("input[name=searchValue]").val($("#searchI").val());
  
       $("input[name=page]").val("1");
       $("form[name=frm]").attr("method", "get");
       $("form[name=frm]").attr("action","booklist").submit();
   }
	
</script>

</head>


<body>
   <div id="mainimg">
      <a href="superMainLibrary"><img alt="" src="images/mainlogo1.PNG"></a>
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
                  <img alt="" src="images/user.png"> <label for="" class="col-sm-8 control-label">관리자님 환영</label>
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
                  <a href="due">도서 관리</a>
               </div>
               <ul class="subnav">
                  <li><a href="#">도서 반납</a></li>
                  <li><a href="#">도서 대여</a></li>
                  <li><a href="#">도서 리스트</a></li>
                  <li><a href="#">도서 통계</a></li>
                  <li><a href="#">도서 등록</a></li>
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
   <%-- <%
                  
                  String id = "";
                  
                  try{
                  id = (String)session.getAttribute("id");            // request에서 id 파라미터를 가져온다
                  
                  if(id==null||id.equals(""){                            // id가 Null 이거나 없을 경우
                  response.sendRedirect("loginform.jsp");    // 로그인 페이지로 리다이렉트 한다.
                  }
                  <%}%> --%>
            <!-- 
                  HttpSession session = request.getSession();
                  session.setAttribute("usrid", usrId);
                   -->
      <div id="body" class="panel-body">



         <div id="posts">
           
               <h1>1:1질응답</h1>
               <div class="form-group">
                  <label style="margin-left: 15px">제목: </label>
                  <label>${qna.qnaTitle} </label>
                  <label  >작성자: ${usr.usrName }</label>
               </div>

               <div style="float: left; margin: auto;">

                  <label>내용</label>

               </div>
               <div style="text-align: right">
               	  
                  <label>${qna.qnaDate}</label>
                  
               </div>

               <div>
                  <textarea  style="width: 620px; height: 150px;" disabled>${qna.qnaContent}</textarea>
               </div>
            
               <br>
               <br>
            	 <form method="post" action="addfw" >
               <div style="float: left;">
                  <label>답변</label>
               </div>
               <div style="text-align: right">
                  관리자ID : <label  name="usrId">alba543</label>
                  글번호 : <label  name="qnaSeq">${qna.qnaSeq}</label>
                  <input type="hidden" value="alba543" name="usrId">
                  <input type="hidden" value="${qna.qnaSeq}" name="qnaSeq">
                <%-- <label>${qna.qnaDate}</label> --%>
               </div>
               		
               <div>
                  <textarea  name="fwContent" style ="width:620px; height:150px;"></textarea>     	 
               </div>
                 <div class="form-group" align="right">
                  <div>
                     <button type="submit" class="btn btn-default" id="updateBtn" >저장</button>
                     &nbsp;&nbsp;&nbsp;
                     <button type="button" class="btn btn-default" id="returnBtn"
                        onclick="location.href='mgrQnaList'">취소</button>
                  </div>
               </div>
               </form>
               <br>
             
               <!--    <div align="center" style="margin-top: 20px">
                  <input type="submit" value="저장" />
                   <input type="button" name="cancelList" value="취소" onclick="location.href='mgrQnaList'" />
               </div> -->
         </div>
         <!--  div id="posts" 끝-->
         
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