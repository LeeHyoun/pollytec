package OOP_141226;

import java.util.Scanner;

public class Exam_Star_print {

	public static void main(String[] args) {
		// 숫자를 입력받아 별직기
		
		Scanner sc = new Scanner(System.in);
		
		//입력받기
		System.out.println("별찍을 숫자를 입력하세요~~");
		int value = Integer.parseInt(sc.nextLine());
		
		for (int i = 0; i < value; i++) {
			
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		

	}

}
