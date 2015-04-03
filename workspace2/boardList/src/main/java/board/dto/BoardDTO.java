package board.dto;

public class BoardDTO {
	
	/*@NotNull 
    @Size(min=2, message="이름은 2글자 이상이어야 합니다.") 
    private String name; 
     
    @NotNull 
    @Pattern(regexp="^[_0-9a-zA-Z-]+@[0-9a-zA-Z]+(.[_0-9a-zA-Z-]+)*$",
    message="email형식에 맞게 입력하세요.") 
    private String email; 
     
    @Min(value=20, message="20살 이상만 가능합니다.") 
    @Max(value=60, message="60살 이하만 가능합니다.") 
    private int age; 
     
    @NotNull 
    @Pattern(regexp="male|female", message="성별을 선택하세요.") 
    private String gender; 
	*/
	
	private int seq ;
	private String userId;
	private String title ;
	private String content;
	private String regdate;
	private String ip;
	private int readCount;
	private String name;
	
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
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "BoardDTO [seq=" + seq + ", userId=" + userId + ", title="
				+ title + ", content=" + content + ", regdate=" + regdate
				+ ", ip=" + ip + ", readCount=" + readCount + ", name=" + name
				+ "]";
	}
	
}
