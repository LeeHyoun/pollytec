package sinsung.sinsungService;

import sinsung.sinsungDTO.MgrQnaFwDTO;

public interface MgrQnaFwService {
	public MgrQnaFwDTO getQnaFw(int qnaSeq);
	public MgrQnaFwDTO addfw(MgrQnaFwDTO qnaFwDTO);
}
