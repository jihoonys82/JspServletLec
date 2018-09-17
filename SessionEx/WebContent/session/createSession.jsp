<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>세션 생성</h1>
<hr>
<% //JSP에는 session 내장 객체가 준비되어 있음.  request.~ 하고 쓸필요 없다.
	//request.getSession();
	session.setAttribute("test1", "Apple");
	session.setAttribute("test2", "Banana");
	session.setAttribute("test3", "Cherry");
	
	//세션 유지시간 설정
	session.setMaxInactiveInterval(3);
	
%>

<h1><a href="viewSession.jsp">세션확인</a></h1>
</body>
</html>