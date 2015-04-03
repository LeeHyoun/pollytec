package OOP_141223;

public class Exam_06 {

	public static void main(String[] args) {
		//인스턴스 2개를 생성.
		User kim = new User("홍길동","홍씨","조선","니나노");
		
		System.out.println(kim.getName());
		System.out.println(kim.getUserId());
		System.out.println(kim.getAddress());
		System.out.println(kim.getPassword());
		System.out.println("----------------------------------------------");

		kim.setName("김씨");
		kim.setAddress("시청");
		kim.setPassword("헥사코드임");
		System.out.println(kim.getName());
		System.out.println(kim.getUserId());
		System.out.println(kim.getAddress());
		System.out.println(kim.getPassword());
		
		System.out.println("----------------------------------------------");
		User kang = new User("춘향이","춘씨","조선","닐나노");
		
		System.out.println(kang.getName());
		System.out.println(kang.getUserId());
		System.out.println(kang.getAddress());
		System.out.println(kang.getPassword());
		System.out.println("----------------------------------------------");

		kang.setName("강씨");
		kang.setAddress("용산");
		kang.setPassword("헥사코드님");
		System.out.println(kang.getName());
		System.out.println(kang.getUserId());
		System.out.println(kang.getAddress());
		System.out.println(kang.getPassword());
		
	}

}
