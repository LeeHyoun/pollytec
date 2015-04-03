package philho.philhoController;

import java.security.InvalidParameterException;
import java.util.Calendar;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import philho.philhoDTO.BoardDTO;
import philho.philhoService.BoardService;
import philho.philhoService.UsrService;

@Controller
public class BoardController {
	@Autowired
	BoardService boardService;
	@Autowired
	UsrService usrService;

	@RequestMapping(value = "/boardlist", method = { RequestMethod.GET,
			RequestMethod.POST })
	public String boardlist(
			@RequestParam(value = "pg", required = false, defaultValue = "1") int ipg,
			Model model) throws Exception {

		int count = boardService.getCount();
		List<BoardDTO> list = boardService.getList(ipg);

		int pageCount = count / 5;
		if ((count % 5) != 0)
			pageCount++;
		

		model.addAttribute("list", list);
		model.addAttribute("count", count);
		model.addAttribute("pageCount", pageCount);
		model.addAttribute("ipg", ipg);

		return "/philhoJSP/boardlist";
	}
	
	@RequestMapping(value="/boardread", method={RequestMethod.GET})
		public String boardread(
				@ModelAttribute BoardDTO boardDTO,
				Model model) throws Exception {
		
		boardDTO = boardService.readBoard(boardDTO);
		
		System.out.println("=====================");
		System.out.println(boardDTO.toString());
		System.out.println("=====================");
		Calendar cal = Calendar.getInstance();
		String calsave = cal.get(Calendar.YEAR)+" "+ (cal.get(Calendar.MONTH)+1)+" "+ cal.get(Calendar.DAY_OF_MONTH);
		model.addAttribute("calsave",calsave);
		model.addAttribute("read",boardDTO);
		
		return "/philhoJSP/boardread";
}

	@RequestMapping(value = "/boardwriteform", method = { RequestMethod.GET})
	public String writeform(
			HttpServletRequest request, HttpServletResponse response, 
			@RequestParam("usrId") String usrId, Model model) throws Exception {
	
		
		if( usrId== null){
			return "redirect:loginform";
		}		
		
			Calendar cal = Calendar.getInstance();
			String calsave = cal.get(Calendar.YEAR)+" "+ (cal.get(Calendar.MONTH)+1)+" "+ cal.get(Calendar.DAY_OF_MONTH);
			HttpSession session = request.getSession();			
			session.setAttribute("cal", cal);
			model.addAttribute("calsave",calsave);
			
			
			
	      System.out.println("==================================");
	      System.out.println(cal.get(Calendar.YEAR)+" "+ (cal.get(Calendar.MONTH)+1)+" "+ cal.get(Calendar.DAY_OF_MONTH));
	      System.out.println("==================================");

		
		return "/philhoJSP/boardwriteform";
	}

	@RequestMapping(value = "/boardqna", method = { RequestMethod.GET })
	public String qna(Model model) throws Exception {

		return "/philhoJSP/boardQna";
	}
	
	
 @RequestMapping(value="/boardupdateform", method={RequestMethod.GET,RequestMethod.POST })
	public String boardupdateform(
			@ModelAttribute BoardDTO board,
			Model model) throws Exception {
		
	 System.out.println("=========update form    =====================");
		System.out.println(board);
		System.out.println("=====================================");
	 
	 
		board = boardService.readBoard(board);
		

		Calendar cal = Calendar.getInstance();
		String calsave = cal.get(Calendar.YEAR)+" "+ (cal.get(Calendar.MONTH)+1)+" "+ cal.get(Calendar.DAY_OF_MONTH);
		
		
		model.addAttribute("calsave",calsave);
		model.addAttribute("board",board);
	
		return "/philhoJSP/boardupdateform";
	
	}
	
	@RequestMapping(value = "/boardupdate", method = { RequestMethod.GET,	RequestMethod.POST })
	public String boardupdate(@ModelAttribute BoardDTO board,
			HttpServletRequest request,
			HttpServletResponse response,
			
			 Model model)
			throws Exception{
		
		
	/*	@RequestParam(value = "boardTitle" ) String boardTitle,
		@RequestParam(value = "boardContent") String boardContent*/
		
		System.out.println("=====================================");
		System.out.println(board);
		System.out.println("=====================================");
		
	/*	board.setBoardTitle(boardTitle);
		board.setBoardContent(boardContent);
		
		*/
		
		boardService.updateBoard(board);
		
		/*return "redirect:/boardread?boardSeq=" +update.getBoardSeq();*/
		return "redirect:boardlist";
}
	
	
	@RequestMapping(value="/addBoard", method={RequestMethod.POST})
	public String addBoard(HttpServletRequest request,
			@RequestParam("usrId") String usrId,
			@RequestParam("title") String title,
			@RequestParam("titletitle") String content,
			@RequestParam("boardDate") String boardDate,
			Model model) throws Exception{
		

		
		System.out.println(title   +"dddd");
		System.out.println(content + "dddd");
		System.out.println(usrId + "dddd");

/*		
		System.out.println("title :" + title);
		System.out.println("content :" + content);	*/	
		if(title == null || "".equals(title)){
			throw new InvalidParameterException("title이 입력안됨");
		}
		if(content == null || "".equals(content)){
			throw new InvalidParameterException("content이 입력안됨");
		}

			BoardDTO board = new BoardDTO();
			board.setUsrId(usrId);
			board.setBoardTitle(title);
			board.setBoardContent(content);
			board.setBoardDate(boardDate);
			
			BoardDTO addBoard = boardService.addBoard(board);
				
			
		return "redirect:boardlist";
		
	}
		
		@RequestMapping(value="/boarddelete",method={RequestMethod.GET})
		public String delete(@RequestParam(value="boardSeq") int boardSeq,Model model) throws Exception{
		boardService.boarddelete(boardSeq);	
		
		
			return "redirect:boardlist";
		}
	
	
		@RequestMapping(value = "/boardsearch", method = { RequestMethod.GET,
				RequestMethod.POST })
		public String boardsearch(
				@RequestParam(value = "pg", required = false, defaultValue = "1") int ipg,
				Model model,@RequestParam(value="searchFiled") String searchFiled,@RequestParam(value="searchValue") String searchValue) throws Exception {
			int count=0;
			 List<BoardDTO> list=null;
			
			if(searchFiled.equals("boardtitle")){
				 count = boardService.getCount2(searchValue);
				list = boardService.getList(ipg,searchValue);
				
			}
			
				else if(searchFiled.equals("boardid")){
					 count = boardService.getCount3(searchValue);
						list = boardService.getList2(ipg,searchValue);
			}
			

			int pageCount = count / 5;
			if ((count % 5) != 0)
				pageCount++;
			

			model.addAttribute("list", list);
			model.addAttribute("count", count);
			model.addAttribute("pageCount", pageCount);
			model.addAttribute("ipg", ipg);
			model.addAttribute("searchValue", searchValue);

			return "/philhoJSP/boardlist";
		}
	

}