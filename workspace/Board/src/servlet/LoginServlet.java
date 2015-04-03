package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.UserDAO;
import dto.UserDTO;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String id = request.getParameter("id");
		String passwd = request.getParameter("passwd");
		System.out.println(id);
		System.out.println(passwd);
		
		// id에 해당하는 회원정보를 요청
		UserDAO userDAO = new UserDAO();
		UserDTO user = userDAO.idCheck(id, passwd);
		System.out.println(user);
		
		if(user == null){
			response.sendRedirect("loginform?login=fail");
			return;
		}
		
		if(passwd.equals(user.getPasswd())){
			System.out.println("passwd equals!!");
			HttpSession session = request.getSession();
			session.setAttribute("logininfo", user); //dto를 넘겨주어 사용
			response.sendRedirect("list");
			return;
		}else{
			response.sendRedirect("loginform?login=fail");
			return;			
		}
	}

}
