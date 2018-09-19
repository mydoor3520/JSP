<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<html>
<head>
<title>회원 가입 화면</title>
</head>
<body>
	<form action="<%=request.getContextPath()%>/join.it" method="post">
		<table border="0" width="300">
			<thead>
				<tr>
					<th colspan="2">회원 가입</th>
				</tr>
			</thead>
			<tbody>
				<tr>
					<th>아이디</th>
					<td><input type="text" name="id" required"></td>
				</tr>
				<tr>
					<th>비밀번호</th>
					<td><input type="password" name="pw" required"></td>
				</tr>
				<tr>
					<th>닉네임</th>
					<td><input type="text" name="nick" required></td>
				</tr>
			</tbody>
			<tfoot>
				<tr>
					<th colspan="2">
						<input type="submit" value="가입하기">
					</th>
				</tr>
			</tfoot>
		</table>
	</form>
</body>
</html>