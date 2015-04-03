package Cookie;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/cookielist")
public class CookieListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		
		// 브라우저(request) 에서 쿠키"getCookies()"를 받아온다.
		Cookie[] cookies = request.getCookies(); // 받아온게 없으면 null 일수 있다.
		
		if(cookies != null){
			for (int i = 0; i < cookies.length; i++) {
				out.println("\n"+cookies[i].getName()+" : "+cookies[i].getValue());
			} 
		}
	}
}

/*
 * 쿠키설정 후 쿠키값 확인 방법
 * http://172.31.3.179:8080/CookieTest/cookielist //확인
 * http://172.31.3.179:8080/CookieTest/cookiesend?name=hlee&value=ok //설정
 */
