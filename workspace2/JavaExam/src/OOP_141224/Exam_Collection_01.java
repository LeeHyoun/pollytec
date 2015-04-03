package OOP_141224;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

public class Exam_Collection_01 {

	public static void main(String[] args) {
		
		//Collection<String> coll = new ArrayList<String>(); 
		Collection<String> coll = new HashSet<String>();
		// 뒤에 구현되는 클레스에 따라 값을 다르게 나올수 있다.
		
		coll.add("kim");
		coll.add("lee");
		coll.add("hong");
		
		Iterator<String> iterator = coll.iterator();
		
		while(iterator.hasNext()){
			String str = iterator.next();
			System.out.println(str);
		}

	}

}
