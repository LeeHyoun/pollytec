package sinsung.sinsungDAO;


import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import sinsung.sinsungDTO.MgrQnaFwDTO;

@Repository
public class MgrQnaFwDAOImpl implements MgrQnaFwDAO{
	
	@Autowired
	private SqlSession sqlSession;
	
	private static final String NS = "com.library.mybatis.mgrQnaFw.";
	
	@Override
	public MgrQnaFwDTO getQnaFw(int qnaSeq) {
		System.out.println(qnaSeq+"@@@@@@@@@@@@@@@@@@@@@@@@@@");
		MgrQnaFwDTO qnaFwDTO = sqlSession.selectOne(NS + "getQnaFw", qnaSeq);
		return qnaFwDTO;
	}

	@Override
	public MgrQnaFwDTO addfw(MgrQnaFwDTO qnaFwDTO) {
		sqlSession.insert(NS + "addfw", qnaFwDTO);
		return qnaFwDTO;

	}


}
