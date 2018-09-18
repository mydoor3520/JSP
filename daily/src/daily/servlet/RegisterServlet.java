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
//			[1] 글 등록
			DailyDto ddto = new DailyDto();
			ddto.setWriter(req.getParameter("writer"));
			ddto.setContent(req.getParameter("content"));
			
//			[2] 처리
			DailyDao ddao = new DailyDao();
			ddao.register(ddto);
			
//			[3] 출력
			resp.setContentType("text/plain; charset=EUC-KR");
			resp.getWriter().println("작성자 : " + ddto.getWriter());
			resp.getWriter().println("내용 : " + ddto.getContent());
			resp.getWriter().println("----------------------");
			resp.getWriter().println("글 등록이 완료 되었습니다.");
		}catch(Exception e) {
			resp.sendError(500, "미안! 스미마셍!");
			e.printStackTrace();
		}
	}
}






