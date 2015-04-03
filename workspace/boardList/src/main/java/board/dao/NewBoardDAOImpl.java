package board.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import board.dto.BoardDTO;
import board.dto.BoardPageDTO;

//DAO구현클래스는 @Repository가 붙는다.
@Repository
public class NewBoardDAOImpl implements NewBoardDAO{
	
	@Autowired
	private SqlSession sqlSession;
	
	// BoardMapper.xml - namespace="kr.co.datastreams.mybatis.Board"
	private static final String NS = "kr.co.datastreams.mybatis.Board."; //마지막 "." 뒤에는 id가 온다.
	
	@Override
	public List<BoardDTO> selectList(int pg) {
		int start = pg * 5 - 5 + 1;
		int end = pg * 5;
		
		BoardPageDTO  boardPageDTO = new BoardPageDTO();
		boardPageDTO.setStart(start);
		boardPageDTO.setEnd(end);
		
		List<BoardDTO> selectList = sqlSession.selectList(NS + "selectList", boardPageDTO);
		return selectList;
	}
	
	@Override
	public int selectCount() {
		int count = sqlSession.selectOne(NS + "selectCount");  //Mapper -> 쿼리 id="selectCount"
		return count;
	}
	
	@Override
	public void writeBoard(BoardDTO boardDTO) {
		sqlSession.insert(NS + "writeBoard", boardDTO);	
	}
	
	@Override
	public void updateBoard(BoardDTO boardDTO) {
		sqlSession.update(NS + "updateBoard", boardDTO);		
	}
	
	@Override
	public BoardDTO readBoard(int seq) {
		
		BoardDTO bdto = sqlSession.selectOne(NS + "readBoard", seq);
		
		return bdto;
	}
	
	@Override
	public void deleteBoard(int seq) {		
		sqlSession.delete(NS + "deleteBoard", seq);
		
	}
	
	public void updateBoardCount(int seq) {
		sqlSession.update(NS + "updateBoardCount", seq);
	}
}
