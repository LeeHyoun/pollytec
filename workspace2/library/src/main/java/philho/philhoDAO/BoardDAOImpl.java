package philho.philhoDAO;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import philho.philhoDTO.BoardDTO;
import philho.philhoDTO.BoardSearchParamDTO;


@Repository
public class BoardDAOImpl implements BoardDAO {
			
	
			@Autowired
			private SqlSession sqlSession;
			
			private static final String NS = "com.library.mybatis.Board.";

			@Override
			public List<BoardDTO> selectList(int pg) {
				int start = pg * 5 - 5 + 1;
				int end = pg * 5;
				BoardSearchParamDTO boardSearchParamDTO =
					new BoardSearchParamDTO();
				boardSearchParamDTO.setStart(start);
				boardSearchParamDTO.setEnd(end);
				
				
				List<BoardDTO> selectList = sqlSession.selectList(NS + "selectList",boardSearchParamDTO);
				
				
				return selectList;
			}

			@Override
			public int selectCount() {
					int count = sqlSession.selectOne(NS + "selectCount");
				return count;
			}


			@Override
			public BoardDTO addBoard(BoardDTO board) {
				sqlSession.insert(NS + "addBoard", board);
				return board;
			}

			@Override
			public BoardDTO readBoard(BoardDTO boardDTO) {
				boardDTO = sqlSession.selectOne(NS + "readBoard", boardDTO.getBoardSeq());
				return boardDTO;
}

	@Override
			public void updateBoard(BoardDTO boardDTO) {
				sqlSession.update(NS + "updateBoard", boardDTO);
				
			}

			@Override
			public List<BoardDTO> getList() {
				List<BoardDTO> selectList = sqlSession.selectList(NS + "selectList2");
				return selectList;
			}

			@Override
			public void boarddelete(int boardSeq) {
				sqlSession.delete(NS + "boarddelete", boardSeq);
				
			}

			@Override
			public int getCount2(String searchValue) {
				HashMap<String,String> map = new HashMap<String,String>();
				map.put("searchValue", searchValue);
				return sqlSession.selectOne(NS + "getCount2", map);
			}

			@Override
			public List<BoardDTO> getList(int ipg, String searchValue) {
				int start = ipg * 5 - 5 + 1;
				int end = ipg * 5;
				BoardSearchParamDTO boardSearchParamDTO =
					new BoardSearchParamDTO();
				boardSearchParamDTO.setStart(start);
				boardSearchParamDTO.setEnd(end);
				boardSearchParamDTO.setSearchValue(searchValue);
				
				List<BoardDTO> getList = sqlSession.selectList(NS + "getList",boardSearchParamDTO);
				return getList;
			}

			@Override
			public int getCount3(String searchValue) {
				HashMap<String,String> map = new HashMap<String,String>();
				map.put("searchValue", searchValue);
				return sqlSession.selectOne(NS + "getCount3", map);
			}

			@Override
			public List<BoardDTO> getList2(int ipg, String searchValue) {
				int start = ipg * 5 - 5 + 1;
				int end = ipg * 5;
				BoardSearchParamDTO boardSearchParamDTO =
					new BoardSearchParamDTO();
				boardSearchParamDTO.setStart(start);
				boardSearchParamDTO.setEnd(end);
				boardSearchParamDTO.setSearchValue(searchValue);
				
				List<BoardDTO> getList2 = sqlSession.selectList(NS + "getList2",boardSearchParamDTO);
				return getList2;
			}

			

}
