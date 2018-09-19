<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>입력창 제어</title>
</head>
<body>
	<input type="search"><br><br>
	<input type="search" maxlength = "20"><br><br>
	<input type="search" value = "고치지마" disabled><br><br>
	<input type="search" value = "고치지마 드래그랑 입력은 돼!" readonly><br><br>
	

	<textarea rows="10" cols="100"></textarea><!-- 100글자짜리 10줄 생성 -->
	<br>
	<select>
		<option>SK</option>
		<option>KT</option>
		<option>LG</option>
		<option>알뜰폰</option>
	</select>

</body>
</html>