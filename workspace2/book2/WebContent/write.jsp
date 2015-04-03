<%@page import="bookDAO.BookDAO"%>
<%@page import="bookDTO.BookDTO"%>
<%@page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%
	// 파라미터를 읽어들인다.
	// name="name"
	String name = request.getParameter("name");
	String content = request.getParameter("content");
	
	// 파라미터를 검사한다.
	if(name == "" || "".equals(name)){
		%>
		<script>
			alert("이름을 입력!!!");
			history.go(-1);
		</script>
		<%		
	}else if(content == null || "".equals(content)){
		%>
		<script>
			alert("내용을 입력!!!");
			history.go(-1);
		</script>
		<%		
	}else{
		// 프로그램 로직이 수행된다.
		BookDTO dto = new BookDTO();
		dto.setName(name);
		dto.setContent(content);
		
		BookDAO dao = new BookDAO();
		dao.insertBook(dto);
		
		// forward or redirect한다.
		response.sendRedirect("index.jsp");
	}
	%>
	