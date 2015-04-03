package eyoon.eyoonService;

import java.util.List;

import eyoon.eyoonDTO.BookPageDTO;
import eyoon.eyoonDTO.DueDTO;
import eyoon.eyoonDTO.RentDTO;



public interface RentService {

	public int selectCount();
	public List<RentDTO> selectList(int ipage, BookPageDTO  bookPageDTO);
	public RentDTO getRent(int rentNo);
	public int updateRent(RentDTO rentDTO);
	public void rentInsert(RentDTO rentDTO);
}	
