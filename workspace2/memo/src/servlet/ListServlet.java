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

@WebServlet("/ListServlet")
public class ListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		MemoDAO dao = new MemoDAO();
		List<MemoDTO> list = dao.selectList();
		
		
		
		// jsp에게 list를 전달한다.
		request.setAttribute("memoList", list);
		//request.setAttribute("title", "Oh My Memo");
		
		RequestDispatcher dispatcher =
				request.getRequestDispatcher("/WEB-INF/views/memolist.jsp");
		dispatcher.forward(request, response);
	}
}
