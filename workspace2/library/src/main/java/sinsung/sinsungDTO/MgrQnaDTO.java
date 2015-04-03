package sinsung.sinsungDTO;

import java.sql.Date;

public class MgrQnaDTO {
	private int rownum;
	private Date qnaDate;
	private int qnaSeq;
	private String qnaState;
	private String usrId;
	private String usrName;
	private String qnaContent;
	private String qnaTitle;
	public int getRownum() {
		return rownum;
	}
	public void setRownum(int rownum) {
		this.rownum = rownum;
	}
	public Date getQnaDate() {
		return qnaDate;
	}
	public void setQnaDate(Date qnaDate) {
		this.qnaDate = qnaDate;
	}
	public int getQnaSeq() {
		return qnaSeq;
	}
	public void setQnaSeq(int qnaSeq) {
		this.qnaSeq = qnaSeq;
	}
	public String getQnaState() {
		return qnaState;
	}
	public void setQnaState(String qnaState) {
		this.qnaState = qnaState;
	}
	public String getUsrId() {
		return usrId;
	}
	public void setUsrId(String usrId) {
		this.usrId = usrId;
	}
	public String getUsrName() {
		return usrName;
	}
	public void setUsrName(String usrName) {
		this.usrName = usrName;
	}
	public String getQnaContent() {
		return qnaContent;
	}
	public void setQnaContent(String qnaContent) {
		this.qnaContent = qnaContent;
	}
	public String getQnaTitle() {
		return qnaTitle;
	}
	public void setQnaTitle(String qnaTitle) {
		this.qnaTitle = qnaTitle;
	}
	@Override
	public String toString() {
		return "MgrQnaDTO [rownum=" + rownum + ", qnaDate=" + qnaDate
				+ ", qnaSeq=" + qnaSeq + ", qnaState=" + qnaState + ", usrId="
				+ usrId + ", usrName=" + usrName + ", qnaContent=" + qnaContent
				+ ", qnaTitle=" + qnaTitle + "]";
	}
	
	
	
	
}
