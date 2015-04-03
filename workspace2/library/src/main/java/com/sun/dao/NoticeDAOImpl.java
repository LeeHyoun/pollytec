package com.sun.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sun.controller.NoticeController;
import com.sun.dto.NoticeDTO;
import com.sun.dto.NoticeParamDTO;

@Repository
public class NoticeDAOImpl implements INoticeDAO {

	@Autowired
	private SqlSession sqlSession;
	
	private static final String NS = "com.you.mybatis.Notice.";
	
	
	@Override
	public List<NoticeDTO> noticeList(int page) {
		int start = page * NoticeController.limit-NoticeController.limit + 1;
		int end = page * NoticeController.limit;
		NoticeParamDTO noticeparamdto = new NoticeParamDTO();
		noticeparamdto.setStart(start);
		noticeparamdto.setEnd(end);
		List<NoticeDTO> noticeList = sqlSession.selectList(NS + "noticeList", noticeparamdto);
		return noticeList;
	}

	@Override
	public int getCount() {
		int count = sqlSession.selectOne(NS + "getCount");
		return count;
	}

	@Override
	public NoticeDTO getOne(String noticeseq) {
		NoticeDTO noticedto = new NoticeDTO();
		noticedto = sqlSession.selectOne(NS + "getOne", noticeseq);
		return noticedto;
	}

	@Override
	public void update(NoticeDTO noticedto) {
		sqlSession.update(NS + "update", noticedto);
	}

	@Override
	public void write(NoticeDTO noticedto) {
		sqlSession.insert(NS + "write", noticedto);
	}

	@Override
	public void delete(String noticeseq) {
		sqlSession.update(NS + "delete", noticeseq);
	}

}
