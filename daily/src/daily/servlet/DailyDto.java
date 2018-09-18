package daily.servlet;
/**
 *	DTO(Data Transfer Object)		변환 객체, 포장 상자. DB 1줄과 동일하게 구성
 */
public class DailyDto {
	private int no;
	private String writer, content, reg;
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getReg() {
		return reg;
	}
	public void setReg(String reg) {
		this.reg = reg;
	}
	@Override
	public String toString() {
		return "TestUserDto [no=" + no + ", writer=" + writer + ", content=" + content + ", reg=" + reg + "]";
	}
	
}
