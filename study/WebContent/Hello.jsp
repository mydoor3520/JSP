<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%
	String str = "test~~~";
%>

<html>
	<head>
		<title>Hello JSP</title>
	</head>
	<body>
		<h2>JSP ������ ����</h2>
		<h3>JSP ������ ����</h3>
		ddd<br>as</br>dsa
		
		<h1><%=str%></h1>
		<h3><%out.println(str);%></h3>
	</body>
</html>