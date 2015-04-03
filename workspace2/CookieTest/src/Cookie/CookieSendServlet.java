package Cookie;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/cookiesend")
public class CookieSendServlet extends HttpServlet {
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
		
		Cookie cookie = new Cookie(name, value);
		// 이 설정이 없으면 브라우저를 닫을때 까지 유지.
		// 브라우저를 닫으면 없어진다.
		cookie.setMaxAge(60 * 60 * 24 * 365); // 1년
		
		// "/" 뒤의 경로 다음에 쿠키가 실행된다.
		cookie.setPath("/");
		
		// .naver.com 으로 끝나는 주소는 쿠키를 다 들고 간다.
		//cookie.setDomain(".naver.com");
		
		response.addCookie(cookie); // 브라우저에게 전송
		out.println("쿠키설정함.");
		
	} // doGet


}
