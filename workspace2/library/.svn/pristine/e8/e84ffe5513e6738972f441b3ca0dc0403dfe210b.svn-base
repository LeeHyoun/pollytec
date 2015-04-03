package philho.philhoDAO;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import philho.philhoDTO.UsrDTO;

@Repository
public class UsrDAOImpl implements UsrDAO{

	@Autowired
	private SqlSession sqlSession;
	private static final String NS = "com.library.mybatis.Usr.";
	
	@Override
	public UsrDTO getUsr(String usrId) {
		UsrDTO usr = sqlSession.selectOne(NS + "getUsr", usrId);
		return usr;
	}

	@Override
	public UsrDTO addUsr(UsrDTO usr) {
		sqlSession.insert(NS + "addusr", usr);
		return usr;
	}

//	@Override
//	public void update(String usrId) {
//		sqlSession.update(NS+"update", usrId);
//	}

	@Override
	public UsrDTO update(UsrDTO usr) {
		sqlSession.update(NS + "update", usr);
		return usr;
	}


}
