<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	/* //HttpSession session = request.getSession();
	String value = (String)session.getAttribute("logininfo");
	if(!"ok".equals(value)){
		response.sendRedirect("loginform.jsp");
		return;
	} */
	
	Cookie[] cookies = request.getCookies();
	if(cookies == null){
		response.sendRedirect("loginform.jsp");
	}
	boolean flag = false;
	for(int i = 0; i < cookies.length; i++){
		if("logininfo".equals(cookies[i].getName())
				&& "ok".equals(cookies[i].getValue())){
			flag = true;
			break;
		}
	}
	if(!flag){
		response.sendRedirect("loginform.jsp");
	}
%>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>auth.jsp</title>
</head>
<body>
<h1>인증된 사용자만 볼수 있어요.</h1>

<a href="/CookieTest/logout.jsp">logout</a>
</body>
</html>