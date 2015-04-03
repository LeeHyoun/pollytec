<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>리스트</title>
</head>
<body>
<h1>리스트!!</h1>
<br><br>

<table width="700" border="1">
<tr>
<td>seq</td>
<td width="400">title</td>
<td>name</td>
<td>등록일</td>
<td>조회수</td>
</tr>

<c:forEach items="${list }" var="board">
	<tr>
	<td>${board.seq }</td>
	<td width="400"><a href="/board/read?seq=${board.seq}">
	${board.title }</a></td>
	<td>${board.userName }</td>
	<td>${board.regdate }</td>
	<td>${board.readCount }</td>
	</tr>
</c:forEach>
</table>

<br><br>
<c:if test="${ipg > 1 }">
	<a href="/board/list?pg=${ipg-1}">이전페이지</a>
</c:if>

<%-- 
<c:forEach begin="1" end="${pageCount}" var="i">
<h3>${i }</h3>
</c:forEach>
--%>
<c:if test="${ipg < pageCount }">
	<a href="/board/list?pg=${ipg+1}">다음페이지</a>
</c:if>

<c:if test="${sessionScope.logininfo != null}">
	<a href="/board/logout">로그아웃</a> &nbsp;&nbsp;
	<a href="/board/writeform">글쓰기</a>
</c:if>
<c:if test="${sessionScope.logininfo == null}">
	<a href="/board/loginform">로그인</a> &nbsp;&nbsp;
	<a href="/board/userjoinform">회원가입</a>
</c:if>
</body>
</html>