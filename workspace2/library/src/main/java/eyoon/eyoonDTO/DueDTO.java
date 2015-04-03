package eyoon.eyoonDTO;

public class DueDTO {
	private int rentNo;
	private String dueReturnday;
	private String dueState;
	private String dueRecord;
	private int dueOverdue;
	/*---------------------*/
	private int bookNo;
	private String usrName;
	private String usrMobile;
	private String bookTitle;
	private String rentDay;
	private String rentState;
	private String rentFlag;
	private int rowNum;
	
	
	
	public int getRowNum() {
		return rowNum;
	}
	public void setRowNum(int rowNum) {
		this.rowNum = rowNum;
	}
	public int getBookNo() {
		return bookNo;
	}
	public void setBookNo(int bookNo) {
		this.bookNo = bookNo;
	}
	public String getUsrName() {
		return usrName;
	}
	public void setUsrName(String usrName) {
		this.usrName = usrName;
	}
	public String getUsrMobile() {
		return usrMobile;
	}
	public void setUsrMobile(String usrMobile) {
		this.usrMobile = usrMobile;
	}
	public String getBookTitle() {
		return bookTitle;
	}
	public void setBookTitle(String bookTitle) {
		this.bookTitle = bookTitle;
	}
	public String getRentDay() {
		return rentDay;
	}
	public void setRentDay(String rentDay) {
		this.rentDay = rentDay;
	}
	public String getRentState() {
		return rentState;
	}
	public void setRentState(String rentState) {
		this.rentState = rentState;
	}
	public String getRentFlag() {
		return rentFlag;
	}
	public void setRentFlag(String rentFlag) {
		this.rentFlag = rentFlag;
	}
	public int getRentNo() {
		return rentNo;
	}
	public void setRentNo(int rentNo) {
		this.rentNo = rentNo;
	}
	public String getDueReturnday() {
		return dueReturnday;
	}
	public void setDueReturnday(String dueReturnday) {
		this.dueReturnday = dueReturnday;
	}
	public String getDueState() {
		return dueState;
	}
	public void setDueState(String dueState) {
		this.dueState = dueState;
	}
	public String getDueRecord() {
		return dueRecord;
	}
	public void setDueRecord(String dueRecord) {
		this.dueRecord = dueRecord;
	}
	public int getDueOverdue() {
		return dueOverdue;
	}
	public void setDueOverdue(int dueOverdue) {
		this.dueOverdue = dueOverdue;
	}
	
	@Override
	public String toString() {
		return "DueDTO [rentNo=" + rentNo + ", dueReturnday=" + dueReturnday
				+ ", dueState=" + dueState + ", dueRecord=" + dueRecord
				+ ", dueOverdue=" + dueOverdue + ", bookNo=" + bookNo
				+ ", usrName=" + usrName + ", usrMobile=" + usrMobile
				+ ", bookTitle=" + bookTitle + ", rentDay=" + rentDay
				+ ", rentState=" + rentState + ", rentFlag=" + rentFlag
				+ ", rowNum=" + rowNum + "]";
	}
	
	
	
	
}
