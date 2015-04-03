package philho.philhoController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import philho.philhoDAO.UsrDAO;
import philho.philhoDTO.UsrDTO;
import philho.philhoService.UsrService;
import baedo.baedoDAO.ManagerDAO;
import baedo.baedoDTO.ManagerDTO;
import baedo.baedoService.ManagerService;

@Controller
public class UsrController {

	@Autowired
	UsrService usrService;
	@Autowired
	ManagerService managerService;
	@Autowired
	UsrDAO usrDAO;
	@Autowired
	ManagerDAO managerDAO;

	@RequestMapping(value = "/usrjoin", method = { RequestMethod.GET })
	public String join(Model model) throws Exception {

		return "/philhoJSP/usrJoin";
	}

	@RequestMapping(value = "/usrjoinOk", method = { RequestMethod.POST })
	public String joinOk(@ModelAttribute UsrDTO usr,
			@RequestParam(value = "zipcode1") String zipcode1,
			@RequestParam(value = "zipcode2") String zipcode2,
			@RequestParam(value = "usrHp1") String usrHp1,
			@RequestParam(value = "usrHp2") String usrHp2,
			@RequestParam(value = "usrMobile1") String usrMobile1,
			@RequestParam(value = "usrMobile2") String usrMobile2,
			HttpServletRequest request, Model model) throws Exception {

		String usrHp = request.getParameter("usrHp");
		usrHp = usrHp + usrHp1 + usrHp2;

		String usrAddr1 = request.getParameter("usrAddr1");
		usrAddr1 = zipcode1 + zipcode2 + usrAddr1;

		String usrMobile = request.getParameter("usrMobile");
		usrMobile = usrMobile + usrMobile1 + usrMobile2;

		usr.setUsrAddr1(usrAddr1);
		usr.setUsrMobile(usrMobile);
		usr.setUsrHp(usrHp);

		System.out.println(usrMobile + "Mobile");
		System.out.println(usrMobile1 + "Mobile1");
		System.out.println(usrMobile2 + "Mobile2");

		model.addAttribute("usr", usr);
		usrService.addUsr(usr);

		return "/sun/superMainLibrary";
	}

	@RequestMapping(value = "/usrlogin", method = { RequestMethod.POST })
	public String login(UsrDTO usr, ManagerDTO manager,
			HttpServletRequest request, @RequestParam("usrId") String usrId,
			@RequestParam("usrPw") String usrPw,
			@RequestParam("divide") String divide, Model model)
			throws Exception {

		if (divide.equals("1")) {
			usr = usrService.getUsr(usrId);

			if (usr == null) {
				return "/sun/superMainLibrary";

			} else if (usrPw.equals(usr.getUsrPw())) {
				HttpSession session = request.getSession();
				session.setAttribute("usr", usr);
				System.out.println(usr);

				model.addAttribute("divide", divide);
				return "redirect:/superMainLibrary";

			} else {
				return "/sun/superMainLibrary";
			}
		} else if (divide.equals("2")) {
			HttpSession session = request.getSession();
			String id = usrId;
			manager = managerService.getManager(id);
			session.setAttribute("manager", manager);
			model.addAttribute("divide", divide);

			return "redirect:/managerMain";

		} else {
			return "/sun/superMainLibrary";
		}
	}

	@RequestMapping(value = "/logout", method = { RequestMethod.POST })
	public String logout(HttpServletRequest request,
			HttpServletResponse response, @RequestParam("usrId") String usrId,
			Model model) throws Exception {

		HttpSession session = request.getSession();
		session.setAttribute("usrid", usrId);
		session.removeAttribute("usrid");
		session.invalidate();

		return "/sun/superMainLibrary";
	}

	@RequestMapping(value = "/usrinfo", method = { RequestMethod.GET, RequestMethod.POST })
	public String usrinfo(
			HttpServletRequest request, HttpServletResponse response, 
			@RequestParam("usrId") String usrId, 
			@RequestParam("usrPw") String usrPw, Model model) throws Exception {

		UsrDTO usr = usrService.getUsr(usrId);

		// 휴대폰
		String usrMobile = usr.getUsrMobile().substring(0, 3);
		String usrMobile1 = usr.getUsrMobile().substring(3, 7);
		String usrMobile2 = usr.getUsrMobile().substring(7, 11);
		usr.setUsrMobile(usrMobile);
		usr.setUsrMobile1(usrMobile1);
		usr.setUsrMobile2(usrMobile2);

		// 집전화
		String usrHp = usr.getUsrHp();
		String usrHp1 = usr.getUsrHp();
		String usrHp2 = usr.getUsrHp();

		if (usr.getUsrHp().substring(0, 2).equals("02")) {

			if (usr.getUsrHp().length() == 9) {
				usrHp = usr.getUsrHp().substring(0, 2);
				usrHp1 = usr.getUsrHp().substring(2, 5);
				usrHp2 = usr.getUsrHp().substring(5, 9);
				usr.setUsrHp(usrHp);
				usr.setUsrHp1(usrHp1);
				usr.setUsrHp2(usrHp2);

			} else if (usr.getUsrHp().length() == 10) {
				usrHp = usr.getUsrHp().substring(0, 2);
				usrHp1 = usr.getUsrHp().substring(2, 6);
				usrHp2 = usr.getUsrHp().substring(6, 10);
				usr.setUsrHp(usrHp);
				usr.setUsrHp1(usrHp1);
				usr.setUsrHp2(usrHp2);
			}

		} else {

			if (usr.getUsrHp().length() == 10) {
				usrHp = usr.getUsrHp().substring(0, 3);
				usrHp1 = usr.getUsrHp().substring(3, 6);
				usrHp2 = usr.getUsrHp().substring(6, 10);
				usr.setUsrHp(usrHp);
				usr.setUsrHp1(usrHp1);
				usr.setUsrHp2(usrHp2);

			} else if (usr.getUsrHp().length() == 11) {
				usrHp = usr.getUsrHp().substring(0, 3);
				usrHp1 = usr.getUsrHp().substring(3, 7);
				usrHp2 = usr.getUsrHp().substring(7, 11);
				usr.setUsrHp(usrHp);
				usr.setUsrHp1(usrHp1);
				usr.setUsrHp2(usrHp2);
			}
		}

		// 주소
		String addr1 = usr.getUsrAddr1();
		String usrAddr1 = addr1.substring(6, addr1.length());
		String zipCode1 = addr1.substring(0, 3);
		String zipCode2 = addr1.substring(3, 6);

		model.addAttribute("usrAddr1", usrAddr1);
		model.addAttribute("zipCode1", zipCode1);
		model.addAttribute("zipCode2", zipCode2);

		model.addAttribute("usr", usr);
		

		return "/philhoJSP/usrInfo";
	}

