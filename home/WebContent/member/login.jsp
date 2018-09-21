<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:include page="/template/header.jsp"></jsp:include>

<img src="<%=request.getContextPath()%>/image/login.gif" width="500" height="200">

<form action="login.it" method="post">
	<input type="email" name="email" placeholder="Email.." required>
	<br><br>
	<input type="password" name="pw" placeholder="Password.." required>
	<br><br>
	<input type="checkbox" name="saveId">아이디 저장하기
	<br><br>
	<input type="submit" value="로그인">
</form>

<jsp:include page="/template/footer.jsp"></jsp:include>