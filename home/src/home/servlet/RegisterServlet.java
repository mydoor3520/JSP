package home.servlet;

import java.io.IOException;
import java.sql.SQLIntegrityConstraintViolationException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import home.bean.MemberDao;
import home.bean.MemberDto;

@WebServlet(urlPatterns="/member/register.it")
public class RegisterServlet extends HttpServlet{
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
//			[1] 준비
			request.setCharacterEncoding("UTF-8");
			MemberDto mdto = new MemberDto();
			mdto.setEmail(request.getParameter("email"));
			mdto.setPw(request.getParameter("pw"));
			mdto.setNick(request.getParameter("nick"));
			mdto.setBirth(request.getParameter("birth"));
			mdto.setPhone(request.getParameter("phone"));
			mdto.setGender(request.getParameter("gender"));
			mdto.setInterest(request.getParameter("interest"));
			mdto.setPost(request.getParameter("post"));
			mdto.setAddr1(request.getParameter("addr1"));
			mdto.setAddr2(request.getParameter("addr2"));
			
//			[2] 처리
			MemberDao mdao = new MemberDao();
			mdao.register(mdto);
			
//			[3] 출력
			response.sendRedirect("register_success.jsp");
		}
		catch(SQLIntegrityConstraintViolationException e) {
			response.sendRedirect("register_fail.jsp");
		}
		catch(Exception e) {
			response.sendError(500, e.getMessage());
			e.printStackTrace();
		}
	}
}







