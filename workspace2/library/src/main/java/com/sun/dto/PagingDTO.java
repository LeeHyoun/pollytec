package com.sun.dto;

import com.sun.controller.NoticeController;

public class PagingDTO {

	private int totalcount;
	private int start;
	private int end;
	private int totalpage;
	private int groupno;
	private int gstart;
	private int gend;
	private int prevpageno;
	private int nextpageno;
	private int pageno;
	private int limit;
	
	
	public int getTotalcount() {
		return totalcount;
	}
	public void setTotalcount(int totalcount) {
		this.totalcount = totalcount;
		this.makePaging();
	}
	private void makePaging() {
		
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
	public int getTotalpage() {
		return totalpage;
	}
	public void setTotalpage(int totalpage) {
		this.totalpage = totalpage;
	}
	public int getGroupno() {
		return groupno;
	}
	public void setGroupno(int groupno) {
		this.groupno = groupno;
	}
	public int getGstart() {
		return gstart;
	}
	public void setGstart(int gstart) {
		this.gstart = gstart;
	}
	public int getGend() {
		return gend;
	}
	public void setGend(int gend) {
		this.gend = gend;
	}
	public int getPrevpageno() {
		return prevpageno;
	}
	public void setPrevpageno(int prevpageno) {
		this.prevpageno = prevpageno;
	}
	public int getNextpageno() {
		return nextpageno;
	}
	public void setNextpageno(int nextpageno) {
		this.nextpageno = nextpageno;
	}
	public int getPageno() {
		return pageno;
	}
	public void setPageno(int pageno) {
		this.pageno = pageno;
	}
	public int getLimit() {
		return limit;
	}
	public void setLimit(int limit) {
		this.limit = limit;
	}
	

}
