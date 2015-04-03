package ch04;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/RedirectServlet")
public class RedirectServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//다시 요청한다. "/ch04/ok.jsp" 로
		//ok.jsp로 요청하면 ok.jsp를 처리후 브라우저에 결과를 보낸다.
		response.sendRedirect("/ch04/ok.jsp");
	}

}
