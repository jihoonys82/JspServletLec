<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP tag Example</title>
</head>
<body>


HELLO!

<% // Variable decalreation
	String scriptlet = "Hi!!!";
	System.out.println(scriptlet);

	// _jspService() 메소드 내부에 코드가 들어가므로 메서드 작성은 안된다. 
// 	public void testMethod(){	
// 	}
%>

<%	// 제어문 
	for(int i=0;i<5;i++) {
%>
	<h3>Hello JSP!</h3>
<%	} %>

</body>
</html>