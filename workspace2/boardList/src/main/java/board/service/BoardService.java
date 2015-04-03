package board.service;

import java.util.List;

import board.dto.BoardDTO;

public interface BoardService {
	//board
	public int selectCount(); //전체 개시물 갯수
	public List<BoardDTO> selectList(int ipage); //한 페이지당 개시물 갯수
	public void deleteBoard(int seq);
	public BoardDTO writeBoard(BoardDTO board);
	
	//readform
	public BoardDTO readBoard(int seq);
	public void updateBoard(BoardDTO boardDTO);
}	
