package servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.BoardDAO;
import dao.DAOException;
import dto.BoardDTO;

@WebServlet("/list")
public class ListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	final static int BLOCK = 5; // 페이지 블럭 갯수
	final static int RECORD = 10; // 페이지당 레코드 갯수
	
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		BoardDAO boardDAO = new BoardDAO();
		
		String strPage = request.getParameter("page");
				
		int ipage = 1;
				
		try{
			//strPage 가 NULL 이거나 "" 이면 ipage 는 여전히 1 이다.
			ipage = Integer.parseInt(strPage);
		}catch(Exception ex){}
		
		int count = boardDAO.getBoardCount(); //전체 개시물 갯수
		int pageCount = count / RECORD;
		//System.out.println(pageCount);
		if(count % 5 > 0) pageCount++; //총 페이지 갯수 구하기
		List<BoardDTO> list = boardDAO.selectListBoard(ipage); //한 페이지당 개시물 갯수
		//System.out.println(list.size());
		
		int prevPage = ((ipage-1)/BLOCK*BLOCK)+1; // 시작블럭숫자 (1~5페이지일경우 1, 6~10일경우 6)
		int nextPage = ((ipage-1)/BLOCK*BLOCK)+BLOCK; // 끝 블럭 숫자 (1~5일 경우 5, 6~10일경우 10)
		
		/*System.out.println(prevPage);
		System.out.println(nextPage);*/
		
		request.setAttribute("page", ipage);
		request.setAttribute("BLOCK", BLOCK);
		request.setAttribute("prevPage", prevPage);
		request.setAttribute("nextPage", nextPage);
		request.setAttribute("pageCount", pageCount);
		request.setAttribute("list", list);
		
		
		// jsp 페이지 안에 session이 이미 저장되어있어 sessionScope 를 사용하여 
		// HttpSession 을 사용할 수 있다.
		/*  HttpSession session = request.getSession();
		String isLogin = (String)session.getAttribute("logininfo");
		request.setAttribute("isLogin", isLogin);*/
		
		RequestDispatcher dispatcher =
				request.getRequestDispatcher("/WEB-INF/views/list.jsp");
		dispatcher.forward(request, response);
	}
}



