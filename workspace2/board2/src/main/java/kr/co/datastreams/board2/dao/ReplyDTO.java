package kr.co.datastreams.board2.dao;

public class ReplyDTO {
	private int seq;
	private int boardSeq;
	private String id;
	private String content;
	private String regdate;
	public int getSeq() {
		return seq;
	}
	public void setSeq(int seq) {
		this.seq = seq;
	}
	public int getBoardSeq() {
		return boardSeq;
	}
	public void setBoardSeq(int boardSeq) {
		this.boardSeq = boardSeq;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
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
	
	@Override
	public String toString() {
		return "RepalyDTO [seq=" + seq + ", boardSeq=" + boardSeq + ", id="
				+ id + ", content=" + content + ", regdate=" + regdate + "]";
	}
	
	
	
}
