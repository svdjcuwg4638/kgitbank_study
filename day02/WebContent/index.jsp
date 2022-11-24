
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.text.SimpleDateFormat,java.util.Date"%>
<!DOCTYPE html>	   <!-- 여기에 import하여도 적용가능 -->
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h1>로그인 화면 (boundary)</h1>
<hr>

<!-- method="POST" 비밀번호를 노출시키지 않음 주소창에 -->

<form action="login-control.jsp" method="POST">
	<p><input type="text" name="id" placeholder="ID" autocomplete="off" required autofocus></p>
	<p><input type="text" name="pw" placeholder="PW" required></p>
	<p><input type="submit" value="로그인"></p>
</form>

<%
	SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 hh시 mm분 ss초");
	String now = sdf.format(new Date());
%>

<h3>지금은 <%=now %>입니다</h3>
<h3>서버의 주소는 <%=request.getServerName() %></h3>
<h3>클라이언트의 주소는 <%=request.getRemoteAddr() %>입니다</h3>

</body>
</html>