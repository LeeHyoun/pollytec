<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">
<head>
<meta charset="UTF-8">
<title>자주묻는 질문</title>

<link rel="stylesheet" href="./css/sun/main.css">
<link rel="stylesheet" href="./css/baedo/width.css">
<link rel="stylesheet" href="/resources/demos/style.css">
<link rel="stylesheet"
	href="//code.jquery.com/ui/1.11.4/themes/smoothness/jquery-ui.css">

<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.1/css/bootstrap.min.css">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.1/css/bootstrap-theme.min.css">
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.1/js/bootstrap.min.js"></script>

<script src="//code.jquery.com/jquery-1.10.2.js"></script>
<script src="//ajax.googleapis.com/ajax/libs/jquery/1/jquery.min.js"></script>
<script src="//cdn.poesis.kr/post/popup.min.js"></script>
<script src="//code.jquery.com/ui/1.11.4/jquery-ui.js"></script>



<script>
	$(function() {
		$("#datepicker").datepicker({
			dateFormat : "yy/mm/dd"
		});
		$("#datepicker2").datepicker({
			dateFormat : "yy/mm/dd"
		});

		$("#postcodify_search_button").postcodifyPopUp({});

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
</script>

<script type="text/javascript">
	$(document).ready(function() {
		$(".subnave").hide();
		$(".topnave").hover(function() {
			$(this).parent().find(".subnave").slideDown('normal').show();
			$(this).parent().hover(function() {
			}, function() {
				$(this).parent().find(".subnave").slideUp('fast');
			});
		});

	});
</script>

<script type="text/javascript">
	$(document).ready(function() {
		$(".subnavr").hide();
		$(".topnavr").hover(function() {
			$(this).parent().find(".subnavr").slideDown('normal').show();
			$(this).parent().hover(function() {
			}, function() {
				$(this).parent().find(".subnavr").slideUp('fast');
			});
		});

	});
</script>

<script type="text/javascript">
	$(document).ready(function() {
		$(".subnavf").hide();
		$(".topnavf").hover(function() {
			$(this).parent().find(".subnavf").slideDown('normal').show();
			$(this).parent().hover(function() {
			}, function() {
				$(this).parent().find(".subnavf").slideUp('fast');
			});
		});

	});
</script>

<script type="text/javascript">
	$(document).ready(function() {
		$(".subnavc").hide();
		$(".topnavc").hover(function() {
			$(this).parent().find(".subnavc").slideDown('normal').show();
			$(this).parent().hover(function() {
			}, function() {
				$(this).parent().find(".subnavc").slideUp('fast');
			});
		});

	});
</script>


<style type="text/css">
td {
	width: 90px;
}
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


			<!-- 로그인 안했을때 로그인박스시작 -->
			<!-- <div id="loginbox">
			<input type="radio" name="divide" value="1" checked>회원
			<input type="radio" name="divide" value="2">관리자</br></br>
			  <form id="loginform" class="form-horizontal">
				  <div class="form-group">
				    <label for="inputEmail3" class="col-sm-3 control-label">ID</label>
				    <div class="col-sm-5">
				      <input type="text" class="form-control" id="inputid" placeholder="ID">
				    </div>
				  </div>
				  <div class="form-group">
				    <label for="inputPassword" class="col-sm-3 control-label">Password</label>
				    <div class="col-sm-5">
				      <input type="password" class="form-control" id="inputPassword" placeholder="Password">
				    </div>
				    <div id="loginbtn" class="form-group">
					    <div class="col-sm-offset-2 col-sm-9">
					      <input type="button" class="btn btn-default" value="Log in">
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
		</div> -->
			<!-- 로그인했을때 보이게.. -->
			<div id="loginbox">
				<form class="form-horizontal">
					<div id="insa" class="form-group">
						<img alt="" src="images/user.png"> <label for=""
							class="col-sm-8 control-label">고봉민님 환영</label>
					</div>
					<div id="logoutbtn" class="form-group">
						<div class="col-sm-offset-2 col-sm-8">
							<input type="button" class="btn btn-default" value="Log Out">
						</div>
					</div>
					<div id="mypagebtn" class="form-group">
						<div class="col-sm-offset-2 col-sm-8">
							<input type="button" class="btn btn-default" value="My Page">
						</div>
					</div>
				</form>
			</div>
			<!-- 로그인박스끝 -->

			<!-- 주메뉴시작 -->
			<div id="menu">
				<li class="navi_set">
					<div class="topnav">
						<a href="#">도서관 관리</a>
					</div>
					<ul class="subnav">
						<li><a href="#">도서관 안내</a></li>
						<li><a href="#">도서관 소개</a></li>
						<li><a href="#">오시는 길</a></li>
					</ul>
				</li>
				<li class="navi_set">
					<div class="topnav">
						<a href="#">자료검색</a>
					</div>
					<ul class="subnav">
						<li><a href="#">장르</a></li>
						<li><a href="#">제목</a></li>
						<li><a href="#">저자</a></li>
					</ul>
				</li>
				<li class="navi_set">
					<div class="topnav">
						<a href="#">커뮤니티</a>
					</div>
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
			<!-- 게시판 글쓰기 폼 -->
			<div id="posts">

				<div class="topnave">
					<a>책을 훼손을 했을경우 어떻게해야하나요?</a>
				</div>
				<ul class="subnave">
					<li><a>국민은행 192-658-54449510</a></li>
				</ul>
				
				<div class="topnavf">
					<a>알바생이너무 이쁜거같아요 어떻게해야하나요?</a>
				</div>
				<ul class="subnavf">
					<li><a>기모찌잉~!</a></li>
				</ul>
				
				<div class="topnavc">
					<a>배재성이라는 점원이 맘에안들어요 어떻게해야하나요?</a>
				</div>
				<ul class="subnavc">
					<li><a>롤접속하세요</a></li>
				</ul>
				
				<div class="topnav">
					<a>영선누나가 너무 괴롭히는데 뭔가..방법이없을까요?</a>
				</div>
				<ul class="subnav">
					<li><a>섬집아기 완창하시면 개이득</a></li>
				</ul>
				
				<div class="topnavr">
					<a>너무추워서 책을 태워버렸어요 어떻게하죠?</a>
				</div>
				<ul class="subnavr">
					<li><a>112</a></li>
				</ul>
				





				<!-- <div class="topnav">
						<ul class="subnav">
							<li>
							<section class="question">
								<header>어떤가요</header>
								<div class="answer" style="display: block;">
									<p>
										"이런이런"
										</p>
										</div>
										</li>
										</ul>
										</div>
							</section> -->
			</div>



			<!-- 
		<div id="body" class="panel-body">
			회원가입
			<div id="posts">
				<form class="form-horizontal"><br/><br/>
					<div class="form-group">
						<label for="usr_id" class="col-lg-3 control-label">아이디</label>
							<div class="col-lg-4">
								<input type="text" class="form-control" id="usr_id" placeholder="아이디를 입력해주세요">
   							</div>
   							<div class="form-group">
							    <div class="col-lg-1">
							      <button type="button" class="btn btn-default" onclick="checkID">ID Check</button>
							    </div>
						  </div>
					</div>
					<div class="form-group">
						<label for="usr_pw" class="col-lg-3 control-label">비밀번호</label>
							<div class="col-lg-6">
								<input type="text" class="form-control" id="usr_pw" placeholder="비밀번호를 입력해주세요">
   							</div>
					</div>
					<div class="form-group">
						<label for="usr_pw2" class="col-lg-3 control-label">비밀번호 확인</label>
							<div class="col-lg-6">
								<input type="text" class="form-control" id="usr_pw2" placeholder="비밀번호 확인">
   							</div>
   					</div>
					<div class="form-group">
						<label for="usr_name" class="col-lg-3 control-label">이름</label>
							<div class="col-lg-6">
								<input type="text" class="form-control" id="usr_name" placeholder="이름">
   						</div>
					</div>
					<div class="form-group">
						<label for="usr_gender" class="col-lg-3 control-label">성별</label>
							<div class="col-lg-6">
								<input type="text" class="form-control" id="usr_gender" placeholder="성별">
   							</div>
   					</div>
   					<div class="form-group">
						<label for="usr_email" class="col-lg-3 control-label">이메일</label>
							<div class="col-lg-4">
								<input type="text" class="form-control" id="usr_email" placeholder="이메일">
   							</div>
   							<div class="form-group">
							    <div class="col-lg-1">
							      <button type="button" class="btn btn-default" onclick="checkEmail">Email Check</button>
							    </div>
						  </div>
   					</div>
   					<div class="form-group">
						<label for="zipcode" class="col-lg-3 control-label">우편번호</label>
							<div class="col-lg-6">
								<input type="text" class="form-control" id="zipcode" placeholder="우편번호">
   							</div>
   					</div>
   					<div class="form-group">
						<label for="usr_addr2" class="col-lg-3 control-label">나머지 주소</label>
							<div class="col-lg-6">
								<input type="text" class="form-control" id="usr_addr2" placeholder="나머지 주소">
   							</div>
   					</div><br/>
   					<div class="form-group">
					    <div class="col-lg-offset-3 col-lg-10">
					      <button type="submit" class="btn btn-default">Sign in</button>
					      <button type="button" class="btn btn-default">main</button>
					    </div>
					  </div>
				</form>
			</div>
 -->
			<!-- 회원가입 끝 -->

			<!-- 왼쪽 주메뉴 시작 -->
			<div id="links">
				<ul>
					<li>
						<h2>커뮤니티</h2>
						<ul>
							<li><a href="boardlist">자주묻는 질문</a></li>
							<li><a href="#">자유 게시판</a></li>
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