<%@page import="bookDTO.BookDTO"%>
<%@page import="java.util.List"%>
<%@page import="bookDAO.BookDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">

    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>BOOK</title>
	<!-- Bootstrap -->
    <link href="css/bootstrap.min.css" rel="stylesheet">
    <link href="css/biliboard.css" rel="stylesheet">
	<script src="js/bootstrap.min.js"></script>
	<!-- jquery -->
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
	
</head>
<%
	BookDAO dao = new BookDAO();
		
	String strPage = request.getParameter("page");
	
	int ipage = 1;
	try{
		ipage = Integer.parseInt(strPage);
	}catch(Exception ex){}
	
	int count = dao.getCount();
	int pageCount = count / 5;
	if(count % 5 > 0) pageCount++;
	List<BookDTO> list = dao.getSelect(ipage);
	
%>
<body>
	<div class="row">
	  <div class="col-xs-offset-3 col-xs-5 col-sm-offset-3 col-sm-5 col-md-offset-3 col-md-5 col-lg-offset-3 col-lg-5">
	    <form method="post" action="write.jsp">
		  <div class="form-group">
		    <input type="text" class="form-control" name="name" placeholder="이름">
		    <textarea class="form-control" rows="3" name="content" placeholder="내용"></textarea>
		  </div>
   			<button type="submit" class="btn btn-default" >등록</button>
		</form>		
	  </div>
	  
	  <div class="col-xs-offset-3 col-xs-5 col-sm-offset-3 col-sm-5 col-md-offset-3 col-md-5 col-lg-offset-3 col-lg-5">
	   	<div class="bs-example">
		      <table class="table table-hover">
		      <thead>
		          <tr>
		            <th>#</th>
		            <th>Name</th>
		            <th>Content</th>
		            <th>Regedate</th>
		            <th>DELETE</th>
		          </tr>
		        </thead>
		        <tbody>
	   		<%
	   		if(count == 0){
	   			%>
	   			<tr>
	            	<td colspan="5" align="center">등록된 게시물이 없습니다.</td>
	          	</tr>
	   			<%	
	   		}else{
	   		
	   		for(int i=0; i < list.size(); i++){
	   			BookDTO dto = list.get(i);
	   		%>
	          <tr>
	            <td><%=i+1%></td>
	            <td><%=dto.getName() %></td>
	            <td><%=dto.getContent() %></td>
	            <td><%=dto.getRegdate() %></td>
	            <td><a href="delete.jsp?id=<%=dto.getId()%>">삭제</a></td>
	          </tr>
	   		<%} //for
	   		}%>	
	   	 </tbody>
	      </table>
	      <div class="row">
	  		<div class="col-xs-offset-3 col-xs-5 col-sm-offset-3 col-sm-5 col-md-offset-3 col-md-5 col-lg-offset-3 col-lg-5">
	        <ul class="pagination pagination-sm">
	          <li><a href="index.jsp?page=1">&laquo;</a></li>
	         	<%
			    	for(int i = 1; i <= pageCount; i++){
			    %>
			    <li><a href="index.jsp?page=<%=i%>"><%=i %></a></li>
			    <%
			    	}
			    %>
	          <li><a href="index.jsp?page=<%=pageCount%>">&raquo;</a></li>
	        </ul>
      		</div>
	    </div>
	  </div>
	</div>
</body>
</html>