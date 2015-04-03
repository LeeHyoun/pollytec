package dao;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;

import dto.BoardDTO;

public class BoardDAO_Test {

	@Test
	public void writeBoard() throws Exception{
		BoardDAO dao = new BoardDAO();
		BoardDTO bdto = new BoardDTO();
		
		String user_id = "urstory3";
		String title = "test";
		String content = "text content";
		String ip = "test ip";
		
		bdto.setUser_id(user_id);
		bdto.setTitle(title);
		bdto.setContent(content);
		bdto.setIp(ip);
		
		int count = dao.writeBoard(bdto);
		assertEquals(1, count);
	}
	
	@Test
	public void selectListBoard() throws Exception{
		BoardDAO dao = new BoardDAO();
		int page = 1;
		List<BoardDTO> list =  dao.selectListBoard(page);
		
		for (BoardDTO boardDTO : list) {
			System.out.println(boardDTO.toString());
		}
		
	}
	
	@Test
	public void readBoard() throws Exception{
		BoardDAO dao = new BoardDAO();
		int seq = 31;
		BoardDTO dto =  dao.readBoard(seq);
		
		System.out.println(dto.toString());
	}
	
	@Test
	public void deleteBoard() throws Exception{
		BoardDAO dao = new BoardDAO();
		int seq = 38;
		boolean flag =  dao.deleteBoard(seq);
		
		assertEquals(true, flag);
	}
	
	@Test
	public void updateBoard() throws Exception{
		BoardDAO dao = new BoardDAO();
		BoardDTO dto = new BoardDTO();
		
		dto.setSeq(61);
		dto.setUser_id("urstory2");
		dto.setTitle("Teest Data");
		dto.setContent("Test Data");
		
		int count =  dao.updateBoard(dto);
		
		assertEquals(1, count);
	}
}
