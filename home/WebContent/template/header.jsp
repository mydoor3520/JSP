<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<html>
<head>
<title>JSP 홈페이지</title>
</head>
<body>
	
	<div align="center">
		<table border="1" width="1200">
			<tbody align="center">
				<!-- 상단 영역 -->
				<tr height="80">
					<td>
						<h1>자바 SW개발자 양성과정 JSP 수업</h1>
					</td>
				</tr>
				
				<!-- 메뉴 영역 -->
				<tr height="50">
					<td align="left">
						<a href="<%=request.getContextPath()%>">홈으로</a>
						<%if(null==session.getAttribute("grade")){%>
						<a href="<%=request.getContextPath()%>/member/register.jsp">회원가입</a>
						 <a href="<%=request.getContextPath()%>/member/login.jsp">로그인</a>
						<%} else{%>
						<a href="<%=request.getContextPath()%>/member/logout.it">로그아웃</a>
						내정보
						정보수정
						회원탈퇴
						<%} %>
						<%if(session.getAttribute("grade").equals("관리자")){ %>관리자모드<%} %>
						자유게시판
						<a href="<%=request.getContextPath()%>/event/home.jsp">이벤트</a>
					</td>
				</tr>
				
				<!-- 중단 영역 -->
				<tr height="500">
					<td>