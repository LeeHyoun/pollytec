package board.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import board.dao.UserDAO;
import board.dto.UserDTO;

@Service
@Transactional
public class UserServiceImpl implements UserService {
	@Autowired
	UserDAO userDAO;
	
	
	@Override
	@Transactional(readOnly=false)
	public void addUser(UserDTO userDTO) {
		userDAO.addUser(userDTO);
	}
}
