package OOP_141224;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;


public class Exam_Collection_SET {

	public static void main(String[] args) {
		
		Set<String> set = new HashSet<String>();
		
		boolean b1 = set.add("첫번째");
		boolean b2 = set.add("두번째");
		boolean b3 = set.add("세번째");
		boolean b4 = set.add("첫번째"); //중복
		
		for (String str : set) {  //foreach
			System.out.println(str);
		}
		
		System.out.println("b1:"+b1+" b2:"+b2+"  b3:"+b3+" b4:"+b4);
		
		Iterator<String> iterator = set.iterator();
		//set.iterator() 가 Iterator 에 의존한다.
		
		while(iterator.hasNext()){
			String str = iterator.next();
			System.out.println(str);
		}
		
		
		
	}

}
