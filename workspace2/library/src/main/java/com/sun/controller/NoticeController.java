package com.sun.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import baedo.baedoDTO.ManagerDTO;

import com.sun.dto.NoticeDTO;
import com.sun.service.INoticeService;


@Controller
public class NoticeController {

	@Autowired
	INoticeService noticeservice;
	
	public static final int limit=5;
	public static final int block=5;

	//관리자메인화면(공지사항리스트불러오기)
	@RequestMapping(value="/managerMain", method={RequestMethod.GET})
	public String noticeList(@RequestParam(value="page",defaultValue="1",required=false) int ipage,HttpServletRequest request,Model model) throws Exception{
		
		int totalcount = noticeservice.getCount();
		
		int end = ipage * limit;
		int start = end - (limit-1);
	
		if(end > totalcount){
			end = totalcount;
		}
		int totalpage = totalcount / limit + (totalcount % limit > 0 ? 1 : 0);
		if(ipage > totalpage){
			ipage = totalpage;
		}
		
		int groupno = ipage / block + (ipage % block > 0 ? 1:0);
		int gend = groupno * block;
		int gstart = gend - (block-1);

		if(gend > totalpage) {
			gend = totalpage;
		}
		
		int prevpageno = gstart - block;
		int nextpageno = gstart + block;
		if(prevpageno < 1) {
			prevpageno = 1;
		}
		
		if(nextpageno > totalpage) {
			nextpageno = totalpage;
		}
		
		List<NoticeDTO> noticeList = noticeservice.noticeList(ipage);//공지사항 리스트 가져오기
		
		model.addAttribute("noticeList", noticeList);
		model.addAttribute("ipage", ipage);
		model.addAttribute("gend", gend);
		model.addAttribute("gstart", gstart);
		model.addAttribute("prevpageno", prevpageno);
		model.addAttribute("nextpageno", nextpageno);
		model.addAttribute("totalpage", totalpage);
		
		return "/sun/managerMain";
	}
	
	//공지사항 글 한 개 보기
	@RequestMapping(value="/read",method={RequestMethod.GET})
	public String read(@RequestParam(value="noticeseq") String noticeseq,Model model) throws Exception{
		NoticeDTO noticedto = noticeservice.getOne(noticeseq);
		model.addAttribute("noticedto", noticedto);
		
		return "/sun/read";
	}
	
	//공지사항 글 업데이트화면
	@RequestMapping(value="/updateform",method={RequestMethod.GET})
	public String updateform(@RequestParam(value="noticeseq") String noticeseq,Model model) throws Exception{
		NoticeDTO noticedto = new NoticeDTO();
		noticedto = noticeservice.getOne(noticeseq);
		model.addAttribute("noticedto", noticedto);
			
		return "/sun/updateForm";
	}
	
	//공지사항 업데이트
	@RequestMapping(value="/update",method={RequestMethod.POST})
	public String update(@ModelAttribute NoticeDTO noticedto,@RequestParam(value="noticeseq") String noticeseq,Model model) throws Exception{
		noticeservice.update(noticedto);
	
		return "redirect:read?noticeseq=" + noticeseq;
	}
	

	//공지사항 글쓰기 폼
	@RequestMapping(value="/writeform",method={RequestMethod.GET})
	public String writeform(Model model,HttpServletRequest request) throws Exception{
		HttpSession session = request.getSession();
		ManagerDTO mgrdto = (ManagerDTO) session.getAttribute("manager");
		model.addAttribute("mgrdto", mgrdto);
		return "/sun/writeForm";
	}
	
	//공지사항 글쓰기
	@RequestMapping(value="/noticewrite",method={RequestMethod.POST})
	public String write(@ModelAttribute NoticeDTO noticedto,@RequestParam(value="mgrid") String mgrid,@RequestParam(value="mgrname") String mgrname,HttpServletRequest request) throws Exception{
		
		noticedto.setMgrid(mgrid);
		noticedto.setMgrname(mgrname);
	
		noticeservice.write(noticedto);
		return "redirect:read?noticeseq="+noticedto.getNoticeseq();
	}
	
	//공지사항 글 삭제
	@RequestMapping(value="/noticedelete",method={RequestMethod.GET})
	public String delete(@RequestParam(value="noticeseq") String noticeseq,Model model) throws Exception{
		noticeservice.delete(noticeseq);
	
		return "redirect:managerMain";
	}
	
}
