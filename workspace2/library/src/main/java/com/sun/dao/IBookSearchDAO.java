package com.sun.dao;

import java.util.List;

import eyoon.eyoonDTO.BookDTO;
import eyoon.eyoonDTO.GenreDTO;
import eyoon.eyoonDTO.RentDTO;

public interface IBookSearchDAO {

	List<GenreDTO> getgenre();

	List<BookDTO> getbooklist(int page);

	BookDTO getone(int bookno);

	List<BookDTO> getimglist();

	List<BookDTO> getisbnlist(int bookno);

	void updatereserve(RentDTO rentdto);

	int getCount(String genrecode);

	List<BookDTO> getgenrelist(int ipage, String genrecode);

	List<BookDTO> titlesearch(String search,int ipage);

	int getCount2(String search);

	int getCount3(String search);

	List<BookDTO> writersearch(String search, int ipage);

	

}
