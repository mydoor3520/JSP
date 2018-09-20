<%@page import="book.bean.BookDto"%>
<%@page import="java.util.List"%>
<%@page import="book.bean.BookDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%
	BookDao bdao = new BookDao();
	List<BookDto> list = bdao.list();
%>
    
<html>
<head>
<title>중고 도서 목록 페이지</title>
</head>
<body>
	<div align="center">
		<h1>중고 도서 목록</h1>
		<hr>
		<table border="1" width="800">
			<thead>
				<tr>
					<th>번호</th>
					<th>도서명</th>
					<th>저자</th>
					<th>출판사</th>
					<th>가격</th>
					<th>등록일</th>
					<th>상태</th>
					<th>관리</th>
				</tr>
			</thead>
			<tbody>
				<%for(BookDto bdto : list){%>
					<tr align="center">
						<td><%=bdto.getNo()%></td>
						<td><%=bdto.getName() %></td>
						<td><%=bdto.getWriter() %></td>
						<td><%=bdto.getPublisher() %></td>
						<td><%=bdto.getPrice() %></td>
						<td><%=bdto.getDate() %></td>
						<td><%=bdto.getStatus() %></td>
						<td>
							<a href="edit.jsp?no=<%=bdto.getNo()%>">수정</a>  
							<a href="delete.bk?no=<%=bdto.getNo()%>">삭제</a>
						</td>
					</tr>
				<%} %>
			</tbody>
		</table>
		<hr>
		<h2><a href="home.jsp">홈으로 이동</a></h2>
		<h2><a href="register.jsp">도서 등록 페이지</a></h2>
	</div>
</body>
</html>