<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%-- Alice Hello! --%>
	<% for(int i=0;i<3;i++){ %>
	<%=request.getAttribute("data") %><br>
	<% } %>
</body>
</html>