package kr.co.sunnyvale.board.controller;

import java.security.InvalidParameterException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import board.dto.BoardDTO;
import board.dto.UserDTO;
import board.service.BoardService;

@Controller
public class BoardController {
	@Autowired
	BoardService boardService;

	
	@RequestMapping(value="/read", method={RequestMethod.GET})
	public String read(HttpServletRequest request,
			@RequestParam("seq") int iseq,
			Model model) throws Exception{
		
		BoardDTO board = boardService.getBoard(iseq);
		
		model.addAttribute("board", board);
		return "read";
	}		
	
	

	
	@RequestMapping(value="/writeform", method={RequestMethod.GET})
	public String writeform(HttpServletRequest request,
			Model model) throws Exception{
		HttpSession session = request.getSession();
		UserDTO user = (UserDTO)session.getAttribute("logininfo");
		if(user == null){
			return "redirect:loginform";
		}
		
		return "writeform";
	}	
	
	@RequestMapping(value="/write", method={RequestMethod.POST})
	public String write(HttpServletRequest request,
			@RequestParam("title") String title,
			@RequestParam("content") String content,
			Model model) throws Exception{
		HttpSession session = request.getSession();
		UserDTO user = (UserDTO)session.getAttribute("logininfo");
		if(user == null){
			return "redirect:loginform";
		}	
		
		System.out.println("title :" + title);
		System.out.println("content :" + content);		
		if(title == null || "".equals(title)){
			throw new InvalidParameterException("title이 입력안됨");
		}
		if(content == null || "".equals(content)){
			throw new InvalidParameterException("content이 입력안됨");
		}

		BoardDTO board = new BoardDTO();
		board.setUserId(user.getId());
		board.setTitle(title);
		board.setContent(content);
		board.setIp(request.getRemoteHost());
		BoardDTO addBoard = boardService.addBoard(board);
		System.out.println(addBoard);
		return "redirect:list";
	}	
	

		
	
	@RequestMapping(value="/list", method={RequestMethod.GET, RequestMethod.POST})
	public String list(@RequestParam(value="pg", required=false, defaultValue="1")int ipg, 
			Model model) throws Exception{

		int count = boardService.getCount();
		List<BoardDTO> list = boardService.getList(ipg);
		
		int pageCount = count / 5;
		if((count%5) != 0)
			pageCount++;
		
		model.addAttribute("list", list);
		model.addAttribute("count", count);
		model.addAttribute("ipg", ipg);
		model.addAttribute("pageCount", pageCount);
		
		return "list";
	}	
}
