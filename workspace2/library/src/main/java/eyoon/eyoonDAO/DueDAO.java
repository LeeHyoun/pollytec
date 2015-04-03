package eyoon.eyoonDAO;

import java.util.List;

import eyoon.eyoonDTO.BookDTO;
import eyoon.eyoonDTO.BookPageDTO;
import eyoon.eyoonDTO.DueDTO;

public interface DueDAO {
	public List<DueDTO> selectList(int pg, BookPageDTO  bookPageDTO);
	public int selectCount();
	public DueDTO updateDue(DueDTO dueDTO);
	public DueDTO getDue(int rentNo);
	public int insertDue(DueDTO dueDTO);
}
