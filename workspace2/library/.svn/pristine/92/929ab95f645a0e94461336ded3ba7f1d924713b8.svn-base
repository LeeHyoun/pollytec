package sinsung.sinsungController;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import sinsung.sinsungDTO.MgrUsrDTO;
import sinsung.sinsungDTO.MgrUsrStDTO;
import sinsung.sinsungDTO.StConditionDTO;
import sinsung.sinsungDTO.UsrRentDueDTO;
import sinsung.sinsungService.MgrUsrService;
import sinsung.sinsungService.MgrUsrStService;

@Controller
public class MgrUsrController {
	@Autowired
	MgrUsrService mgrUsrService;
	
	@Autowired
	MgrUsrStService mgrUsrStService;
	
	@RequestMapping(value="/usrupdate", method={RequestMethod.POST})
	public String MgrUsrUpdate(@ModelAttribute MgrUsrDTO usrDTO,
			@RequestParam(value="usrMobile1") String usrMobile1,
			@RequestParam(value="usrMobile2") String usrMobile2,
			@RequestParam(value="usrMobile3") String usrMobile3,
			@RequestParam(value="usrHp1") String usrHp1,
			@RequestParam(value="usrHp2") String usrHp2,
			@RequestParam(value="usrHp3") String usrHp3,
			@RequestParam(value="zipcode1") String zipcode1,
			@RequestParam(value="zipcode2") String zipcode2,
			@RequestParam(value="usrAddr") String usrAddr,
			Model model) throws Exception{
		
		usrDTO.setUsrMobile(usrMobile1 + usrMobile2 + usrMobile3);
		usrDTO.setUsrHp(usrHp1 + usrHp2 + usrHp3);
		usrDTO.setUsrAddr1(zipcode1 + zipcode2 + usrAddr);
		
		mgrUsrService.updateUsr(usrDTO);
		
		return "redirect:mgrUsrList";
	}

	@RequestMapping(value="/mgrusrupdate", method={RequestMethod.GET})
	public String MgrUsrUpdateForm (@RequestParam(value="usrId") String usrId, Model model) throws Exception{
		MgrUsrDTO usrDTO = mgrUsrService.getUsr(usrId);
		String usrMobile1 = usrDTO.getUsrMobile().substring(0, 3);
		String usrMobile2 = usrDTO.getUsrMobile().substring(3, 7);
		String usrMobile3 = usrDTO.getUsrMobile().substring(7, 11);
		usrDTO.setUsrMobile1(usrMobile1);
		usrDTO.setUsrMobile2(usrMobile2);
		usrDTO.setUsrMobile3(usrMobile3);
		
		String usrHp1 = null;
		String usrHp2 = null;
		String usrHp3 = null;
		
		if(usrDTO.getUsrHp().substring(0,2).equals("02")){
			
			if(usrDTO.getUsrHp().length() == 9){
				usrHp1 = usrDTO.getUsrHp().substring(0,2);
				usrHp2 = usrDTO.getUsrHp().substring(2,5);
				usrHp3 = usrDTO.getUsrHp().substring(5,9);
				usrDTO.setUsrHp1(usrHp1);
				usrDTO.setUsrHp2(usrHp2);
				usrDTO.setUsrHp3(usrHp3);
			}else if(usrDTO.getUsrHp().length() == 10){
				usrHp1 = usrDTO.getUsrHp().substring(0,2);
				usrHp2 = usrDTO.getUsrHp().substring(2,6);
				usrHp3 = usrDTO.getUsrHp().substring(6,10);
				usrDTO.setUsrHp1(usrHp1);
				usrDTO.setUsrHp2(usrHp2);
				usrDTO.setUsrHp3(usrHp3);
			}
			
		}else{
			if(usrDTO.getUsrHp().length() == 10){
				usrHp1 = usrDTO.getUsrHp().substring(0,3);
				usrHp2 = usrDTO.getUsrHp().substring(3,6);
				usrHp3 = usrDTO.getUsrHp().substring(6,10);
				usrDTO.setUsrHp1(usrHp1);
				usrDTO.setUsrHp2(usrHp2);
				usrDTO.setUsrHp3(usrHp3);
			}else if(usrDTO.getUsrHp().length() == 11){
				usrHp1 = usrDTO.getUsrHp().substring(0,3);
				usrHp2 = usrDTO.getUsrHp().substring(3,7);
				usrHp3 = usrDTO.getUsrHp().substring(7,11);
				usrDTO.setUsrHp1(usrHp1);
				usrDTO.setUsrHp2(usrHp2);
				usrDTO.setUsrHp3(usrHp3);
			}
		}
		String zipCode1;
		String zipCode2;
		String usrAddr;
		int strlen =  usrDTO.getUsrAddr1().length();
		zipCode1 = usrDTO.getUsrAddr1().substring(0,3);
		zipCode2 = usrDTO.getUsrAddr1().substring(3,6);
		usrAddr =usrDTO.getUsrAddr1().substring(6,strlen);
		
		model.addAttribute("usr", usrDTO);
		model.addAttribute("zipCode1", zipCode1);
		model.addAttribute("zipCode2", zipCode2);
		model.addAttribute("usrAddr", usrAddr);
		return "/sinsungJSP/mgrusrupdateform";
	}
	
