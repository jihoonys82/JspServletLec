<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
// Javascript Object
var json = { "a" : 1, "b" : "2", "c" : "Cherry", "d":true };
console.log(json);

// Object type --> String : mashalling
var jsonText = JSON.stringify(json);
console.log(jsonText);

// String --> Object type : unmashalling
var jsonObject = JSON.parse(jsonText);
console.log(jsonObject);



</script>

</head>
<body>

</body>
</html>