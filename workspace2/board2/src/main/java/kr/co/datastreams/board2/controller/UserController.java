package kr.co.datastreams.board2.controller;

import kr.co.datastreams.board2.dao.UserDAO;
import kr.co.datastreams.board2.dto.UserDTO;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class UserController {
	
	@RequestMapping(value="addUserFormServlet", method=RequestMethod.GET)
	public String addUserForm(Model model) throws Exception {
		
			return "adduserform";
	}	
	
	@RequestMapping(value="adduser", method=RequestMethod.POST)
	public String addUser(@ModelAttribute UserDTO userDto ,Model model) throws Exception {
		
			System.out.println(userDto.toString());
			
			// DTO에 위의 값을 설정
			UserDTO user = new UserDTO();
			user.setId(userDto.getId());
			user.setPasswd(userDto.getPasswd());
			user.setName(userDto.getName());
			user.setBirthyyyy(userDto.getBirthyyyy());
			user.setBirthmn(userDto.getBirthmn());
			user.setGender(userDto.getGender());
			user.setEmail(userDto.getEmail());
							
			// DAO를 이용하여 저장.
			UserDAO userDAO = new UserDAO();
			userDAO.addUser(user);
			
			// list로 이동
			return "redirect:list";
	}

}
