package kr.co.sunnyvale.board.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import board.dto.UserDTO;
import board.service.UserService;

@Controller
public class UserController {
	@Autowired
	UserService userService;


	
	@RequestMapping(value="/loginform", method={RequestMethod.GET})
	public String loginform(Model model) throws Exception{
		return "loginform";
	}
	
	@RequestMapping(value="/userjoinform", method={RequestMethod.GET})
	public String userjoinform(Model model) throws Exception{

		return "userjoinform";
	}
	
	
	@RequestMapping(value="/login", method={RequestMethod.POST})
	public String login(
			HttpServletRequest request,
			@RequestParam("id") String id,
			@RequestParam("passwd") String passwd,
			Model model) throws Exception{

		UserDTO user = userService.getUser(id);
		System.out.println(user);
		if(user == null){
			return "redirect:loginform?login=fail";
		}
		if(passwd.equals(user.getPasswd())){
			System.out.println("passwd equals!!");
			HttpSession session = request.getSession();
			session.setAttribute("logininfo", user);
			return "redirect:list";
		}else{
			return "redirect:loginform?login=fail";
		}
	}
	
	@RequestMapping(value="/userjoin", method={RequestMethod.POST})
	public String userjoin(
			HttpServletRequest request,
			Model model) throws Exception{
		String id = request.getParameter("idtxt");
		String pw = request.getParameter("pwtxt");
		String name = request.getParameter("nametxt");
		String birthyy = request.getParameter("birthyy");
		String birthmm = request.getParameter("birthmm");
		String email = request.getParameter("emailtxt");
		String emailselect = request.getParameter("emailselect");
		email = email + "@" + emailselect;
		String gender = "m";
		
		// DTO에 위의 값을 설정
		UserDTO user = new UserDTO();
		user.setId(id);
		user.setPasswd(pw);
		user.setName(name);
		user.setBirthyy(birthyy);
		user.setBirthmm(birthmm);
		user.setEmail(email);
		user.setGender(gender);
		
//		// DAO를 이용하여 저장.
		userService.addUser(user);
		// list로 이동
		return "redirect:list";
	}
	
	@RequestMapping(value="/logout", method={RequestMethod.GET})
	public String logout(HttpServletRequest request,
			Model model) throws Exception{
		HttpSession session = request.getSession();
		session.removeAttribute("logininfo");
		return "redirect:list";
	}		
}
