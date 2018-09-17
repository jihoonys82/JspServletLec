<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="http://code.jquery.com/jquery-2.2.4.min.js"></script>

<script type="text/javascript">
function send() {
	var n1 = $("#num1").val();
	var n2 = $("#num2").val();
	var oper = $("#oper").val();
	
	// Ajax 요청 URL
	var url ="/jQueryAjax/jQueryAjax_ok.jsp";
	
	// 쿼리스트링
	var data = { num1:n1, num2:n2, oper:oper};
	var query = "num1="+n1 +"&num2=" + n2 + "&oper=" + oper;
	
	// .load 를 이용한 Ajax 요청
	$("#resultData").load(url, data);
// 	$("#resultData").load(url+"?"+ query);

	//입력 창 초기화
	$("#num1").val("");
	$("#num2").val("");
	$("#oper").val("add");
	
	
}
</script>
</head>
<body>

<input type="text" id="num1" name="num1" />
<select id="oper" style="vertical-align: middle; height:22px;">
	<option value="add">더하기</option>
	<option value="sub">빼기</option>
	<option value="mul">곱하기</option>
	<option value="div">나누기</option>
</select>
<input type="text" id="num2" name="num2"/>
<button onclick="send();"> = </button>
<hr>
<div id="resultData"></div>
</body>
</html>