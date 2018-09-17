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
<%
	User user = new User();
%>

<jsp:useBean id="user2" class="dto.User" scope="page" ></jsp:useBean>
<!-- scope : page, request(요청이 끊어질 때까지), session(클라이언트가 접속을 끊을 때 까지), application(웹 어플리케이션이 끝날 때 까지) -->

<% user.setId("Alice"); %>
스크립트릿 ID: <%=user.getId() %> <br>

<%-- user2에 id 값 set 하기 --%>
<%-- user2.setId("Bob"); --%>
<jsp:setProperty property="id" name="user2" value="Bob" />

<%-- user2의 id값 get 하기 --%>
<%-- user2.getId();  --%>
액션태그 ID : <jsp:getProperty property="id" name="user2"/> 
</body>
</html>