package eyoon.eyoonService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import eyoon.eyoonDAO.BookDAO;
import eyoon.eyoonDTO.BookDTO;
import eyoon.eyoonDTO.BookPageDTO;
import eyoon.eyoonDTO.RentDTO;

@Service
@Transactional
public class BookServiceImpl implements BookService {
	@Autowired
	BookDAO bookDAO;

	@Override
	@Transactional(readOnly=true)
	public int selectCount() {
		int count = bookDAO.selectCount();
		return count;
	}
	
	@Override
	@Transactional(readOnly=true)
	public List<BookDTO> selectList(int ipage, BookPageDTO  bookPageDTO) {
		return bookDAO.selectList(ipage, bookPageDTO);
	}

	@Override
	public BookDTO addBook(BookDTO bookDTO){
		return bookDAO.addBook(bookDTO);
	}

	@Override
	public BookDTO readBook(BookDTO bookDTO){
		return bookDAO.readBook(bookDTO);
	}

	@Override
	public void updateBook(BookDTO bookDTO) {
		bookDAO.updateBook(bookDTO);
	}

	@Override
	public void deleteBook(BookDTO bookDTO) {
		bookDAO.deleteBook(bookDTO);		
	}

	@Override
	public List<RentDTO> selectName(RentDTO bookDTO) {
		return bookDAO.selectName(bookDTO);
	
	}

	@Override
	public BookDTO getBook(BookDTO bookDTO) {
		
		return bookDAO.getBook(bookDTO);
	}	
}
