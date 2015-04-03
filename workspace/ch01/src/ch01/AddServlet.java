package ch01;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/AddServlet")
public class AddServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		
	/*	out.println("<form method='post' action='/ch01/AddServlet'>");
		out.println("<input type='submit' value='post'>");
		out.println("</form>");*/
		
		//forward 하기 위한 코드
		RequestDispatcher dispatcher = 
				request.getRequestDispatcher("/add.jsp");
		dispatcher.forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		
		String value1 = request.getParameter("value1");
		String value2 = request.getParameter("value2");
						
		out.println("<h1>"+value1+"</h1>");
		out.println("<h1>"+value2+"</h1>");
		
		int num1 = Integer.parseInt(value1);
		int num2 = Integer.parseInt(value2);
		out.println("<h1>"+num1+"+"+num2+"="+(num1+num2)+"</h1>");
	}

}
