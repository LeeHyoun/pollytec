package board.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import board.dto.UserDTO;
import board.exception.DAOException;
import board.util.DBUtil;

@Repository
public class UserDAOImpl implements UserDAO {
	@Autowired
	private SqlSession sqlSession;
	
	@Override
	public UserDTO getUser(String id) throws DAOException{
		UserDTO user = sqlSession.selectOne("kr.co.sunnyvale.mybatis.User.selectUser",id);
		return user;
	}
	

	@Override
	public int addUser(UserDTO user) 
			throws DAOException{
		int count = 0;
		count = sqlSession.insert("kr.co.sunnyvale.mybatis.User.addUser", user);
		return count;
	}// addMemo
	
}
