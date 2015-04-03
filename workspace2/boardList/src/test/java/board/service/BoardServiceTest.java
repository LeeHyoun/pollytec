package board.service; 

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

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
        board.setTitle("hello3333"); 
        board.setContent("hello world"); 
        board.setIp("127.0.0.1"); 
        board.setUserId("test"); 
        board.setName("kim"); 
        
        BoardDTO board2 = boardService.writeBoard(board); 
        assertNotEquals(board2.getSeq(), 0); 
    } 
     
    @Test 
    @Transactional 
    public void getCount() throws Exception{ 
        int count1 = boardService.selectCount(); 
        BoardDTO board = new BoardDTO(); 
        board.setTitle("hello3333"); 
        board.setContent("hello world"); 
        board.setIp("127.0.0.1"); 
        board.setUserId("test"); 
        board.setName("kim"); 
        BoardDTO board2 = boardService.writeBoard(board); 
        int count2 = boardService.selectCount(); 
        assertEquals(count1, count2-1); 
    } 
} 