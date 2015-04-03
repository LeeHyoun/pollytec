package sinsung.sinsungService;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import baedo.baedoDTO.ManagerDTO;
import sinsung.sinsungDAO.MgrQnaFwDAO;
import sinsung.sinsungDTO.MgrQnaDTO;
import sinsung.sinsungDTO.MgrQnaFwDTO;

@Service
@Transactional
public class MgrQnaFwServiceImpl implements MgrQnaFwService{
	
	@Autowired
	MgrQnaFwDAO mgrQnaFwDAO;

	
	@Override
	public MgrQnaFwDTO getQnaFw(int qnaSeq){
		System.out.println(qnaSeq+"%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
		MgrQnaFwDTO qnaFwDTO = mgrQnaFwDAO.getQnaFw(qnaSeq);
		
		return qnaFwDTO;
	}


	@Override
	@Transactional(readOnly=false)
	public MgrQnaFwDTO addfw(MgrQnaFwDTO qnaFwDTO) {
		// TODO Auto-generated method stub
		return mgrQnaFwDAO.addfw(qnaFwDTO);
	}
}
