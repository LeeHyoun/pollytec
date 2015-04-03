package com.sun.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sun.dao.INoticeDAO;
import com.sun.dto.NoticeDTO;

@Service
@Transactional
public class NoticeServiceImpl implements INoticeService {

	@Autowired
	INoticeDAO noticedao;
	
	@Override
	@Transactional(readOnly=true)
	public List<NoticeDTO> noticeList(int page) {
		
		return noticedao.noticeList(page);
	}

	@Override
	public int getCount() {
		
		return noticedao.getCount();
	}

	@Override
	public NoticeDTO getOne(String noticeseq) {
		
		return noticedao.getOne(noticeseq);
	}

	@Override
	public void update(NoticeDTO noticedto) {
		
		noticedao.update(noticedto);
	}

	@Override
	public void write(NoticeDTO noticedto) {
		
		noticedao.write(noticedto);
	}

	@Override
	public void delete(String noticeseq) {
		
		noticedao.delete(noticeseq);
	}

}
