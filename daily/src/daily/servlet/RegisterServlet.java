package daily.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns="/writer.brd")
public class RegisterServlet extends HttpServlet{
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try {
//			[1] �� ���
			DailyDto ddto = new DailyDto();
			ddto.setWriter(req.getParameter("writer"));
			ddto.setContent(req.getParameter("content"));
			
//			[2] ó��
			DailyDao ddao = new DailyDao();
			ddao.register(ddto);
			
//			[3] ���
			resp.setContentType("text/plain; charset=EUC-KR");
			resp.getWriter().println("�ۼ��� : " + ddto.getWriter());
			resp.getWriter().println("���� : " + ddto.getContent());
			resp.getWriter().println("----------------------");
			resp.getWriter().println("�� ����� �Ϸ� �Ǿ����ϴ�.");
		}catch(Exception e) {
			resp.sendError(500, "�̾�! ���̸���!");
			e.printStackTrace();
		}
	}
}






