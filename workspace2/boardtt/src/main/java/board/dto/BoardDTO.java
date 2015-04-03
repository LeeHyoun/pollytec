package board.dto;

public class BoardDTO {
	private int seq;
	private String userId;
	private String userName;
	private String title;
	private String content;
	private String regdate;
	private String ip;
	private int readCount;
	public int getSeq() {
		return seq;
	}
	public void setSeq(int seq) {
		this.seq = seq;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getRegdate() {
		return regdate;
	}
	public void setRegdate(String regdate) {
		this.regdate = regdate;
	}
	public String getIp() {
		return ip;
	}
	public void setIp(String ip) {
		this.ip = ip;
	}
	public int getReadCount() {
		return readCount;
	}
	public void setReadCount(int readCount) {
		this.readCount = readCount;
	}
	@Override
	public String toString() {
		return "BoardDTO [seq=" + seq + ", userId=" + userId + ", userName="
				+ userName + ", title=" + title + ", content=" + content
				+ ", regdate=" + regdate + ", ip=" + ip + ", readCount="
				+ readCount + "]";
	}

	
	
}

/*
seq number primary key,
id varchar2(20), 
title varchar2(20), 
content varchar2(200), 
regdate date,
ip varchar2(30), 
read_count number,
*/