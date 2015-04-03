<%@page import="my.GuestbookDTO"%>
<%@page import="java.util.List"%>
<%@page import="my.GuestbookDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	// list.jsp?page=1
	String strPage = request.getParameter("page");
	int ipage = 1;
	try{
		ipage = Integer.parseInt(strPage);
	}catch(Exception ex){}
	GuestbookDAO dao = new GuestbookDAO();
	int count = dao.getGuestbookCount();
	int pageCount = count / 5;
	if(count % 5 > 0) pageCount++;
	List<GuestbookDTO> list = dao.getList(ipage);
%>    
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Guestbook list</title>

    <!-- Bootstrap -->
    <link href="/css/bootstrap.min.css" rel="stylesheet">
	<script src="/js/bootstrap.min.js"></script>
	<!-- jquery -->
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
	<style type="text/css">
		.guestbook_form {margin-bottom: 30px;}
	</style>
  </head>
  <body>
  	<!-- 방명록 title -->
  	<div class="row guestbook_title">
		<div class="col-xs-12 col-sm-offset-3 col-sm-5 col-md-offset-3 col-md-5 col-lg-offset-3 col-lg-5"><h1>방명록</h1></div>
	</div>
	
	<!-- 글쓰기 폼 -->
  	<div class="row guestbook_form">
		<div class="col-xs-12 col-sm-offset-3 col-sm-5 col-md-offset-3 col-md-5 col-lg-offset-3 col-lg-5">
		<form method="post" action="write.jsp">
			<input type="text" class="form-control" name="name" placeholder="이름을 입력하세요.">
			<textarea rows="5" class="form-control" name="content" placeholder="내용을 입력하세요."></textarea>
			 <button type="submit" class="btn btn-success">확인</button>
		</form>
		</div>
	</div>
    <!-- 글 목록 -->
  	<div class="row">
  	<%
  		for(int i = 0; i < list.size(); i++){
  			GuestbookDTO guestbook = list.get(i);
  	%>
		<div class="guestbook_box col-xs-12 col-sm-offset-3 col-sm-5 col-md-offset-3 col-md-5 col-lg-offset-3 col-lg-5">
			<div class="panel panel-primary">
			  <div class="panel-heading"><%=guestbook.getName() %></div>
			  <div class="panel-body">
			    <%=guestbook.getContent() %>
			  </div>
			  <div class="panel-footer"><%=guestbook.getRegdate() %></div>
			</div>
		</div>
	<%
  		} // list
	%>			
	</div>
	
	<!-- 페이지 처리 -->
  	<div class="row">
		<div class="col-xs-12 col-sm-offset-3 col-sm-5 col-md-offset-3 col-md-5 col-lg-offset-3 col-lg-5 ">
			<nav>
			  <ul class="pagination">
			    <li>
			      <a href="#" aria-label="Previous">
			        <span aria-hidden="true">&laquo;</span>
			      </a>
			    </li>
			    <%
			    	for(int i = 1; i <= pageCount; i++){
			    %>
			    <li><a href="list.jsp?page=<%=i%>"><%=i %></a></li>
			    <%
			    	}
			    %>
			    <li>
			      <a href="#" aria-label="Next">
			        <span aria-hidden="true">&raquo;</span>
			      </a>
			    </li>
			  </ul>
			</nav>
		</div>
	</div>	
  </body>
</html>