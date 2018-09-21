<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:include page="/template/header.jsp"></jsp:include>

<h1>회원 가입</h1>
<form action="register.it" method="post">
<table border="1" width="60%">
	<tbody>
		<tr> 
			<th>이메일</th>
			<td>
				<input type="email" name="email" required>
				<a href="">중복확인</a>
			</td>
		</tr>
		<tr>
			<th>비밀번호</th>
			<td><input type="password" name="pw" required></td>
		</tr>
		<tr>
			<th>닉네임</th>
			<td><input type="text" name="nick" required></td>
		</tr>
		<tr>
			<th>생년월일</th>
			<td><input type="date" name="birth" required></td>
		</tr>
		<tr>
			<th>전화번호</th>
			<td><input type="tel" name="phone"></td>
		</tr>
		<tr>
			<th>성별</th>
			<td>
				<input type="radio" name="gender" value="남자" checked>남자
				<input type="radio" name="gender" value="여자">여자
			</td>
		</tr>
		<tr>
			<th>관심분야</th>
			<td><input type="text" name="interest"></td>
		</tr>
		<tr>
			<th>우편번호</th>
			<td>
				<input type="text" name="post">
				<a href="">우편번호 검색</a>
			</td>
		</tr>
		<tr>
			<th>기본주소</th>
			<td><input type="text" name="addr1" size="70"></td>
		</tr>
		<tr>
			<th>상세주소</th>
			<td><input type="text" name="addr2" size="70"></td>
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

<jsp:include page="/template/footer.jsp"></jsp:include>