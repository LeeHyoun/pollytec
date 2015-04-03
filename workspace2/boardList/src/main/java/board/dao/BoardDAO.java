package board.dao;

import java.util.List;

import board.dto.BoardDTO;

public interface BoardDAO {
	public List<BoardDTO> selectList(int pg);
	public int selectCount();
	public BoardDTO writeBoard(BoardDTO boardDTO);
	public void updateBoard(BoardDTO boardDTO);
	public BoardDTO readBoard(int seq);
	public void deleteBoard(int seq);
	public int updateBoardCount(int seq) throws DAOException;
}
