package board.service;

import board.dto.UserDTO;

public interface UserService {
	public UserDTO getUser(String id);
	public void addUser(UserDTO user);
}
