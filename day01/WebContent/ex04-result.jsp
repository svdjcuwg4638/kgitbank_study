<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ex04.result.jsp</title>
</head>
<body>

<h1>입력값(파라미터) 받아서 처리하기</h1>
<hr>

<%!
	String adult;
	String name;
	String age;
%>

<%
	name = request.getParameter("name");
	age = request.getParameter("age");
	adult = Integer.parseInt(age) < 20 ? "미성년자": "성인";
%>


<h3><%=name %>님의 나이는 <%=age %>살이고 <%=adult %></h3>

<div>
	<a href="ex04-form.jsp"><button>돌아가기</button></a>
</div>

</body>
</html>