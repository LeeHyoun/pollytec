package OOP_141226;

import java.util.Random;

public class Exam_Random_MIN_MAX {

	public static void main(String[] args) {
		// 10개의 정수에 1~100사이의 랜덤값 저장
		int[] num = new int[10];
		
		Random ran = new Random();
		
		for (int i = 0; i < num.length; i++) {
			//10개의 배열의 값을 모두 출력
			num[i] = ran.nextInt(100)+1;
			System.out.println((i+1)+"]번째 값 : "+num[i]);
		}
		
		// 가장 큰 값과 가장 작은 값을 출력	
		int max = num[0];
		int min = num[0];
		
		for (int j = 0; j < num.length; j++) {
			if(max<num[j])
				max = num[j];
			if(min>num[j])
				min = num[j];
			
			max = Math.max(max, num[j]);
			min = Math.min(min, num[j]);
		}
		
		System.out.println("----------------");
		System.out.println("MAX는 :"+max);
		System.out.println("MIN은 :"+min);
		
		
	}

}
