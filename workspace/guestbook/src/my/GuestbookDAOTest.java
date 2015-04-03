package my;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class GuestbookDAOTest {
	@Test
	public void getList() throws Exception{
		int page = 1;
		GuestbookDAO dao = new GuestbookDAO();
		List<GuestbookDTO> list = dao.getList(page);
		for (GuestbookDTO guestbookDTO : list) {
			System.out.println(guestbookDTO);
		}
	}
	@Test
	public void deleteGuestbook() throws Exception {
		int id = 22;
		GuestbookDAO dao = new GuestbookDAO();
		int count = dao.deleteGuestbook(id);
		Assert.assertEquals(count, 1);
	}
	@Test
	public void addGuestbook() throws Exception {
		GuestbookDTO guestbook = new GuestbookDTO();
		guestbook.setName("kim");
		guestbook.setContent("haha");
		
		GuestbookDAO dao = new GuestbookDAO();
		int count = dao.addGuestbook(guestbook);
		Assert.assertEquals(count, 1);
	}

	@Test
	public void getCount() throws Exception{
		GuestbookDAO dao = new GuestbookDAO();
		int count = dao.getGuestbookCount();
		Assert.assertEquals(count, 2);
	}
}
