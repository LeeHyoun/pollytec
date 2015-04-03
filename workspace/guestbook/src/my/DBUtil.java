package my;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DBUtil {
	public static Connection getConnect() throws Exception{
		Connection conn = null;
		try{
			String dbUrl = "jdbc:oracle:thin:@172.31.3.163:1521:ORCL";
			String dbId = "scott";
			String dbPassword = "tiger";
			String driverName = "oracle.jdbc.driver.OracleDriver";
			Class.forName(driverName);
			conn = DriverManager.getConnection(dbUrl, dbId, dbPassword);
		}catch(Exception ex){
			ex.printStackTrace();
			throw ex;
		}
		return conn;
	}
	// insert, update, delete 
	public static void close(Connection conn, PreparedStatement ps)
		throws Exception{
		if(ps != null){
			try{
				ps.close();
			}catch(Exception ex){}
		}
		if(conn != null){
			try{
				conn.close();
			}catch(Exception ex){}
		}
	} // close
	
	// select
	public static void close(Connection conn, PreparedStatement ps,
			ResultSet rs) throws Exception{
		if(rs != null){
			try{
				rs.close();
			}catch(Exception ex){}
		}
		close(conn, ps);
	}
} // class



