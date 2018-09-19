<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<html>
<head>
<title>링크 태그</title>
</head>
<body>
	
	<a href="../../hello.jsp">hello.jsp로 이동</a>
	<br><br>
	<a href="/study/hello.jsp">hello.jsp로 이동</a>
	<br><br>
	<a href="<%=request.getContextPath()%>/hello.jsp">hello.jsp로 이동</a>
	
</body>
</html>