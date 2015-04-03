package OOP_141224;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;

public class Exam_Random {

	public static void main(String[] args) {
		
		Random random = new Random();  
		//1L seed : 같은 순서의 랜덤값이 나온다.
		
		Map<Integer,Integer> map = new HashMap<Integer,Integer>();
				
		for (int i = 1; i < 10; i++) {
			map.put(i, 0);
		}
		
		for (int i = 0; i < 10000; i++) {
			int ran = random.nextInt(9)+ 1;
			
			for (int j = 1; j < 10; j++) {
				if(ran == j)
					map.put(j, map.get(j)+1);
			}
		}
		
		Set<Integer> set = map.keySet();
		Iterator<Integer> iterator = set.iterator();
		int i =1;
		while(iterator.hasNext()){
			int num = map.get(iterator.next());
			System.out.println(i+"번] : "+num+"회 당첨_____ 확률: 약"+(10000/num)+"%");
			i++;
		}
		
	}

}
