<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<html>
<head>
<title>��ũ �±�</title>
</head>
<body>
	
	<a href="../../hello.jsp">hello.jsp�� �̵�</a>
	<br><br>
	<a href="/study/hello.jsp">hello.jsp�� �̵�</a>
	<br><br>
	<a href="<%=request.getContextPath()%>/hello.jsp">hello.jsp�� �̵�</a>
	
</body>
</html>