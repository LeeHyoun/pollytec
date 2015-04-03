package my;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// @WebServlet 을 어노테이션이라고 한다.
// 일종의 설정.
@WebServlet("/hi")
public class HiServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void service(HttpServletRequest arg0, HttpServletResponse arg1)
			throws ServletException, IOException {
		System.out.println("service!!!");
	}

	@Override
	public void destroy() {
		System.out.println("destory2");
	}

	@Override
	public void init() throws ServletException {
		System.out.println("init");
	}

	// init, destroy, service, doGet, doPost
	// 메소드중에서 선택하여 오버라이딩 한다.
	
}
