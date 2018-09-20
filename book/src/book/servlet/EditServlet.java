package book.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import book.bean.BookDao;


@WebServlet(urlPatterns="/edit.bk")
public class EditServlet extends HttpServlet{
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
//			[1] 준비		no
			request.setCharacterEncoding("UTF-8");
			int no = Integer.parseInt(request.getParameter("no"));
			String name = request.getParameter("name");
			String writer= request.getParameter("writer");
			String publisher = request.getParameter("publisher");
			int price = Integer.parseInt(request.getParameter("price"));
			String status =request.getParameter("status");
			
//			[2] 처리
			BookDao bdao = new BookDao();
			bdao.edit(no, name, writer, publisher, price, status);
			
//			[3] 출력		list.jsp
			response.sendRedirect(request.getContextPath()+"/tag/list.jsp");
		}catch(Exception e) {
			e.printStackTrace();
			response.sendError(500);
		}
	}
}