	@RequestMapping(value = "/usrUpdate", method = { RequestMethod.GET, RequestMethod.POST })
	public String usrUpdate(
			HttpServletRequest request, HttpServletResponse response, 
			Model model) throws Exception {


		HttpSession session = request.getSession();
		UsrDTO usr = (UsrDTO) session.getAttribute("usr");
		

		// 휴대폰
		String usrMobile = usr.getUsrMobile().substring(0, 3);
		String usrMobile1 = usr.getUsrMobile().substring(3, 7);
		String usrMobile2 = usr.getUsrMobile().substring(7, 11);
		usr.setUsrMobile(usrMobile);
		usr.setUsrMobile1(usrMobile1);
		usr.setUsrMobile2(usrMobile2);

		// 집전화
		String usrHp = usr.getUsrHp();
		String usrHp1 = usr.getUsrHp();
		String usrHp2 = usr.getUsrHp();

		if (usr.getUsrHp().substring(0, 2).equals("02")) {

			if (usr.getUsrHp().length() == 9) {
				usrHp = usr.getUsrHp().substring(0, 2);
				usrHp1 = usr.getUsrHp().substring(2, 5);
				usrHp2 = usr.getUsrHp().substring(5, 9);
				usr.setUsrHp(usrHp);
				usr.setUsrHp1(usrHp1);
				usr.setUsrHp2(usrHp2);

			} else if (usr.getUsrHp().length() == 10) {
				usrHp = usr.getUsrHp().substring(0, 2);
				usrHp1 = usr.getUsrHp().substring(2, 6);
				usrHp2 = usr.getUsrHp().substring(6, 10);
				usr.setUsrHp(usrHp);
				usr.setUsrHp1(usrHp1);
				usr.setUsrHp2(usrHp2);
			}

		} else {

			if (usr.getUsrHp().length() == 10) {
				usrHp = usr.getUsrHp().substring(0, 3);
				usrHp1 = usr.getUsrHp().substring(3, 6);
				usrHp2 = usr.getUsrHp().substring(6, 10);
				usr.setUsrHp(usrHp);
				usr.setUsrHp1(usrHp1);
				usr.setUsrHp2(usrHp2);

			} else if (usr.getUsrHp().length() == 11) {
				usrHp = usr.getUsrHp().substring(0, 3);
				usrHp1 = usr.getUsrHp().substring(3, 7);
				usrHp2 = usr.getUsrHp().substring(7, 11);
				usr.setUsrHp(usrHp);
				usr.setUsrHp1(usrHp1);
				usr.setUsrHp2(usrHp2);
			}
		}

		// 주소
		String addr1 = usr.getUsrAddr1();
		String usrAddr1 = addr1.substring(6, addr1.length());
		String zipCode1 = addr1.substring(0, 3);
		String zipCode2 = addr1.substring(3, 6);

		model.addAttribute("usrAddr1", usrAddr1);
		model.addAttribute("zipCode1", zipCode1);
		model.addAttribute("zipCode2", zipCode2);

		model.addAttribute("usr", usr);

		return "/philhoJSP/usrUpdate";
	}

	@RequestMapping(value = "/usrUpdateOk", method = { RequestMethod.GET, RequestMethod.POST })
	public String usrUpdateOk(
			HttpServletRequest request, HttpServletResponse response,
			@ModelAttribute UsrDTO usr,
			@RequestParam(value = "usrId") String usrId,
			@RequestParam(value = "usrPw") String usrPw,
			@RequestParam(value = "usrHp") String usrHp,
			@RequestParam(value = "usrHp1") String usrHp1,
			@RequestParam(value = "usrHp2") String usrHp2,
			@RequestParam(value = "usrMobile") String usrMobile,
			@RequestParam(value = "usrMobile1") String usrMobile1,
			@RequestParam(value = "usrMobile2") String usrMobile2,
			@RequestParam(value = "usrEmail") String usrEmail,
			@RequestParam(value = "usrAddr1") String usrAddr1,
			@RequestParam(value = "usrAddr2") String usrAddr2,
			@RequestParam(value = "zipcode1") String zipcode1,
			@RequestParam(value = "zipcode2") String zipcode2, Model model) throws Exception {
		
		usr.setUsrAddr1(zipcode1 + zipcode2 + usrAddr1);
		usr.setUsrMobile(usrMobile + usrMobile1 + usrMobile2);
		usr.setUsrHp(usrHp + usrHp1 + usrHp2);

		usrService.update(usr);

		return "redirect:/usrinfo?usrId=" + usr.getUsrId() + "&usrPw=" + usr.getUsrPw();
	}
}
