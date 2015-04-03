package connect;

import static org.junit.Assert.*;

import org.junit.Test;

public class DBcon_Test {

	@Test
	public void Connection() throws Exception {
		DBcon db = new DBcon();
		System.out.println(db.getConnect());
	}
}
