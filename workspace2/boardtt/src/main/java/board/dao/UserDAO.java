package board.dao;

import board.dto.UserDTO;
import board.exception.DAOException;

public interface UserDAO {

	public UserDTO getUser(String id) throws DAOException;

	public int addUser(UserDTO user) throws DAOException;// addMemo

}