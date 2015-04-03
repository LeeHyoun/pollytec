package examples.spring.ch04.nontransaction;

import java.util.Date;
import java.util.List;

public class Member {
	
	private int memberId;
	private String name;
	private int age;
	private List address;
	private Date created;
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Date getCreated() {
		return created;
	}
	public void setCreated(Date created) {
		this.created = created;
	}
	public int getMemberId() {
		return memberId;
	}
	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List getAddress() {
		return address;
	}
	public void setAddress(List address) {
		this.address = address;
	}

	public String toString() {
		return memberId + " " + name + " " + age + " " + address + " " + created; 
	}
	
}
