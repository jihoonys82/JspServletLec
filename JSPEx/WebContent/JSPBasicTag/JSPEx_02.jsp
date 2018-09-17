<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP tag Example</title>
</head>
<body>

<%-- Declaration --%>

<%!	String name= "Alice"; // 변수 선언 %>

<%!  // 메서드 정의
	public void method(){
		System.out.println("Hello, " + name);
	}
%>

<%-- Scriptlet --%>
<%
	method(); // 메서드 호출
%>
</body>
</html>