<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html >
<html>
<head>
   	<meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>글 목록</title>
    <!-- Bootstrap -->
    <link href="/css/bootstrap.min.css" rel="stylesheet">

	<!-- jquery -->
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
	<script src="/js/bootstrap.min.js"></script>	
	<script src="http://code.jquery.com/jquery-1.10.2.js"></script>
</head>

<body>
	<div class="col-xs-12 col-sm-offset-3 col-sm-7 col-md-offset-3 col-md-7 col-lg-offset-3 col-lg-7 ">
		<div class="panel panel-danger">
		<div class="panel-heading">
	        <h3 class="panel-title">등록된 글 목록</h3>
	        <c:if test="${sessionScope.logininfo.name != null }">
			 	<div align="right">
				 	<a href="/Board/logout" ><button  type="button" class="btn btn-danger">로그아웃</button></a>
				</div>
			</c:if>
        </div>
        <div class="panel-body">
			<table class="table table-hover">
		      <thead>
		        <tr align="center">
		          <th align="center">번호</th>
		          <th align="center">제목</th>
		          <th align="center">글쓴이</th>
		          <th align="center">등록일</th>
		          <th align="center">조회수</th>
		          <th align="center">삭제</th>
		        </tr>
		      </thead>
		      
		      <tbody>
		      <!-- 레코드 출력 -->
		      <c:if test="${pageCount == 0 }">
		      	<tr >
		          <td colspan="6" align="center" style="color: red;"><b>레코드가 없습니다.</b></td>
		        </tr>
		      </c:if>
		      
		      <c:if test="${pageCount != 0 }">
			      <c:forEach items="${list }" var="boardDTO" varStatus="status">
			        <tr>
			          <th align="center">${boardDTO.seq }</th>
			          <td><a href="/Board/readform?seq=${boardDTO.seq }&page=${pageCount }" >${boardDTO.title }</a></td>
			          <td>${boardDTO.user_id }</td>
			          <td>${boardDTO.regdate }</td>
			          <td align="right">${boardDTO.read_count }</td>
			          <td align="center"><a href="/Board/delete/?seq=${boardDTO.seq }">삭제</a></td>
			        </tr>
			      </c:forEach>
		      </c:if>
		      </tbody>
		    </table>
		    
		     <!-- 페이지 처리 -->
			<div align="center">
				<nav>
				  <ul class="pagination" >
				  	<c:if test="${page>BLOCK }">
					    <li>
					    	<a href="list?page=1" aria-label="Previous">
					        	<span aria-hidden="true">&laquo;</span>
					      	</a>
					    </li>
					    <li>
						    <a href="list?page=${prevPage-1}" aria-label="Previous">
						      	<span aria-hidden="true">이전</span>
						    </a>
					    </li>
				    </c:if>
				   
			    	<c:forEach var="i" begin="${prevPage }" end="${nextPage }" step="1">
			    		<li><a href="list?page=${i }">${i }</a></li>
					</c:forEach>
				    
				    <c:if test="${nextPage < pageCount }">
					    <li>
						    <a href="list?page=${nextPage+1 }" aria-label="Previous">
						     	<span aria-hidden="true">다음</span>
						    </a>
					    </li>
					    <li>
						    <a href="list?page=${pageCount}" aria-label="Next">
						       	<span aria-hidden="true">&raquo;</span>
						    </a>
					    </li>
				    </c:if>
				  </ul>
				</nav>
			</div>	
  		</div>
	 	</div>
	 	<c:if test="${sessionScope.logininfo.name == null }">
		 	<div align="right">
			 	<a href="AddUserFormServlet" ><button  type="button" class="btn btn-primary">회원가입</button></a>
				<a href="
				loginform"><button type="button" class="btn btn-success">로그인</button></a>
			</div>
		</c:if>
		<c:if test="${sessionScope.logininfo.name != null }">
		 	<div align="right">
		 		<a href="/Board/writeform" ><button  type="button" class="btn btn-success">글 쓰기</button></a>
			</div>
		</c:if>
	</div>
</body>
</html>