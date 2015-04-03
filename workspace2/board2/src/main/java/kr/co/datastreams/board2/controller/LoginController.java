package kr.co.datastreams.board2.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import kr.co.datastreams.board2.dao.UserDAO;
import kr.co.datastreams.board2.dto.UserDTO;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {
	@RequestMapping(value="loginform", method=RequestMethod.GET)
	public String loginForm(Model model) throws Exception{
		
			return "loginform";
	}
	
	@RequestMapping(value="login")
	public String login(
			@RequestParam("id") String id, 
			@RequestParam("passwd") String passwd,
			HttpServletRequest request,
			Model model) throws Exception {
		
		
		System.out.println(id);
		System.out.println(passwd);
		
		// id에 해당하는 회원정보를 요청
		UserDAO userDAO = new UserDAO();
		UserDTO user = userDAO.idCheck(id, passwd);
		System.out.println(user);
		
		if(user == null){
			return "redirect:loginform?login=fail";
		}
		
		if(passwd.equals(user.getPasswd())){
			System.out.println("passwd equals!!");
			HttpSession session = request.getSession();
			session.setAttribute("logininfo", user); //dto를 넘겨주어 사용
			
			return "redirect:list";
		}else{
			return "redirect:loginform?login=fail";
		}
	}
	
	@RequestMapping(value="logout", method=RequestMethod.GET)
	public String logOut(HttpServletRequest request, Model model) throws Exception {
		HttpSession session = request.getSession();
		session.removeAttribute("logininfo");
		return "redirect:list";
	}
}
