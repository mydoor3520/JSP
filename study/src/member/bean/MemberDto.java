package member.bean;

public class MemberDto {
	private String name, address, phone, email;
	private int born;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public MemberDto() {
		super();
	}
	public MemberDto(String name, String address, String phone, String email, int born) {
	this.name = name;
	this.address = address;
	this.phone = phone;
	this.email = email;
	this.born = born;
	}

	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getBorn() {
		return born;
	}
	public void setBorn(int born) {
		this.born = born;
	}
}
