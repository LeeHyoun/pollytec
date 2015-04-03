<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String id = request.getParameter("id");
	String passwd = request.getParameter("passwd");
	
	String dbid = "urstory";
	String dbpasswd = "1234";
	
	if(id.equals(dbid) && passwd.equals(dbpasswd)){
		// jsp 는 이미 session이라는 변수가 선언되어 있다.
		//HttpSession session = request.getSession();
		/* session.setAttribute("logininfo", "ok");
		response.sendRedirect("auth.jsp"); */
		
		Cookie c = new Cookie("logininfo","ok");
		c.setPath("/");
		response.addCookie(c);
	}else{
		response.sendRedirect("loginform.jsp?fail=ok");
	}
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>login.jsp</title>
</head>
<body>
<a href="/CookieTest/auth.jsp">auth.jsp</a>
</body>
</html>