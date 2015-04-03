package board.dao;

import java.util.List;

import board.dto.BoardDTO;

public interface BoardDAO {
	public List<BoardDTO> selectList(int pg);
	public int selectCount();
	public int updateBoardCount(int seq);
	public BoardDTO selectBoard(int seq);
	public BoardDTO addBoard(BoardDTO board);
}
