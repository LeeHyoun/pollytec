<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<link rel="stylesheet"   href="./css/sun/managermain.css">
<link rel="stylesheet"	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.1/css/bootstrap.min.css">
<link rel="stylesheet"	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.1/css/bootstrap-theme.min.css">
<script	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.1/js/bootstrap.min.js"></script>
<script src="http://code.jquery.com/jquery-1.10.2.min.js"></script>

<link rel="stylesheet" href="//code.jquery.com/ui/1.11.4/themes/smoothness/jquery-ui.css">
<script src="//code.jquery.com/jquery-1.10.2.js"></script>
<script src="//code.jquery.com/ui/1.11.4/jquery-ui.js"></script>
<link rel="stylesheet" href="/resources/demos/style.css">

		<script src="js/eyoonJS/jquery.min.js"></script>
		<script src="js/eyoonJS/highcharts.js"></script>
		<script src="js/eyoonJS/exporting.js"></script>
		<style type="text/css" src="css/eyoonCSS/demo.css">	</style>

<title>도서통계</title>
<script type="text/javascript">
	$(function () {
	    $('#container').highcharts({
	        chart: {
	            type: 'column'
	        },
	        title: {
	            text: '도서관 시스템'
	        },
	        subtitle: {
	            text: '-도서 통계'
	        },
	        xAxis: {
	            categories: [
	                'Jan',
	                'Feb',
	                'Mar',
	                'Apr',
	                'May',
	                'Jun',
	                'Jul',
	                'Aug',
	                'Sep',
	                'Oct',
	                'Nov',
	                'Dec'
	            ]
	        },
	        yAxis: {
	            min: 0,
	            title: {
	                text: '대여 도서 갯수'
	            }
	        },
	        tooltip: {
	            headerFormat: '<span style="font-size:20px">{point.key}</span><table>',
	            pointFormat: '<tr><td style="color:{series.color};padding:0">{series.name}: </td>' +
	                '<td style="padding:0"><b>{point.y:.1f}%</b></td></tr>',
	            footerFormat: '</table>',
	            shared: true,
	            useHTML: true
	        },
	        plotOptions: {
	            column: {
	                pointPadding: 0.2,
	                borderWidth: 0
	            }
	        },
	        series: [{
	            name: '대여',
	            data: [49.9, 71.5, 106.4, 129.2, 144.0, 176.0, 135.6, 148.5, 216.4, 194.1, 95.6, 54.4]
	
	        }, {
	            name: '반납',
	            data: [83.6, 78.8, 98.5, 93.4, 106.0, 84.5, 105.0, 104.3, 91.2, 83.5, 106.6, 92.3]
	
	        }, {
	            name: '훼손',
	            data: [48.9, 38.8, 39.3, 41.4, 47.0, 48.3, 59.0, 59.6, 52.4, 65.2, 59.3, 51.2]
	
	        }]
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
			<!-- 오른쪽 주메뉴 내용시작 -->
			<div id="posts" style="float: right;width:80%;">
				<div id="container" style="width: 800px; height: 400px;">
				</div>
			</div>
		<!-- 왼쪽 주메뉴 시작 -->
  	  	<div style="float: left;"> <!-- id=links  -->
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
  	  	</div>
  	  	<!-- 오른쪽 주메뉴 내용 끝 -->
  	  	

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