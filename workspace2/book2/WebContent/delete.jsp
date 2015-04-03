<%@page import="sun.nio.cs.HistoricallyNamedCharset"%>
<%@page import="bookDAO.BookDAO"%>
<%@page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%
	// 파라미터를 읽어들인다.
	// name="name"
	String id = request.getParameter("id");
	
	if(id == null || "".equals(id))
	{
		%>
		<script>
		alert("해당 글이 없습니다.");
		history.go(-1);
		</script>
		<%
	}else{
		int intId = Integer.parseInt(id);
		
		BookDAO dao = new BookDAO();
		dao.deleteBook(intId);
		
		// forward or redirect한다.
		response.sendRedirect("index.jsp");
	}
%>