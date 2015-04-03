package board.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import board.dto.UserDTO;

@Repository
public class NewUserDAOImpl implements NewUserDAO{
	
	@Autowired
	private SqlSession sqlSession;
	
	private final static String NS = "kr.co.datastreams.mybatis.User.";
	
	@Override
	public int addUser(UserDTO udto) {
		int n = sqlSession.insert(NS + "addUser", udto);
		System.out.println("user insert = n : " + n);
		return n;
	}
}
