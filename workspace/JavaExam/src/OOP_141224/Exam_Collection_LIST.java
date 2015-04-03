package OOP_141224;

import java.util.ArrayList;
import java.util.List;



public class Exam_Collection_LIST {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<String>();
		
		list.add("첫번째");
		list.add("두번째");
		list.add("세번째");
		
		for (String str : list) {  //foreach
			System.out.println(str);
		}
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	}

}
