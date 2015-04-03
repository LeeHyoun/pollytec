package kr.co.datastreams.board.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import board.dao.NewUserDAO;
import board.dto.UserDTO;

@Controller
public class UserController {
	
	@Autowired
	NewUserDAO newUserDAO;
	
	@RequestMapping(value="addUserForm", method=RequestMethod.GET)
	public String addUserForm(Model model) throws Exception {
		
			return "adduserform";
	}	
	
	@RequestMapping(value="adduser", method=RequestMethod.POST)
	public String addUser(@ModelAttribute UserDTO userDto ,Model model) throws Exception {
		
		System.out.println("===================================================================");
		System.out.println(userDto.toString());
		System.out.println("===================================================================");
		
		// DAO를 이용하여 저장.
		newUserDAO.addUser(userDto);
		
		// list로 이동
		return "redirect:list";
	}

}
