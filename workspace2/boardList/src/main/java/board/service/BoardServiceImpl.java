package board.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import board.dao.BoardDAO;
import board.dto.BoardDTO;

@Service
@Transactional
public class BoardServiceImpl implements BoardService {
	@Autowired
	BoardDAO boardDAO;

	@Override
	@Transactional(readOnly=true)
	public int selectCount() {
		int count = boardDAO.selectCount();
		return count;
	}

	@Override
	@Transactional(readOnly=true)
	public List<BoardDTO> selectList(int ipage) {
		return boardDAO.selectList(ipage);
	}

	@Override
	@Transactional(readOnly=false)
	public void deleteBoard(int seq) {
		boardDAO.deleteBoard(seq);		
	}

	@Override
	@Transactional(readOnly=false)
	public BoardDTO writeBoard(BoardDTO board) {
		return boardDAO.writeBoard(board);
	}

	@Override
	public BoardDTO readBoard(int seq) {
		return boardDAO.readBoard(seq);
	}

	@Override
	public void updateBoard(BoardDTO boardDTO) {
		boardDAO.updateBoard(boardDTO);
	}
	
	
	
}
