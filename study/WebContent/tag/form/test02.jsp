<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	//JSP에는 자동으로 생성되는 "내장객체"가 존재(request, response, out, ...)
	request.setCharacterEncoding("UTF-8");//전송된 모든 데이터를 UTF-8로 복원
	String q = request.getParameter("q");
	String method = request.getMethod();
%>
    
<html>
<head>
<title>수신 페이지(서블릿)</title>
</head>
<body>
	<h1>q = <%=q%></h1>
	<h1>전송방식 = <%=method%></h1>
</body>
</html>