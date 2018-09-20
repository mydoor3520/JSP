package book.bean;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;


public class BookDao {
	private String driverClassName = "oracle.jdbc.OracleDriver";
	private String url = "jdbc:oracle:thin:@127.0.0.1:1523:xe";
	private String username = "sw5";
	private String password = "sw5";
	
	public Connection getConnection() throws Exception {
		Class.forName(driverClassName);
		return DriverManager.getConnection(url, username, password);
	}
	
	
//	도서 등록
	public void register(BookDto bdto) throws Exception{
		Connection con = getConnection();
		//no,name,writer,publisher,reg,price,status
		String sql = "insert into BOOK values(book_seq.nextval, ?, ?, ?, sysdate, ?, ?)";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, bdto.getName());
		ps.setString(2, bdto.getWriter());
		ps.setString(3, bdto.getPublisher());
		ps.setInt(4, bdto.getPrice());
		ps.setString(5, bdto.getStatus());
	
		ps.execute();
		
		con.close();
	}
	
	//플레이어 목록 조회
	public List<BookDto> list() throws Exception{
		Class.forName("oracle.jdbc.OracleDriver");
		Connection con = DriverManager.getConnection(
				"jdbc:oracle:thin:@localhost:1523:xe", "sw5", "sw5");
		
		String sql = "select * from book order by no desc";
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
	
	//삭제기능
	public void delete(int no) throws Exception{
		Connection con = getConnection();
		
		String sql = "delete book where no=?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setInt(1, no);
		ps.execute();
		
		con.close();
	}
	
	//수정기능
		public void edit(
				int no, String name, String writer, String publisher,
				int price, String status) throws Exception{
			Connection con = getConnection();
			
			String sql = 
					"update book set name=?, writer=?, publisher=?,"
					+ " price=?, status=? where no=?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, name);
			ps.setString(2, writer);
			ps.setString(3, publisher);
			ps.setInt(4, price);
			ps.setString(5, status);
			ps.setInt(6, no);
			ps.execute();
			
			con.close();
		}

}








