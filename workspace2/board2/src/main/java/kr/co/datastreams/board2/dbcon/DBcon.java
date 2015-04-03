package kr.co.datastreams.board2.dbcon;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DBcon {
	public static Connection getConnect() throws Exception{
		Connection conn = null;
		
		try {
			String url="jdbc:oracle:thin:@localhost:1521:orcl";
			String userid="scott";
			String password="tiger";
			String driverName="oracle.jdbc.driver.OracleDriver";
			Class.forName(driverName);
			conn = DriverManager.getConnection(url, userid, password);
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
		return conn;
	}
	
	public static void close(Connection conn, PreparedStatement ps) throws Exception{
		try {
			if(conn != null)
			{
				conn.close();
			}
		} catch (Exception e) {}
		
		try {
			if(ps != null)
			{
				ps.close();
			}
		} catch (Exception e) {}
	}
	
	public static void close(Connection conn, PreparedStatement ps, ResultSet rs) throws Exception{
		try {
			if(rs != null)
			{
				rs.close();
			}
		} catch (Exception e) {}
		close(conn, ps);
	}
}
