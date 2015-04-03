package OOP_141224;

public class Exam_Object_Book {

	public static void main(String[] args) {
		
		Book b1 = new Book("0001", "Java", 5000);
		Book b2 = new Book("0001", "Java", 5000);
		
		if(b1==b2){
			System.out.println("같은 레퍼런스이다.");
		}
		
		if(b1.equals(b2)){
			System.out.println("같은 값이다.");
		}
		
	}
}


class Book{
	
	private String isbn;
	private String title;
	private int price;
	
	public Book(String isbn, String title, int price) {
		super();
		this.isbn = isbn;
		this.title = title;
		this.price = price;
	}
	
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	
	@Override
	public String toString() {
		return "Book [isbn=" + isbn + ", title=" + title + ", price=" + price
				+ "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((isbn == null) ? 0 : isbn.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())   //클래스 정보
			return false;
		
		Book other = (Book) obj;
		if (isbn == null) {
			if (other.isbn != null)
				return false;
		} else if (!isbn.equals(other.isbn))
			return false;
		return true;
	}

}