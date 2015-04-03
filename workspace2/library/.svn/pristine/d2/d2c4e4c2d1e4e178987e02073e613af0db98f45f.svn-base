package com.sun.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sun.dao.IBookSearchDAO;

import eyoon.eyoonDTO.BookDTO;
import eyoon.eyoonDTO.GenreDTO;
import eyoon.eyoonDTO.RentDTO;

@Service
@Transactional
public class BookSearchServiceImpl implements IBookSearchService {

	@Autowired
	IBookSearchDAO bookdao;

	@Override
	public List<GenreDTO> getgenre() {
		
		return bookdao.getgenre();
	}

	@Override
	public List<BookDTO> getbooklist(int page) {
		
		return bookdao.getbooklist(page);
	}

	@Override
	public BookDTO getone(int bookno) {
		
		return bookdao.getone(bookno);
	}

	@Override
	public List<BookDTO> getimglist() {
		
		return bookdao.getimglist();
	}

	@Override
	public List<BookDTO> getisbnlist(int bookno) {
		
		return bookdao.getisbnlist(bookno);
	}

	@Override
	public void updatereserve(RentDTO rentdto) {
		bookdao.updatereserve(rentdto);
		
	}

	@Override
	public int getCount(String genrecode) {
		
		return bookdao.getCount(genrecode);
	}

	@Override
	public List<BookDTO> genreList(int ipage,String genrecode) {
		
		return bookdao.getgenrelist(ipage,genrecode);
	}

	@Override
	public List<BookDTO> titlesearch(String search,int ipage) {
		
		return bookdao.titlesearch(search,ipage);
	}

	@Override
	public int getCount2(String search) {
		
		return bookdao.getCount2(search);
	}

	@Override
	public int getCount3(String search) {
		
		return bookdao.getCount3(search);
	}

	@Override
	public List<BookDTO> writersearch(String search, int ipage) {


		return bookdao.writersearch(search,ipage);
	}

	


	
}
