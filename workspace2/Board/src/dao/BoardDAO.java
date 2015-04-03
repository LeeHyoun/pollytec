package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import dbcon.DBcon;
import dto.BoardDTO;
import dto.UserDTO;

public class BoardDAO {
	DBcon db = new DBcon();  //DB Connect
	final static int LIMIT = 10;  //페이지당 레코드 갯수
	
	// insert
	public int writeBoard(BoardDTO bdto) throws DAOException{
		int count=0;
		
		Connection conn = null;
		PreparedStatement ps = null;
		
		String sql = "insert into board_lh (seq,user_id,title,content,regdate,ip,read_count) values(board_lh_seq.nextval,?,?,?,sysdate,?,0)";
		
		try {
			conn = db.getConnect();
			ps = conn.prepareStatement(sql);
			
			ps.setString(1, bdto.getUser_id());
			ps.setString(2, bdto.getTitle());
			ps.setString(3, bdto.getContent());
			ps.setString(4, bdto.getIp());
										
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
	
	// select list
		public List<BoardDTO> selectListBoard(int page) throws DAOException{	
			List<BoardDTO> list = new ArrayList<BoardDTO>();
				
			Connection conn = null;
			PreparedStatement ps = null;
			ResultSet rs = null;
/*			
String sql = "select r, seq, id, title, content, regdate, ip, read_count, user_name "
			+ "from (select rownum r, seq, id, title, content, regdate, ip, read_count, user_name "
			+ "from (select b.seq seq, b.user_id id,b.title title,b.content content,b.regdate regdate,b.ip ip, b.read_count read_count, u.name user_name "
			+ "from board_lh b, user_lh u "
			+ "where b.user_id = u.id order by seq desc ) ) where r >= ? and r <= ?";  
						*/
			
			String sql = "select b.seq, b.user_id, b.title, b.content, b.regdate, b.ip, b.read_count, u.name from (SELECT seq, user_id, title, content, regdate, ip, read_count FROM board_lh where seq between ? and ? ) b , user_lh u where b.user_id = u.id";			
			
			try {
				int start = page * LIMIT - LIMIT + 1;
				int end = page * LIMIT;
				
				conn = db.getConnect();
				ps = conn.prepareStatement(sql);
				
				ps.setInt(1, start);
				ps.setInt(2, end);
				
				rs = ps.executeQuery();
				
				while(rs.next()){	//한건의 데이터 가져옴
					
					BoardDTO bdto= new BoardDTO();
					bdto.setSeq(rs.getInt(1));
					bdto.setUser_id(rs.getString(2));
					bdto.setTitle(rs.getString(3));
					bdto.setContent(rs.getString(4));
					bdto.setRegdate(rs.getString(5));
					bdto.setIp(rs.getString(6));
					bdto.setRead_count(rs.getInt(7));
					bdto.setName(rs.getString(8));
					
					list.add(bdto);
				}
			} catch (Exception e) {
				throw new DAOException(e);
			} finally {
				try {
					db.close(conn, ps,rs);
				} catch (Exception e) {
					throw new DAOException(e);
				}
			}
			
			return list;
		}
		
		public int getBoardCount() throws DAOException{
			int count = 0;
			
			Connection conn = null;
			PreparedStatement ps = null;
			ResultSet rs = null;
			
			String sql = "select count(*) from board_lh";     
			
			try {	
				conn = db.getConnect();
				ps = conn.prepareStatement(sql);
				rs = ps.executeQuery();
				if(rs.next()){	//한건의 데이터 가져옴
					count = rs.getInt(1);
				}
			} catch (Exception e) {
				throw new DAOException(e);
			} finally {
				try {
					db.close(conn, ps,rs);
				} catch (Exception e) {
					throw new DAOException(e);
				}
			}
			return count;
		}
		
		
		//글 상세보기
		public BoardDTO readBoard(int seq) throws DAOException{
			BoardDTO boardDTO = null;
			
			Connection conn = null;
			PreparedStatement ps = null;
			ResultSet rs = null;
			
			String sql="select b.seq seq, b.user_id id,b.title title,b.content content,b.regdate regdate,b.ip ip, b.read_count read_count, u.name user_name from board_lh b, user_lh u where b.user_id = u.id and seq = ? ";
			
			try {
				conn = db.getConnect();
				ps = conn.prepareStatement(sql);
				ps.setInt(1, seq);
				rs = ps.executeQuery();
				
				if(rs.next()){
					boardDTO = new BoardDTO();
					
					boardDTO.setSeq(rs.getInt(1));
					boardDTO.setUser_id(rs.getString(2));
					boardDTO.setTitle(rs.getString(3));
					boardDTO.setContent(rs.getString(4));
					boardDTO.setRegdate(rs.getString(5));
					boardDTO.setIp(rs.getString(6));
					boardDTO.setRead_count(rs.getInt(7));
					boardDTO.setName(rs.getString(8));
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
			
			return boardDTO;
		}
		
		
		// deleteBoard
		public boolean deleteBoard(int seq) throws DAOException{
			boolean flag = false;
			
			Connection conn = null;
			PreparedStatement ps = null;
			
			String sql = "delete from board_lh where seq = ?";
			
			try {
				conn = db.getConnect();
				ps = conn.prepareStatement(sql);
				ps.setInt(1, seq);
											
				int n = ps.executeUpdate();
				if(n != 0){
					flag = true;
				}
			} catch (Exception e) {
				throw new DAOException(e);
			} finally {
				try {
					db.close(conn, ps);
				} catch (Exception e) {
					throw new DAOException(e);
				}
			}
			
			return flag;
		}
		
		//updateBoard
		public int updateBoard(BoardDTO dto) throws DAOException{	
							
			Connection conn = null;
			PreparedStatement ps = null;
			
			int count = 0;
			String sql = "update board_lh set title = ?, content = ? where seq = ? and user_id = ?";     
			
			try {
				conn = db.getConnect();
				ps = conn.prepareStatement(sql);
				
				ps.setString(1, dto.getTitle());
				ps.setString(2, dto.getContent());
				ps.setInt(3, dto.getSeq());
				ps.setString(4, dto.getUser_id());
				
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
}
