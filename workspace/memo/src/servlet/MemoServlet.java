package servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import memodao.MemoDAO;
import dto.MemoDTO;


@WebServlet("/MemoServlet")
public class MemoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
		
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		
		MemoDAO dao = new MemoDAO();
				
		String title = request.getParameter("title");
		String content = request.getParameter("content");
		
		try {
			dao.insertMemo(title, content);
		} catch (Exception e) {}
		
		response.sendRedirect("/ListServlet");
	}
	
	
}
