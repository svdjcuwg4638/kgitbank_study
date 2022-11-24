<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%--

	quiz-form.jsp에서 넘어온
	파라미터를 <table>태그를 이용하여 각각 출력
	
 --%>
 <%!
 	String name;
 	String id;
 	String pw;
 	String email;
 	String sex;
 	String phoneNo;
 	String y;
 	String m;
 	String d;
 %>
 
 <%
 	name= request.getParameter("name");
 	id= request.getParameter("id");
 	pw= request.getParameter("pw");
 	email= request.getParameter("email");
 	y= request.getParameter("y");
 	m= request.getParameter("m");
 	d= request.getParameter("d");
 	sex= request.getParameter("sex");
 	phoneNo= request.getParameter("phoneNo");
 
 %>
 
 <p>ID : <%=id %><br>
	PW : <%=pw %><br>
	이름 : <%=name %><br>
	생년월일 : <%=y %>년 <%=m %>월 <%=d %>일<br>
	email : <%=email %><br>
	성별 : <%=sex %><br>
	전화번호 : <%=phoneNo %></p>
	
	<div>
	<a href="quiz-form.jsp"><button>돌아가기</button></a>
	</div>
</body>
</html>