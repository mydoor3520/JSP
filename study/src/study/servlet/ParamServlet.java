package study.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * �Ķ����(Parameter)�� ó���ϴ� ���
 *  - req(request)		��û��ü. ����� ������ �������
 *  - resp(response)	���䰴ü. ����ڿ��� ���� ������ ������ �� ����
 */
@WebServlet(urlPatterns="/param")
public class ParamServlet extends HttpServlet{
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//		request�� �̿��Ͽ� �Ķ���� ������ �о����(������ String)
		
//		q��� �Ķ���� ������ �аڽ��ϴ�
		String q = req.getParameter("q");
		System.out.println("q = "+q);
		
//		p��� �Ķ���� ������ �аڽ��ϴ�
		String p = req.getParameter("p");
		System.out.println("p = "+p);
		
	}
}





