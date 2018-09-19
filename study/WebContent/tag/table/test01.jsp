<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<html>
<head>
<title>표 만들기</title>
</head>
<body>
	
	<!-- 표를 만들기 위한 틀 -->
	<table border="1" width="500">
		<!-- 제목 영역 -->
		<thead></thead>
		<!-- 내용 영역 -->
		<tbody>
			<!-- 줄 -->
			<tr>
				<!-- 칸 -->
				<th>첫번째</th>
				<td>두번째</td>
			</tr>
			<tr>
				<th colspan="2">첫번째</th>
			</tr>
		</tbody>
		<!-- 하단 영역 -->
		<tfoot></tfoot>
	</table>
	
</body>
</html>