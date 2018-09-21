<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:include page="/template/header.jsp"></jsp:include>

<h1>이미 사용중인 아이디입니다</h1>
<h2><a href="register.jsp">다시 가입하기</a></h2>
<h2><a href="<%=request.getContextPath()%>">홈으로 이동</a></h2>

<jsp:include page="/template/footer.jsp"></jsp:include>