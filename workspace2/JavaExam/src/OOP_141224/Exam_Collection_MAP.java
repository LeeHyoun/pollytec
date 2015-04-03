package OOP_141224;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;


public class Exam_Collection_MAP {

	public static void main(String[] args) {
		
		Map<Integer, String> map = new HashMap<Integer, String>();
		
		map.put(1, "첫번째");
		map.put(2, "두번째");
		map.put(3, "세번째");
		map.put(4, "네번째");
		
		Set<Integer> keyset = map.keySet();
		Iterator<Integer> iterator = keyset.iterator();
		
		while(iterator.hasNext()){
			int key = iterator.next();
			String value = map.get(key);
			
			System.out.println(key+", "+value);
		}
	}

}
