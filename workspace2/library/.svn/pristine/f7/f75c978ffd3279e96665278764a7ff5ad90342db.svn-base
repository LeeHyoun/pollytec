package eyoon.eyoonDAO;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import eyoon.eyoonDTO.BookPageDTO;
import eyoon.eyoonDTO.RentDTO;
@Repository
public class RentDAOImpl implements RentDAO{
	
	@Autowired
	private SqlSession sqlSession;
	
	// BookMapper.xml - namespace="com.library.mybatis.Rent."
	private static final String NS = "com.library.mybatis.Rent."; 


	@Override
	public List<RentDTO> selectList(int pg, BookPageDTO bookPageDTO) {
		int start = pg * 5 - 5 + 1;
		int end = pg * 5;
		
		bookPageDTO.setStart(start);
		bookPageDTO.setEnd(end);
				
		List<RentDTO> duelist = sqlSession.selectList(NS + "rentList", bookPageDTO);
		return duelist;
	}
	
	@Override
	public int selectCount() {
		int count = sqlSession.selectOne(NS + "RselectCount"); 
		return count;
	}

	@Override
	public RentDTO getRent(int rentNo) {
		RentDTO rentDTO = sqlSession.selectOne(NS + "getRent", rentNo);
		return rentDTO;
	}

	@Override
	public int updateRent(RentDTO rentDTO) {
		int cnt = sqlSession.update(NS + "updateRent", rentDTO);
		return cnt;
	}

	@Override
	public void rentInsert(RentDTO rentDTO) {
		sqlSession.selectOne(NS + "rentInsert", rentDTO);
	}
}
