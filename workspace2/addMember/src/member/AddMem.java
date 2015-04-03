package member;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



@WebServlet("/AddMem")
public class AddMem extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		
		PrintWriter out = response.getWriter();
		
		String id = request.getParameter("id");
		String pwd = request.getParameter("pwd");
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String selYear = request.getParameter("selYear");
		String selMonth = request.getParameter("selMonth");
		String zender = request.getParameter("zender");
		
		out.println("아 이 디 :"+id+"<br>");
		out.println("패스워드 :"+pwd+"<br>");
		out.println("이    름 :"+name+"<br>");
		out.println("이 메 일 :"+email+"<br>");
		out.println("생년월일 :"+selYear+"년 "+selMonth+"월<br>");
		out.println("성    별 :"+zender+"<br>");
		
	}
}
