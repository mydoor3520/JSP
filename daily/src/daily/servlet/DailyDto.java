package daily.servlet;
/**
 *	DTO(Data Transfer Object)		��ȯ ��ü, ���� ����. DB 1�ٰ� �����ϰ� ����
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
