package book.bean;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class BookDao {
	private final String driverClassName = "oracle.jdbc.OracleDriver";
	private final String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
	private final String username = "sw5";
	private final String password = "sw5";
	
	public Connection getConnection() throws Exception {
		Class.forName(driverClassName);
		return DriverManager.getConnection(url, username, password);
	}
	
//	등록 기능
	public void register(BookDto bdto) throws Exception{
		Connection con = getConnection();
		
		String sql = "insert into book values(book_seq.nextval, ?, ?, ?, sysdate, ?, ?)";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, bdto.getName());
		ps.setString(2, bdto.getWriter());
		ps.setString(3, bdto.getPublisher());
		ps.setInt(4, bdto.getPrice());
		ps.setString(5, bdto.getStatus());
		ps.execute();
		
		con.close();
	}
	
	public List<BookDto> list() throws Exception{
		Connection con = getConnection();
		
		String sql = "select * from book order by no asc";
		PreparedStatement ps = con.prepareStatement(sql);
		ResultSet rs = ps.executeQuery();
		
		List<BookDto> list = new ArrayList<>();
		while(rs.next()) {
			BookDto bdto = new BookDto();
			bdto.setNo(rs.getInt("no"));
			bdto.setName(rs.getString("name"));
			bdto.setWriter(rs.getString("writer"));
			bdto.setPublisher(rs.getString("publisher"));
			bdto.setReg(rs.getString("reg"));
			bdto.setPrice(rs.getInt("price"));
			bdto.setStatus(rs.getString("status"));
			list.add(bdto);
		}
		
		con.close();
		return list;
	}

	public void delete(int no) throws Exception{
		Connection con = getConnection();
		
		String sql = "delete book where no=?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setInt(1, no);
		ps.execute();
		
		con.close();
	}
	
	public BookDto get(int no) throws Exception{
		Connection con = getConnection();
		
		String sql = "select * from book where no=?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setInt(1, no);
		ResultSet rs = ps.executeQuery();
		
		BookDto bdto = new BookDto();
		if(rs.next()) {
			bdto.setNo(rs.getInt("no"));
			bdto.setName(rs.getString("name"));
			bdto.setWriter(rs.getString("writer"));
			bdto.setPublisher(rs.getString("publisher"));
			bdto.setReg(rs.getString("reg"));
			bdto.setPrice(rs.getInt("price"));
			bdto.setStatus(rs.getString("status"));
		}
		
		con.close();
		return bdto;
	}

	public void edit(BookDto bdto) throws Exception{
		Connection con = getConnection();
		
		String sql = "update book "
								+ "set "
									+ "name=?, writer=?, publisher=?, price=?, status=? "
								+ "where no=?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, bdto.getName());
		ps.setString(2, bdto.getWriter());
		ps.setString(3, bdto.getPublisher());
		ps.setInt(4, bdto.getPrice());
		ps.setString(5, bdto.getStatus());
		ps.setInt(6, bdto.getNo());
		ps.execute();
		
		con.close();
	}
}
