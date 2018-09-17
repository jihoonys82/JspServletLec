<%@page import="dto.User"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>Action Tag Test</h1>
<hr>
<% if(true) { %>
<jsp:forward page="/view/viewPage.jsp">
	<jsp:param value="123" name="abc"/>
</jsp:forward>
<% } %>
</body>
</html>