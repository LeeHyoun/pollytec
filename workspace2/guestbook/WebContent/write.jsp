<%@page import="my.GuestbookDAO"%>
<%@page import="my.GuestbookDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	// 파라미터를 읽어들인다.
	// name="name"
	String name = request.getParameter("name");
	String content = request.getParameter("content");
	// 파라미터를 검사한다.
	if(name != null || "".equals(name)){
%>
<script>
alert("이름을 입력!!!");
history.go(-1);
</script>
<%		
	}
	if(content != null || "".equals(content)){
%>
<script>
alert("내용을 입력!!!");
history.go(-1);
</script>
<%		
	}
	// 프로그램 로직이 수행된다.
	GuestbookDTO guestbook = new GuestbookDTO();
	guestbook.setName(name);
	guestbook.setContent(content);
	
	GuestbookDAO dao = new GuestbookDAO();
	dao.addGuestbook(guestbook);
	
	// forward or redirect한다.
	response.sendRedirect("list.jsp");
%>