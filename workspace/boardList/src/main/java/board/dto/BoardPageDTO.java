package board.dto;

public class BoardPageDTO {
	private int start;
	private int end;
	
	public int getStart() {
		return start;
	}
	public void setStart(int start) {
		this.start = start;
	}
	public int getEnd() {
		return end;
	}
	public void setEnd(int end) {
		this.end = end;
	}
	
	
	@Override
	public String toString() {
		return "BoardPageDTO [start=" + start + ", end=" + end + "]";
	}
}
