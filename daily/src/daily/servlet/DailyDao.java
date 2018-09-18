package daily.servlet;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;


/**
 *	DAO(Data Access Object) 		DB ó�� ���� Ŭ����. DB ó�� ��� ���� 
 */
public class DailyDao {
	private String driverClassName = "oracle.jdbc.OracleDriver";
	private String url = "jdbc:oracle:thin:@127.0.0.1:1523:xe";
	private String username = "sw5";
	private String password = "sw5";
	
	public Connection getConnection() throws Exception {
		Class.forName(driverClassName);
		return DriverManager.getConnection(url, username, password);
	}
	
	
//	�� ���
	public void register(DailyDto ddto) throws Exception{
		Connection con = getConnection();
		
		String sql = "insert into daily values(daily_seq.nextval, ?, ?, sysdate)";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, ddto.getWriter());
		ps.setString(2, ddto.getContent());
	
		ps.execute();
		
		con.close();
	}
	
//	�� ��ü ���(�ֽż� ��ȸ)
	public List<DailyDto> list() throws Exception{
		Class.forName("oracle.jdbc.OracleDriver");
		Connection con = DriverManager.getConnection(
				"jdbc:oracle:thin:@localhost:1523:xe", "sw5", "sw5");
		
		String sql = "select * from daily";
		PreparedStatement ps = con.prepareStatement(sql);
		ResultSet rs = ps.executeQuery();
		
		List<DailyDto> list = new ArrayList<>();
		while(rs.next()) {
			DailyDto ddto = new DailyDto();
			ddto.setNo(rs.getInt("no"));
			ddto.setWriter(rs.getString("writer"));
			ddto.setContent(rs.getString("content"));
			ddto.setReg(rs.getString("reg"));
			list.add(ddto);
		}
		con.close();
		return list;
	}

}








