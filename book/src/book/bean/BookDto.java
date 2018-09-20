package book.bean;
/**
 *	DTO(Data Transfer Object)		변환 객체, 포장 상자. DB 1줄과 동일하게 구성
 */
public class BookDto {
	private int no, price;
	private String status, name, reg, writer,publisher;
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getReg() {
		return reg;
	}
	public void setReg(String reg) {
		this.reg = reg;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public BookDto(String name, String writer, String publisher, int price, String status) {
		this.price = price;
		this.status = status;
		this.name = name;
		this.writer = writer;
		this.publisher = publisher;
	}
	public BookDto() {

	}
	
}
