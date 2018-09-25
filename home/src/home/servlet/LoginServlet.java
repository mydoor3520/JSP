package home.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import home.bean.MemberDao;

@WebServlet(urlPatterns="/member/login.it")
public class LoginServlet extends HttpServlet{
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
//			[1] 준비		email, pw, saveId
			MemberDao mdao = new MemberDao();
		
			String email = request.getParameter("email");
			String pw = request.getParameter("pw");
			String grade = mdao.getGrade(email, pw);
			String saveId = request.getParameter("saveId");//null or on
		
//			[2] 처리
			boolean login = mdao.login(email, pw);
			
//			[3] 출력
			if(login) {
//				세션(session)에 로그인 성공의 의미로 {login=이메일} 형태의 데이터를 저장(setAttribute)
				HttpSession session = request.getSession();
				session.setAttribute("login", email);
				session.setAttribute("grade", grade);
				response.sendRedirect(request.getContextPath());
			}else {
				response.sendRedirect("login_fail.jsp");
			}
		}
		catch(Exception e) {
			response.sendError(500, e.getMessage());
			e.printStackTrace();
		}
	}
}








