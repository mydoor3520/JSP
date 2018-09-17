package study.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns="/menusearch")
public class MenuSearchServlet extends HttpServlet{
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//		[1] ��û ������ ����ִ� key�� ����
		String key = req.getParameter("key");
		System.out.println("key = "+key);
		
//		[2] DB ó���� ����
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:xe", "sw5", "sw5");
			
			String sql = "select * from menu where name like '%'||?||'%' order by name asc";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, key);
			ResultSet rs = ps.executeQuery();
			
			List<MenuDto> list = new ArrayList<>();
			while(rs.next()) {
				MenuDto mdto = new MenuDto();
				mdto.setName(rs.getString("name"));
				mdto.setPrice(rs.getInt("price"));
				list.add(mdto);
			}
			
			con.close();
			
//			[3] ����ڿ��� ����(resp �̿�)
			resp.setContentType("text/plain; charset=EUC-KR");
			PrintWriter out = resp.getWriter();
			out.println("�˻� ���");
			for(MenuDto mdto : list) {
				out.println(mdto);
			}
			out.close();//flush
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}






