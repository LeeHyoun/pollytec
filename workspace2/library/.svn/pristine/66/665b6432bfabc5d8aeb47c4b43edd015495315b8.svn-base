package com.sun.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import philho.philhoDTO.BoardDTO;
import philho.philhoService.BoardService;

import com.sun.service.IBookSearchService;

import eyoon.eyoonDTO.BookDTO;

@Controller
public class MainController {

	@Autowired
	IBookSearchService bookservice;
	
	@Autowired
	BoardService boardService;
	
	
	@RequestMapping(value="/superMainLibrary", method={RequestMethod.GET})
	public String superMainLibrary(Model model) throws Exception{
		List<BookDTO> getimglist = bookservice.getimglist();
		List<BoardDTO> list = boardService.getList();

		model.addAttribute("list", list);
		model.addAttribute("getimglist", getimglist);
		
		return "/sun/superMainLibrary";
	}
	@RequestMapping(value="/mainLibrary", method={RequestMethod.GET})
	public String mainLibrary(Model model) throws Exception{
		
		return "/sun/mainLibrary";
	}
	
	@RequestMapping(value="/useLibrary", method={RequestMethod.GET})
	public String useLibrary(Model model) throws Exception{
		
		return "/sun/useLibrary";
	}
	@RequestMapping(value="/comeLibrary", method={RequestMethod.GET})
	public String comeLibrary(Model model) throws Exception{
		
		return "/sun/comeLibrary";
	}
	
}
