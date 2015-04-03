package sinsung.sinsungDAO;

import java.util.List;

import sinsung.sinsungDTO.MgrUsrDTO;
import sinsung.sinsungDTO.MgrUsrStDTO;
import sinsung.sinsungDTO.UsrRentDueDTO;

public interface MgrDAO {
	public List<MgrUsrDTO> UsrList(int ipg);
	public MgrUsrDTO getUsr(String usrId);
	
	public MgrUsrDTO updateUsr(MgrUsrDTO usr);
	public List<MgrUsrDTO> getUsrName(String usrName);
	public List<MgrUsrDTO> getUsrId(String usrId);
	
	public int selectCount();
}
