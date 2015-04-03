package sinsung.sinsungService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import eyoon.eyoonDTO.BookPageDTO;
import sinsung.sinsungDAO.MgrQnaDAO;
import sinsung.sinsungDTO.MgrQnaDTO;
import sinsung.sinsungDTO.MgrQnaDTO1;

@Service
@Transactional
public class MgrQnaServiceImpl implements MgrQnaService{
	
	@Autowired
	MgrQnaDAO mgrQnaDAO;
	
	@Override
	public List<MgrQnaDTO> QnaList(int ipage,BookPageDTO bookPageDTO){
		List<MgrQnaDTO> qnaList = mgrQnaDAO.QnaList(ipage, bookPageDTO);
		return qnaList;
	}
	
	@Override
	public MgrQnaDTO getQna(String usrId){
		MgrQnaDTO qnaDTO = mgrQnaDAO.getQna(usrId);
		
		return qnaDTO;
	}

	/*@Override
	public List<MgrQnaDTO1> QnaList1() {
		// TODO Auto-generated method stub
		return null;
	}*/

	@Override
	public int selectCount() {
		
		return mgrQnaDAO.getQnaCount();
	}


	
}
