package bookDAO;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.apache.jasper.tagplugins.jstl.core.ForEach;
import org.junit.Assert;
import org.junit.Test;

import bookDTO.BookDTO;

public class BookDAO_Test {

	@Test
	public void getSelect() throws Exception{
		BookDAO dao = new BookDAO();
		List<BookDTO> list = new ArrayList<BookDTO>();
		int page = 1;
		
		list = dao.getSelect(page);
		
		for(BookDTO dto : list){
			System.out.println(dto.toString());
		}
	}
	
	@Test
	public void getCount() throws Exception{
		BookDAO dao = new BookDAO();
		System.out.println(dao.getCount());
	}
	
	@Test
	public void insertBook() throws Exception{
		BookDAO dao = new BookDAO();
		BookDTO dto = new BookDTO();
		
		dto.setName("이현");
		dto.setContent("내용테스트");
		
		Assert.assertEquals(dao.insertBook(dto), 1);
	}
	
	@Test
	public void deleteBook() throws Exception{
		BookDAO dao = new BookDAO();
		int id = 8;
		
		Assert.assertEquals(dao.deleteBook(id), 1);
	}
}
