package examples.spring.ch02.collection;

import java.util.List;
import java.util.Map;

public class BookStore {

	List bookList; 
	
	//property name = booklist = setBookList()
	public void setBookList(List bookList) { // property 안에 list 태그 
		this.bookList = bookList;
	}
	
	// DB를 사용하지 않는
	// 자주 변경되지 않는 자료구조를 사용할때
	
	public void printBookInfo() {
		
		for (int i = 0; i < bookList.size(); i++) //전체  리스트에서
		{
			System.out.println("==================");
			Map book = (Map) bookList.get(i); // map을 가져오고
			
			String title = (String) book.get("title"); //타이틀과
			List authorList = (List) book.get("authorList"); //저자를 각각 형식에 맞게 저장
			//저자는 리스트로 되어있으니 List형식으로 value는 값 이므로 String
			System.out.println(title);  //값으로 되어있는 title는 출력
			
			for (int k = 0; k < authorList.size(); k++) { // 저자가 list로 되어있으니 
				String author = (String) authorList.get(k); //그안의 것 (value)값 을 가져와
				System.out.println(author); //출력한다.
			}
			System.out.println("==================");
		}
	}
}
