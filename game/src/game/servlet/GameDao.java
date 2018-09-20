package game.servlet;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;


public class GameDao {
	private String driverClassName = "oracle.jdbc.OracleDriver";
	private String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
	private String username = "sw5";
	private String password = "sw5";
	
	public Connection getConnection() throws Exception {
		Class.forName(driverClassName);
		return DriverManager.getConnection(url, username, password);
	}
	
	
//	아디디, 직업 등록
	public void register(GameDto ddto) throws Exception{
		Connection con = getConnection();
		
		String sql = "insert into game values(game_seq.nextval, ?, ?, '1', '0')";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, ddto.getId());
		ps.setString(2, ddto.getJob());
	
		ps.execute();
		
		con.close();
	}
	
	//플레이어 목록 조회
	public List<GameDto> list() throws Exception{
		Class.forName("oracle.jdbc.OracleDriver");
		Connection con = DriverManager.getConnection(
				"jdbc:oracle:thin:@localhost:1521:xe", "sw5", "sw5");
		
		String sql = "select * from game";
		PreparedStatement ps = con.prepareStatement(sql);
		ResultSet rs = ps.executeQuery();
		
		List<GameDto> list = new ArrayList<>();
		while(rs.next()) {
			GameDto gdto = new GameDto();
			gdto.setNo(rs.getInt("no"));
			gdto.setId(rs.getString("id"));
			gdto.setJob(rs.getString("job"));
			gdto.setLev(rs.getInt("lev"));
			gdto.setExp(rs.getInt("exp"));
			list.add(gdto);
		}
		con.close();
		return list;
	}

}








