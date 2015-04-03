package board.dao;

import board.dto.UserDTO;

public interface LoginDAO {
	public UserDTO idCheck(UserDTO udto);
}
