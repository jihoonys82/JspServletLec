<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>에러페이지</h1>

정상적인 요청의 URL :  
<%=request.getRequestURI() %>

<%
	// 상태코드 얻기
	Integer statusCode = (Integer) request.getAttribute("javax.servlet.error.status_code");
	// 요청 URI 얻기
	String requestURI = (String) request.getAttribute("javax.servlet.error.request_uri");
	
	// 요청 URI가 명확하지 않다면 Unknown으로 처리하기.
	if(requestURI == null) {
		requestURI="Unknown";
	}
	
	if(statusCode == 404){
		//Not found 
		out.write("<h1>404가 떴어요! </h1>");
		out.write("<h3>404가 떴어요! 관리자를 쪼으세요. </h3>");
		
		out.write("<strong>Status Code</strong> ");
		out.write(statusCode + "<br>");
		
		out.write("<strong>Requested URI</strong> ");
		out.write(requestURI + "<br>");
	}
	
// 	out.write("<strong>Status Code</strong> ");
// 	out.write(statusCode + "<br>");
	
// 	out.write("<strong>Requested URI</strong> ");
// 	out.write(requestURI + "<br>");
%>
</body>
</html>