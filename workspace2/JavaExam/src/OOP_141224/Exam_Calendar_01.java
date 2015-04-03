package OOP_141224;

public class Exam_Calendar_01 {

	public static void main(String[] args) {
		
		//MyData d1 = new MyData();  
		//private로 선언되어있어 외부 클레스에서 접근을 못함
		//생성자 호출을 할 수 없고, 인스턴스를 만들지 못한다.
		
		MyData.print();
		//MyData Class의 print() 매소드는 public 접근지정자이고
		//MyData Class가 메모리에 올라갈때 static 영역에 print() 매소드가 올라가있기 때문에
		//실행될 수 있다.
	}

}// Exam_Calendar_01 - END

class MyData{
	// 컴파일시 자동으로 생성된다.
	private MyData() {
		super();
	}
	
	public static void print(){
		System.out.println("print1");
	}
}