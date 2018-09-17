<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<script src="/js/httpRequest.js" type="text/javascript"></script>
<script type="text/javascript">
function helloServer() {
	var params = "name="+document.f.name.value;
	
	sendRequest("POST", "ajax_03_ok.jsp", params, helloFromServer);
	
}

function helloFromServer(){
	if(httpRequest.readyState==4) {
		if(httpRequest.status == 200) {
			alert("서버응답 : " + httpRequest.responseText);
		}
	}
}
</script>
</head>
<body>

<form name="f">
	<input type="text" name="name" />
	<input type="button" value="입력"  onclick="helloServer();" />
</form>

</body>
</html>