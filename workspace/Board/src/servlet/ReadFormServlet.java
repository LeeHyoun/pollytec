package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.BoardDAO;
import dto.BoardDTO;
import dto.UserDTO;


@WebServlet("/readform")
public class ReadFormServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		UserDTO user = (UserDTO)session.getAttribute("logininfo");
		if(user == null){
			response.sendRedirect("loginform");
			return;
		}
		
		int page = Integer.parseInt(request.getParameter("page"));
		int seq = Integer.parseInt(request.getParameter("seq"));
						
		BoardDAO dao = new BoardDAO();
		BoardDTO dto = dao.readBoard(seq);
		
		request.setAttribute("page", page);
		request.setAttribute("dto", dto);
		
		RequestDispatcher dispatcher 
			= request.getRequestDispatcher("/WEB-INF/views/readform.jsp");
		dispatcher.forward(request, response);
	}

}
