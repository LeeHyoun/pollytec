package OOP_141226;

import java.util.Random;
import java.util.Scanner;

public class Exam_Random_12QNA {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//변수에 1부터 100사이의 랜덤한 값을 저장한다.
		int i = (int)(Math.random() *100)+1;
		int cnt=1;
		
		System.out.println("내가 생각하고 있는 숫자는 몇일까요???");
		
		while(true){
			//사용자는 숫자를 입력한다.
			System.out.println(cnt+"]번째 숫자를 입력해 주세요[1~100].");
			String num = sc.nextLine();
			int value = Integer.parseInt(num);
			
			//사용자 값과 랜덤값을 비교
			if(i > value){
				System.out.println("입력한 값이 더 작아요!!!");
			}else if(i < value){
				System.out.println("입력한 값이 더 커요!!!");
			}else{
				System.out.println("축하합니다!!! ["+cnt+"]번째 입력후 맞추셨습니다!!");
				System.out.println("랜덤값은 !! : ["+i+"]이였습니다.!");
				break;
			}
			
			//10번안에 맞추기
			if(cnt == 10){
				System.out.println("안타까워요 ... 실패...(기회는 10번!!)");
			}else cnt++;
			
			//cnt++;
		}
	}
}
