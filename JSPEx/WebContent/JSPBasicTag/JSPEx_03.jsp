<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP tag Example</title>
</head>
<body>

<%-- Expression --%>
<h3>안녕</h3>

<%
	int num = 123;
	out.println(num); // 브라우저로 전송
	System.out.println(num); // 서버 콘솔
%>

<%-- 표현식 사용 --%>
<%=num%>

<% out.println(num); %>
</body>
</html>