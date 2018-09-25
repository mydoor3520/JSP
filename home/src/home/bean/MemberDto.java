package home.bean;

public class MemberDto {
	private String email;		//입력
	private String pw;			//입력
	private String nick;		//입력
	private String birth;		//입력
	private String phone;		//입력
	private String gender;	//입력
	private String interest;	//입력
	private int point;
	private String post;		//입력
	private String addr1;		//입력
	private String addr2;		//입력
	private String reg;
	private String grade;
	public MemberDto() {
		super();
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
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
	public String getBirth() {
		return birth;
	}
	public void setBirth(String birth) {
		this.birth = birth;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getInterest() {
		return interest;
	}
	public void setInterest(String interest) {
		this.interest = interest;
	}
	public int getPoint() {
		return point;
	}
	public void setPoint(int point) {
		this.point = point;
	}
	public String getPost() {
		return post;
	}
	public void setPost(String post) {
		this.post = post;
	}
	public String getAddr1() {
		return addr1;
	}
	public void setAddr1(String addr1) {
		this.addr1 = addr1;
	}
	public String getAddr2() {
		return addr2;
	}
	public void setAddr2(String addr2) {
		this.addr2 = addr2;
	}
	public String getReg() {
		return reg;
	}
	public void setReg(String reg) {
		this.reg = reg;
	}
	public String getGrade() {
		return grade;
	}
	public void setPower(String grade) {
		this.grade = grade;
	}
	@Override
	public String toString() {
		return "MemberDto [email=" + email + ", pw=" + pw + ", nick=" + nick + ", birth=" + birth + ", phone=" + phone
				+ ", gender=" + gender + ", interest=" + interest + ", point=" + point + ", post=" + post + ", addr1="
				+ addr1 + ", addr2=" + addr2 + ", reg=" + reg + ", grade=" + grade + "]";
	}
}
