package study.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns="/login.it")
public class LoginServlet extends HttpServlet{
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try {
//			[1] 준비
			String id = req.getParameter("id");
			String pw = req.getParameter("pw");
			
//			[2] 처리
			TestUserDto tdto = new TestUserDto();
			tdto.setId(id);
			tdto.setPw(pw);
			
			TestUserDao tdao = new TestUserDao();
			boolean login = tdao.login(tdto);
			
//			[3] 출력
			resp.setContentType("text/plain; charset=EUC-KR");
			PrintWriter out = resp.getWriter();
			if(login) {
				out.println("로그인 성공!");
			}else {
				out.println("로그인 정보가 일치하지 않습니다");
			}
			out.close();
		}
		catch(Exception e) {
			resp.sendError(500, "미안!");
			e.printStackTrace();
		}
	}
}






