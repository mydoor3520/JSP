package book.bean;

public class BookDto {
	private int no;
	private String name;
	private String writer;
	private String publisher;
	private String reg;
	private int price;
	private String status;
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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
	//필요에 의해 추가된 getter
	public String getDate() {
		return reg.substring(0, 10);
	}
	public String getReg() {
		return reg;
	}
	public void setReg(String reg) {
		this.reg = reg;
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
	@Override
	public String toString() {
		return "BookDto [no=" + no + ", name=" + name + ", writer=" + writer + ", publisher=" + publisher + ", reg="
				+ reg + ", price=" + price + ", status=" + status + "]";
	}
}
