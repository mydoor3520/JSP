<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<html>
<head>
<title>중고 도서 등록 페이지</title>
</head>
<body>
	<div align="center">
		<h1>중고 도서 등록 화면</h1>
		<hr>
		<form action="register.bk" method="post">
			<table border="1" width="500">
				<tbody>
					<tr>
						<th>도서명</th>
						<td><input type="text" name="name" required></td>
					</tr>
					<tr>
						<th>저자</th>
						<td><input type="text" name="writer" required></td>
					</tr>
					<tr>
						<th>출판사</th>
						<td><input type="text" name="publisher" required></td>
					</tr>
					<tr>
						<th>판매가</th>
						<td><input type="number" name="price" required></td>
					</tr>
					<tr>
						<th>도서상태</th>
						<td>
							<input type="radio" name="status" value="A" checked>아주좋음
							<input type="radio" name="status" value="B">좋음
							<input type="radio" name="status" value="C">보통
						</td>
					</tr>
				</tbody>
				<tfoot>
					<tr>
						<td colspan="2" align="center">
							<input type="submit" value="등록하기">
						</td>
					</tr>
				</tfoot>
			</table>
		</form>
	</div>
</body>
</html>