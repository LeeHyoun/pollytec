package sinsung.sinsungDAO;

import sinsung.sinsungDTO.MgrQnaFwDTO;

public interface MgrQnaFwDAO {
	public MgrQnaFwDTO getQnaFw(int qnaSeq);
	public MgrQnaFwDTO addfw(MgrQnaFwDTO qnaFwDTO);
	
}
