package eyoon.eyoonController;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import eyoon.eyoonDTO.BookPageDTO;
import eyoon.eyoonDTO.RentDTO;
import eyoon.eyoonService.RentService;

@Controller
public class RentController {
	
	@Autowired
	RentService rentService;
	
	final static int BLOCK = 5; 
	final static int RECORD = 10; 
	
	@RequestMapping(value="/rentlist", method={RequestMethod.GET, RequestMethod.POST})
	public String list(
			@RequestParam(value="page", required=false, defaultValue="1") int ipage, 
			@ModelAttribute BookPageDTO bookPageDTO,
			Model model) throws Exception{
		
		int count = rentService.selectCount(); 
		int pageCount = count / RECORD;
		//System.out.println(pageCount);
		System.out.println(bookPageDTO.toString());
		
		if(count % 5 > 0) pageCount++; 
		List<RentDTO> list = rentService.selectList(ipage, bookPageDTO); 
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
		
		return "/eyoonJSP/rentlist";
	}
	
	
	@RequestMapping(value="/rentInsert", method={RequestMethod.GET,RequestMethod.POST})
	public String rentInsert(
			@ModelAttribute RentDTO rentDTO,
			HttpServletRequest request,
			Model model) throws Exception {
		
		/*HttpSession session = request.getSession();
		UsrDTO user = (UsrDTO)session.getAttribute("logininfo");
		if(user == null){
			
			return "redirect:loginform";
		}*/	
		System.out.println("===============================================");
		System.out.println(rentDTO.toString());
		System.out.println("===============================================");
						
		rentService.rentInsert(rentDTO);
		
		return "redirect:rentlist";
	}
}


