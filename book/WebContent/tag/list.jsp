<%@page import="book.bean.BookDto"%>
<%@page import="book.bean.BookDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div align="center">
		<h1>도서리스트</h1>
		<form action="/tag/edit.jsp" method="post">
			<table border="1" width="500">
				<%
					BookDao bdao = new BookDao();
					for (BookDto bdto : bdao.list()) {
				%>
				<tr>
					<th><%=bdto.getNo()%></th>
					<td><%=bdto.getName()%></td>
					<td><%=bdto.getWriter()%></td>
					<td><%=bdto.getPublisher()%></td>
					<td><%=bdto.getReg()%></td>
					<td><%=bdto.getPrice()%></td>
					<td><%=bdto.getStatus()%></td>
					<td><a
						href="<%=request.getContextPath()%>/delete.bk?no=<%=bdto.getNo()%>">삭제</a>
					</td>

					<td><a
						href="<%=request.getContextPath()%>/tag/edit.jsp?no=<%=bdto.getNo()%>" name = <%=bdto.getNo()%>>수정</a>
					</td>
				</tr>
				<%
					}
				%>
			</table>
		</form>
	</div>
</body>
</html>