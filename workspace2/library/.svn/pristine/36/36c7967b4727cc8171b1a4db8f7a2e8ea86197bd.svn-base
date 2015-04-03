package eyoon.eyoonDAO;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import eyoon.eyoonDTO.BookDTO;
import eyoon.eyoonDTO.BookPageDTO;
import eyoon.eyoonDTO.RentDTO;

@Repository
public class BookDAOImpl implements BookDAO{
	
	@Autowired
	private SqlSession sqlSession;
	
	// BookMapper.xml - namespace="com.library.mybatis.Book."
	private static final String NS = "com.library.mybatis.Book."; 
	
	@Override
	public List<BookDTO> selectList(int pg, BookPageDTO  bookPageDTO) {
		int start = pg * 10 - 10 + 1;
		int end = pg * 10;
		
		bookPageDTO.setStart(start);
		bookPageDTO.setEnd(end);
		
		List<BookDTO> selectList = new ArrayList<BookDTO>();
		
		if(bookPageDTO.getSearchFiled() != null && bookPageDTO.getSearchFiled() != ""){
			 selectList = sqlSession.selectList(NS + "selectList", bookPageDTO);
			 System.out.println(1);
		}else if(bookPageDTO.getSearchDateStart() != null && bookPageDTO.getSearchDateStart() != ""){
			 System.out.println(bookPageDTO.getSearchDateStart() + "||||" + bookPageDTO.getSearchDateEnd() );
			 selectList = sqlSession.selectList(NS + "selectList2", bookPageDTO);
			 System.out.println(2);
		}else {
			 selectList = sqlSession.selectList(NS + "selectList3", bookPageDTO);
			 System.out.println(3);
		}
		
		return selectList;
	}

	@Override
	public int selectCount() {
		int count = sqlSession.selectOne(NS + "selectCount"); 
		return count;
	}
	
	@Override
	public BookDTO addBook(BookDTO bookDTO) {
		sqlSession.insert(NS + "addBook", bookDTO);
		return bookDTO;
	}

	public BookDTO readBook(BookDTO bookDTO) {
		bookDTO = sqlSession.selectOne(NS + "readBook", bookDTO.getBookNo());
		return bookDTO;
	}

	@Override
	public void updateBook(BookDTO bookDTO) {
		sqlSession.update(NS + "updateBook", bookDTO);		
	}

	@Override
	public void deleteBook(BookDTO bookDTO) {
		sqlSession.delete(NS + "deleteBook", bookDTO);		
	}

	@Override
	public List<RentDTO> selectName(RentDTO rentDTO) {
		List<RentDTO> list = sqlSession.selectList(NS + "selectName", rentDTO);
		return list;
	}

	@Override
	public BookDTO getBook(BookDTO bookDTO) {
		return sqlSession.selectOne(NS + "getBook", bookDTO.getBookIsbn());
	}

}
