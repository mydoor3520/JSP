<%@page import="game.servlet.GameDto"%>
<%@page import="game.servlet.GameDao"%>

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
		<h1>플레이어 리스트</h1>
	<table border="1" width="500">
		<%
			GameDao gdao = new GameDao();
			for(GameDto gdto : gdao.list()) {
		%>
		<tr>
			<th><%=gdto.getNo()%></th>
			<td><%=gdto.getId() %></td>
			<td><%=gdto.getJob() %></td>
			<td><%=gdto.getLev() %></td>
			<td><%=gdto.getExp() %></td>
			<td>
						<a href="hunt.it?no=<%=gdto.getNo()%>">사냥하기</a>
					</td>
		</tr>
		<%} %>
	</table>
	</div>
</body>
</html>