package sinsung.sinsungDAO;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import eyoon.eyoonDTO.BookPageDTO;
import sinsung.sinsungDTO.MgrQnaDTO;
import sinsung.sinsungDTO.MgrQnaFwDTO;

@Repository
public class MgrQnaDAOImpl implements MgrQnaDAO{
	
	@Autowired
	private SqlSession sqlSession;
	
	private static final String NS = "com.library.mybatis.mgrQna.";
	
	@Override
	public List<MgrQnaDTO> QnaList(int pg, BookPageDTO bookPageDTO){
		int start = pg * 10 - 10 + 1;
		int end = pg * 10;
		
		bookPageDTO.setStart(start);
		bookPageDTO.setEnd(end);
		
		List<MgrQnaDTO> qnaList = sqlSession.selectList(NS + "qnalist", bookPageDTO);
		System.out.println(qnaList);
		return qnaList;
		
	}

	@Override
	public MgrQnaDTO getQna(String usrId) {
		MgrQnaDTO qnaDTO = sqlSession.selectOne(NS + "getQna", usrId); 
		return qnaDTO;
	}

	@Override
	public int getQnaCount() {
		
		return sqlSession.selectOne(NS + "getQnaCount"); 
	}


	
}
