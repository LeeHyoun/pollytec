package my;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

// DAO -> DataAccessObject 의 약자다.
// 저장
// 전체 건수
// 페이지별 목록
public class GuestbookDAO {
	public final static int LIMIT = 5; // 한페이지에 5개 보여줌.

	public int deleteGuestbook(int id) 
			throws Exception{
		int count = 0;
		Connection conn = null;
		PreparedStatement ps = null;
		try{
			conn = DBUtil.getConnect();
			String sql = "delete from guestbook where id = ?";
			ps = conn.prepareStatement(sql); 
			ps.setInt(1, id);
			count = ps.executeUpdate(); 
		}catch(Exception ex){
			ex.printStackTrace();
		}finally{
			// db연결 close
			DBUtil.close(conn, ps);
		}
		
		return count;
	}
	// 방명록을 저장한다.
	public int addGuestbook(GuestbookDTO guestbook) 
			throws Exception{
		int count = 0;
		Connection conn = null;
		PreparedStatement ps = null;
		try{
			// db연결
			conn = DBUtil.getConnect();
			// 변하는 부분은 물음표로 하여 sql 문자열을 준비
			String sql = "insert into guestbook ( id, name, content, regdate ) values ( guestbook_seq.NEXTVAL, ?, ?, sysdate)";
			// conn에게(db를 아는건 conn뿐.) sql을 db에서 실행할 수 있도록 준비부탁
			// db의 sql문장을 가리키는 것이 ps 
			ps = conn.prepareStatement(sql); 
			// 물음표에 값을 설정 (바인딩)
			// 물음표는 first 부터 시작. 1부터 시작.
			ps.setString(1, guestbook.getName());
			ps.setString(2, guestbook.getContent());
			// 위의 코드까지가 sql이 db에서 준비가 된것.
			// db에 준비된 sql을 실행. 그 실행된 결과가 반환.
			count = ps.executeUpdate(); 
		}catch(Exception ex){
			ex.printStackTrace();
		}finally{
			// db연결 close
			DBUtil.close(conn, ps);
		}
		
		return count;
	}
	
	// 방명록 전체 건수를 구한다.
	public int getGuestbookCount() throws Exception{
		int count = 0;
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		try{
			conn = DBUtil.getConnect();
			String sql = "select count(*) from guestbook";
			ps = conn.prepareStatement(sql);
			rs = ps.executeQuery();
			rs.next(); // 한건의 row를 읽어온다.
			count = rs.getInt(1); // 첫번째 칼럼의 값을 달라.
		}catch(Exception ex){
			ex.printStackTrace();
		}finally{
			// db연결 close
			DBUtil.close(conn, ps, rs);
		}
		return count;
	}
	
	// page에 해당하는 목록을 읽어온다.
	public List<GuestbookDTO> getList(int page) throws Exception{
		// page : 1 --> 1,5
		// page : 2 --> 6,10
		int start = page * LIMIT - LIMIT + 1;
		int end = page * LIMIT;
		List<GuestbookDTO> list = new ArrayList<GuestbookDTO>();
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		try{
			conn = DBUtil.getConnect();
			String sql = "select r, id,name, content, to_char(regdate,'yyyy.mm.dd hh24:mi') from ( select rownum r, id,name, content, regdate from (select id,name, content, regdate from guestbook order by id desc) ) where r >= ? and r<= ?";
			ps = conn.prepareStatement(sql);
			ps.setInt(1, start);
			ps.setInt(2, end);
			rs = ps.executeQuery();
			// row를 더이상 읽어올것이 없을때까지 반복
			while(rs.next()){
				int r = rs.getInt(1);
				int id = rs.getInt(2);
				String name = rs.getString(3);
				String content = rs.getString(4);
				String regdate = rs.getString(5);
				GuestbookDTO guestbook = new GuestbookDTO();
				guestbook.setRownum(r);
				guestbook.setId(id);
				guestbook.setName(name);
				guestbook.setContent(content);
				guestbook.setRegdate(regdate);
				list.add(guestbook);
			}
		}catch(Exception ex){
			ex.printStackTrace();
		}finally{
			// db연결 close
			DBUtil.close(conn, ps, rs);
		}		
		return list;
	}
}
