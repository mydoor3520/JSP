<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<html>
<head>
<title>전송 폼 만들기</title>
</head>
<body>
	
	<!-- 폼은 입력값을 목적지로 전송하는 그룹의 개념. 전송할 입력창에는 name을 부여 -->
	<form action="test02.jsp" method="post">
<!-- 		<input type="search" name="q" required pattern="[a-zA-Z]{2,10}"> -->
		<input type="search" name="q" required>
		<input type="submit">
	</form>
	
</body>
</html>






