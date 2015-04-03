package examples.spring.ch03.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class ExceptionHandler implements InvocationHandler {

	Object targetObject;

	public ExceptionHandler(Object targetObject) {
		this.targetObject = targetObject;
	}

	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		try {
			return method.invoke(targetObject, args);
		} catch (Exception e) {
			System.out.println("----------------------------");
			System.out.println("메소드 호출 예외 발생 : " + method.getName() + ", " + e.getMessage());
			System.out.println("----------------------------");

			return null;
		}
	}

}