	@RequestMapping(value="/mgrUsrSearch", method={RequestMethod.GET})
	public String MgrUsrSearch (HttpServletRequest request, Model model) throws Exception{
		String condition = request.getParameter("searchCondition");
		String word = request.getParameter("searchWord");
		List<MgrUsrDTO> usrList = null;
		if(condition.equals("ID") ){
			usrList = mgrUsrService.getUsrId(word);
		}else if(condition.equals("name")){
			usrList = mgrUsrService.getUsrName(word);
		}
		model.addAttribute("usrlist", usrList);
		return "/sinsungJSP/mgrUsrList";
	}
		
	@RequestMapping(value="/mgrUsrList", method={RequestMethod.GET})
	public String MgrUsrList (@RequestParam( value="pg", required=false, defaultValue="1")int ipg, Model model) throws Exception{
		int count = mgrUsrService.getCount();
		int pageCount = count / 10;
		if((count%10) != 0)
			pageCount++;
		
		if(ipg <1){
			ipg=1;
		}else if(ipg > pageCount){
			ipg = pageCount;
		}
		
		
		
		List<MgrUsrDTO> usrList = mgrUsrService.UsrList(ipg);
		model.addAttribute("usrlist", usrList);
		model.addAttribute("ipg", ipg);
		model.addAttribute("pageCount", pageCount);
		//System.out.println(usrList);
		return "/sinsungJSP/mgrUsrList";
		
	}
	
	@RequestMapping(value="/mgrUsrStList", method={RequestMethod.GET})
	public String MgrUsrStList (@RequestParam( value="pg", required=false, defaultValue="1")int ipg, Model model) throws Exception{
		
		int count = mgrUsrStService.getCount();
		int pageCount = count / 10;
		if((count%10) != 0)
			pageCount++;
		
		if(ipg <1){
			ipg=1;
		}else if(ipg > pageCount){
			ipg = pageCount;
		}
		
		List<MgrUsrStDTO> mgrUsrStList = mgrUsrStService.UsrStList(ipg);
		model.addAttribute("usrlist", mgrUsrStList);
		model.addAttribute("ipg", ipg);
		model.addAttribute("pageCount", pageCount);
		return "/sinsungJSP/mgrUsrStList";
	}
	
