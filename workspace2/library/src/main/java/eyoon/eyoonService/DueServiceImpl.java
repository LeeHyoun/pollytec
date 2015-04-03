package eyoon.eyoonService;

import java.util.List;






import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import eyoon.eyoonDAO.DueDAO;
import eyoon.eyoonDTO.BookDTO;
import eyoon.eyoonDTO.BookPageDTO;
import eyoon.eyoonDTO.DueDTO;

@Service
@Transactional
public class DueServiceImpl implements DueService {
	@Autowired
	DueDAO dueDAO;

	@Override
	@Transactional(readOnly=true)
	public int selectCount() {
		int count = dueDAO.selectCount();
		return count;
	}
	
	@Override
	@Transactional(readOnly=true)
	public List<DueDTO> selectList(int ipage, BookPageDTO  bookPageDTO) {
		return dueDAO.selectList(ipage, bookPageDTO);
	}
	
	@Override
	public DueDTO updateDue(DueDTO dueDTO) {
		dueDTO = dueDAO.updateDue(dueDTO);
		return dueDTO;
	}

	@Override
	public DueDTO getDue(int rentNo) {
		DueDTO dueDTO = dueDAO.getDue(rentNo);
		return dueDTO;
	}

	@Override
	public int insertDue(DueDTO dueDTO) {
		int cnt = dueDAO.insertDue(dueDTO);
		return cnt;
	}
}
