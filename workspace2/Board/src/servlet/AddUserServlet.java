package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.UserDAO;
import dto.UserDTO;

@WebServlet("/adduser")
public class AddUserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id = request.getParameter("id");
		String passwd = request.getParameter("passwd");
		String name = request.getParameter("name");
		String birthyyyy = request.getParameter("birthyyyy");
		String birthmn = request.getParameter("birthmn");
		String email = request.getParameter("email");
		String gender = request.getParameter("gender");
		
		System.out.println("id : " + id);
		System.out.println("passwd : " + passwd);
		System.out.println("name : " + name);
		System.out.println("birthyyyy : " + birthyyyy);
		System.out.println("birthmn : " + birthmn);
		System.out.println("email : " + email);
		System.out.println("gender : " + gender);
		
		
		// DTO에 위의 값을 설정
		UserDTO user = new UserDTO();
		user.setId(id);
		user.setPasswd(passwd);
		user.setName(name);
		user.setBirthyyyy(birthyyyy);
		user.setBirthmn(birthmn);
		user.setGender(gender);
		user.setEmail(email);
		
		
		// DAO를 이용하여 저장.
		UserDAO userDAO = new UserDAO();
		userDAO.addUser(user);
		
		// list로 이동
		response.sendRedirect("/Board/list");
	}
}
