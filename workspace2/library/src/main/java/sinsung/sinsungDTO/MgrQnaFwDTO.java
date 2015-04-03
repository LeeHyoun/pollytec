package sinsung.sinsungDTO;

import java.sql.Date;

public class MgrQnaFwDTO {
	private int rownum;
	private Date fwDate;
	private int fwSeq;
	private String qnaSeq;
	private String mgrId;
	private String fwContent;
	public int getRownum() {
		return rownum;
	}
	public void setRownum(int rownum) {
		this.rownum = rownum;
	}
	public Date getFwDate() {
		return fwDate;
	}
	public void setFwDate(Date fwDate) {
		this.fwDate = fwDate;
	}
	public int getFwSeq() {
		return fwSeq;
	}
	public void setFwSeq(int fwSeq) {
		this.fwSeq = fwSeq;
	}
	public String getQnaSeq() {
		return qnaSeq;
	}
	public void setQnaSeq(String qnaSeq) {
		this.qnaSeq = qnaSeq;
	}
	public String getMgrId() {
		return mgrId;
	}
	public void setMgrId(String mgrId) {
		this.mgrId = mgrId;
	}
	public String getFwContent() {
		return fwContent;
	}
	public void setFwContent(String fwContent) {
		this.fwContent = fwContent;
	}
	@Override
	public String toString() {
		return "MgrQnaFwDTO [rownum=" + rownum + ", fwDate=" + fwDate
				+ ", fwSeq=" + fwSeq + ", qnaSeq=" + qnaSeq + ", mgrId="
				+ mgrId + ", fwContent=" + fwContent + "]";
	}
	
	
	
}
