<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>   
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>

<link rel="stylesheet" href="./css/sun/main.css">
<link rel="stylesheet" href="./css/baedo/width.css">
<link rel="stylesheet" href="/resources/demos/style.css">
<link rel="stylesheet" href="//code.jquery.com/ui/1.11.4/themes/smoothness/jquery-ui.css">

<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.1/css/bootstrap.min.css">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.1/css/bootstrap-theme.min.css">
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.1/js/bootstrap.min.js"></script>

<script src="//code.jquery.com/jquery-1.10.2.js"></script>
<script src="//ajax.googleapis.com/ajax/libs/jquery/1/jquery.min.js"></script>
<script src="//cdn.poesis.kr/post/popup.min.js"></script>
<script src="//code.jquery.com/ui/1.11.4/jquery-ui.js"></script>



<script>
$(document).ready(function(){
	   $("#delete").click(function(){
	   document.mgradd.action="delete";
	   document.mgradd.submit();
	   });
	});
$(function() {
  $(".datepicker").datepicker({
     dateFormat: "yy/mm/dd"
  });
  $(".datepicker2").datepicker({
     dateFormat: "yy/mm/dd"
  });
  
  $("#postcodify_search_button").postcodifyPopUp({
   }); 
});

</script>
<script language = "javascript">
function check(){
   if(document.mgradd.mgrname.value==""){
      alert("이름을 입력해주세요.");
        document.mgradd.mgrname.focus();
        return false;
   }
   if(document.mgradd.mgrbirth.value==""){
      alert("생년월일을 입력해주세요.");
        document.mgradd.mgrbirth.focus();
        return false;
   }
   if(document.mgradd.mgrid.value==""){
      alert("아이디를 입력해주세요.");
        document.mgradd.mgrid.focus();
        return false;
   }
   for (i=0;i<document.mgradd.mgrid.value.length ;i++ )
   {
    ch=document.mgradd.mgrid.value.charAt(i);
     if (!(ch>='0' && ch<='9') && !(ch>='a' && ch<='z'))
     {
     alert ("아이디는 소문자, 숫자만 입력가능합니다.");
     document.mgradd.mgrid.focus();
     document.mgradd.mgrid.select();
     return
     }
   }
   if (document.mgradd.mgrid.value.indexOf(" ")>=0)
   {
    alert("아이디에 공백을 사용할 수 없습니다.");
    document.mgradd.mgrid.focus();
    document.mgradd.mgrid.select();
    return
   }
   if (document.mgradd.mgrid.value.length<6 || document.mgradd.mgrid.value.length>12)
   {
    alert ("아이디를 6~12자까지 입력해주세요.");
    document.mgradd.mgrid.focus();
    document.mgradd.mgrid.select();
    return
   }
   if(document.mgradd.mgrpw.value==""){
      alert("패스워드를 입력해주세요.");
        document.mgradd.mgrpw.focus();
        return false;
   }
   if (document.mgradd.mgrpw.value.length<4 || document.mgradd.mgrpw.value.length>12)
   {
    alert ("비밀번호를 4~12자까지 입력해주세요.");
    document.mgradd.mgrpw.focus();
    document.mgradd.mgrpw.select();
    return
   }

   if(document.mgradd.mgrmobile1.value==""){
      alert("핸드폰번호를 입력해주세요.");
        document.mgradd.mgrmobile1.focus();
        return false;
   }
   
   if(document.mgradd.mgrmobile2.value==""){
      alert("핸드폰번호를 입력해주세요.");
        document.mgradd.mgrmobile2.focus();
        return false;
   }
   if(document.mgradd.mgrhp1.value==""){
      alert("집전화번호를 입력해주세요.");
      document.mgradd.mgrhp1.focus();
        return false;
   }
   
   if(document.mgradd.mgrhp2.value==""){
      alert("집전화번호를 입력해주세요.");
        document.mgradd.mgrhp2.focus();
        return false;
   }
   
   if(document.mgradd.mgremail.value==""){
      alert("이메일을 입력해주세요.");
        document.mgradd.mgremail.focus();
        return false;
   }
    
   if(document.mgradd.zipcode1.value==""){
      alert("우편번호를 입력해주세요.");
        document.mgradd.zipcode1.focus();
        return false;
   }
   if(document.mgradd.zipcode2.value==""){
      alert("우편번호를 입력해주세요.");
        document.mgradd.zipcode2.focus();
        return false;
   }
   if(document.mgradd.mgradd1.value==""){
      alert("주소를 입력해주세요");
        document.mgradd.mgradd1.focus();
        return false;
   }
   if(document.mgradd.mgrdate.value==""){
      alert("입사일을 입력해주세요.");
        document.mgradd.mgrdate.focus();
        return false;
   }
   if(document.mgradd.mgrsal.value==""){
      alert("급여를 입력해주세요.");
        document.mgradd.mgrsal.focus();
        return false;
   }
   document.mgradd.action="getmodify";
   document.mgradd.submit();
}


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

