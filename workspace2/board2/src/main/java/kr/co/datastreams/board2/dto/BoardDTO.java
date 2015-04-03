package kr.co.datastreams.board2.dto;

public class BoardDTO {
	private int seq ;
	private String user_id;
	private String title ;
	private String content;
	private String regdate;
	private String ip;
	private int read_count;
	private String name;
	
	public int getSeq() {
		return seq;
	}
	public void setSeq(int seq) {
		this.seq = seq;
	}
	public String getUser_id() {
		return user_id;
	}
	public void setUser_id(String user_id) {
		this.user_id = user_id;
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
	public int getRead_count() {
		return read_count;
	}
	public void setRead_count(int read_count) {
		this.read_count = read_count;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "BoardDTO [seq=" + seq + ", user_id=" + user_id + ", title="
				+ title + ", content=" + content + ", regdate=" + regdate
				+ ", ip=" + ip + ", read_count=" + read_count + ", name="
				+ name + "]";
	}
}
