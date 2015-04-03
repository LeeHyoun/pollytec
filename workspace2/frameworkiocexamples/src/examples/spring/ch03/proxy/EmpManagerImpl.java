package examples.spring.ch03.proxy;

import java.text.SimpleDateFormat;
import java.util.Date;

public class EmpManagerImpl implements EmpManager {

	public String getGreetingMessage(String message) throws Exception {
		try {
			//System.out.println("------------------------------");
			//System.out.println("메소드 호출 Start : [" + new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").format(new Date()) + "]");
			System.out.println("비즈니스 로직 수행.");
			String str = null;
			str.charAt(0);	// NullPointerException 발생
			return "Hi " + message;
		} finally {
			//System.out.println("메소드 호출 End : [" + new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").format(new Date()) + "]");
			//System.out.println("------------------------------");
		}
	}

}
