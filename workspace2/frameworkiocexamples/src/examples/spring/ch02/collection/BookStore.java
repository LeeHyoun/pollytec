package examples.spring.ch02.collection;

import java.util.List;
import java.util.Map;

public class BookStore {

	List bookList; 
	
	//property name = booklist = setBookList()
	public void setBookList(List bookList) { // property �ȿ� list �±� 
		this.bookList = bookList;
	}
	
	// DB�� ������� �ʴ�
	// ���� ������� �ʴ� �ڷᱸ���� ����Ҷ�
	
	public void printBookInfo() {
		
		for (int i = 0; i < bookList.size(); i++) //��ü  ����Ʈ����
		{
			System.out.println("==================");
			Map book = (Map) bookList.get(i); // map�� ��������
			
			String title = (String) book.get("title"); //Ÿ��Ʋ��
			List authorList = (List) book.get("authorList"); //���ڸ� ���� ���Ŀ� �°� ����
			//���ڴ� ����Ʈ�� �Ǿ������� List�������� value�� �� �̹Ƿ� String
			System.out.println(title);  //������ �Ǿ��ִ� title�� ���
			
			for (int k = 0; k < authorList.size(); k++) { // ���ڰ� list�� �Ǿ������� 
				String author = (String) authorList.get(k); //�׾��� �� (value)�� �� ������
				System.out.println(author); //����Ѵ�.
			}
			System.out.println("==================");
		}
	}
}
