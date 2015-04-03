package OOP_141224;

import java.util.Random;
import java.util.Set;

public class LOTTO {

	public static void main(String[] args) {
		
		System.out.println("######## 인 생 역 전 LOTTO!!!! ########");
		
		Random ran = new Random();
		int random = 0;
		
		
		
		for (int i = 0; i < 6; i++) {
			 random = ran.nextInt(45) +1 ;
			 
		}
		System.out.println(random);
	}

}
