package Cookie;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/sessionlist")
public class SessionListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 response.setContentType("text/html;charset=utf-8"); 
        PrintWriter out = response.getWriter(); 
        
        // 브라우저로 부터 쿠키에 들어있는 세션정보를 읽어와
        // HttpSession 를 이용해 사용한다.
        HttpSession session = request.getSession(); 

        // 하나씩 값을 가져와서 저장.
        Enumeration<String> attributeNames
            		= session.getAttributeNames(); 
        
        // 값이 없을때 까지 출력
        while (attributeNames.hasMoreElements())
        { 
            String name = (String) attributeNames.nextElement(); 
            String value = (String)session.getAttribute(name); 
            out.println(name + " : " + value + "<br>"); 
        }

	} // doGet
}
