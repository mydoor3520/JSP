package game.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns="/register.it")
public class RegisterServlet extends HttpServlet{
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try {
//			[1] ���̵�, ���� ���
			req.setCharacterEncoding("UTF-8");
			GameDto gdto = new GameDto(req.getParameter("id"),req.getParameter("job"));
			
//			[2] ó��
			GameDao gdao = new GameDao();
			gdao.register(gdto);
			resp.sendRedirect(req.getContextPath()+"/tag/register_result.jsp");
			
//			
		}catch(Exception e) {
			resp.sendError(500, "�̾�! ���̸���!");
			e.printStackTrace();
		}
	}
}






