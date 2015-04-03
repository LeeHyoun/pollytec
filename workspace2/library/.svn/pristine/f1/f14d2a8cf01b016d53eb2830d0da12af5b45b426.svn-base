package sinsung.sinsungService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import sinsung.sinsungDAO.MgrDAO;
import sinsung.sinsungDTO.MgrUsrDTO;

@Service
@Transactional
public class MgrUsrServiceImpl implements MgrUsrService {
	
	@Autowired
	MgrDAO mgrDAO;

	@Override
	public List<MgrUsrDTO> UsrList(int ipg) {
		List<MgrUsrDTO> usrList = mgrDAO.UsrList(ipg);
		return usrList;
	}

	@Override
	public MgrUsrDTO getUsr(String usrId) {
		MgrUsrDTO usrDTO = mgrDAO.getUsr(usrId);
		//System.out.println(usrDTO);
		return usrDTO;
	}

	@Override
	public MgrUsrDTO updateUsr(MgrUsrDTO usrDTO) {
		mgrDAO.updateUsr(usrDTO);
		return usrDTO;
	}

	@Override
	public List<MgrUsrDTO> getUsrName(String usrName) {
		List<MgrUsrDTO> usrList = mgrDAO.getUsrName(usrName);
		return usrList;
	}

	@Override
	public List<MgrUsrDTO> getUsrId(String usrId) {
		List<MgrUsrDTO> usrList = mgrDAO.getUsrId(usrId);
		return usrList;
	}

	@Override
	@Transactional(readOnly=true)
	public int getCount() {
		return mgrDAO.selectCount();
	}

	
}
