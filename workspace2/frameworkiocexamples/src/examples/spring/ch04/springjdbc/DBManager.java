package examples.spring.ch04.springjdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBManager {

	public static Connection getConnection(){
		Connection con = null;
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection("jdbc:oracle:thin:@70.12.220.130:1521:ora9", "java61", "java61");
		}catch(Exception e){
			e.printStackTrace();
		}

		return con;
	}
}