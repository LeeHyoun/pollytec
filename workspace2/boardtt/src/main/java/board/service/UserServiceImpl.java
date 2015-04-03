package board.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import board.dao.UserDAO;
import board.dto.UserDTO;

@Service
@Transactional
public class UserServiceImpl implements UserService{
	@Autowired
	UserDAO userDAO;
	
	@Override
	@Transactional(readOnly=true)
	public UserDTO getUser(String id) {
		return userDAO.getUser(id);
	}

	@Override
	@Transactional(readOnly=false)
	public void addUser(UserDTO user) {
		userDAO.addUser(user);
	}

}
