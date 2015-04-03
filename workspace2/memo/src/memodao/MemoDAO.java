package memodao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import dbcon.DBcon;
import dto.MemoDTO;

public class MemoDAO {
	DBcon db ;
	final private int LIMIT = 3;
	// insert
	public int insertMemo(String title, String content) throws DAOException{
		int n = 0;
		
		Connection conn = null;
		PreparedStatement ps = null;
		
		String sql = "insert into memo_lh(seq, title, content, regdate ) values (memo_lh_seq.NEXTVAL, ?, ?, sysdate)";
		
		try {
			conn = db.getConnect();
			ps = conn.prepareStatement(sql);
			
			ps.setString(1, title);
			ps.setString(2, content);
			
			n = ps.executeUpdate();
			
		} catch (Exception e) {
			throw new DAOException(e);
		}finally{
			try {
				db.close(conn, ps);
			} catch (Exception e) {
				throw new DAOException(e);
			}
		}
		
		return n;
	}
	
	// list
	public List<MemoDTO> selectList() throws DAOException{
		List<MemoDTO> list = new ArrayList<MemoDTO>();		
		
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		String sql = "select seq, title, content, to_char(regdate, 'yyyy/mm/dd hh24:mi') regdate from memo_lh order by seq desc ";
		
		
		try {
			conn = db.getConnect();
			ps = conn.prepareStatement(sql);
			rs = ps.executeQuery();
						
			while(rs.next()){
				int seq = rs.getInt("seq");
				String title = rs.getString("title");
				String content = rs.getString("content");
				String regdate = rs.getString("regdate");
				
				MemoDTO dto = new MemoDTO();
				
				dto.setSeq(seq);
				dto.setTitle(title);
				dto.setContent(content);
				dto.setRegdate(regdate);
				
				list.add(dto);
			}
			
		} catch (Exception e) {
			//e.getStackTrace();
			throw new DAOException(e);
		}finally{
			try {
				db.close(conn, ps, rs);
			} catch (Exception e) {
				throw new DAOException(e);
			}
		}
		return list;
	}
//////////////////////////////////////////////////////////////////////////////////////////////////	
	// 방명록 전체 건수를 구한다.
		public int getMemoCount() throws DAOException{
			int count = 0;
			Connection conn = null;
			PreparedStatement ps = null;
			ResultSet rs = null;
			try{
				conn = db.getConnect();
				String sql = "select count(*) from memo_lh";
				ps = conn.prepareStatement(sql);
				rs = ps.executeQuery();
				rs.next(); // 한건의 row를 읽어온다.
				count = rs.getInt(1); // 첫번째 칼럼의 값을 달라.
			}catch(Exception e){
				throw new DAOException(e);
			}finally{
				try {
					db.close(conn, ps, rs);
				} catch (Exception e) {
					throw new DAOException(e);
				}
			}
			return count;
		}
		
		// page에 해당하는 목록을 읽어온다.
		public List<MemoDTO> getList(int page) throws DAOException{
			// page : 1 --> 1,5
			// page : 2 --> 6,10
			int start = page * LIMIT - LIMIT + 1;
			int end = page * LIMIT;
			List<MemoDTO> list = new ArrayList<MemoDTO>();
			Connection conn = null;
			PreparedStatement ps = null;
			ResultSet rs = null;
			try{
				conn = db.getConnect();
				String sql = "select r, seq, title, content, to_char(regdate,'yyyy.mm.dd hh24:mi') from ( select rownum r, seq, title, content, regdate from (select seq, title, content, regdate from memo_lh order by seq desc) ) where r >= ? and r<= ?";
				ps = conn.prepareStatement(sql);
				ps.setInt(1, start);
				ps.setInt(2, end);
				rs = ps.executeQuery();
				// row를 더이상 읽어올것이 없을때까지 반복
				while(rs.next()){
					int r = rs.getInt(1);
					int seq = rs.getInt(2);
					String title = rs.getString(3);
					String content = rs.getString(4);
					String regdate = rs.getString(5);
					MemoDTO dto = new MemoDTO();
					dto.setSeq(seq);
					dto.setTitle(title);
					dto.setContent(content);
					dto.setRegdate(regdate);
					list.add(dto);
				}
			}catch(Exception ex){
				throw new DAOException(ex);
			}finally{
				// db연결 close
				try {
					db.close(conn, ps, rs);
				} catch (Exception e) {

					throw new DAOException(e);
				}
			}		
			return list;
		}
}
