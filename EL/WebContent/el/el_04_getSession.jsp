<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>세션 정보 확인</h1>
<hr>
	${sessionScope.SESSION_TEST}<br>
	${SESSION_TEST }<br>
	
<%=session.getAttribute("SESSION_TEST") %>

<% if((boolean)session.getAttribute("login")) {%>
	로그아웃버튼
<% } %>



</body>
</html>