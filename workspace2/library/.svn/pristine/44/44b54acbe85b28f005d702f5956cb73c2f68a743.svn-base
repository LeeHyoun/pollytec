<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<%
  String masterId       = "okadmin";
  String masterPassword = "okpass";
  String id       = request.getParameter("id");
  String password = request.getParameter("password");
  String message = ""; // 결과 메시지
  String script = "";  // 결과 후 실행할 javascript 
  boolean isLogin = masterId.equals(id) 
                     && masterPassword.equals(password);
  if (isLogin) {
       // 세션에 loginId의 키로 로그인한 id를 넣어둔다.
       session.setAttribute("loginId", id);
       message = "성공적으로 로그인되었습니다.";
       script = "document.location.replace('mgrQnaInfo')";
  } else {
       message = "로그인되지 않았습니다.";
       script = "history.back();";
  }
%><script type="text/javascript">
  // 결과 메시지를 javascript 경고창으로 표시
  alert('<%= message %>');
  <%= script %>
</script>
<title>Insert title here</title>
</head>
<body>

</body>
</html>