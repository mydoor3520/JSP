package home.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(urlPatterns="/member/logout.it")
public class LogoutServlet extends HttpServlet{
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		[1] 세션에서 login, power를 삭제
		HttpSession session = request.getSession();
		session.removeAttribute("login");
		session.removeAttribute("power");
//		session.invalidate();//전체삭제
		
//		[2] 홈으로 리다이렉트
		response.sendRedirect(request.getContextPath());
	}
}