</head>
<body>
      <div id="mainimg"><a href="superMainLibrary"><img alt="" src="images/mainlogo1.PNG"></a></div>
        <!-- 오른쪽상단메뉴시작 -->
        <div class="btn-group" role="group" aria-label="...">
           <button type="button" class="btn btn-default" onclick="location.href='superMainLibrary';">Home</button>
          <!-- <button type="button" class="btn btn-default">Login</button>
          <button type="button" class="btn btn-default">회원가입</button>
          <button type="button" class="btn btn-default" onclick="location.href='managerMain';" >관리자</button> -->
      </div>
      <!-- 오른쪽상단메뉴끝 -->
   <div  class="panel panel-default">
   <!-- header시작 -->
  	<div id="header" class="panel-heading" style="background: url(images/main.PNG);background-size: 100% 100%;">
	  	
		<!-- 로그인박스시작 -->
		<div class="loginbox2">
			  <form class="form-horizontal">
				  <div id="insa" class="form-group">
				  	<img alt="" src="images/user.png">
				    <label for="" class="col-sm-8 control-label">${sessionScope.manager.mgr_name} 님 환영</label>
				  </div>
				  <div id="logoutbtn" class="form-group">
				    <div class="col-sm-offset-2 col-sm-8">

				      <input type="button" class="btn btn-default" id="logoutbtn2" value="Log Out">

				      <input type="button" class="btn btn-default" value="Log Out">

				    </div>
				  </div>
			  </form>
		</div>
		<!-- 로그인박스끝 -->
		
		
		
		<!-- 주메뉴시작 -->
		<div id="menu">
			<li class="navi_set" id="libManage">
				<div class="topnav"><a href="mgr">인사 관리</a></div>
				<ul class="subnav">
					<li><a href="#">경영 지원부</a></li>
					<li><a href="#">직원 등록</a></li>
				</ul>
			</li>
			<li class="navi_set" id="dataSearch">
				<div class="topnav"><a href="duelist">도서 관리</a></div>
				<ul class="subnav">
					<li><a href="duelist">도서 반납</a></li>
					<li><a href="rentlist">도서 대여</a></li>
					<li><a href="booklist">도서 리스트</a></li>
					<li><a href="bookstats">도서 통계</a></li>
					<li><a href="addbook">도서 등록</a></li>
				</ul>
			</li>
			<li class="navi_set" id="community">
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
          <form class="form-horizontal" name="mgradd" method="post">
             <h1>직원등록</h1>
      
             <table class="table table-hover" width="700">
         <tr class="success">
            <td>*이름</td>
            <td><input type="edittext" name="mgrname" id="mgrname" value=${manager.mgr_id }></td>
            <td>*부서</td>
            <td>
            <select name="deptno" id="deptno" >
            <option value="101">경영지원부</option>
            <option value="102">시설관리팀</option>
            <option value="103">품질관리팀</option>
            <option value="100">기타</option>
            </select>
            </td>
         </tr>
            <tr>
               <td>*생년월일</td>
               <td><input type="text" class="datepicker" name="mgrbirth" id ="mgrbirth" value= ${manager.mgr_birth } ></td>
               <td>*성별</td>
               <td>남 <input type="radio" id="gender" name="mgrgender" value="M" checked="checked">
                여 <input type="radio" id="gender" value="F" name="mgrgender"></td>
            </tr>
            <tr>
               <td>*ID</td>
               <td><input type="text" name="mgrid" id= "mgrid" value= ${manager.mgr_id } ></td>
               <td>*Password</td>
               <td><input type="password" name="mgrpw" id="mgrpw" value= ${manager.mgr_pw } ></td>
            </tr>
            <tr>
               <td>*핸드폰</td>
               <td>
               <select name="mgrmobile" value="${mgrmobile1}">
               <option value="010">010</option>
               <option value="016">016</option>
               <option value="017">017</option>
               <option value="019">019</option>
               </select> 
               - <input type="text" name="mgrmobile1" maxlength="4" class="width50"  id="mgrmobile1" value= "${mgrmobile2}"> - <input type="text" name="mgrmobile2" maxlength="4" class="width50" id="mgrmobile2" value="${mgrmobile3}">
               </td>
               <td>*집전화</td>
               <td>
               <select name="mgrhp" value="${mgrhp1}" >
               <option value="031">031</option>
               <option value="032">032</option>
               <option value="054">054</option>
               </select> 
               - <input type="text" name="mgrhp1" maxlength="4" class="width50" id="mgrhp1" value="${mgrhp2}"> - <input type="text" name="mgrhp2" maxlength="4" class="width50" id="mgrhp2" value="${mgrhp3}">
               </td>
            </tr>
            <tr>
               <td>*E-mail</td>
               <td><input type="text" name="mgremail" id="mgremail" value= ${manager.mgr_email}></td>
               <td>*직급코드</td>
               <td>
               <select name="ranknum">
      
               <option value="200">사장</option>
               <option value="201">이사</option>
               <option value="202">부장</option>
               <option value="203">차장</option>
               <option value="204">과장</option>
               <option value="205">대리</option>
               <option value="206">사원</option>
               <option value="207">아르바이트</option>
               <option value="208">자원봉사</option>
               </select> 
               </td>
            </tr>
            <tr>
            <td>*우편번호</td>
            <td colspan="3">
            <input type="text" name="zipcode1" class="postcodify_postcode6_1 width50"  value="${zipcode1}")" id="zipcode1"/> &ndash;
            <input type="text" name="zipcode2" class="postcodify_postcode6_2 width50" value="${zipcode2}"  id="zipcode2"  />
            <input type="button" value="검색" id="postcodify_search_button"><br />
            </td>            
            </tr>
            <tr>
            <td>*주소</td>
            <td colspan="3">
            <input type="text" name="mgradd1" class="postcodify_address width400" id="mgradd1" value="${addr1}" />
            </td>            
            </tr>
            <tr>
            <td>*나머지주소</td>
            <td colspan="3">
            <input type="text" name="mgradd2" class="width400" value="${manager.mgr_addr2}"/>
            </td>            
            </tr>
            <tr>
               <td>*입사일</td>
               <td><input type="text" class="datepicker2 mgrdate" name="mgrdate" value="${manager.mgr_date}" disabled></td>
               <td>*급여</td>
               <td><input type="text" name="mgrsal" id="mgrsal" value="${manager.mgr_sal}"></td>
            </tr>
         
            <tr>
               <td>자격증</td>
               <td colspan="3">
               <textarea rows="5" class="width500 form-control" name="mgrlicens" ${manager.mgr_license }></textarea></td>
            </tr>
            <tr>
               <td>경력사항</td>
               <td colspan="3">
               <textarea rows="5" class="width500 form-control" name="mgrcereer" ${manager.mgr_career }></textarea></td>
            </tr>
            <tr>
            <td colspan="3"></td>
               <td align="right"> 
               <input type="button" value="삭제" id="delete"><input type="button" value="수정" onclick="check()">
            </tr>
         </table>
         </form>
          </div>
          <!-- 오른쪽 주메뉴 내용 끝 -->
          
         <!-- 왼쪽 주메뉴 시작 -->

  	  	<div id="leftSub1" class="links">
				<ul>
					<li>
						<h2>
							<a href="mgr">인사관리</a>
						</h2>
						<ul style="background: url(images/img10.gif) repeat-x;">
							<li style="background: url(images/img03.gif) repeat-x left bottom;"><a href="mspart">경영지원부</a></li>
							<li style="background: url(images/img03.gif) repeat-x left bottom;"><a href="qcpart">품질관리팀</a></li>
							<li style="background: url(images/img03.gif) repeat-x left bottom;"><a href="fmpart">시설관리팀</a></li>
							<li style="background: url(images/img03.gif) repeat-x left bottom;"><a href="etcpart">기타</a></li>
						</ul>
						<h2>
							<a href="mgradd">직원 등록</a>
						</h2>
					</li>
				</ul>
			</div>
			<div style="clear: both;">&nbsp;</div>

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