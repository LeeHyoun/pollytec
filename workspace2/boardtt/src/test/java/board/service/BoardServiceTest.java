package board.service;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.transaction.annotation.Transactional;

import board.dto.BoardDTO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:/spring/dbpool-context.xml","classpath:/spring/root-context.xml"})
@TransactionConfiguration(defaultRollback=true)
public class BoardServiceTest {
	@Autowired
	BoardService boardService;
	
	@Test
	@Transactional
	public void addBoard() throws Exception{
		BoardDTO board = new BoardDTO();
//		board.setTitle("hello2222");
//		board.setContent("hello world");
//		board.setIp("127.0.0.1");
//		board.setUserId("urstory");
//		board.setUserName("kim");
		BoardDTO board2 = boardService.addBoard(board);
		assertNotEquals(board2.getSeq(), 0);
	}
}