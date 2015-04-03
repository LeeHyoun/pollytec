package board.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import board.dto.ReplyDTO;
import board.exception.DAOException;
import board.util.DBUtil;

public class ReplyDAO {

	public int addReply(ReplyDTO reply) 
			throws DAOException{
		int seq = 0;
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		try{
			conn = DBUtil.getConnect();
			// autocommit이 기본은 true이다.
			// 한가지 작업이 끝나면 무조건 commit된다.
			conn.setAutoCommit(false);
			String sql = "insert into reply (seq, board_seq, id, content, regdate) values ( reply_seq.NEXTVAL, ?, ?, ?, sysdate)";
			ps = conn.prepareStatement(sql); 
			ps.setInt(1, reply.getBoardSeq());
			ps.setString(2, reply.getId());
			ps.setString(3, reply.getContent());
			ps.executeUpdate(); 
			
			sql = "select reply_seq.CURRVAL from dual"; //CURRVAL 현재 시퀀스값을 보여준다.
			ps = conn.prepareStatement(sql);
			rs = ps.executeQuery();
			rs.next();
			seq = rs.getInt(1);
			
		}catch(Exception ex){
			//ex.printStackTrace();
			throw new DAOException(ex);
		}finally{
			try{
				DBUtil.close(conn, ps,rs);
			}catch(Exception e){
				throw new DAOException(e);
			}
		}
		return seq;
	}// addMemo
	
}
