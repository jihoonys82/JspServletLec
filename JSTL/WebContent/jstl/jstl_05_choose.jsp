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
<h1>c:choose</h1>
<hr>

<c:choose>
	<c:when test='${param.sel eq 1}'>
		<h3>1이 선택되었습니다.</h3>
	</c:when>
	<c:when test='${param.sel eq 2}'>
		<h3>2가 선택되었습니다.</h3>
	</c:when>
	<c:when test='${param.sel eq 3}'>
		<h3>3이 선택되었습니다.</h3>
	</c:when>
	<c:otherwise>
		<h3>잘못된 값 입력 </h3>
	</c:otherwise>
</c:choose>

<h1><a href="/jstl/jstl_05_form.jsp">돌아가기</a></h1>

</body>
</html>