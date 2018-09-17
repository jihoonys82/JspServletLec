<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%-- <% System.out.println("AJAX Request Test"); %> --%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

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
