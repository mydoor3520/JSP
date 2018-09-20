package game.servlet;
/**
 *	DTO(Data Transfer Object)		변환 객체, 포장 상자. DB 1줄과 동일하게 구성
 */
public class GameDto {
	private int no, lev, exp;
	private String id, job;
	public int getNo() {
		return no;
	}
	public int getLev() {
		return lev;
	}
	public void setLev(int lev) {
		this.lev = lev;
	}
	public int getExp() {
		return exp;
	}
	public void setExp(int exp) {
		this.exp = exp;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public void setNo(int no) {
		this.no = no;
	}
	
	public GameDto(String id, String job) {
		this.exp = 0;
		this.lev = 1;
		this.id = id;
		this.job = job;
	}
	
	public GameDto() {
	}
	@Override
	public String toString() {
		return "DailyDto [no=" + no + ", lev=" + lev + ", exp=" + exp + ", id=" + id + ", job=" + job + "]";
	}

	
}
