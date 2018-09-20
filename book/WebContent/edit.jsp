<%@page import="book.bean.BookDto"%>
<%@page import="book.bean.BookDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	//[1] 데이터 수신
	int no = Integer.parseInt(request.getParameter("no"));
	
	//[2] DB 처리
	BookDao bdao = new BookDao();
	BookDto bdto = bdao.get(no); 
%>
<html>
<head>
<title>도서 수정</title>
</head>
<body>
	<div align="center">
		<h1>중고 도서 정보 수정</h1>
		<hr>
		<form action="edit.bk" method="post">
			<input type="hidden" name="no" value="<%=bdto.getNo()%>">
		
			<table border="1" width="500">
				<tbody>
<!-- 					<tr> -->
<!-- 						<th>도서번호</th> -->
<%-- 						<td><input type="text" name="no" required value="<%=bdto.getNo()%>" readonly></td> --%>
<!-- 					</tr> -->
					<tr>
						<th>도서명</th>
						<td><input type="text" name="name" required value="<%=bdto.getName()%>"></td>
					</tr>
					<tr>
						<th>저자</th>
						<td><input type="text" name="writer" required value="<%=bdto.getWriter()%>"></td>
					</tr>
					<tr>
						<th>출판사</th>
						<td><input type="text" name="publisher" required value="<%=bdto.getPublisher()%>"></td>
					</tr>
					<tr>
						<th>판매가</th>
						<td><input type="number" name="price" required value="<%=bdto.getPrice()%>"></td>
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