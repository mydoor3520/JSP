<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:include page="/template/header.jsp"></jsp:include>

<h1>로그인 정보가 일치하지 않습니다</h1>
<h2><a href="login.jsp">다시 로그인하기</a></h2>
<h2><a href="<%=request.getContextPath()%>">홈으로 가기</a></h2>

<jsp:include page="/template/footer.jsp"></jsp:include>