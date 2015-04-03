package kr.co.datastreams.board2.dao;

import java.util.List;

import static org.junit.Assert.assertEquals;
import kr.co.datastreams.board2.dto.BoardDTO;

import org.junit.Test;

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
