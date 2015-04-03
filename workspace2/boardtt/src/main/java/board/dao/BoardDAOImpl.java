package board.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import board.dto.BoardDTO;
import board.dto.BoardSearchParamDTO;

//DAO구현클래스는 @Repository가 붙는다.
@Repository
public class BoardDAOImpl implements BoardDAO{
	// <bean id="sqlSession" class="org.mybatis.spring.SqlSessionTemplate">
	// dbpool-context.xml에서 위와 같이 설정되어 있다.
	// 위와 같이 설정된 객체를 @Autowired는 주입하라는 의미다.
	@Autowired
	private SqlSession sqlSession;
	
	private static final String NS = "kr.co.sunnyvale.mybatis.Board.";
	
	
	
	@Override
	public int selectCount() {
		int count = sqlSession.selectOne(NS + "selectCount");
		return count;
	}



	@Override
	public List<BoardDTO> selectList(int pg) {
		int start = pg * 5 - 5 + 1;
		int end = pg * 5;
		BoardSearchParamDTO boardSearchParamDTO =
				new BoardSearchParamDTO();
		boardSearchParamDTO.setStart(start);
		boardSearchParamDTO.setEnd(end);
		
		List<BoardDTO> selectList = sqlSession.selectList(NS + "selectList", boardSearchParamDTO);
		return selectList;
	}



	@Override
	public int updateBoardCount(int seq) {
		int count = sqlSession.update(NS + "updateBoardCount", seq);
		return count;
	}



	@Override
	public BoardDTO selectBoard(int seq) {
		BoardDTO board = sqlSession.selectOne(NS + "selectBoard", seq);
		return board;
	}



	@Override
	public BoardDTO addBoard(BoardDTO board) {
		sqlSession.insert(NS + "addBoard", board);
		return board;
	}

}
