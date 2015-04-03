package board.dto;

public class UserDTO {
	private String id ;
	private String passwd;
	private String name; 
	private String birthyyyy;
	private String birthmn; 
	private String gender;
	private String email;
	private String regdate ;
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPasswd() {
		return passwd;
	}
	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBirthyyyy() {
		return birthyyyy;
	}
	public void setBirthyyyy(String birthyyyy) {
		this.birthyyyy = birthyyyy;
	}
	public String getBirthmn() {
		return birthmn;
	}
	public void setBirthmn(String birthmn) {
		this.birthmn = birthmn;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getRegdate() {
		return regdate;
	}
	public void setRegdate(String regdate) {
		this.regdate = regdate;
	}
	
	@Override
	public String toString() {
		return "UserDTO [id=" + id + ", passwd=" + passwd + ", name=" + name
				+ ", birthyyyy=" + birthyyyy + ", birthmn=" + birthmn
				+ ", gender=" + gender + ", email=" + email + ", regdate="
				+ regdate + "]";
	}
	
	
	
	
}
