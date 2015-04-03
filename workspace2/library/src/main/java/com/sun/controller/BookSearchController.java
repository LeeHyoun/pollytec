package com.sun.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.sun.dto.NoticeDTO;
import com.sun.service.IBookSearchService;

import eyoon.eyoonDTO.BookDTO;
import eyoon.eyoonDTO.GenreDTO;
import eyoon.eyoonDTO.RentDTO;

@Controller
public class BookSearchController {

	@Autowired
	IBookSearchService bookservice;
	
	//자료검색
	@RequestMapping(value="/bookSearch",method={RequestMethod.GET})
	public String booksearch(Model model) throws Exception{
		List<BookDTO> getimglist = bookservice.getimglist();//신작도서이미지 가져오기
		
		model.addAttribute("getimglist", getimglist);
		return "/sun/bookSearch";
	}
	
	//장르검색화면
	@RequestMapping(value="/genre",method={RequestMethod.GET})
	public String genre(@RequestParam(value="page",defaultValue="1",required=false) int ipage,Model model) throws Exception{
		List<GenreDTO> genrelist = bookservice.getgenre();//장르이름,장르코드가져오기
		List<BookDTO> getimglist = bookservice.getimglist();
		
		model.addAttribute("getimglist", getimglist);
		model.addAttribute("genrelist", genrelist);
		
		return "/sun/bookSearchGenre";
	}
	
	//장르검색
	@RequestMapping(value="/selectglist",method={RequestMethod.POST,RequestMethod.GET})
	public String read(@RequestParam(value="genre",defaultValue="1") String genrecode,@RequestParam(value="page",defaultValue="1",required=false) int ipage,HttpServletRequest request,Model model) throws Exception{
			
		int totalcount = bookservice.getCount(genrecode);//총 게시물수
		
		int end = ipage * NoticeController.limit;
		int start = end - (NoticeController.limit-1);
		if(end > totalcount){
			end = totalcount;
		}
		int totalpage = totalcount / NoticeController.limit + (totalcount % NoticeController.limit > 0 ? 1 : 0);
		if(ipage > totalpage){
			ipage = totalpage;
		}
		
		int groupno = ipage / NoticeController.block + (ipage % NoticeController.block > 0 ? 1:0);//페이지그룹번호
		int gend = groupno * NoticeController.block;
		int gstart = gend - (NoticeController.block-1);
		
		if(gend > totalpage) {
			gend = totalpage;
		}
		
		int prevpageno = gstart - NoticeController.block;
		int nextpageno = gstart + NoticeController.block;
		if(prevpageno < 1) {
			prevpageno = 1;
		}
		
		if(nextpageno > totalpage) {
			nextpageno = totalpage;
		}
		
		List<BookDTO> genreList = bookservice.genreList(ipage,genrecode);//장르코드에 해당하는 도서리스트가져오기
		
		model.addAttribute("genreList", genreList);
		model.addAttribute("ipage", ipage);
		model.addAttribute("gend", gend);
		model.addAttribute("gstart", gstart);
		model.addAttribute("prevpageno", prevpageno);
		model.addAttribute("nextpageno", nextpageno);
		model.addAttribute("totalpage", totalpage);
		model.addAttribute("genrecode",genrecode);
		
		return "/sun/selectGList";
	}
	
	//도서상세보기
	@RequestMapping(value="/detailbook",method={RequestMethod.GET, RequestMethod.POST})
	public String detailbook(@RequestParam(value="bookno") int bookno,Model model) throws Exception{
		BookDTO bookdto = bookservice.getone(bookno);//선택도서번호에 해당하는 도서리스트 가져오기
		List<BookDTO> isbnlist = bookservice.getisbnlist(bookno);//선택 도서번호와 같은 isbn 리스트 가져오기
		
		model.addAttribute("bookdto", bookdto);
		model.addAttribute("isbnlist", isbnlist);
		return "/sun/detailBook";
	}
	
	//예약하기
	@RequestMapping(value="/reserve",method={RequestMethod.GET})
	public String reserve(HttpServletRequest request,@RequestParam(value="bookno") int bookno) throws Exception{
		HttpSession session = request.getSession();
		String sessionid = (String) session.getAttribute("usrId");
		RentDTO rentdto = new RentDTO();
		rentdto.setRentBookingid(sessionid);
		rentdto.setBookNo(bookno);
		
		bookservice.updatereserve(rentdto);//rent테이블의 booking상태변경(예약중)하기
		return "redirect:mainLibrary";
	}
	
	//제목검색화면
	@RequestMapping(value="/titlesearch",method={RequestMethod.GET})
	public String titlesearch(@RequestParam(value="page",defaultValue="1",required=false) int ipage,Model model) throws Exception{
		
		List<BookDTO> booklist = bookservice.getbooklist(ipage);//신작도서 리스트 가져오기
		model.addAttribute("booklist", booklist);
		
		return "/sun/titleSearch";
	}
	
