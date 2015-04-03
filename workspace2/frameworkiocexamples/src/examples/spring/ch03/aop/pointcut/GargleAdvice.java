package examples.spring.ch03.aop.pointcut;

import java.lang.reflect.Method;

import org.springframework.aop.AfterReturningAdvice;

public class GargleAdvice implements AfterReturningAdvice {

	public void afterReturning(Object arg0, Method arg1, Object[] arg2, Object arg3) throws Throwable {
		System.out.println("    ---> 양치한다.");

	}



}
