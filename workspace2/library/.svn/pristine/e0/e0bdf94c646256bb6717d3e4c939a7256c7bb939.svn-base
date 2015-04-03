package philho.philhoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import philho.philhoDAO.UsrDAO;
import philho.philhoDTO.UsrDTO;

@Service
@Transactional
public class UsrServiceImpl implements UsrService {
	@Autowired
	UsrDAO usrDAO;

	@Override
	// @Transactional(readOnly=true)
	public UsrDTO getUsr(String usrId) {
		return usrDAO.getUsr(usrId);
	}

	@Override
	// @Transactional(readOnly=false)
	public void addUsr(UsrDTO usr) {
		usrDAO.addUsr(usr);
	}

//	@Override
//	public void update(String usrId) {
//		usrDAO.update(usrId);
//	}

	@Override
	public UsrDTO update(UsrDTO usr) {
		usrDAO.update(usr);
		return usr;
	}



}
