package philho.philhoDAO;

import philho.philhoDTO.UsrDTO;

public interface UsrDAO {
	
	// 유저 하나 가져오기  
	public UsrDTO getUsr(String usrId);
	
	// 유저 하나 추가 
	public UsrDTO addUsr(UsrDTO usr);
	
	// 수정
//	public void update(String usrId);
	public UsrDTO update(UsrDTO usr);
	
}
