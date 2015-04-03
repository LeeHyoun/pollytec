package board.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import board.dao.BoardDAO;
import board.dto.BoardDTO;

@Service
@Transactional
public class BoardServiceImpl implements BoardService{
	@Autowired
	BoardDAO boardDAO;
	
	@Override
	@Transactional(readOnly=false)
	public BoardDTO getBoard(int seq) {
		boardDAO.updateBoardCount(seq);
		BoardDTO board = boardDAO.selectBoard(seq);
		return board;
	}

	@Override
	@Transactional(readOnly=false)
	public BoardDTO addBoard(BoardDTO board) {
		return boardDAO.addBoard(board);
	}

	@Override
	@Transactional(readOnly=true)
	public int getCount() {
		return boardDAO.selectCount();
	}

	@Override
	@Transactional(readOnly=true)
	public List<BoardDTO> getList(int page) {
		return boardDAO.selectList(page);
	}

	
}
