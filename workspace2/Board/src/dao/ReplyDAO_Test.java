package dao;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

import dbcon.DBcon;
import dto.BoardDTO;

public class ReplyDAO_Test {
	
	@Test
	public void writeReply() throws Exception{
		ReplyDAO redao = new ReplyDAO();
		
		BoardDTO bdto = new BoardDTO();
		bdto.setSeq(1);
		bdto.setUser_id("hlee");
		
		ReplyDTO redto = new ReplyDTO();
		redto.setContent("Reply Test");
		
		int n = redao.writeReply(bdto, redto);
		assertEquals(1, n);
	}
	
	@Test
	public void selectReplyList() throws Exception{
		ReplyDAO redao = new ReplyDAO();
		
		int seq = 1;
		List<ReplyDTO> list = redao.selectReplyList(seq);

		for (ReplyDTO replyDTO : list) {
			System.out.println(replyDTO.toString());
		}
	}
}
