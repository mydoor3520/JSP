<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
					</td>
				</tr>
				
				<!-- 하단 영역 -->
				<tr height="80">
					<td>
						세션ID : <%=session.getId()%>, 
						login = <%=session.getAttribute("login")%>,
						grade = <%=session.getAttribute("grade")%>
					</td>
				</tr>
			</tbody>
		</table>
	</div>
	
</body>
</html>