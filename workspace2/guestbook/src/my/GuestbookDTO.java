package my;

//DTO -> Data Transfer Object
//1건의 정보를 저장. 비슷한 이름으로 VO(ValueObject)
public class GuestbookDTO {
	private int rownum;
	private int id;
	private String name;
	private String content;
	private String regdate;
	
	public int getRownum() {
		return rownum;
	}
	public void setRownum(int rownum) {
		this.rownum = rownum;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getRegdate() {
		return regdate;
	}
	public void setRegdate(String regdate) {
		this.regdate = regdate;
	}
	@Override
	public String toString() {
		return "GuestbookDTO [rownum=" + rownum + ", id=" + id + ", name="
				+ name + ", content=" + content + ", regdate=" + regdate + "]";
	}

	
}

/*
id number primary key, 
name varchar2(20) not null, 
content clob not null, 
regdate date not null 
*/