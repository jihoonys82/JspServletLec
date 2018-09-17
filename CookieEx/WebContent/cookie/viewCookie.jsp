<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>쿠키 확인</h1>
<hr>

<%
	Cookie[] cookies = request.getCookies();
	for(int i=0; i<cookies.length;i++) {%>
<%-- <p> Name : <%=cookies[i].getName()%>, Value : <%=cookies[i].getValue() %></p> --%>
	<%=cookies[i].getName() + "=" + cookies[i].getValue()+ "<br>" %>
<%	}%>

<h1><a href="createCookie.jsp">쿠키 생성</a></h1>
<h1><a href="updateCookie.jsp">쿠키 수정</a></h1>
<h1><a href="deleteCookie.jsp">쿠키 삭제</a></h1>

</body>
</html>