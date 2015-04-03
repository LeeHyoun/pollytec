package sinsung.sinsungController;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


import eyoon.eyoonDTO.BookDTO;
import eyoon.eyoonDTO.BookPageDTO;
import eyoon.eyoonService.BookService;
import sinsung.sinsungDTO.MgrQnaDTO;

import sinsung.sinsungDTO.MgrQnaFwDTO;
import sinsung.sinsungDTO.MgrUsrDTO;
import sinsung.sinsungService.MgrQnaFwService;
import sinsung.sinsungService.MgrQnaService;
import sinsung.sinsungService.MgrUsrService;

import eyoon.eyoonDTO.BookDTO;
import eyoon.eyoonDTO.BookPageDTO;
import eyoon.eyoonService.BookService;

@Controller
public class MgrQnaFwController {
	@Autowired
	MgrUsrService mgrUsrService;
	
	@Autowired
	MgrQnaService mgrQnaService;

	@Autowired
	MgrQnaFwService mgrQnaFwService;
	
	@Autowired
	MgrQnaService mgrQnaService1;
	
	@Autowired
	BookService bookService;

	final static int BLOCK = 5; 
	final static int RECORD = 10; 
	
	@RequestMapping(value="/mgrQnaList", method={RequestMethod.GET, RequestMethod.POST})
	public String MgrQnaList (
			@RequestParam(value="page", required=false, defaultValue="1") int ipage,
			@ModelAttribute BookPageDTO bookPageDTO,
			Model model) throws Exception{
		
		int count = mgrQnaService.selectCount(); 
		int pageCount = count / RECORD;
		//System.out.println(pageCount);
		System.out.println(bookPageDTO.toString());
		
		if(count % 5 > 0) pageCount++; 
		
		List<MgrQnaDTO> qnaList = mgrQnaService.QnaList(ipage, bookPageDTO);
		System.out.println(pageCount);
		
		int prevPage = ((ipage-1)/BLOCK*BLOCK)+1; 
		int nextPage = ((ipage-1)/BLOCK*BLOCK)+BLOCK; 
		
		bookPageDTO.setPrevPage(prevPage);
		bookPageDTO.setNextPage(nextPage);
		bookPageDTO.setPageCount(pageCount);
		bookPageDTO.setPage(ipage);
			
		model.addAttribute("BLOCK", BLOCK);
		model.addAttribute("qnalist", qnaList);
		model.addAttribute("bookPageDTO",bookPageDTO);
				
			
		return "/sinsungJSP/mgrQnaList";
	}
	
		
	/*
	@RequestMapping(value="/mgrQnaList1", method={RequestMethod.POST})
	public String MgrQnaList1 (@ModelAttribute MgrQnaDTO1 mgrQnaDTO1,
			HttpServletRequest request, Model model) throws Exception{		
		List<MgrQnaDTO1> qnaList = mgrQnaService1.QnaList1();
		model.addAttribute("qnalist", qnaList);
		return "/sinsungJSP/mgrQnaList1";
	}*/
	
	
	@RequestMapping(value="/mgrQnaInfo", method={RequestMethod.GET})
	public String MgrQnaInfo (@RequestParam(value="usrId") String usrId, Model model) throws Exception{
		MgrUsrDTO usrDTO = mgrUsrService.getUsr(usrId);
		model.addAttribute("usr", usrDTO);
		MgrQnaDTO qnaDTO = mgrQnaService.getQna(usrId);
		model.addAttribute("qna",qnaDTO);
		/* System.out.println(qnaDTO.getQnaSeq() +"+++++++++++++++++++++++++++++");*/
		MgrQnaFwDTO qnaFwDTO = mgrQnaFwService.getQnaFw(qnaDTO.getQnaSeq());
		model.addAttribute("qnaFw", qnaFwDTO);
		/*System.out.println(qnaFwDTO+"+++++++++++++++++++++++++++++++++++++++++++");*/
		return "/sinsungJSP/mgrQnaInfo";
	}
	


}
