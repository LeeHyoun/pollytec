package sinsung.sinsungService;

import java.util.List;

import sinsung.sinsungDTO.MgrUsrStDTO;
import sinsung.sinsungDTO.StConditionDTO;
import sinsung.sinsungDTO.UsrRentDueDTO;

public interface MgrUsrStService {
	public List<MgrUsrStDTO> UsrStList(int ipg);
	public List<UsrRentDueDTO> UsrRent5List(String usrId);
	public List<UsrRentDueDTO> UsrRentList(String usrId);
	public MgrUsrStDTO UsrSt(String usrId);
	public List<UsrRentDueDTO> UsrDue5List(String usrId);
	public List<UsrRentDueDTO> UsrDueList(String usrId);
	public List<UsrRentDueDTO> UsrOverDue5List(String usrId);
	public List<UsrRentDueDTO> UsrOverDueList(String usrId);
	public List<UsrRentDueDTO> UsrHarm5List(String usrId);
	public List<UsrRentDueDTO> UsrHarmList(String usrId);
	public List<UsrRentDueDTO> UsrMiss5List(String usrId);
	public List<UsrRentDueDTO> UsrMissList(String usrId);
	public List<UsrRentDueDTO> UsrNotReturn5List(String usrId);
	public List<UsrRentDueDTO> UsrNotReturnList(String usrId);
	
	public int getCount();
	public List<MgrUsrStDTO> SortStList(StConditionDTO stconDTO, int ipg);
	public List<MgrUsrStDTO> WordStList(StConditionDTO stconDTO);
}
