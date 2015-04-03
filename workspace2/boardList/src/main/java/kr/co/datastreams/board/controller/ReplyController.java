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
import board.service.ReplyService;

@Controller
public class ReplyController {
	
	@Autowired
	ReplyService replyService;
	
	@RequestMapping(value="writeReply" ,method=RequestMethod.POST)
	public String reply(
			@ModelAttribute ReplyDTO replyDTO,
			HttpServletRequest request,
			Model model) throws Exception {
	
		HttpSession session = request.getSession();
		UserDTO user = (UserDTO)session.getAttribute("logininfo");
		if(user == null){
			
			return "redirect:loginform"; 
		}
		
		replyService.writeReply(replyDTO);
		return "r";
	}
}
