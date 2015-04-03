package OOP_141223;

public class Exam_03 {

	public static void main(String[] args) {
		// 0.0 <= x < 1.0
		// 0.7316433693479558

		double random = Math.random();
		
		// 0.0 <= x < 6.0
		random = random * 6;  
		
		// 실수를 정수로 바꾸기. 잘림!!
		// 0 <= x < 6
		int value = (int)random; // 형변환
		
		// 1 <= x < 7
		value = value + 1;
		System.out.println(value);
		
	}

}