	@RequestMapping(value="/searchStList", method={RequestMethod.POST})
	public String SearchStList(@RequestParam( value="pg", required=false, defaultValue="1")int ipg, 
			@RequestParam(value="condition", required=false, defaultValue="rent") String firstCondition,
			@RequestParam(value="sort", required=false, defaultValue="desc") String secondCondition,
			@RequestParam(value="rank", required=false, defaultValue="11") String rank,
			@RequestParam(value="searchCondition", required=false, defaultValue="") String searchCondition,
			@RequestParam(value="searchContent", required=false, defaultValue="") String searchContent,
			Model model) throws Exception{
		
		StConditionDTO stconDTO = new StConditionDTO();
		stconDTO.setFirstCondition(firstCondition);
		stconDTO.setRank(rank);
		stconDTO.setSearchCondition(searchCondition);
		stconDTO.setSearchContent(searchContent);
		stconDTO.setSecondCondition(secondCondition);
		
		int count = mgrUsrService.getCount();
		int pageCount = count / 10;
		if((count%10) != 0)
			pageCount++;
		
		List<MgrUsrStDTO> mgrUsrStList = null;
		if(stconDTO.getFirstCondition().equals("search")){
			mgrUsrStList = mgrUsrStService.WordStList(stconDTO);
		}else{
			mgrUsrStList = mgrUsrStService.SortStList(stconDTO, ipg);
		}
		System.out.println(ipg);
		model.addAttribute("usrlist", mgrUsrStList);
		model.addAttribute("sc", stconDTO);
		model.addAttribute("ipg", ipg);
		model.addAttribute("pageCount", pageCount);
		
		return "/sinsungJSP/mgrUsrStList";
	}
	@RequestMapping(value="/searchStListPage", method={RequestMethod.GET})
	public String SearchStListPage(@RequestParam( value="pg", required=false, defaultValue="1")int ipg, 
			@RequestParam(value="condition", required=false, defaultValue="rent") String firstCondition,
			@RequestParam(value="sort", required=false, defaultValue="desc") String secondCondition,
			@RequestParam(value="rank", required=false, defaultValue="10") String rank,
			@RequestParam(value="searchCondition", required=false, defaultValue="") String searchCondition,
			@RequestParam(value="searchContent", required=false, defaultValue="") String searchContent,
			Model model) throws Exception{
		
		StConditionDTO stconDTO = new StConditionDTO();
		stconDTO.setFirstCondition(firstCondition);
		stconDTO.setRank(rank);
		stconDTO.setSearchCondition(searchCondition);
		stconDTO.setSearchContent(searchContent);
		stconDTO.setSecondCondition(secondCondition);
		
		System.out.println(stconDTO);
		System.out.println(ipg);
		int count = mgrUsrService.getCount();
		int pageCount = count / 10;
		if((count%10) != 0)
			pageCount++;
		
		List<MgrUsrStDTO> mgrUsrStList = null;
		if(stconDTO.getFirstCondition().equals("search")){
			mgrUsrStList = mgrUsrStService.WordStList(stconDTO);
		}else{
			mgrUsrStList = mgrUsrStService.SortStList(stconDTO, ipg);
		}
		
		model.addAttribute("usrlist", mgrUsrStList);
		model.addAttribute("sc", stconDTO);
		model.addAttribute("ipg", ipg);
		model.addAttribute("pageCount", pageCount);
		
		return "/sinsungJSP/mgrUsrStList";
	}
	
	
	
	@RequestMapping(value="/mgrUsrStInfo", method={RequestMethod.GET})
	public String MgrUsrStForm (@RequestParam(value="usrId") String usrId, Model model) throws Exception{
		List<UsrRentDueDTO> rent5List = mgrUsrStService.UsrRent5List(usrId);
		model.addAttribute("rentlist", rent5List);
		MgrUsrDTO usrDTO = mgrUsrService.getUsr(usrId);
		model.addAttribute("usr", usrDTO);
		MgrUsrStDTO usrSt = mgrUsrStService.UsrSt(usrId);
		model.addAttribute("usrSt", usrSt);
		
		List<UsrRentDueDTO> due5List = mgrUsrStService.UsrDue5List(usrId);
		model.addAttribute("duelist", due5List);
		
		List<UsrRentDueDTO> overdue5List = mgrUsrStService.UsrOverDue5List(usrId);
		model.addAttribute("overduelist", overdue5List);
		
		List<UsrRentDueDTO> harm5List = mgrUsrStService.UsrHarm5List(usrId);
		model.addAttribute("harmlist", harm5List);
		
		List<UsrRentDueDTO> miss5List = mgrUsrStService.UsrMiss5List(usrId);
		model.addAttribute("misslist", miss5List);
	
		
		
		return "/sinsungJSP/mgrUsrStInfo";
	}
	
