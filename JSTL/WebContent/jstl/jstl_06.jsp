<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="java.util.HashMap"%>
<%@page import="java.util.Map"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style> 

<c:forEach var="i" begin="2" end="9">	
	<c:forEach var="j" begin="1" end="9">
		#res${i}${j} {
			background-color:#${i*11}${j*11}00;
			margin: 1px;
			padding : 1px;
		}
	</c:forEach>
</c:forEach>

.clearfix::after {
	content: "";
	clear: both;
	display: table;
}
</style>
</head>
<body>
<h1>c:forEach</h1>
<hr>

<c:forEach var="i" begin="1" end="10" step="2">
	${i} <br>
</c:forEach>

<hr>

<c:set var="sum" value="0" />
<%-- forEach 문을 이용한 1~100의 합계 및 최종출력 --%>
<c:forEach var="i" begin="1" end="100">
	<c:set var="sum" value="${sum + i}" />
</c:forEach>
결과 : ${sum }

<hr>
<%-- 구구단 2~9단까지 --%>
<div class="clearfix">
<c:forEach var="i" begin="2" end="9">
	<div style="float:left; border:1px solid red; padding: 5px; margin:3px;">
		<h3>=== ${i }단 ===</h3> 
		<c:forEach var="j" begin="1" end="9">
			<div id="res${i }${j }">
				${i } * ${j } = ${i*j }<br>
			</div>
		</c:forEach>
	</div>
</c:forEach>
</div>

<hr>

<% 
	Map<Integer, String> map = new HashMap<>();
	map.put(1, "Apple");
	map.put(2, "Banana");
	map.put(3, "Cherry");
%>
<c:forEach var="iter" items="<%=map %>">
	${iter.key } : ${iter.value }<br>
</c:forEach>

<hr>
<%
	List<String> list = new ArrayList<>();
	list.add("Apple");
	list.add("Banana");
	list.add("Cherry");
	list.add("Durian");
	list.add("Eggplant");
%>
<c:forEach var="i" items="<%=list %>" step="2" varStatus="stat" > <%-- begin="1" end="4" --%>
	i : ${i } <br>
	루프 중 현재 인덱스 : ${stat.index }<br>
	루프 실행 횟수 : ${stat.count }<br>
	first : ${stat.first }<br>
	last : ${stat.last }<br>
	step : ${stat.step }<br> 
	---------------<br>
</c:forEach>
</body>
</html>