package kr.co.datastreams.board2.dao;

import kr.co.datastreams.board2.dto.UserDTO;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import com.mchange.util.AssertException;

public class UserDAO_Test {
	
	@Test
	public void addUser() throws Exception{
		UserDAO dao = new UserDAO();
		UserDTO udto = new UserDTO();
		
		udto.setId("test1");
		udto.setPasswd("test");
		udto.setName("test");
		udto.setBirthyyyy("2015");
		udto.setBirthmn("05");
		udto.setGender("남");
		udto.setEmail("ddd@naver.com");
				
		int n = dao.addUser(udto);
		assertEquals(1, n);
	}
	
	@Test
	public void idCheck() throws Exception{
		UserDAO dao = new UserDAO();
		String id = "hlee";
		String passwd = "1234";
		
		UserDTO user = dao.idCheck(id,passwd);
		
		System.out.println(user.toString());	
	}
	
	
}
