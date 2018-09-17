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
<h1>c:set session 확인</h1>
<hr>
pageScope : ${pageData }<br>
sessionScope : ${sessionData }<br>

<hr>

pageScope Data : <c:out value="${pageData }" default="pageData 없음" />
<hr>
맵 데이터 <br>
<c:out value='${sessionScope.m.get("A") }' /><br>

<c:out value='${m.get("B") }' />
<h1><a href="jstl_03.jsp">세션값 삭제</a></h1>
</body>
</html>