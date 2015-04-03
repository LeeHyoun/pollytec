package board.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import board.dao.ReplyDAO;
import board.dto.ReplyDTO;

@Service
@Transactional
public class ReplyServiceImpl implements ReplyService {
	
	@Autowired
	ReplyDAO replyDAO;
	
	@Override
	@Transactional(readOnly=false)
	public void writeReply(ReplyDTO replyDTO) {
		replyDAO.writeReply(replyDTO);
	}
	
	@Override
	public List<ReplyDTO> replyList(int boardSeq) {
		return replyDAO.replyList(boardSeq);
	}
}
