<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

${param.num1 }<br>
${param.num2 }<br>
${param.oper }<br>

<%
	int num1 = Integer.parseInt(request.getParameter("num1"));
	int num2 = Integer.parseInt(request.getParameter("num2"));
	String oper = request.getParameter("oper");
%>
<h2>연산결과</h2>
<h3>
	<c:choose>
		<c:when test='${param.oper eq "add" }'>
			<c:out value="${param.num1 }" />  + <c:out value="${param.num2 }" /> = ${param.num1 + param.num2 }
	 	</c:when>
		<c:when test='${param.oper eq "sub" }'> - 
			<c:out value="${param.num1 }" />  - <c:out value="${param.num2 }" /> = ${param.num1 - param.num2 }
		</c:when>
		<c:when test='${param.oper eq "mul" }'>
			<c:out value="${param.num1 }" />  * <c:out value="${param.num2 }" /> = ${param.num1 * param.num2 }
		</c:when>
		<c:when test='${param.oper eq "div" }'>
			<c:out value="${param.num1 }" />  / <c:out value="${param.num2 }" /> = 
			<fmt:formatNumber pattern="###########.##" value="${param.num1 / param.num2 }" /> 
		</c:when>
		<c:otherwise> ??? 잘못</c:otherwise>
	</c:choose>
</h3>

<h1><a href="/ajax/ajax_01.jsp">이전페이지로 이동</a></h1>
<h1><a href="#" onclick="history.go(-1)">뒤로가기 </a></h1>
</body>
</html>