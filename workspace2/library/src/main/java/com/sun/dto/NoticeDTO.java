package com.sun.dto;

public class NoticeDTO {
	private String noticeseq;
	private String mgrid;
	private String noticetitle;
	private String noticedate;
	private String noticecontent;
	private String mgrname;
	
	public String getNoticeseq() {
		return noticeseq;
	}
	public void setNoticeseq(String noticeseq) {
		this.noticeseq = noticeseq;
	}
	public String getMgrid() {
		return mgrid;
	}
	public void setMgrid(String mgrid) {
		this.mgrid = mgrid;
	}
	public String getNoticetitle() {
		return noticetitle;
	}
	public void setNoticetitle(String noticetitle) {
		this.noticetitle = noticetitle;
	}
	public String getNoticedate() {
		return noticedate;
	}
	public void setNoticedate(String noticedate) {
		this.noticedate = noticedate;
	}
	public String getNoticecontent() {
		return noticecontent;
	}
	public void setNoticecontent(String noticecontent) {
		this.noticecontent = noticecontent;
	}
	public String getMgrname() {
		return mgrname;
	}
	public void setMgrname(String mgrname) {
		this.mgrname = mgrname;
	}
	@Override
	public String toString() {
		return "NoticeDTO [noticeseq=" + noticeseq + ", mgrid=" + mgrid
				+ ", noticetitle=" + noticetitle + ", noticedate=" + noticedate
				+ ", noticecontent=" + noticecontent + ", mgrname=" + mgrname
				+ "]";
	}
	
	
	
}
