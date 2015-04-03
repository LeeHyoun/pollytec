package eyoon.eyoonDTO;

public class BookDTO {
	private int bookNo;      
	private String genreCode;    
	private String bookBringout;   
	private String bookAddday;           
	private String bookStored;    
	private String bookCallnumber;   
	private String bookIsbn;   
	private String bookImg;   
	private int bookPrice;      
	private String bookWriter;   
	private String bookTitle;  
	private String bookCompany;   
	private String bookContent;
	private String bookState;
	private int rowNum;
	private String rentState;
	private String rentDueday;
	private String rentBooking;
	
	
	public String getRentBooking() {
		return rentBooking;
	}
	public void setRentBooking(String rentBooking) {
		this.rentBooking = rentBooking;
	}
	public String getRentDueday() {
		return rentDueday;
	}
	public void setRentDueday(String rentDueday) {
		this.rentDueday = rentDueday;
	}
	/*public String getBookAddday() {
		return bookAddday;
	}
	public void setBookAddday(String bookAddday) {
		this.bookAddday = bookAddday;
	}
	public int getRowNum() {
		return rowNum;
	}
	public void setRowNum(int rowNum) {
		this.rowNum = rowNum;
	}*/
	public String getRentState() {
		return rentState;
	}
	public void setRentState(String rentState) {
		this.rentState = rentState;
	}
	public int getrowNum() {
		return rowNum;
	}
	public void setrowNum(int rowNum) {
		this.rowNum = rowNum;
	}
	public int getBookNo() {
		return bookNo;
	}
	public void setBookNo(int bookNo) {
		this.bookNo = bookNo;
	}
	public String getGenreCode() {
		return genreCode;
	}
	public void setGenreCode(String genreCode) {
		this.genreCode = genreCode;
	}
	public String getBookBringout() {
		return bookBringout;
	}
	public void setBookBringout(String bookBringout) {
		this.bookBringout = bookBringout;
	}
	public String getbookAddday() {
		return bookAddday;
	}
	public void setbookAddday(String bookAddday) {
		this.bookAddday = bookAddday;
	}
	public String getBookStored() {
		return bookStored;
	}
	public void setBookStored(String bookStored) {
		this.bookStored = bookStored;
	}
	public String getBookCallnumber() {
		return bookCallnumber;
	}
	public void setBookCallnumber(String bookCallnumber) {
		this.bookCallnumber = bookCallnumber;
	}
	public String getBookIsbn() {
		return bookIsbn;
	}
	public void setBookIsbn(String bookIsbn) {
		this.bookIsbn = bookIsbn;
	}
	public String getBookImg() {
		return bookImg;
	}
	public void setBookImg(String bookImg) {
		this.bookImg = bookImg;
	}
	public int getBookPrice() {
		return bookPrice;
	}
	public void setBookPrice(int bookPrice) {
		this.bookPrice = bookPrice;
	}
	public String getBookWriter() {
		return bookWriter;
	}
	public void setBookWriter(String bookWriter) {
		this.bookWriter = bookWriter;
	}
	public String getBookTitle() {
		return bookTitle;
	}
	public void setBookTitle(String bookTitle) {
		this.bookTitle = bookTitle;
	}
	public String getBookCompany() {
		return bookCompany;
	}
	public void setBookCompany(String bookCompany) {
		this.bookCompany = bookCompany;
	}
	public String getBookContent() {
		return bookContent;
	}
	public void setBookContent(String bookContent) {
		this.bookContent = bookContent;
	}
	public String getBookState() {
		return bookState;
	}
	public void setBookState(String bookState) {
		this.bookState = bookState;
	}
	@Override
	public String toString() {
		return "BookDTO [bookNo=" + bookNo + ", genreCode=" + genreCode
				+ ", bookBringout=" + bookBringout + ", bookAddday="
				+ bookAddday + ", bookStored=" + bookStored
				+ ", bookCallnumber=" + bookCallnumber + ", bookIsbn="
				+ bookIsbn + ", bookImg=" + bookImg + ", bookPrice="
				+ bookPrice + ", bookWriter=" + bookWriter + ", bookTitle="
				+ bookTitle + ", bookCompany=" + bookCompany + ", bookContent="
				+ bookContent + ", bookState=" + bookState + ", rowNum="
				+ rowNum + ", rentState=" + rentState + ", rentDueday="
				+ rentDueday + ", rentBooking=" + rentBooking + "]";
	}
	
	
	
	
	
	
}
