<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>fmt:formatNumber</h1>
<hr>

<fmt:formatNumber value="1234567890" type="number" /><br>
<fmt:formatNumber value="1234567890" type="currency"
	currencySymbol="$" /><br>
<fmt:formatNumber value="1234567890" type="percent"
	groupingUsed="false" /><br>
<hr>


<fmt:formatNumber value="12345.67890" type="number"
	pattern="#####.##" /><br>
<fmt:formatNumber value="12345.67890" type="number"
	pattern="######.######" /><br>
<fmt:formatNumber value="12345.67890" type="number"
	pattern="000000.000000" /><br>
<hr>


<fmt:formatNumber value="0.5" type="percent"/>

</body>
</html>