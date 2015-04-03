package kr.co.datastreams.board2.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import kr.co.datastreams.board2.dbcon.DBcon;
import kr.co.datastreams.board2.dto.UserDTO;

public class UserDAO {
	DBcon db = new DBcon();
	
	// insert
	public int addUser(UserDTO udto) throws DAOException{
		int count=0;
		
		Connection conn = null;
		PreparedStatement ps = null;
		
		String sql = "insert into user_lh (id,passwd,name,birthyyyy,birthmn,gender,email,regdate) values(?,?,?,?,?,?,?,sysdate)";
		
		try {
			conn = db.getConnect();
			ps = conn.prepareStatement(sql);
			
			ps.setString(1, udto.getId());
			ps.setString(2, udto.getPasswd());
			ps.setString(3, udto.getName());
			ps.setString(4, udto.getBirthyyyy());
			ps.setString(5, udto.getBirthmn());
			ps.setString(6, udto.getGender());
			ps.setString(7, udto.getEmail());
						
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
	
	
	// idcheck
	public UserDTO idCheck(String id,String passwd) throws DAOException{	
		
		System.out.println(id+":DAO");
		System.out.println(passwd+":DAO");
		
		UserDTO user = null;
		
		
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		
String sql = "select id,passwd,name,birthyyyy,birthmn,gender,email,to_char(regdate,'yyyy/MM/dd') regdate from user_lh where id = ? and passwd = ?";     
		
		try {
			conn = db.getConnect();
			ps = conn.prepareStatement(sql);
			ps.setString(1, id);
			ps.setString(2, passwd);
			rs = ps.executeQuery();
			
			if(rs.next()){	//한건의 데이터 가져옴
				
				user = new UserDTO();
				user.setId(rs.getString(1));
				user.setPasswd(rs.getString(2));
				user.setName(rs.getString(3));
				user.setBirthyyyy(rs.getString(4));
				user.setBirthmn(rs.getString(5));
				user.setGender(rs.getString(6));
				user.setEmail(rs.getString(7));
				user.setRegdate(rs.getString(8));
				
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
		
		return user;
	}
	
	
}
