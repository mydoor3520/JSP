<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<html>
<head>
<title>회원 가입 화면</title>
</head>
<body>
	<form action="<%=request.getContextPath()%>/register.it" method="post">
		<table border="0" width="300">
			<thead>
				<tr>
					<th colspan="2">아이디 등록</th>
				</tr>
			</thead>
			<tbody>
				<tr>
					<th>아이디</th>
					<td><input type="text" name="id" required></td>
				</tr>
				<tr>
					<th>직업</th>
					<td><select name="job" requierd>
							<option>전사</option>
							<option>마법사</option>
					</select></td>
				</tr>
			</tbody>
			<tfoot>
				<tr>
					<th colspan="2"><input type="submit" value="가입하기"></th>
				</tr>
			</tfoot>
		</table>
	</form>
</body>
</html>