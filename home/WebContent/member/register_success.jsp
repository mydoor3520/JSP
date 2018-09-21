<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:include page="/template/header.jsp"></jsp:include>

<h1>회원 가입이 완료되었습니다</h1>
<h2><a href="login.jsp">로그인하기</a></h2>
<h2><a href="<%=request.getContextPath()%>">홈으로 이동</a></h2>

<jsp:include page="/template/footer.jsp"></jsp:include>