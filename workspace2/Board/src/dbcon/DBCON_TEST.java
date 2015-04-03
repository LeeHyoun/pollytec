package dbcon;

import static org.junit.Assert.*;

import java.sql.Connection;

import org.junit.Test;

public class DBCON_TEST {

	@Test
	public void getConnection() throws Exception{
		DBcon db = new DBcon();
		Connection conn =  db.getConnect();
		assertNotNull(conn);
	}

}
