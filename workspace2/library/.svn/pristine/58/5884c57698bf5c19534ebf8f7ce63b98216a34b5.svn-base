package eyoon.eyoonService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import eyoon.eyoonDAO.RentDAO;
import eyoon.eyoonDTO.BookPageDTO;
import eyoon.eyoonDTO.RentDTO;

@Service
@Transactional
public class RentServiceImpl implements RentService {
	@Autowired
	RentDAO rentDAO;
		
	@Override
	@Transactional(readOnly=true)
	public int selectCount() {
		int count = rentDAO.selectCount();
		return count;
	}
	
	@Override
	@Transactional(readOnly=true)
	public List<RentDTO> selectList(int ipage, BookPageDTO  bookPageDTO) {
		return rentDAO.selectList(ipage, bookPageDTO);
	}

	@Override
	public RentDTO getRent(int rentNo) {
		RentDTO rentDTO = rentDAO.getRent(rentNo);
		return rentDTO;
	}

	@Override
	public int updateRent(RentDTO rentDTO) {
		int cnt = rentDAO.updateRent(rentDTO);
		return cnt;
	}

	@Override
	public void rentInsert(RentDTO rentDTO) {
		 rentDAO.rentInsert(rentDTO);
	}
	
}
