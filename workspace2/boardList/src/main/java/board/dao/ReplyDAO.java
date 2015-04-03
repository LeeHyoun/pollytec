package board.dao;

import java.util.List;

import board.dto.BoardDTO;
import board.dto.ReplyDTO;

public interface ReplyDAO {

	// insert
	public abstract int writeReply(ReplyDTO redto) throws DAOException;

	// selectList
	public abstract List<ReplyDTO> replyList(int seq) throws DAOException;

}