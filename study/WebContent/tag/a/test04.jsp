<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>

<%
	//자바 코드로 출력할 내용을 준비
	String a = request.getParameter("a");
%>


<html>
<head>
<title>수신 페이지</title>
</head>
<body>
	<h1>a = <%=a%></h1>
</body>
</html>