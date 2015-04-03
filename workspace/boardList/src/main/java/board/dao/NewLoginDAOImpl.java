package board.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import board.dto.UserDTO;

@Repository
public class NewLoginDAOImpl implements NewLoginDAO{
	@Autowired
	private SqlSession sqlSession;
	
	private final static String NS = "kr.co.datastreams.mybatis.User.";
	
	@Override
	public UserDTO idCheck(UserDTO udto) {
		udto = sqlSession.selectOne(NS + "idCheck", udto);
		return udto;
	}
	
}