	//제목검색
	@RequestMapping(value="/titlesearch2",method={RequestMethod.POST,RequestMethod.GET})
	public String titlesearch2(@RequestParam(value="page",defaultValue="1",required=false) int ipage,@RequestParam(value="search") String search,HttpServletRequest request, Model model) throws Exception{
		
		int totalcount = bookservice.getCount2(search);//도서 제목이 검색어에 해당하는 총 레코드 수 구하기
		if(totalcount==0){//검색결과가 없는 경우
			model.addAttribute("search", search);
			
			return "/sun/noSearch";
		}
		int end = ipage * NoticeController.limit;
		int start = end - (NoticeController.limit-1);
		if(end > totalcount){
			end = totalcount;
		}
		int totalpage = totalcount / NoticeController.limit + (totalcount % NoticeController.limit > 0 ? 1 : 0);
		if(ipage > totalpage){
			ipage = totalpage;
		}
		
		int groupno = ipage / NoticeController.block + (ipage % NoticeController.block > 0 ? 1:0);
		int gend = groupno * NoticeController.block;
		int gstart = gend - (NoticeController.block-1);
		if(gend > totalpage) {
			gend = totalpage;
		}
		
		int prevpageno = gstart - NoticeController.block;
		int nextpageno = gstart + NoticeController.block;
		if(prevpageno < 1) {
			prevpageno = 1;
		}
		
		if(nextpageno > totalpage) {
			nextpageno = totalpage;
		}
	
		List<BookDTO> gettitlelist = bookservice.titlesearch(search,ipage);//제목이 검색어에 해당하는 도서 리스트 가져오기
		
		model.addAttribute("ipage", ipage);
		model.addAttribute("gend", gend);
		model.addAttribute("gstart", gstart);
		model.addAttribute("prevpageno", prevpageno);
		model.addAttribute("nextpageno", nextpageno);
		model.addAttribute("totalpage", totalpage);
		model.addAttribute("gettitlelist", gettitlelist);
		model.addAttribute("search", search);
		
		return "/sun/titleSearch2";
	}
	
	//저자검색화면
	@RequestMapping(value="/writersearch",method={RequestMethod.GET})
	public String writersearch(@RequestParam(value="page",defaultValue="1",required=false) int ipage,Model model) throws Exception{
		
		List<BookDTO> booklist = bookservice.getbooklist(ipage);//신작도서 리스트 5개 가져오기
		model.addAttribute("booklist", booklist);
		
		return "/sun/writerSearch";
	}
	
	//저자별검색
	@RequestMapping(value="/writersearch2",method={RequestMethod.POST,RequestMethod.GET})
	public String writersearch2(@RequestParam(value="page",defaultValue="1",required=false) int ipage,@RequestParam(value="search") String search,HttpServletRequest request, Model model) throws Exception{
		
		int totalcount = bookservice.getCount3(search);//도서의 저자가 검색어에 해당하는 총 레코드수 구하기
		if(totalcount==0){//검색결과가 없는 경우
			model.addAttribute("search", search);
			
			return "/sun/noSearch2";
		}
			
		int end = ipage * NoticeController.limit;
		int start = end - (NoticeController.limit-1);
		if(end > totalcount){
			end = totalcount;
		}
		int totalpage = totalcount / NoticeController.limit + (totalcount % NoticeController.limit > 0 ? 1 : 0);
		if(ipage > totalpage){
			ipage = totalpage;
		}
		
		int groupno = ipage / NoticeController.block + (ipage % NoticeController.block > 0 ? 1:0);
		int gend = groupno * NoticeController.block;
		int gstart = gend - (NoticeController.block-1);
		
		if(gend > totalpage) {
			gend = totalpage;
		}
		
		int prevpageno = gstart - NoticeController.block;
		int nextpageno = gstart + NoticeController.block;
		if(prevpageno < 1) {
			prevpageno = 1;
		}
		
		if(nextpageno > totalpage) {
			nextpageno = totalpage;
		}
	
		List<BookDTO> getwriterlist = bookservice.writersearch(search,ipage);
		
		model.addAttribute("search", search);
		model.addAttribute("ipage", ipage);
		model.addAttribute("gend", gend);
		model.addAttribute("gstart", gstart);
		model.addAttribute("prevpageno", prevpageno);
		model.addAttribute("nextpageno", nextpageno);
		model.addAttribute("totalpage", totalpage);
		model.addAttribute("getwriterlist", getwriterlist);
		
		return "/sun/writerSearch2";
		
	}
}

