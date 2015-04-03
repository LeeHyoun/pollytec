package examples.spring.ch03.proxy;

import java.lang.reflect.Proxy;

public class Test {

	public static void main(String[] args) throws Exception {
		//EmpManager empManager = new EmpManagerImpl();

		ExceptionHandler exceptionHandler = new ExceptionHandler(new EmpManagerImpl());
		EmpManager empManager = (EmpManager) Proxy.newProxyInstance(
				EmpManagerImpl.class.getClassLoader(),
				EmpManagerImpl.class.getInterfaces(),
				exceptionHandler);

		LoggingHandler handler = new LoggingHandler(empManager);
		// newProxyInstance(대상 객체의 클래스 로더, 구현해야 할 인터페이스 목록, InvocationHandler 객체)
		empManager = (EmpManager) Proxy.newProxyInstance(
				EmpManagerImpl.class.getClassLoader(),
				EmpManagerImpl.class.getInterfaces(),
				handler);

		System.out.println(empManager.getGreetingMessage("홍길동"));
	}
}
