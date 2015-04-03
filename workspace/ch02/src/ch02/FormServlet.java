package ch02;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/FormServlet")
public class FormServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		
		String text1 = request.getParameter("value1");// name="value1"
		out.println("value1 : "+text1+"<br>");
		
		String passwd1 = request.getParameter("value2"); //name="value2"
		out.println("value2 : "+passwd1+"<br>");
		
		//받는값이 여러개인 경우 getParameterValues() 를 사용하여 배열로 가져온다.
		String check[] = request.getParameterValues("value3"); //name="value3"
		
		if(check == null){//반드시 NULL 을 검사
			out.println("선택되지 않음.<br>");
		}else{
			for(int i=0; i < check.length; i++){
				out.println("check : "+check[i] + "<br>");
			}
		}
		
		String radio = request.getParameter("value4");  //name="value4"
		out.println("value4 : "+radio+"<br>");
		
		String select = request.getParameter("value5"); //name="value5"
		out.println("value5 : "+select+"<br>");
		
		String area = request.getParameter("value6"); //name="value6"
		out.println("value6 : "+area+"<br>");
				
	}

}
