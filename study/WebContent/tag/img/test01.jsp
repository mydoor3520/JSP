<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<html>
<head>
<title>img �±�</title>
</head>
<body>
	<img alt="���� ���" src="https://i.ytimg.com/vi/dzkdZ3J-Qqw/hqdefault.jpg">
	<br>
	<img alt="���� ���" src="https://i.ytimg.com/vi/dzkdZ3J-Qqw/hqdefault.jpg"
			width="400" height="300">
	<br>
	<img alt="���� ���" src="https://i.ytimg.com/vi/dzkdZ3J-Qqw/hqdefault.jpg"
			width="100%" title="��ο� ���">
			
	<br>
	<br>
	<!-- ����� : ���� �������� �������� ��� -->
	<img src="bg.jpg" width="80%">
	<br>
	<img src="../../image/bg.jpg" width="80%">
	<br>
	<!-- ������ : ��Ʈ(root)�� �������� ��� -->
	<img src="http://localhost:8080/study/image/bg.jpg" width="80%">
	<br> 
	<img src="/study/image/bg.jpg" width="80%">
	<br>
	<%
		//��û ������ �̿��Ͽ� root ��θ� ���
		String root = request.getContextPath();//  	/study
	%>
	<img src="<%=root%>/image/bg.jpg" width="80%">
	<br>
	<img src="<%=request.getContextPath()%>/image/bg.jpg" width="80%">
	<br>
</body>
</html>










