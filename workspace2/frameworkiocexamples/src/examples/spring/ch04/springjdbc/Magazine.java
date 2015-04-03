package examples.spring.ch04.springjdbc;

import java.util.Date;

public class Magazine {

	private int magazineId;
	private String title;
	private int price;
	private Date created;

	public Magazine() {
	}

	public int getMagazineId() {
		return magazineId;
	}

	public void setMagazineId(int magazineId) {
		this.magazineId = magazineId;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Date getCreated() {
		return created;
	}

	public void setCreated(Date created) {
		this.created = created;
	}

	public String toString() {
		String result = null;
		result = magazineId + " " + title + " " + price + " " + created;
		return result;
	}
}
