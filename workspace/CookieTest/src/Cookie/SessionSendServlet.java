package Cookie;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/sessionsend")
public class SessionSendServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		
		
		// path/cookiesend?name=logininfo&value=ok
		String name = request.getParameter("name");
		String value = request.getParameter("value");
		
		if(name == null || "".equals(name)){
			out.println("이름이 필요함.");
			return;
		}
		
		HttpSession session = request.getSession();
		session.setAttribute(name, value);
		out.println("세션 설정함.");
	}


}
