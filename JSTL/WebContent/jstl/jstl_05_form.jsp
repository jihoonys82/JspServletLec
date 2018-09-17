<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>c:choose - form</h1>
<hr>

<form action="/jstl/jstl_05_choose.jsp" method="post"> 
	<select name="sel">
		<option value="1">one</option>
		<option value="2">two</option>
		<option value="3">three</option>
	</select>
	
	<input type="submit"  value="제출" />
<!-- 	<button type="button"><a href="/jstl/jstl_05_choose.jsp">제출</a></button> -->
</form>


</body>
</html>