package examples.spring.ch04.nativejdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBManager {

	public static Connection getConnection(){
		Connection con = null;
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:xe", "java00", "java00");
		}catch(Exception e){
			e.printStackTrace();
		}

		return con;
	}
}