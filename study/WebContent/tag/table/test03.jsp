<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<html>
<head>
<title>������ ����</title>
</head>
<body>
	<div align="center">
		<h1>������</h1>
		<table border="1" width="800">
			<thead>
				<tr>
					<th>2��</th>
					<th>3��</th>
					<th>4��</th>
					<th>5��</th>
					<th>6��</th>
					<th>7��</th>
					<th>8��</th>
					<th>9��</th>
				</tr>
			</thead>
			
			<tbody>
				<%for(int i=2; i <= 9; i++){ %>
				<tr>
					<td>2 X <%=i%> = <%=2 * i%></td>
					<td>3 X <%=i%> = <%=3 * i%></td>
					<td>4 X <%=i%> = <%=4 * i%></td>
					<td>5 X <%=i%> = <%=5 * i%></td>
					<td>6 X <%=i%> = <%=6 * i%></td>
					<td>7 X <%=i%> = <%=7 * i%></td>
					<td>8 X <%=i%> = <%=8 * i%></td>
					<td>9 X <%=i%> = <%=9 * i%></td>
				</tr>
				<%} %>
			</tbody>
		</table>
		
		<hr>
		
		<table border="1" width="800">
			<thead>
				<tr>
					<%for(int k=2; k <= 9; k++){ %>
						<th><%=k%>��</th>
					<%} %>
				</tr>
			</thead>
			
			<tbody>
				<%for(int i=1; i <= 9; i++){ %>
				<tr>
					<%for(int k=2; k <= 9; k++){ %>
						<td><%=k%> X <%=i%> = <%=k * i%></td>
					<%} %>
				</tr>
				<%} %>
			</tbody>
		</table>
		
	</div>
	
	
	
</body>
</html>












