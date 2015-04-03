package board.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import board.dto.BoardDTO;
import board.dto.ReplyDTO;

@Repository
public class ReplyDAOImpl implements ReplyDAO {
	
	@Autowired
	private SqlSession sqlSession;
	
	private final static String NS = "kr.co.datastreams.mybatis.Reply.";
	
	// insert
	@Override
	public int writeReply(ReplyDTO redto) throws DAOException{
		int count=0;
				
		count = sqlSession.insert(NS + "writeReply", redto);
		
		return count;
	}
	
	// selectList
	@Override
	public List<ReplyDTO> replyList(int seq) throws DAOException{
		
		
		List<ReplyDTO> list = sqlSession.selectList(NS + "replyList", seq);
				
		return list;
	}
}
