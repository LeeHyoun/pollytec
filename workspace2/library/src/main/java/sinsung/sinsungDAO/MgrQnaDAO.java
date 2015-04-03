package sinsung.sinsungDAO;

import java.util.List;

import baedo.baedoDTO.ManagerDTO;
import eyoon.eyoonDTO.BookPageDTO;
import sinsung.sinsungDTO.MgrQnaDTO;

public interface MgrQnaDAO {
	public List<MgrQnaDTO> QnaList(int pg, BookPageDTO bookPageDTO);
	public MgrQnaDTO getQna(String usrId);
	public int getQnaCount();
	
}
