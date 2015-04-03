package my;

import static org.junit.Assert.*;
import java.sql.Connection;

import org.junit.Test;
public class DBUtilTest {

	@Test
	public void getConnection() throws Exception{
		Connection conn = DBUtil.getConnect();
		assertNotNull(conn);
	}
	
	@Test
	public void plus() throws Exception{
		int value = 2 + 2;
		assertEquals(value, 4); // Assert.assertEquals(value, 4);
	}
}



