package study.servlet;
/**
 *	DTO(Data Transfer Object)		��ȯ ��ü, ���� ����. DB 1�ٰ� �����ϰ� ����
 */
public class TestUserDto {
	private String id, pw, nick, joindate, grade;
	private int money;
	@Override
	public String toString() {
		return "TestUserDto [id=" + id + ", pw=" + pw + ", nick=" + nick + ", joindate=" + joindate + ", grade=" + grade
				+ ", money=" + money + "]";
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public String getNick() {
		return nick;
	}
	public void setNick(String nick) {
		this.nick = nick;
	}
	public String getJoindate() {
		return joindate;
	}
	public void setJoindate(String joindate) {
		this.joindate = joindate;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	public TestUserDto() {
		super();
	}
}
