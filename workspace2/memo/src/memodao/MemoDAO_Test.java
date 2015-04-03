package memodao;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

import dbcon.DBcon;
import dto.MemoDTO;

public class MemoDAO_Test {
	
	@Test
	public void selectList() throws Exception {
		MemoDAO dao = new MemoDAO();
		List<MemoDTO> list = dao.selectList();
		
		for (MemoDTO memoDTO : list) {
			System.out.println(memoDTO.toString());
		}
	}
	
	@Test
	public void insertMemo() throws Exception{
		MemoDAO dao = new MemoDAO();
		
		String title = "test1";
		String content = "test1";
		
		int n = dao.insertMemo(title, content);
		
		assertEquals(1, n);
	}
	
	@Test
	public void getList() throws Exception{
		MemoDAO dao = new MemoDAO();
		int page = 1;
		List<MemoDTO> list = dao.getList(page);
		
		for (MemoDTO memoDTO : list) {
			System.out.println(memoDTO.toString());
		}
	}
	
	@Test
	public void getMemoCount() throws Exception{
		MemoDAO dao = new MemoDAO();
		int n = dao.getMemoCount();
		System.out.println("count :"+n);
	}
}
