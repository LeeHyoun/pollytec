package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import dbcon.DBcon;
import dto.BoardDTO;

public class ReplyDAO {
	DBcon db ;
	
	// insert
	public int writeReply(BoardDTO bdto,ReplyDTO redto) throws DAOException{
		int count=0;
		
		Connection conn = null;
		PreparedStatement ps = null;
		
		String sql = "insert into reply_lh (seq,board_seq,id,content,regdate) values(reply_lh_seq.nextval,?,?,?,sysdate)";
		
		try {
			conn = db.getConnect();
			ps = conn.prepareStatement(sql);
			
			ps.setInt(1, bdto.getSeq());
			ps.setString(2, bdto.getUser_id());
			ps.setString(3, redto.getContent());
													
			count = ps.executeUpdate();
		} catch (Exception e) {
			throw new DAOException(e);
		} finally {
			try {
				db.close(conn, ps);
			} catch (Exception e) {
				throw new DAOException(e);
			}
		}
		
		return count;
	}
	
	
	
	// selectList
	public List<ReplyDTO> selectReplyList(int seq) throws DAOException{
		List<ReplyDTO> list = new ArrayList<ReplyDTO>();
		
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		String sql = "select * from reply_lh where BOARD_SEQ = ?";
		
		try {
			conn = db.getConnect();
			ps = conn.prepareStatement(sql);
			ps.setInt(1, seq);
			
			rs = ps.executeQuery();
			
			while(rs.next()){
				ReplyDTO redto = new ReplyDTO();
				
				redto.setSeq(rs.getInt(1));
				redto.setBoardSeq(rs.getInt(2));
				redto.setId(rs.getString(3));
				redto.setContent(rs.getString(4));
				redto.setRegdate(rs.getString(5));
				
				list.add(redto);
			}

		} catch (Exception e) {
			throw new DAOException(e);
		} finally {
			try {
				db.close(conn, ps, rs);
			} catch (Exception e) {
				throw new DAOException(e);
			}
		}
		
		return list;
	}
}
