package eyoon.eyoonDTO;

public class BookPageDTO {
	private int start; //조회시작
	private int end;  //조회끝
	
	private String searchFiled;  //검색 조건
	private String searchValue;  //검색어
	
	private int page; //페이지 번호
	private int prevPage; //이전 페이지
	private int nextPage; //다음 페이지
	private int pageCount; //전체 게시글 수 
	
	private String searchDateStart;
	private String searchDateEnd;
	
	
	
	public String getSearchDateStart() {
		return searchDateStart;
	}
	public void setSearchDateStart(String searchDateStart) {
		this.searchDateStart = searchDateStart;
	}
	public String getSearchDateEnd() {
		return searchDateEnd;
	}
	public void setSearchDateEnd(String searchDateEnd) {
		this.searchDateEnd = searchDateEnd;
	}
	public int getPage() {
		return page;
	}
	public void setPage(int page) {
		this.page = page;
	}
	public int getPrevPage() {
		return prevPage;
	}
	public void setPrevPage(int prevPage) {
		this.prevPage = prevPage;
	}
	public int getNextPage() {
		return nextPage;
	}
	public void setNextPage(int nextPage) {
		this.nextPage = nextPage;
	}
	public int getPageCount() {
		return pageCount;
	}
	public void setPageCount(int pageCount) {
		this.pageCount = pageCount;
	}
	public String getSearchFiled() {
		return searchFiled;
	}
	public void setSearchFiled(String searchFiled) {
		this.searchFiled = searchFiled;
	}
	public String getSearchValue() {
		return searchValue;
	}
	public void setSearchValue(String searchValue) {
		this.searchValue = searchValue;
	}
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
		return "BookPageDTO [start=" + start + ", end=" + end
				+ ", searchFiled=" + searchFiled + ", searchValue="
				+ searchValue + ", page=" + page + ", prevPage=" + prevPage
				+ ", nextPage=" + nextPage + ", pageCount=" + pageCount
				+ ", searchDateStart=" + searchDateStart + ", searchDateEnd="
				+ searchDateEnd + "]";
	}
	
	
	
}
