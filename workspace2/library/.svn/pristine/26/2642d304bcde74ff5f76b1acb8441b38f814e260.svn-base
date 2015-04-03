package baedo.baedoController;

import java.io.PrintWriter;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import baedo.baedoDTO.ManagerDTO;
import baedo.baedoService.ManagerService;




@Controller
public class MgrController {
	@Autowired
	ManagerService managerService;
	
	@RequestMapping(value="/mgradd", method={RequestMethod.GET})
	   public String mgradd(Model model) throws Exception{
	      return "/baedoJSP/mgradd";
	}
	
	
	@RequestMapping(value="/mgr", method={RequestMethod.GET, RequestMethod.POST})
	public String list(HttpServletRequest request, @RequestParam(value="pg", required=false, defaultValue="1")int ipg, 
			Model model) throws Exception{
		HttpSession session = request.getSession();
		ManagerDTO manager = (ManagerDTO)session.getAttribute("manager");
		System.out.println(manager.getMgr_id());
		if(!manager.getMgr_id().equals("jae1234")){
			return "redirect:authority";
		}else{
		
		int count = managerService.getCount();
		List<ManagerDTO> list = managerService.getList(ipg);
		
		int pageCount = count / 5;
		if((count%5) != 0)
			pageCount++;
		
		model.addAttribute("list", list);
		model.addAttribute("count", count);
		model.addAttribute("ipg", ipg);
		model.addAttribute("pageCount", pageCount);
		
		return "/baedoJSP/Mgr";
		}
	}
	
	@RequestMapping(value="/authority", method={RequestMethod.GET})
	   public String authority(Model model) throws Exception{
	      return "/sun/authority";
	}
	
	@RequestMapping(value="/mspart", method={RequestMethod.GET, RequestMethod.POST})
	public String mslist(@RequestParam(value="pg", required=false, defaultValue="1")int ipg, 
			Model model) throws Exception{

		int count = managerService.getMsCount();
		List<ManagerDTO> list = managerService.getmsList(ipg);
		
		int pageCount = count / 5;
		if((count%5) != 0)
			pageCount++;
		
		model.addAttribute("list", list);
		model.addAttribute("count", count);
		model.addAttribute("ipg", ipg);
		model.addAttribute("pageCount", pageCount);
		
		return "/baedoJSP/mspart";
	}
	
	@RequestMapping(value="/fmpart", method={RequestMethod.GET, RequestMethod.POST})
	public String fmlist(@RequestParam(value="pg", required=false, defaultValue="1")int ipg, 
			Model model) throws Exception{

		int count = managerService.getFmCount();
		List<ManagerDTO> list = managerService.getfmList(ipg);
		
		int pageCount = count / 5;
		if((count%5) != 0)
			pageCount++;
		
		model.addAttribute("list", list);
		model.addAttribute("count", count);
		model.addAttribute("ipg", ipg);
		model.addAttribute("pageCount", pageCount);
		
		return "/baedoJSP/fmpart";
	}
	
	@RequestMapping(value="/etcpart", method={RequestMethod.GET, RequestMethod.POST})
	public String etclist(@RequestParam(value="pg", required=false, defaultValue="1")int ipg, 
			Model model) throws Exception{

		int count = managerService.getEtcCount();
		List<ManagerDTO> list = managerService.getetcList(ipg);
		
		int pageCount = count / 5;
		if((count%5) != 0)
			pageCount++;
		
		model.addAttribute("list", list);
		model.addAttribute("count", count);
		model.addAttribute("ipg", ipg);
		model.addAttribute("pageCount", pageCount);
		
		return "/baedoJSP/etcpart";
	}
	
	
	@RequestMapping(value="/qcpart", method={RequestMethod.GET, RequestMethod.POST})
	public String qclist(@RequestParam(value="pg", required=false, defaultValue="1")int ipg, 
			Model model) throws Exception{

		int count = managerService.getQcCount();
		List<ManagerDTO> list = managerService.getqcList(ipg);
		System.out.println(count);
		int pageCount = count / 5;
		if((count%5) != 0)
			pageCount++;
		
		
		
		model.addAttribute("list", list);
		model.addAttribute("count", count);
		model.addAttribute("ipg", ipg);
		model.addAttribute("pageCount", pageCount);
		
		return "/baedoJSP/qcpart";
	}
	
