package philho.philhoService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import philho.philhoDAO.BoardDAO;
import philho.philhoDAO.UsrDAO;
import philho.philhoDTO.BoardDTO;


@Service
@Transactional
public class BoardServiceImpl implements BoardService{
	@Autowired
	BoardDAO boardDAO;
	UsrDAO usrDAO;

	@Override
	public List<BoardDTO> getList(int page) {
		return boardDAO.selectList(page);
	}

	@Override
	public int getCount() {
		return boardDAO.selectCount();
	}

	@Override
	public BoardDTO addBoard(BoardDTO board) {
		return boardDAO.addBoard(board);
	}

	@Override
	public BoardDTO readBoard(BoardDTO boardDTO) {
		return boardDAO.readBoard(boardDTO);
	}

@Override
	public void updateBoard(BoardDTO boardDTO) {
		boardDAO.updateBoard(boardDTO);
		
	}

	@Override
	public List<BoardDTO> getList() {
		
		return boardDAO.getList();
	}

	@Override
	public void boarddelete(int boardSeq) {
		boardDAO.boarddelete(boardSeq);
		
	}

	@Override
	public int getCount2(String searchValue) {
		
		return boardDAO.getCount2(searchValue);
	}

	@Override
	public List<BoardDTO> getList(int ipg, String searchValue) {
		
		return boardDAO.getList(ipg,searchValue);
	}

	@Override
	public List<BoardDTO> getList2(int ipg, String searchValue) {

		return boardDAO.getList2(ipg, searchValue);
	}

	@Override
	public int getCount3(String searchValue) {
		
		return boardDAO.getCount3(searchValue);
	}



}
