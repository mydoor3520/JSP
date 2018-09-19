package study.servlet;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *	DAO(Data Access Object) 		DB 처리 대행 클래스. DB 처리 기능 구현 
 */
public class TestUserDao {
	private String driverClassName = "oracle.jdbc.OracleDriver";
	private String url = "jdbc:oracle:thin:@127.0.0.1:1523:xe";
	private String username = "sw5";
	private String password = "sw5";
	
	public Connection getConnection() throws Exception {
		Class.forName(driverClassName);
		return DriverManager.getConnection(url, username, password);
	}
	
//	로그인 기능
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
	
//	회원가입
	public void register(TestUserDto tdto) throws Exception{
		Connection con = getConnection();
		
		String sql = "insert into testuser values(?, ?, ?, 0, '일반', sysdate)";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, tdto.getId());
		ps.setString(2, tdto.getPw());
		ps.setString(3, tdto.getNick());
		ps.execute();
		con.close();
//		return;
	}
}








