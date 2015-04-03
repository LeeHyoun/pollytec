package com.sun.dao;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sun.controller.NoticeController;
import com.sun.dto.NoticeParamDTO;

import eyoon.eyoonDTO.BookDTO;
import eyoon.eyoonDTO.GenreDTO;
import eyoon.eyoonDTO.RentDTO;

@Service
@Transactional
public class BookSearchDAOImpl implements IBookSearchDAO {

	@Autowired
	private SqlSession sqlSession;
	
	private static final String NS = "com.you.mybatis.BookSearch.";
	
	@Override
	public List<GenreDTO> getgenre() {
		List<GenreDTO> genrelist = sqlSession.selectList(NS + "getgenre");
		return genrelist;
	}

	@Override
	public List<BookDTO> getbooklist(int page) {
		int start = page * NoticeController.limit-NoticeController.limit + 1;
		int end = page * NoticeController.limit;
		NoticeParamDTO noticeparamdto = new NoticeParamDTO();
		noticeparamdto.setStart(start);
		noticeparamdto.setEnd(end);
		
		List<BookDTO> getbooklist = sqlSession.selectList(NS + "getbooklist",noticeparamdto);
		return getbooklist;
	}

	@Override
	public BookDTO getone(int bookno) {
		BookDTO bookdto = new BookDTO(); 
		bookdto = sqlSession.selectOne(NS + "getone", bookno);
		return bookdto;
	}

	@Override
	public List<BookDTO> getimglist() {
		List<BookDTO> getimglist = sqlSession.selectList(NS + "getimglist");
		return getimglist;
	}

	@Override
	public List<BookDTO> getisbnlist(int bookno) {
		List<BookDTO> getisbnlist = sqlSession.selectList(NS + "getisbnlist", bookno);
		
		return getisbnlist;
	}

	@Override
	public void updatereserve(RentDTO rentdto) {
		sqlSession.update(NS + "updatereserve", rentdto);
		
	}

	@Override
	public int getCount(String genrecode) {
		
		return sqlSession.selectOne(NS + "getgenrecount", genrecode);
	}

	@Override
	public List<BookDTO> getgenrelist(int ipage,String genrecode) {
		int start = ipage * NoticeController.limit-NoticeController.limit + 1;
		int end = ipage * NoticeController.limit;
		NoticeParamDTO noticeparamdto = new NoticeParamDTO();
		noticeparamdto.setStart(start);
		noticeparamdto.setEnd(end);
		noticeparamdto.setGenrecode(genrecode);
		
		List<BookDTO> getgenrelist = sqlSession.selectList(NS + "getgenrelist",noticeparamdto);
		return getgenrelist;
	}

	@Override
	public List<BookDTO> titlesearch(String search,int ipage) {
		int start = ipage * NoticeController.limit-NoticeController.limit + 1;
		int end = ipage * NoticeController.limit;
		NoticeParamDTO noticeparamdto = new NoticeParamDTO();
		noticeparamdto.setStart(start);
		noticeparamdto.setEnd(end);
		noticeparamdto.setTitle(search);
		
		List<BookDTO> gettitlelist = sqlSession.selectList(NS + "gettitlelist",noticeparamdto);
		return gettitlelist;
	}

	@Override
	public int getCount2(String search) {
		HashMap<String,String> map = new HashMap<String,String>();
		map.put("search", search);
		return sqlSession.selectOne(NS + "gettitlecount", map);
	}

	@Override
	public int getCount3(String search) {
		HashMap<String,String> map = new HashMap<String,String>();
		map.put("search", search);
		return sqlSession.selectOne(NS + "getwritercount", map);
	}

	@Override
	public List<BookDTO> writersearch(String search, int ipage) {
		int start = ipage * NoticeController.limit-NoticeController.limit + 1;
		int end = ipage * NoticeController.limit;
		NoticeParamDTO noticeparamdto = new NoticeParamDTO();
		noticeparamdto.setStart(start);
		noticeparamdto.setEnd(end);
		noticeparamdto.setWriter(search);
		
		List<BookDTO> getwriterlist = sqlSession.selectList(NS + "getwriterlist",noticeparamdto);
		return getwriterlist;
	}

	

}
