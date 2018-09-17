<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
</head>
<body>
<div class="container mt-5">
	<div class="card row">
		<div class="card-header ">
			<h2>${post.title }</h2>
		</div>
		<ul class="list-group list-group-flush">
			<li class="list-group-item">
				<div class="d-flex float-left mr-4">ID: ${post.writer}</div>
				<div class="d-flex float-left mr-4">이름: ${post.writerId }</div>
				<div class="d-flex float-left mr-4">조회수<span class="badge badge-pill badge-primary">${post.hit }</span></div>
				<div class="d-flex float-left mr-4">추천수<span class="pdage badge-pill badge-secondary">${post.recommend }</span></div>
				<div class="d-flex float-left">작성일:<fmt:formatDate value="${post.writtenDate }" /> </div>
			</li>
			<li class="list-group-item">
				<article>
					${post.content }
				</article>
			</li>
			<li class="list-group-item">
				<button id="btnList" class="btn btn-primary btn-sm">목록 </button>
<%-- 				<c:if test="${post.writerId eq sessionScope.userId }"> --%>
					<button id="btnEdit" class="btn btn-info btn-sm">수정</button>
					<button id="btnDelete" class="btn btn-warning btn-sm">삭제</button>
<%-- 				</c:if> --%>
				<c:if test="${post.writerId ne sessionScope.userId }">
					<button id="btnRecommend" class="btn btn-success btn-sm">추천</button>
				</c:if>
			</li>
		</ul>
	</div>
	
	<div class="card mt-3">
		<ul class="list-group">
			<li class="list-group-item">
				<form action="/board/view.do" method="post">
					<div class="form-group">
						<input type="text" readonly class="form-control" id="writer" name="writer" value="${sessionScope.writer }" />
					</div> 
					<div class="form-group">
						<textarea class="form-control" id="reply" name="reply" rows="5"></textarea>
					</div>
					<div class="form-group">
						<input type="submit" class="btn btn-primary" value="입력완료" />
					</div>
				</form>
			</li>
			<c:forEach items="${reply }" var="item">
				<li class="list-group-item">
					<div>${item.commentNo } - ${item.writer } - ${item.writtenDate } </div>
					<div>${item.content }</div>
					<c:if test="${sessionScope.writerId eq item.userId }">
						<div><a href="" class="btn btn-danger">댓글 삭제</a> </div>				
					</c:if>
				</li>
			</c:forEach>
			<!--  댓글 기능 구현 중 .  -->
		</ul>
	</div>
</div>

<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js" integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js" integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy" crossorigin="anonymous"></script>
<script type="text/javascript">
$(document).ready(function() {
	$("#btnList").click(function() {
		$(location).attr("href", "/board/pagingList.do");
	});
	$("#btnEdit").click(function() {
		$(location).attr("href", "/board/update.do?boardNo="+${post.boardNo});
	});
	$("#btnDelete").click(function() {
		$(location).attr("href", "/board/delete.do?boardNo="+${post.boardNo});
	});
});
</script>
</body>
</html>