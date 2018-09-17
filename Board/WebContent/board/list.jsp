<%@page import="board.service.BoardService"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">

</head>
<body>
<div class="container">
	<h1>The Board!</h1>
	<div class="row justify-content-right">
		<div class="col-md-4 input-group mb-3">
			<form class="form-inline" action="/board/pagingList.do" method="get">
				<input class="form-control mr-1" type="text" id="search" name="search" placeholder="${paging.search }" aria-label="search" aria-describedby="searchBtn">
				<input type="submit" class="btn btn-warning" id="searchBtn" value="검색" />
			</form>
		</div>
	</div>
	<table class="table table-responsible table-sm table-hover">
		<thead>
			<tr>
				<th scope="col">선택</th>
				<th scope="col">글번호</th>
				<th scope="col">제목</th>
				<th scope="col">작성자</th>
				<th scope="col">조회수</th>
				<th scope="col">추천수</th>
				<th scope="col">작성일</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${result}" var="item">
				<tr onclick='window.location.replace("/board/view.do?boardNo=${item.boardNo }");'>
					<td scope="row"><input type="checkbox" name="${item.boardNo }" value="${item.boardNo }"/> 
					<td scope="row">${item.boardNo } </td>
					<td>${item.title }</td>	
					<td>${item.writer }</td>
					<td>${item.hit }</td>
					<td>${item.recommend }</td>
					<td><fmt:formatDate dateStyle="short" value="${item.writtenDate }"/> </td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
	<div class="row justify-content-center">
		<jsp:include page="/util/paging.jsp" />
	</div>
	<c:if test="${sessionScope.login eq true }">
		<div>
			<a class="btn btn-primary" href="/board/write.do">글쓰기</a>
		</div>	
	</c:if>
</div>
<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js" integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js" integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy" crossorigin="anonymous"></script>
</body>
</html>