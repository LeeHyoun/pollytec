package examples.spring.ch01.javabeans;

// �ڹٺ���
public class UserBean {
	
	//��������� private�� ����
	private String name;
	private int age;
	private boolean male;
	
	// �⺻�����ڸ� ������ �־�� �Ѵ�.
	public UserBean() {
	}
	
	public UserBean(String name, int age, boolean male) {
		this.name = name;
		this.age = age;
		this.male = male;
	}

	//setter, getter �޼ҵ带 ������ �־�� �Ѵ�. - ������Ƽ ��� �Ѵ�.
	//setter �޼ҵ� ����
	public void setName(String name) {
		this.name = name;
	}

	//getter �޼ҵ� ����
	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public boolean isMale() {
		return male;
	}

	public void setMale(boolean male) {
		this.male = male;
	}

}