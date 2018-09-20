<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<html>
<head>
<title>도서등록화면</title>
</head>
<body>
	<form action="<%=request.getContextPath()%>/register.bk" method="post">
		<table border="0" width="600">
			<thead>
				<tr>
					<th colspan="2">도서 등록</th>
				</tr>
			</thead>
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
					<th>가격</th>
					<td><input type="text" name="price" required></td>
				</tr>
				<tr>
					<th>상태</th>
					<td><select name="status" requierd>
							<option>A</option>
							<option>B</option>
							<option>C</option>
					</select></td>
				</tr>
			</tbody>
			<tfoot>
				<tr>
					<th colspan="2"><input type="submit" value="등록하기"></th>
				</tr>
			</tfoot>
		</table>
	</form>
</body>
</html>