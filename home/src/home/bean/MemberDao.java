package home.bean;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class MemberDao {
	private final String driverClassName = "oracle.jdbc.OracleDriver";
	private final String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
	private final String username = "sw5";
	private final String password = "sw5";
	
	public Connection getConnection() throws Exception {
		Class.forName(driverClassName);
		return DriverManager.getConnection(url, username, password);
	}

	public void register(MemberDto mdto) throws Exception {
		Connection con = getConnection();
		
		String sql = "insert into member values(?, ?, ?, ?, ?, ?, ?, 0, ?, ?, ?, sysdate, '일반')";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, mdto.getEmail());
		ps.setString(2, mdto.getPw());
		ps.setString(3, mdto.getNick());
		ps.setString(4, mdto.getBirth());
		ps.setString(5, mdto.getPhone());
		ps.setString(6, mdto.getGender());
		ps.setString(7, mdto.getInterest());
		ps.setString(8, mdto.getPost());
		ps.setString(9, mdto.getAddr1());
		ps.setString(10, mdto.getAddr2());
		ps.execute();
		
		con.close();
	}
	
//	로그인 처리 메소드
	public boolean login(String email, String pw) throws Exception{
		Connection con = getConnection();
		
		String sql = "select * from member where email=? and pw=?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, email);
		ps.setString(2, pw);
		ResultSet rs = ps.executeQuery();
		
		boolean result = rs.next();//데이터 유무 추출
		con.close();
		return result;
	}
	
	public String getGrade(String email, String pw) throws Exception{
		Connection con = getConnection();
		
		String sql = "select * from member where email=? and pw=?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, email);
		ps.setString(2, pw);
		String result = "";
		ResultSet rs = ps.executeQuery();
		if(rs.next()) result = rs.getString("grade");
		con.close();
		return result;
	}
}







