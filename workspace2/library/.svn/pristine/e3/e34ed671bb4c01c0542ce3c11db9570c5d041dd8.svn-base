package baedo.baedoService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.servlet.ModelAndView;

import baedo.baedoDAO.ManagerDAO;
import baedo.baedoDTO.ManagerDTO;

@Service
@Transactional
public class ManagerServiceImpl implements ManagerService{
	
	

	
	
	@Autowired
	ManagerDAO managerDAO;
	
	@Override
	@Transactional(readOnly=true)
	public List<ManagerDTO> getList(int page) {
		return managerDAO.selectList(page);
	}
	
	
	
	
	
	@Override
	public ManagerDTO getReport(String id) {
		return managerDAO.getReport(id);
	}




	@Override
	public int getFmCount() {
		// TODO Auto-generated method stub
		return managerDAO.selectFmCount();
	}

	@Override
	public void deleteManager(String id) {
		managerDAO.deleteManager(id);
	}
	
	@Override
	public ManagerDTO getModify(ManagerDTO manager) {
		// TODO Auto-generated method stub
		return managerDAO.getModify(manager);
	}

	@Override
	@Transactional(readOnly=false)
	public String idcheck(String id) {
		return managerDAO.idcheck(id);
	}


	@Override
	public int getEtcCount() {
		// TODO Auto-generated method stub
		return managerDAO.selectEtcCount();
	}

	@Override
	public int getMsCount() {
		// TODO Auto-generated method stub
		return managerDAO.selectMsCount();
	}

	
	
	@Override
	public int getQcCount() {
		// TODO Auto-generated method stub
		return managerDAO.selectQcCount();
	}

	

	@Override
	@Transactional(readOnly=true)
	public List<ManagerDTO> getmsList(int page) {
		return managerDAO.selectmsList(page);
	}
	
	@Override
	@Transactional(readOnly=true)
	public List<ManagerDTO> getqcList(int page) {
		return managerDAO.selectqcList(page);
	}
	
	@Override
	@Transactional(readOnly=true)
	public List<ManagerDTO> getfmList(int page) {
		return managerDAO.selectfmList(page);
	}
	
	@Override
	@Transactional(readOnly=true)
	public List<ManagerDTO> getetcList(int page) {
		return managerDAO.selectetcList(page);
	}
	
	@Override
	@Transactional(readOnly=true)
	public int getCount() {
		return managerDAO.selectCount();
	}
	
	@Override
	@Transactional(readOnly=true)
	public List<ManagerDTO> getSearchList(String name) {
		// TODO Auto-generated method stub
		System.out.println(name);
		return managerDAO.selectSearchList(name);
	}
	
	
	
	@Override
	public ManagerDTO getManager(String id) {
		// TODO Auto-generated method stub
		return managerDAO.getManager(id);
	}

	@Override
	@Transactional(readOnly=false)
	public ManagerDTO addManager(ManagerDTO manager) {
		return managerDAO.addManager(manager);
	}
	@Override
	public int getId(String checkid) {
		
		return managerDAO.getId(checkid);
	}
	
}
