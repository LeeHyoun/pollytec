package kr.co.datastreams.board.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import board.dao.NewLoginDAO;
import board.dto.UserDTO;

@Controller
public class LoginController {
	@Autowired
	NewLoginDAO newLoginDAO;
	
	@RequestMapping(value="loginform", method=RequestMethod.GET)
	public String loginForm(Model model) throws Exception{
		
			return "loginform";
	}
	
	
	@RequestMapping(value="login")
	public String login(
			@ModelAttribute UserDTO udto,
			HttpServletRequest request,
			Model model) throws Exception {
		
		System.out.println("===============================================================");
		System.out.println(udto.toString());
		System.out.println("===============================================================");
		
		String id = udto.getId();
		String passwd = udto.getPasswd();
		
		// id에 해당하는 회원정보를 요청
		udto = newLoginDAO.idCheck(udto);
		
		System.out.println(udto.toString());
		
		if(udto == null){
			return "redirect:loginform?login=fail";
		}
		
		if(passwd.equals(udto.getPasswd())){
			System.out.println("passwd equals!!");
			HttpSession session = request.getSession();
			session.setAttribute("logininfo", udto); //dto를 넘겨주어 사용
			
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
