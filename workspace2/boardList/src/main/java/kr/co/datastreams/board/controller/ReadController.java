package kr.co.datastreams.board.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import board.dao.ReplyDAO;
import board.dto.BoardDTO;
import board.dto.ReplyDTO;
import board.dto.UserDTO;
import board.service.BoardService;



@Controller
public class ReadController {
	
	@Autowired
	BoardService boardService;
	
	@Autowired
	ReplyDAO newReplyDAO;
	
	@RequestMapping(value="readform", method=RequestMethod.GET)
	public String readForm(
			@RequestParam("page") int page,
			@RequestParam("seq") int seq,
			HttpServletRequest request ,
			Model model) throws Exception {
		
		
		HttpSession session = request.getSession();
		UserDTO user = (UserDTO)session.getAttribute("logininfo");
		if(user == null){
			
			return "redirect:loginform";
		}
							
		BoardDTO dto = boardService.readBoard(seq);
		dto.setName(user.getName());
		System.out.println(dto.toString());
		
		List<ReplyDTO> relist = new ArrayList<ReplyDTO>();
		
		
		relist = newReplyDAO.replyList(seq);
		
		model.addAttribute("relist", relist);
		model.addAttribute("page", page);
		model.addAttribute("dto", dto);
		
		return "readform";
	}
	
	@RequestMapping(value="readupdate", method=RequestMethod.POST)
	public String readUpdate(
			HttpServletRequest request,
			@ModelAttribute BoardDTO boardDTO,
			@RequestParam("page") int page,
			Model model) throws Exception {
		
		HttpSession session = request.getSession();
		UserDTO user = (UserDTO)session.getAttribute("logininfo");
		
		if(user == null){
			
			return "redirect:loginform";
		}
   		
		System.out.println(boardDTO.toString());
		boardService.updateBoard(boardDTO);
		
		return "redirect:list?page="+page;
	}
}
