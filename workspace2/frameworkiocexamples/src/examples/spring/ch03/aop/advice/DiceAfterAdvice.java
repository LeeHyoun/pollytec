package examples.spring.ch03.aop.advice;

import java.lang.reflect.Method;

import org.springframework.aop.AfterReturningAdvice;

public class DiceAfterAdvice implements AfterReturningAdvice {

	public void afterReturning(Object returnObj, Method method, Object[] args, Object targetObj) throws Throwable {
		System.out.println("[사후충고] " + method.getName() + " 호출 후에 실행..");
		System.out.println("실행결과는 : " + returnObj);
	}



}