	@RequestMapping(value = "/idcheck", method = { RequestMethod.GET})
	public void idcheck(
			@RequestParam(value="id") String checkid,HttpServletResponse response, 
			Model model) throws Exception{
		
		PrintWriter out = response.getWriter();
		int count = managerService.getId(checkid);
		out.print(count);
	
	
	}
	
	@RequestMapping(value = "/mgradd", method = { RequestMethod.POST })
	public String mgradd(@ModelAttribute  ManagerDTO manager, 
			             HttpServletRequest request, BindingResult bindingResult, Model model) throws Exception {
		
		String mgrname=request.getParameter("mgrname");
		String deptno=request.getParameter("deptno");
		String mgrbirth=request.getParameter("mgrbirth");
		String mgrid=request.getParameter("mgrid");
		String mgrpw=request.getParameter("mgrpw");
		String mgremail=request.getParameter("mgremail");
		String ranknum=request.getParameter("ranknum");
		String mgradd2=request.getParameter("mgradd2");
		String mgrdate=request.getParameter("mgrdate");
		String mgrsal=request.getParameter("mgrsal");
		String mgrlicens=request.getParameter("mgrlicens");
		String mgrcereer=request.getParameter("mgrcereer");
		String mgrgender=request.getParameter("mgrgender");
		
		String mgrmobile=request.getParameter("mgrmobile");
		String mgrmobile2=request.getParameter("mgrmobile1");
		String mgrmobile3=request.getParameter("mgrmobile2");
		mgrmobile = mgrmobile + mgrmobile2 + mgrmobile3;
		
		String mgrhp=request.getParameter("mgrhp");
		String mgrhp1=request.getParameter("mgrhp1");
		String mgrhp2=request.getParameter("mgrhp2");
		mgrhp = mgrhp + mgrhp1 + mgrhp2;
		
		String zipcode=request.getParameter("zipcode1");
		String zipcode1=request.getParameter("zipcode2");
		String mgradd1=request.getParameter("mgradd1");
		zipcode = zipcode + zipcode1 + mgradd1 ;
		
		manager.setMgr_name(mgrname);
		manager.setDept_no(deptno);
		manager.setMgr_birth(mgrbirth);
		manager.setMgr_id(mgrid);
		manager.setMgr_pw(mgrpw);
		manager.setMgr_email(mgremail);
		manager.setRank_num(ranknum);
		manager.setMgr_addr2(mgradd2);
		manager.setMgr_date(mgrdate);
		manager.setMgr_sal(mgrsal);
		manager.setMgr_license(mgrlicens);
		manager.setMgr_career(mgrcereer);
		manager.setMgr_gender(mgrgender);
		manager.setMgr_addr1(zipcode);
		manager.setMgr_mobile(mgrmobile);
		manager.setMgr_hp(mgrhp);
		
		System.out.println(zipcode);
		model.addAttribute("Manager", manager);
		managerService.addManager(manager);
		System.out.println(manager);

		return "redirect:mgr";

	}
	
