<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<html>
<head>
<title>문제</title>
</head>
<body>
	<!-- 
		네이버, 구글, 다음의 이미지를 출력하시고 각각의 이미지를 클릭하면 해당 홈페이지로 이동하도록 구현
	 -->
	 <a href="https://www.naver.com/">
	 	<img src="<%=request.getContextPath()%>/image/naver.png" width="200" height="200">
	 </a>
	 <a href="https://www.google.com">
	 	<img src="<%=request.getContextPath()%>/image/google.png" width="200" height="200">
	 </a>
	 <a href="https://www.daum.net">
	 	<img src="<%=request.getContextPath()%>/image/daum.jpg" width="200" height="200">
	 </a>
</body>
</html>







