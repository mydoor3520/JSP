<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<html>
<head>
<title>로그인 페이지</title>
</head>
<body>
	<form action="<%=request.getContextPath()%>/login.it" method="post">
		<input type="text" placeholder="아이디" name="id" required pattern="\w+">
		<input type="password" placeholder="비밀번호" name="pw" required>
		<input type="submit" value="로그인">
	</form>
</body>
</html>