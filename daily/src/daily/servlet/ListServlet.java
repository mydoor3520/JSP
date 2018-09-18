package daily.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(urlPatterns="/list.brd")
public class ListServlet {
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try {
			
//			[2] 처리
			resp.setContentType("text/plain; charset=EUC-KR");
			PrintWriter out = resp.getWriter();
			
			DailyDao ddao = new DailyDao();
			for(DailyDto ddto : ddao.list()) {
				out.println(ddto.getNo());
				out.println(ddto.getWriter());
				out.println(ddto.getContent());
				out.println(ddto.getReg());
			}

		}catch(Exception e) {
			resp.sendError(500, "미안! 스미마셍!");
			e.printStackTrace();
		}
	}
}