	@RequestMapping(value="/namesearch", method={RequestMethod.GET, RequestMethod.POST})
	public String search(@RequestParam(value="name",  required=false)
			String name, Model model)
			 throws Exception{
		
		
		
		List<ManagerDTO> list = managerService.getSearchList(name);
		
		int count = managerService.getCount();
		int pageCount = count / 5;
		if((count%5) != 0)
			pageCount++;
		
		model.addAttribute("list", list);
		model.addAttribute("count", count);
		model.addAttribute("pageCount", pageCount);
		return "/baedoJSP/namesearch";
		
	}
	
	
	@RequestMapping(value = "/modify", method = { RequestMethod.GET, RequestMethod.POST})
	public String modify(@RequestParam(value="id", required=false)String id, Model model) throws Exception {
	
		
		ManagerDTO manager = managerService.getManager(id);
		
		String mobile = manager.getMgr_mobile();
		String mgrmobile1 = mobile.substring(0,3);
		String mgrmobile2 = mobile.substring(3,7);
		String mgrmobile3 = mobile.substring(7,11);
		
		String hp = manager.getMgr_hp();
		String mgrhp1 = hp.substring(0,3);
		String mgrhp2 = hp.substring(3,7);
		String mgrhp3 = hp.substring(7,11);
		
		String zipcode = manager.getMgr_addr1();
		
		String zipcode1 = zipcode.substring(0,3);
		String zipcode2 = zipcode.substring(3,6);
		String addr1 = zipcode.substring(7);

		
		model.addAttribute("mgrmobile1", mgrmobile1);
		model.addAttribute("mgrmobile2", mgrmobile2);
		model.addAttribute("mgrmobile3", mgrmobile3);
		model.addAttribute("zipcode1", zipcode1);
		model.addAttribute("zipcode2", zipcode2);
		model.addAttribute("addr1", addr1);
		model.addAttribute("mgrhp1", mgrhp1);
		model.addAttribute("mgrhp2", mgrhp2);
		model.addAttribute("mgrhp3", mgrhp3);
		
		model.addAttribute("manager", manager);
		
		return "/baedoJSP/modify";
	}
	
	
	
	
	@RequestMapping(value = "/getmodify", method = { RequestMethod.GET, RequestMethod.POST})
	public String getmodify(@RequestParam(value="id", required=false)String id, Model model, ManagerDTO manager , HttpServletRequest request) throws Exception {
	
		
		String mgrname=request.getParameter("mgrname");
		String deptno=request.getParameter("deptno");
		String mgrbirth=request.getParameter("mgrbirth");
		String mgrid=request.getParameter("mgrid");
		String mgrpw=request.getParameter("mgrpw");
		String mgremail=request.getParameter("mgremail");
		String ranknum=request.getParameter("ranknum");
		String mgradd2=request.getParameter("mgradd2");
		String mgrdate=request.getParameter("mgrdate");
		String mgrsal=request.getParameter("mgrsal");
		String mgrlicens=request.getParameter("mgrlicens");
		String mgrcereer=request.getParameter("mgrcereer");
		String mgrgender=request.getParameter("mgrgender");
		
		String mgrmobile=request.getParameter("mgrmobile");
		String mgrmobile2=request.getParameter("mgrmobile1");
		String mgrmobile3=request.getParameter("mgrmobile2");
		mgrmobile = mgrmobile + mgrmobile2 + mgrmobile3;
		
		String mgrhp=request.getParameter("mgrhp");
		String mgrhp1=request.getParameter("mgrhp1");
		String mgrhp2=request.getParameter("mgrhp2");
		mgrhp = mgrhp + mgrhp1 + mgrhp2;
		
		String zipcode=request.getParameter("zipcode1");
		String zipcode1=request.getParameter("zipcode2");
		String mgradd1=request.getParameter("mgradd1");
		zipcode = zipcode + zipcode1 + mgradd1 ;
		
		manager.setMgr_name(mgrname);
		manager.setDept_no(deptno);
		manager.setMgr_birth(mgrbirth);
		manager.setMgr_id(mgrid);
		manager.setMgr_pw(mgrpw);
		manager.setMgr_email(mgremail);
		manager.setRank_num(ranknum);
		manager.setMgr_addr2(mgradd2);
		manager.setMgr_date(mgrdate);
		manager.setMgr_sal(mgrsal);
		manager.setMgr_license(mgrlicens);
		manager.setMgr_career(mgrcereer);
		manager.setMgr_gender(mgrgender);
		manager.setMgr_addr1(zipcode);
		manager.setMgr_mobile(mgrmobile);
		manager.setMgr_hp(mgrhp);
		
		managerService.getModify(manager);
		System.out.println(manager.getDept_no());
		model.addAttribute("manager", manager);
		
		return "redirect:mgr";

	}
	

	
	@RequestMapping(value = "/delete", method = { RequestMethod.GET, RequestMethod.POST})
	public String delete(@RequestParam(value="mgrid", required=false)String id) throws Exception {
		System.out.println(id);
		managerService.deleteManager(id);
		
		return "/baedoJSP/Mgr";
	}
}
