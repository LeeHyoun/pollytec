package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.BoardDAO;
import dto.BoardDTO;
import dto.UserDTO;

/**
 * Servlet implementation class WriteServlet
 */
@WebServlet("/write")
public class WriteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
   		HttpSession session = request.getSession();
		UserDTO user = (UserDTO)session.getAttribute("logininfo");
		if(user == null){
			response.sendRedirect("/Board/loginform");
			return;
		}
   		
   		String title = request.getParameter("title");
		String content = request.getParameter("content");
		
		BoardDAO boardDAO = new BoardDAO();
		BoardDTO boardDTO = new BoardDTO();
		
		boardDTO.setUser_id(user.getId());
		boardDTO.setTitle(title);
		boardDTO.setContent(content);
		boardDTO.setIp("iipp");
		
		boardDAO.writeBoard(boardDTO);
		response.sendRedirect("/Board/list");
	}

}
