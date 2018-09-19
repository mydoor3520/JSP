<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<html>
<head>
<title>img 태그</title>
</head>
<body>
	<img alt="멋진 배경" src="https://i.ytimg.com/vi/dzkdZ3J-Qqw/hqdefault.jpg">
	<br>
	<img alt="멋진 배경" src="https://i.ytimg.com/vi/dzkdZ3J-Qqw/hqdefault.jpg"
			width="400" height="300">
	<br>
	<img alt="멋진 배경" src="https://i.ytimg.com/vi/dzkdZ3J-Qqw/hqdefault.jpg"
			width="100%" title="어두운 배경">
			
	<br>
	<br>
	<!-- 상대경로 : 현재 페이지를 기준으로 계산 -->
	<img src="bg.jpg" width="80%">
	<br>
	<img src="../../image/bg.jpg" width="80%">
	<br>
	<!-- 절대경로 : 루트(root)를 기준으로 계산 -->
	<img src="http://localhost:8080/study/image/bg.jpg" width="80%">
	<br> 
	<img src="/study/image/bg.jpg" width="80%">
	<br>
	<%
		//요청 정보를 이용하여 root 경로를 계산
		String root = request.getContextPath();//  	/study
	%>
	<img src="<%=root%>/image/bg.jpg" width="80%">
	<br>
	<img src="<%=request.getContextPath()%>/image/bg.jpg" width="80%">
	<br>
</body>
</html>










