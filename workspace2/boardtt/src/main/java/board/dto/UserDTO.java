package board.dto;

public class UserDTO {
	private String id;
	private String passwd;
	private String name;
	private String birthyy;
	private String birthmm;
	private String email;
	private String gender;
	private String regdate;
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
	public String getBirthyy() {
		return birthyy;
	}
	public void setBirthyy(String birthyy) {
		this.birthyy = birthyy;
	}
	public String getBirthmm() {
		return birthmm;
	}
	public void setBirthmm(String birthmm) {
		this.birthmm = birthmm;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
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
				+ ", birthyy=" + birthyy + ", birthmm=" + birthmm + ", email="
				+ email + ", gender=" + gender + ", regdate=" + regdate + "]";
	}
	
}

/*

String name = request.getParameter("nametxt");
String birthyy = request.getParameter("birthyy");
String birthmm = request.getParameter("birthmm");
String email = request.getParameter("emailtxt");
String gender = "m";
*/