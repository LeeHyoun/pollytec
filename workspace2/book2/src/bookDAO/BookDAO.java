package bookDAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import connect.DBcon;
import bookDTO.BookDTO;

public class BookDAO {
	
	private DBcon db;
	final private int LIMIT = 5;
	
	public List<BookDTO> getSelect(int page) throws Exception{
		
		int start = page * LIMIT - LIMIT + 1; 
	    int end = page * LIMIT; 
		
		List<BookDTO> list = new ArrayList<BookDTO>();
		
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		String sql="select r, id, name, content, to_char(regdate,'yyyy.mm.dd hh24:mi') from ( select rownum r, id,name, content, regdate from (select id,name, content, regdate from guestbook order by id desc)) where r >= ? and r<= ?";
		
		try {
			conn = db.getConnect();
			ps = conn.prepareStatement(sql);
			
			ps.setInt(1, start);
			ps.setInt(2, end);
			
			rs = ps.executeQuery();
			
			while(rs.next()){
				BookDTO dto = new BookDTO();
				
				int r= rs.getInt(1);
				int id = rs.getInt(2);
				String name = rs.getString(3);
				String content = rs.getString(4);
				String regdate = rs.getString(5);
				
				dto.setRownum(r);
				dto.setId(id);
				dto.setName(name);
				dto.setContent(content);
				dto.setRegdate(regdate);
				
				list.add(dto);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}finally{		
			db.close(conn, ps, rs);		
		}
		return list;
	}
	
	public int getCount() throws Exception{
		
		int count = 0;
		
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		String sql="select count(*) from guestbook ";
		
		try {
			conn = db.getConnect();
			ps = conn.prepareStatement(sql);
			rs = ps.executeQuery();
									
			rs.next();
			count = rs.getInt(1);
			
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}finally{		
			db.close(conn, ps, rs);		
		}
		return count;
	}
	
	public int insertBook(BookDTO dto) throws Exception{
		Connection conn = null;
		PreparedStatement ps = null;
		
		int count = 0;
		
		String sql = "insert into guestbook (id, name, content, regdate) values(user_seq.nextval,?,?, sysdate)";
		
		try {
			conn = db.getConnect();
			ps = conn.prepareStatement(sql);
			
			ps.setString(1, dto.getName());
			ps.setString(2, dto.getContent());
			
			count = ps.executeUpdate();
		} catch (Exception e) {
			e.getStackTrace();
			throw e;
		}finally{
			db.close(conn, ps);
		}
		
		return count;
	}
	
	public int deleteBook(int id) throws Exception{
		Connection conn = null;
		PreparedStatement ps = null;
		int bool = 0;
		
		String sql = "delete from guestbook where id = ?";
		
		try {
			conn = db.getConnect();
			ps = conn.prepareStatement(sql);
			ps.setInt(1, id);
			bool= ps.executeUpdate();
		} catch (Exception e) {
			e.getStackTrace();
			throw e;
		}finally{
			db.close(conn, ps);
		}
		
		return bool;
	}
	
}
