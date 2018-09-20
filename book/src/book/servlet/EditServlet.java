package book.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import book.bean.BookDao;
import book.bean.BookDto;

@WebServlet(urlPatterns="/edit.bk")
public class EditServlet extends HttpServlet{
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
//			[1] 준비
			request.setCharacterEncoding("utf-8");
			
			BookDto bdto = new BookDto();
			bdto.setNo(Integer.parseInt(request.getParameter("no")));
			bdto.setName(request.getParameter("name"));
			bdto.setWriter(request.getParameter("writer"));
			bdto.setPublisher(request.getParameter("publisher"));
			bdto.setPrice(Integer.parseInt(request.getParameter("price")));
			bdto.setStatus(request.getParameter("status"));
			
//			[2] DB처리
			BookDao bdao = new BookDao();
			bdao.edit(bdto);
			
//			[3] 출력
			response.sendRedirect("list.jsp");
		}
		catch(Exception e) {
			e.printStackTrace();
			response.sendError(500);
		}
	}
}




