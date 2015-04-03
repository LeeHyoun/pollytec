package kr.co.datastreams.board2.controller;

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
public class ReplyController {
	
	@RequestMapping(value="reply" ,method=RequestMethod.POST)
	public String reply(
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
		boardDTO.setIp("iipp");
		
		boardDAO.writeBoard(boardDTO);
		return "redirect:list";
	}
}
