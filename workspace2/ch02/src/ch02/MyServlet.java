package ch02;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MyServlet
 */
@WebServlet("/MyServlet")
public class MyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		
		String method = request.getMethod();
		out.println("Method : " + method + " <br>"); 
		
		Enumeration<String> headerNames 
				= request.getHeaderNames();
		
		while (headerNames.hasMoreElements()) { 
            String name = (String) headerNames.nextElement(); 
            String value = request.getHeader(name); 
            out.println(name + ":" + value + "<br>"); 
        } 
	}

}
