package sinsung.sinsungService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import sinsung.sinsungDAO.MgrDAO;
import sinsung.sinsungDAO.MgrStDAO;
import sinsung.sinsungDTO.MgrUsrStDTO;
import sinsung.sinsungDTO.StConditionDTO;
import sinsung.sinsungDTO.UsrRentDueDTO;

@Service
@Transactional
public class MgrUsrStServiceImpl implements MgrUsrStService {
	@Autowired
	MgrDAO mgrDAO;
	
	@Autowired
	MgrStDAO mgrStDAO;
	
	@Override
	public List<MgrUsrStDTO> UsrStList(int ipg) {
		List<MgrUsrStDTO> usrStList = mgrStDAO.UsrStList(ipg);
		return usrStList;
	}

	@Override
	public List<UsrRentDueDTO> UsrRent5List(String usrId) {
		List<UsrRentDueDTO> rent5List = mgrStDAO.UsrRent5List(usrId);
		return rent5List;
	}

	@Override
	public List<UsrRentDueDTO> UsrRentList(String usrId) {
		List<UsrRentDueDTO> rentList = mgrStDAO.UsrRentList(usrId);
		return rentList;
	}

	@Override
	public MgrUsrStDTO UsrSt(String usrId) {
		MgrUsrStDTO usrSt = mgrStDAO.UsrSt(usrId);
		
		return usrSt;
	}

	@Override
	public List<UsrRentDueDTO> UsrDue5List(String usrId) {
		List<UsrRentDueDTO> due5List = mgrStDAO.UsrDue5List(usrId);
		return due5List;
	}

	@Override
	public List<UsrRentDueDTO> UsrDueList(String usrId) {
		List<UsrRentDueDTO> dueList = mgrStDAO.UsrDueList(usrId);
		return dueList;
	}

	@Override
	public List<UsrRentDueDTO> UsrOverDue5List(String usrId) {
		List<UsrRentDueDTO> overdue5List = mgrStDAO.UsrOverDue5List(usrId);
		return overdue5List;
	}

	@Override
	public List<UsrRentDueDTO> UsrOverDueList(String usrId) {
		List<UsrRentDueDTO> overdueList = mgrStDAO.UsrOverDueList(usrId);
		return overdueList;
	}

	@Override
	public List<UsrRentDueDTO> UsrHarm5List(String usrId) {
		List<UsrRentDueDTO> harm5List = mgrStDAO.UsrHarm5List(usrId);
		return harm5List;
	}

	@Override
	public List<UsrRentDueDTO> UsrHarmList(String usrId) {
		List<UsrRentDueDTO> harmList = mgrStDAO.UsrHarmList(usrId);
		return harmList;
	}

	@Override
	public List<UsrRentDueDTO> UsrMiss5List(String usrId) {
		List<UsrRentDueDTO> miss5List = mgrStDAO.UsrMiss5List(usrId);
		return miss5List;
	}

	@Override
	public List<UsrRentDueDTO> UsrMissList(String usrId) {
		List<UsrRentDueDTO> missList = mgrStDAO.UsrMissList(usrId);
		return missList;
	}

	@Override
	public List<UsrRentDueDTO> UsrNotReturn5List(String usrId) {
		List<UsrRentDueDTO> notReturn5List = mgrStDAO.UsrNotReturn5List(usrId);
		return notReturn5List;
	}

	@Override
	public List<UsrRentDueDTO> UsrNotReturnList(String usrId) {
		List<UsrRentDueDTO> notReturnList = mgrStDAO.UsrNotReturn5List(usrId);
		return notReturnList;
	}
	
	@Override
	@Transactional(readOnly=true)
	public int getCount() {
		return mgrStDAO.selectCount();
	}
	
	@Override
	public List<MgrUsrStDTO> SortStList(StConditionDTO stconDTO, int ipg) {
		List<MgrUsrStDTO> usrStList = mgrStDAO.SortStList(stconDTO, ipg);
		return usrStList;
	}

	@Override
	public List<MgrUsrStDTO> WordStList(StConditionDTO stconDTO) {
		List<MgrUsrStDTO> usrStList = mgrStDAO.WordStList(stconDTO);
		return usrStList;
	}
}
