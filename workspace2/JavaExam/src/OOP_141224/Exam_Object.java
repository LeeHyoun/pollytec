package OOP_141224;

public class Exam_Object {

	public static void main(String[] args) {
		
		Data d1 = new Data();
		d1.setName("data01");
		d1.setCount(50);
		
		//println 메소드는 object 를 받아들이면,
		// object의 toString() 메소드가 리턴하는 값을 출력,
		// object의 toString() , equals() , hashCode()
		//메소드는 오버라이딩을 하라고 준비되어 있는 메소드.
		
		//메소드를 오버라이딩하면 무조껀 자식께  실행된다.
		System.out.println(d1);
	}

}

class Data{
	private String name;
	private int count;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	
	@Override
	public String toString() {
		return "Data [name=" + name + ", count=" + count + "]";
	}
	
	
}
