package eyoon.eyoonController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import eyoon.eyoonDTO.BookPageDTO;
import eyoon.eyoonDTO.DueDTO;
import eyoon.eyoonDTO.DueReturnDTO;
import eyoon.eyoonDTO.RentDTO;
import eyoon.eyoonService.DueService;
import eyoon.eyoonService.RentService;


@Controller
public class DueController {
	
	@Autowired
	DueService dueService;
	
	@Autowired
	RentService rentService;
	
	final static int BLOCK = 5; 
	final static int RECORD = 10; 
	
	@RequestMapping(value="/duelist", method={RequestMethod.GET, RequestMethod.POST})
	public String list(
			@RequestParam(value="page", required=false, defaultValue="1") int ipage, 
			@ModelAttribute BookPageDTO bookPageDTO,
			Model model) throws Exception{
		
		int count = dueService.selectCount(); 
		int pageCount = count / RECORD;
		//System.out.println(pageCount);
		System.out.println(bookPageDTO.toString());
		
		if(count % 5 > 0) pageCount++; 
		List<DueDTO> list = dueService.selectList(ipage, bookPageDTO); 
		//System.out.println(list.size());
		
		int prevPage = ((ipage-1)/BLOCK*BLOCK)+1; 
		int nextPage = ((ipage-1)/BLOCK*BLOCK)+BLOCK; 
		
		bookPageDTO.setPrevPage(prevPage);
		bookPageDTO.setNextPage(nextPage);
		bookPageDTO.setPageCount(pageCount);
		bookPageDTO.setPage(ipage);
		
		
		model.addAttribute("BLOCK", BLOCK);
		model.addAttribute("list", list);
		model.addAttribute("bookPageDTO",bookPageDTO);
		
		return "/eyoonJSP/duelist";
	}
	
	/*반납*/
	@RequestMapping(value="/dueReturn", method={RequestMethod.GET, RequestMethod.POST})
	public String bookReturn(Model model,
			@RequestParam(value="rentNo", required=false, defaultValue="1") int seq,
			@ModelAttribute DueReturnDTO dueReturnDTO) throws Exception{
		
		System.out.println(seq);
		model.addAttribute("rentNo",seq);
		//model.addAttribute("Due",dueReturnDTO);
		
		return "/eyoonJSP/bookReturn";
	}
	
	
	@RequestMapping(value="/updateReturn", method={RequestMethod.GET, RequestMethod.POST})
	public String updateReturn(Model model,
			@RequestParam(value="rentNo", required=false, defaultValue="1") int seq,
			@RequestParam(value="dueState", required=false) String dueState,
			@RequestParam(value="dueRecord", required=false) String dueRecord
			) throws Exception{
		
		RentDTO rentDTO = rentService.getRent(seq);
		rentDTO.setRentState("대여가능");
		rentDTO.setRentBooking("예약불가");
		rentDTO.setRentFlag("1");
		DueDTO dueDTO = new DueDTO();
		dueDTO.setRentNo(seq);
		dueDTO.setDueState(dueState);
		dueDTO.setDueRecord(dueRecord);
		dueDTO.setDueOverdue(0);
		System.out.println("11111");
		int cnt = rentService.updateRent(rentDTO);
		System.out.println("22222");
		int cnt2 = dueService.insertDue(dueDTO);
		System.out.println("33333");
		model.addAttribute("due", dueDTO);
		System.out.println("44444");
		return "redirect:duelist";
	}
	
}


