package study.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns="/join.it")
public class RegisterServlet extends HttpServlet{
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try {
//			[1] 준비 - id, pw, nick
			TestUserDto tdto = new TestUserDto();
			tdto.setId(req.getParameter("id"));
			tdto.setPw(req.getParameter("pw"));
			tdto.setNick(req.getParameter("nick"));
			
//			[2] 처리
			TestUserDao tdao = new TestUserDao();
			tdao.register(tdto);
			
//			[3] 출력
			resp.setContentType("text/plain; charset=EUC-KR");
			resp.getWriter().println("회원 가입이 완료되었습니다");
//			resp.getWriter().close();
		}catch(Exception e) {
			resp.sendError(404, "미안! 스미마셍!");
			e.printStackTrace();
		}
	}
}






