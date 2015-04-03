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
public class ReadController {
	
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
							
		BoardDAO dao = new BoardDAO();
		BoardDTO dto = dao.readBoard(seq);
		
		request.setAttribute("page", page);
		request.setAttribute("dto", dto);
		
		return "readform";
	}
	
	@RequestMapping(value="readupdate", method=RequestMethod.POST)
	public String readUpdate(HttpServletRequest request, Model model) throws Exception {
		HttpSession session = request.getSession();
		UserDTO user = (UserDTO)session.getAttribute("logininfo");
		
		if(user == null){
			
			return "redirect:loginform";
		}
   		
		int seq = Integer.parseInt(request.getParameter("seq"));
   		String title = request.getParameter("title");
		String content = request.getParameter("content");
		
		BoardDAO boardDAO = new BoardDAO();
		BoardDTO boardDTO = new BoardDTO();
		
		boardDTO.setUser_id(user.getId());
		boardDTO.setSeq(seq);
		boardDTO.setTitle(title);
		boardDTO.setContent(content);
		
		boardDAO.updateBoard(boardDTO);
		
		return "redirect:list";
	}
}
