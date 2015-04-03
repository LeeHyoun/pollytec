package OOP_141223;

public class User {
	// 필드 - 인스턴스 변수
	private String userId;
	private String password;
	private String name;
	private  String address;
	
	
	// 파라미터가 없는 생성자를 기본생성자. User()
	// 생성자가 없으면 자동으로 기본생성자는 컴파일 시 만들어진다.
	// 생성자. 클래스 이름과 같다. 리턴 type이 없다.
	// 인스턴스가 만들어진 후 초기화
	
	public User(String userId) {
		this.userId = userId;
	}
	
	public User(String userId,String name, String password, String address) {
		// 부모의 생성자를 호출한다.
		super(); // 없어도 컴파일때 자동으로 생성됩니다.
		this.userId = userId;
		this.name = name;
		this.password = password;
		this.address = address;
	}

	// getter, setter
	public String getUserId() {
		return userId;
	}


	/*public void setUserId(String userId) {
		this.userId = userId;
	}*/


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


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

	@Override
	public String toString() {
		return "User [userId=" + userId + ", password=" + password + ", name="
				+ name + ", address=" + address + "]";
	}
	
	
	
	
}
