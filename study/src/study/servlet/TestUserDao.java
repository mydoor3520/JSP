package study.servlet;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *	DAO(Data Access Object) 		DB ó�� ���� Ŭ����. DB ó�� ��� ���� 
 */
public class TestUserDao {
	private String driverClassName = "oracle.jdbc.OracleDriver";
	private String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
	private String username = "sw5";
	private String password = "sw5";
	
	public Connection getConnection() throws Exception {
		Class.forName(driverClassName);
		return DriverManager.getConnection(url, username, password);
	}
	
//	�α��� ���
	public boolean login(TestUserDto tdto) throws Exception {
		Connection con = getConnection();
		
		String sql = "select * from testuser where id=? and pw=?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, tdto.getId());
		ps.setString(2, tdto.getPw());
		ResultSet rs = ps.executeQuery();
		boolean result = rs.next();
		
		con.close();
		return result;
	}
	
//	ȸ������
	public void register(TestUserDto tdto) throws Exception{
		Connection con = getConnection();
		
		String sql = "insert into testuser values(?, ?, ?, 0, '�Ϲ�', sysdate)";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, tdto.getId());
		ps.setString(2, tdto.getPw());
		ps.setString(3, tdto.getNick());
		ps.execute();
		
		con.close();
//		return;
	}
}








