package kr.co.sunnyvale.board.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import board.dao.BoardDAO;
import board.dto.BoardDTO;
import board.service.BoardService;

@Controller
public class BoardAPIController {
	@Autowired
	BoardService boardService;
	
	@RequestMapping(value="/test", method={RequestMethod.GET})
	public String test(
			Model model) throws Exception{
		return "test";
	}		


	@RequestMapping(value="/read.api", method={RequestMethod.GET})
	@ResponseStatus(HttpStatus.OK)
	@ResponseBody
	public BoardDTO read(HttpServletRequest request,
			@RequestParam("seq") int iseq,
			Model model) throws Exception{

		BoardDTO board = boardService.getBoard(iseq);
		
		return board;
	}		

	@RequestMapping(value="/list.api", method={RequestMethod.GET})
	@ResponseStatus(HttpStatus.OK)
	@ResponseBody
	public List<BoardDTO> list(@RequestParam(value="pg", required=false, defaultValue="1")int ipg, 
			Model model) throws Exception{

		int count = boardService.getCount();
		List<BoardDTO> list = boardService.getList(ipg);
		
		return list;
	}	
}
