package book.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import book.bean.BookDao;


@WebServlet(urlPatterns="/delete.bk")
public class Delete_Servlet extends HttpServlet{
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
//			[1] 준비		no
			int no = Integer.parseInt(request.getParameter("no"));
			
//			[2] 처리
			BookDao bdao = new BookDao();
			bdao.delete(no);
			
//			[3] 출력		list.jsp
			response.sendRedirect(request.getContextPath()+"/tag/list.jsp");
		}catch(Exception e) {
			e.printStackTrace();
			response.sendError(500);
		}
	}
}









