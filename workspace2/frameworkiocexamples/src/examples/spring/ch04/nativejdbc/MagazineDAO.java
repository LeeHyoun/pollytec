package examples.spring.ch04.nativejdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class MagazineDAO {

	public Magazine findMagazine(int magazineId) {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		Magazine result = null;		
		// 쿼리문 작성
		String sql = "select magazineId, title, price, created from MAGAZINE where magazineId = ?";

		try{			
			// 커넥션 얻기
			con = DBManager.getConnection();
			
			// PreparedStatement 생성
			pstmt = con.prepareStatement(sql);
			
			// 파라미터 바인딩
			pstmt.setInt(1, magazineId);
			
			// 쿼리 실행 후 결과 받기
			rs = pstmt.executeQuery();
						
			// ResultSet -> Magazine 매핑
			if(rs.next()){
				result = new Magazine();
				result.setMagazineId(rs.getInt("magazineId"));
				result.setTitle(rs.getString("title"));
				result.setPrice(rs.getInt("price"));
				result.setCreated(rs.getDate("created"));
			}
			
		}catch(Exception e){
			e.printStackTrace();
		}finally{	// 자원해제
			try{ if(rs != null) rs.close(); }catch(Exception e){}
			try{ if(pstmt != null) pstmt.close(); }catch(Exception e){}
			try{ if(con != null) con.close(); }catch(Exception e){}
		}
		
		return result;
	}
}
