<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<script src="/js/httpRequest.js" type="text/javascript"></script>
<script type="text/javascript">
function requestServer() {
	var name = document.f.name.value;
	var content = document.f.content.value;
	var params = "name="+ name +"&content="+content;
	
	sendRequest("POST", "ajax_04_ok.jsp", params, function (){
		if(httpRequest.readyState == 4){
			if(httpRequest.status == 200){
				document.getElementById("resultData").innerHTML = httpRequest.responseText;
			}
		}
	});
}
</script>
</head>
<body>
<form name="f" method="post">
	<label>이름 : <input type="text" name="name"/></label><br>
	<label>내용 : <textarea name="content" rows="5" cols="30"></textarea></label><br>
	<input type="button" value="입력" onclick="requestServer();" />
</form>
<div id="resultData"></div>


</body>
</html>