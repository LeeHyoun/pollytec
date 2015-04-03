package OOP_141226;

import java.util.Scanner;

public class Exam_Char {

	public static void main(String[] args) {
		// 숫자를 입력받아 별직기
		
		Scanner sc = new Scanner(System.in);
		char ch = 'a';
		//입력받기
		System.out.println("별찍을 숫자를 입력하세요~~");
		int value = Integer.parseInt(sc.nextLine());
		
		for (int i = 0; i < value; i++) {
			
			for (int j = 0; j <= i; j++) {
				System.out.print(ch);
				ch++;
				
				if(ch > 'z')
					ch = 'a';
			}
			System.out.println();
		}
		

	}

}
