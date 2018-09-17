<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
</head>
<body>
<div class="container">
	<form class="mt-5" action="/board/update.do" method="post" >
		<div class="form-group">
			<label for="title">제목</label>
			<input type="text" class="form-control" id="title" name="title" placeholder="글제목을 입력하세요" value="${post.title }">
		</div>
		<div class="row">
			<div class="col">
				<label for="boardNo">번호</label>
				<input class="form-control" readonly type="text" id="boardNo" name="boardNo" value="${post.boardNo }">
			</div>
			<div class="col">
				<label for="writer">아이디</label>
				<input class="form-control" readonly type="text" id="writerId" name="writerId" value="${post.writerId }">
			</div>
			<div class="col">
				<label for="hit">조회</label>
				<input class="form-control" readonly type="text" id="hit" name="hit" value="${post.hit }">
			</div>
			<div class="col">
				<label for="recommend">추천</label>
				<input class="form-control" readonly type="text" id="recommend" name="recommend" value="${post.recommend }">
			</div>
			<div class="col">
				<label for="writtenDate">작성일</label>
				<input class="form-control" readonly type="text" id="writtenDate" name="writtenDate" value="${post.writtenDate }">
			</div>
		</div>
		<div class="form-group">
			<label for="writer">작성자</label>
			<input class="form-control" type="text" id="writer" placeholder="${sessionScope.writer }" readonly value="${post.writer }">
		</div>
		<div class="form-group">
			<label for="content">내용</label>
			<textarea class="form-control" name="content" id="content" rows="10" style="width:100%;">${post.content }</textarea>

		</div>
		<input class="btn btn-primary" id="btnWrite" type="submit" value="수정" onclick="submitContents();"/>
		<input class="btn btn-secondary" type="button" value="목록" onclick="history.go(-1);" />
	</form>
</div>

<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js" integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js" integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy" crossorigin="anonymous"></script>
<script type="text/javascript" src="/resources/smarteditor/js/service/HuskyEZCreator.js" charset="utf-8"></script>
<script type="text/javascript">
var oEditors = [];
nhn.husky.EZCreator.createInIFrame({
    oAppRef: oEditors,
    elPlaceHolder: "content",
    sSkinURI: "/resources/smarteditor/SmartEditor2Skin.html",
    fCreator: "createSEditor2",
    htParams : {
    	bUseToolbar: true, // 툴바 사용여부
    	bUseVerticalResizer: false, //입력창 크기 조절바
    	bUseModeChanger: true //모드 탭
    }
});

//‘저장’ 버튼을 누르는 등 저장을 위한 액션을 했을 때 submitContents가 호출된다고 가정한다.
function submitContents(elClickedObj) {
    // 에디터의 내용이 textarea에 적용된다.
    oEditors.getById["content"].exec("UPDATE_CONTENTS_FIELD", []);

    // 에디터의 내용에 대한 값 검증은 이곳에서
    // document.getElementById("ir1").value를 이용해서 처리한다.
    try {
        elClickedObj.form.submit();
    } catch(e) {}
}

$("document").ready(function() {
	$("#btnWrite").click(function() {
		submitContents($(this));
	});
});

</script>

</body>
</html>