package examples.spring.ch03.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.Date;

public class LoggingHandler implements InvocationHandler {

	Object targetObject;

	public LoggingHandler(Object targetObject) {
		this.targetObject = targetObject;
	}

	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		try {
			System.out.println("------------------------------");
			System.out.println("메소드 호출 Start : [" + new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").format(new Date()) + "]");

			return method.invoke(targetObject, args);
		} finally {
			System.out.println("메소드 호출 End : [" + new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").format(new Date()) + "]");
			System.out.println("------------------------------");
		}
	}



}