	@RequestMapping(value="/usrRentInfo", method={RequestMethod.GET})
	public String UsrRentInfo (@RequestParam(value="usrId") String usrId, Model model) throws Exception{
		//System.out.println(usrId);
		List<UsrRentDueDTO> rentList = mgrUsrStService.UsrRentList(usrId);
		model.addAttribute("rentlist", rentList);
		MgrUsrDTO usrDTO = mgrUsrService.getUsr(usrId);
		model.addAttribute("usr", usrDTO);
		
		MgrUsrStDTO usrSt = mgrUsrStService.UsrSt(usrId);
		model.addAttribute("usrSt", usrSt);
		return "/sinsungJSP/usrRentInfo";
	}

	@RequestMapping(value="/usrDueInfo", method={RequestMethod.GET})
	public String UsrDuetInfo (@RequestParam(value="usrId") String usrId, Model model) throws Exception{
		List<UsrRentDueDTO> dueList = mgrUsrStService.UsrDueList(usrId);
		model.addAttribute("duelist", dueList);
		
		MgrUsrDTO usrDTO = mgrUsrService.getUsr(usrId);
		model.addAttribute("usr", usrDTO);
		MgrUsrStDTO usrSt = mgrUsrStService.UsrSt(usrId);
		model.addAttribute("usrSt", usrSt);
		
		return "/sinsungJSP/usrDueInfo";
	}
	@RequestMapping(value="/usrOverDueInfo", method={RequestMethod.GET})
	public String UsrOverDueInfo (@RequestParam(value="usrId") String usrId, Model model) throws Exception{
		List<UsrRentDueDTO> overdueList = mgrUsrStService.UsrOverDueList(usrId);
		model.addAttribute("overduelist", overdueList);
		
		MgrUsrDTO usrDTO = mgrUsrService.getUsr(usrId);
		model.addAttribute("usr", usrDTO);
		MgrUsrStDTO usrSt = mgrUsrStService.UsrSt(usrId);
		model.addAttribute("usrSt", usrSt);
		
		return "/sinsungJSP/usrOverDueInfo";
	}
	
	@RequestMapping(value="/usrHarmInfo", method={RequestMethod.GET})
	public String UsrHarmInfo (@RequestParam(value="usrId") String usrId, Model model) throws Exception{
		List<UsrRentDueDTO> harmList = mgrUsrStService.UsrHarmList(usrId);
		model.addAttribute("harmlist", harmList);
		
		MgrUsrDTO usrDTO = mgrUsrService.getUsr(usrId);
		model.addAttribute("usr", usrDTO);
		MgrUsrStDTO usrSt = mgrUsrStService.UsrSt(usrId);
		model.addAttribute("usrSt", usrSt);
		return "/sinsungJSP/usrHarmInfo";
	}
	
	@RequestMapping(value="/usrMissInfo", method={RequestMethod.GET})
	public String UsrMissInfo (@RequestParam(value="usrId") String usrId, Model model) throws Exception{
		
		List<UsrRentDueDTO> missList = mgrUsrStService.UsrMissList(usrId);
		model.addAttribute("misslist", missList);
		
		MgrUsrDTO usrDTO = mgrUsrService.getUsr(usrId);
		model.addAttribute("usr", usrDTO);
		MgrUsrStDTO usrSt = mgrUsrStService.UsrSt(usrId);
		model.addAttribute("usrSt", usrSt);
		
		
			return "/sinsungJSP/usrMissInfo";
	}
	
	@RequestMapping(value="/usrNotReturnInfo", method={RequestMethod.GET})
	public String UsrNotReturnInfo (@RequestParam(value="usrId") String usrId, Model model) throws Exception{
		
		List<UsrRentDueDTO> notreturnList = mgrUsrStService.UsrNotReturnList(usrId);
		model.addAttribute("notreturnlist", notreturnList);
		
		MgrUsrDTO usrDTO = mgrUsrService.getUsr(usrId);
		model.addAttribute("usr", usrDTO);
		MgrUsrStDTO usrSt = mgrUsrStService.UsrSt(usrId);
		model.addAttribute("usrSt", usrSt);
		
		return "/sinsungJSP/usrNotReturnInfo";
	}
	
}
