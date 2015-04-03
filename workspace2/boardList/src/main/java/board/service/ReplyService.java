package board.service;

import java.util.List;

import board.dto.ReplyDTO;

public interface ReplyService {
	public void writeReply(ReplyDTO replyDTO);
	public List<ReplyDTO> replyList(int boardSeq);
}
