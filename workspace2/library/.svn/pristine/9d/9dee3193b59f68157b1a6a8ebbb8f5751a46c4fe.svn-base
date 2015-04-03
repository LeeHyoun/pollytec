package eyoon.eyoonController;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import philho.philhoService.UsrService;
import eyoon.eyoonDTO.BookDTO;
import eyoon.eyoonDTO.BookPageDTO;
import eyoon.eyoonDTO.RentDTO;
import eyoon.eyoonService.BookService;

@Controller
public class BookController {
	
	@Autowired
	BookService bookService;
	
	@Autowired
	UsrService usrService;
	
	final static int BLOCK = 5; 
	final static int RECORD = 10; 
	
	@RequestMapping(value="/booklist", method={RequestMethod.GET, RequestMethod.POST})
	public String list(
			@RequestParam(value="page", required=false, defaultValue="1") int ipage, 
			@ModelAttribute BookPageDTO bookPageDTO,
			Model model) throws Exception{
		
		int count = bookService.selectCount(); 
		int pageCount = count / RECORD;
		//System.out.println(pageCount);
		System.out.println(bookPageDTO.toString());
		
		if(count % 5 > 0) pageCount++; 
		List<BookDTO> list = bookService.selectList(ipage, bookPageDTO); 
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
		
		return "/eyoonJSP/booklist";
	}
	
	@RequestMapping(value="/addbook", method={RequestMethod.GET})
	public String addbook(Model model) throws Exception {
		return "/eyoonJSP/addBook";
	}
	
	@RequestMapping(value="/write", method={RequestMethod.POST})
	public String write(
			@ModelAttribute BookDTO bookDTO,
			HttpServletRequest request,
			Model model) throws Exception {
		
		/*HttpSession session = request.getSession();
		UsrDTO user = (UsrDTO)session.getAttribute("logininfo");
		if(user == null){
			
			return "redirect:loginform";
		}*/	
		bookService.addBook(bookDTO);
		
		return "redirect:/booklist";
	}
	
	@RequestMapping(value="/deletebook", method=RequestMethod.POST)
	public String deleteBook(
			@ModelAttribute BookDTO bookDTO,
			@ModelAttribute BookPageDTO bookPageDTO,
			HttpServletRequest request,
			Model model) throws Exception {
	
		/*	HttpSession session = request.getSession();
		UserDTO user = (UserDTO)session.getAttribute("logininfo");
		
		if(user == null){
			return "redirect:loginform";
		}*/
   		
		bookService.deleteBook(bookDTO);
		
		
		return "redirect:booklist?page="+bookPageDTO.getPage();
	}
	
	@RequestMapping(value="/deleteform", method={RequestMethod.GET})
	public String deleteForm(
			@ModelAttribute BookDTO bookDTO,
			@ModelAttribute BookPageDTO bookPageDTO,
			Model model) throws Exception {
		
			model.addAttribute("Book",bookDTO);
			model.addAttribute("bookPageDTO",bookPageDTO);
			
		return "/eyoonJSP/deleteForm"; 
	}
	
	@RequestMapping(value="/bookstats", method={RequestMethod.GET})
	public String bookstats(Model model) throws Exception {
		return "/eyoonJSP/bookStats";
	}
	
	@RequestMapping(value="/readbook", method={RequestMethod.GET})
	public String readBook(
			@ModelAttribute BookDTO bookDTO,
			Model model) throws Exception {
		
		bookDTO = bookService.readBook(bookDTO);
		
		System.out.println("=============================================");
		System.out.println(bookDTO.toString());
		System.out.println("=============================================");
		
		model.addAttribute("Book", bookDTO);
		
		return "/eyoonJSP/readBook";
	}
	
	@RequestMapping(value="readUpdate", method=RequestMethod.POST)
	public String readUpdate(
			HttpServletRequest request,
			@ModelAttribute BookDTO bookDTO,
			@RequestParam(value="page", required=false, defaultValue="1") int ipage,
			Model model) throws Exception {
		
		/*HttpSession session = request.getSession();
		UserDTO user = (UserDTO)session.getAttribute("logininfo");
		
		if(user == null){
			
			return "redirect:loginform";
		}*/
   		
		System.out.println(bookDTO.toString());
		bookService.updateBook(bookDTO);
				
		
		return "redirect:/booklist?page"+ipage;
	}
	
	@RequestMapping(value="/bookRent", method={RequestMethod.GET,RequestMethod.POST})
	public String bookRent(
			
			Model model) throws Exception {
	
		return "/eyoonJSP/bookRent";
	}
	
	
	@RequestMapping(value="/getBook", method={RequestMethod.GET,RequestMethod.POST})
	public @ResponseBody BookDTO getBook(
			@ModelAttribute BookDTO bookDTO) throws Exception {
			
			bookDTO = bookService.getBook(bookDTO);
			
			System.out.println(bookDTO.toString());
			
			return bookDTO;
	}

	
	@RequestMapping(value="/rentUsr", method={RequestMethod.GET,RequestMethod.POST})
	public String rentUsr(
			@ModelAttribute RentDTO rentDTO,
			Model model) throws Exception {
		
			System.out.println(rentDTO.getUsrName());
			
			List<RentDTO> list = bookService.selectName(rentDTO);
			
			model.addAttribute("list", list);
		return "/eyoonJSP/rentUsr";
	}
}


