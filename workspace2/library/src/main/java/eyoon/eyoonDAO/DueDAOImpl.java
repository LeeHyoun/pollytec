package eyoon.eyoonDAO;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import eyoon.eyoonDTO.BookDTO;
import eyoon.eyoonDTO.BookPageDTO;
import eyoon.eyoonDTO.DueDTO;
@Repository
public class DueDAOImpl implements DueDAO{
	
	@Autowired
	private SqlSession sqlSession;
	
	// BookMapper.xml - namespace="com.library.mybatis.Book."
	private static final String NS = "com.library.mybatis.Due."; 

	@Override
	public List<DueDTO> selectList(int pg, BookPageDTO bookPageDTO) {
		int start = pg * 5 - 5 + 1;
		int end = pg * 5;
		
		bookPageDTO.setStart(start);
		bookPageDTO.setEnd(end);
				
		List<DueDTO> duelist = sqlSession.selectList(NS + "dueList", bookPageDTO);
		return duelist;
	}
	
	@Override
	public int selectCount() {
		int count = sqlSession.selectOne(NS + "RselectCount"); 
		return count;
	}

	@Override
	public DueDTO updateDue(DueDTO dueDTO) {
		// TODO Auto-generated method stub
		sqlSession.update(NS + "dueReturn", dueDTO);
		return dueDTO;
	}
	
	@Override
	public DueDTO getDue(int rentNo){
		DueDTO dueDTO = sqlSession.selectOne(NS + "getDue", rentNo);
		return dueDTO;
	}

	@Override
	public int insertDue(DueDTO dueDTO) {
		int cnt = sqlSession.insert(NS + "insertDue", dueDTO);
		return cnt;
	}

}
