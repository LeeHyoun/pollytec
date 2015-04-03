package eyoon.eyoonDTO;

public class DueReturnDTO {
	private int rentNo;
	private String dueReturnday;
	private String dueState;
	private String dueRecord;
	private int dueOverdue;
	
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
		return "DueReturnDTO [rentNo=" + rentNo + ", dueReturnday="
				+ dueReturnday + ", dueState=" + dueState + ", dueRecord="
				+ dueRecord + ", dueOverdue=" + dueOverdue + "]";
	}
	
	
}
