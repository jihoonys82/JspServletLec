<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>세션 삭제</h1>
<hr>
<%
	session.invalidate();
%>

<h1><a href="createSession.jsp">세션생성</a></h1>
<h1><a href="viewSession.jsp">세션확인</a></h1>
</body>
</html>