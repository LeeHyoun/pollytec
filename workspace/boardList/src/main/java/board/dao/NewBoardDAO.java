package board.dao;

import java.util.List;

import board.dto.BoardDTO;

public interface NewBoardDAO {
	public List<BoardDTO> selectList(int pg);
	public int selectCount();
	public void writeBoard(BoardDTO boardDTO);
	public void updateBoard(BoardDTO boardDTO);
	public BoardDTO readBoard(int seq);
	public void deleteBoard(int seq);
	public void updateBoardCount(int seq) throws DAOException;
}
