package board.service;

import java.util.List;

import board.dto.BoardDTO;

public interface BoardService {
	public BoardDTO getBoard(int seq);
	public BoardDTO addBoard(BoardDTO board);
	public int getCount();
	public List<BoardDTO> getList(int page);
}
