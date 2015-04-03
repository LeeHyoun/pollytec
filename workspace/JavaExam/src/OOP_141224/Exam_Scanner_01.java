package OOP_141224;

import java.util.Scanner;

public class Exam_Scanner_01 {

	public static void main(String[] args) {
		
		//InputStream 은 읽기 위한 객체 .
		//System.in 특수! 키보드로부터 읽어들인다.
		//System.in 은 키보드.
		//그렇다면 Scanner 생성자에 파일로부터 읽어들이는
		//InputStream의 자식인스턴스를 넣으면 어떻게 될까?
		
		Scanner scanner = new Scanner(System.in);
		String str = scanner.nextLine();
		System.out.println(str);
	}

}
