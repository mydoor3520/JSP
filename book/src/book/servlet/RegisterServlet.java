package book.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import book.bean.BookDao;
import book.bean.BookDto;

@WebServlet(urlPatterns="/register.bk")
public class RegisterServlet extends HttpServlet{
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try {
//			[1] 아이디, 직업 등록
			req.setCharacterEncoding("UTF-8");
			BookDto bdto = 
					new BookDto(req.getParameter("name"),req.getParameter("writer"),
							req.getParameter("publisher"),Integer.parseInt(req.getParameter("price")),
							req.getParameter("status"));
			
//			[2] 처리
			BookDao bdao = new BookDao();
			bdao.register(bdto);
			
//			[3] 결과
			resp.sendRedirect(req.getContextPath()+"/tag/list.jsp");
			
//			
		}catch(Exception e) {
			resp.sendError(500, "내부 에러~!");
			e.printStackTrace();
		}
	}
}






