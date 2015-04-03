package kr.co.datastreams.board2.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import kr.co.datastreams.board2.dao.BoardDAO;
import kr.co.datastreams.board2.dto.BoardDTO;
import kr.co.datastreams.board2.dto.UserDTO;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class ListController  {
		
	final static int BLOCK = 5; // 페이지 블럭 갯수
	final static int RECORD = 10; // 페이지당 레코드 갯수
	
	@RequestMapping(value="list", method=RequestMethod.GET)
	public String list(
			@RequestParam(value="page", defaultValue="1", required=false ) int ipage ,
			Model model) throws Exception {
		BoardDAO boardDAO = new BoardDAO();
		
		int count = boardDAO.getBoardCount(); //전체 개시물 갯수
		int pageCount = count / RECORD;
		//System.out.println(pageCount);
		if(count % 5 > 0) pageCount++; //총 페이지 갯수 구하기
		List<BoardDTO> list = boardDAO.selectListBoard(ipage); //한 페이지당 개시물 갯수
		//System.out.println(list.size());
		
		int prevPage = ((ipage-1)/BLOCK*BLOCK)+1; // 시작블럭숫자 (1~5페이지일경우 1, 6~10일경우 6)
		int nextPage = ((ipage-1)/BLOCK*BLOCK)+BLOCK; // 끝 블럭 숫자 (1~5일 경우 5, 6~10일경우 10)
		
		/*System.out.println(prevPage);
		System.out.println(nextPage);*/
		
		model.addAttribute("page", ipage);
		model.addAttribute("BLOCK", BLOCK);
		model.addAttribute("prevPage", prevPage);
		model.addAttribute("nextPage", nextPage);
		model.addAttribute("pageCount", pageCount);
		model.addAttribute("list", list);
				
		return "list";
	}
	
	@RequestMapping(value="delete", method=RequestMethod.GET)
	public String boardDel(HttpServletRequest request, Model model) throws Exception {
		HttpSession session = request.getSession();
		UserDTO user = (UserDTO)session.getAttribute("logininfo");
		
		if(user == null){
			return "redirect:loginform";
		}
   		
   		int seq = Integer.parseInt(request.getParameter("seq"));
				
		BoardDAO boardDAO = new BoardDAO();
		BoardDTO boardDTO = new BoardDTO();
				
		boardDAO.deleteBoard(seq);
		return "redirect:list";
	}
	
	@RequestMapping(value="writeform", method=RequestMethod.GET)
	public String writeForm() throws Exception {
		
		return "writeform";
	}
	
	@RequestMapping(value="write", method=RequestMethod.POST)
	public String write(
			@RequestParam("title") String title,
			@RequestParam("content") String content,
			HttpServletRequest request,
			Model model) throws Exception {
		
		HttpSession session = request.getSession();
		UserDTO user = (UserDTO)session.getAttribute("logininfo");
		if(user == null){
			
			return "redirect:loginform";
		}
					
		BoardDAO boardDAO = new BoardDAO();
		BoardDTO boardDTO = new BoardDTO();
		
		boardDTO.setUser_id(user.getId());
		boardDTO.setTitle(title);
		boardDTO.setContent(content);
		boardDTO.setIp(request.getRemoteAddr());
		
		boardDAO.writeBoard(boardDTO);
		
		return "redirect:list";
	}
	
}



