<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
</head>
<body>

<div class="container">
	<div class="row">
		<div class="col"><h1>The Board!</h1></div>
	</div>
	<div class="row justify-content-center">
		<c:if test="${sessionScope.login ne true }">
			<div class="col-3">
				<button id="btnLogin" class="btn btn-primary">로그인</button>			
			</div>
			<div class="col-3">
				<button id="btnJoin" class="btn btn-secondary">회원가입</button>			
			</div>
		</c:if>
		<c:if test="${sessionScope.login eq true }">
			<div class="col-3">
				<button id="btnLogout" class="btn btn-info">로그아웃</button>			
			</div>
		</c:if>	
		<div class="col-3">
			<button id="btnList" class="btn btn-info">목록</button>			
		</div>
	</div>
</div>

<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js" integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js" integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy" crossorigin="anonymous"></script>
<script type="text/javascript">
$("document").ready(function() {
	$("#btnLogin").click(function() {
		$(location).attr("href", "/member/login.do");
	});
	$("#btnJoin").click(function() {
		$(location).attr("href", "/member/join.do");
	});
	$("#btnLogout").click(function() {
		$(location).attr("href", "/member/logout.do");
	});
	$("#btnList").click(function() {
		$(location).attr("href", "/board/pagingList.do");
	});
});

</script>

</body>
</html>