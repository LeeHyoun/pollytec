package examples.spring.ch03.aop.annotation;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;


@Aspect
public class Gargle {

	//사후 충고
	//CityLife 빈의 eat로 시작하는 메소드
	@After("execution(* CityLife.eat*())")
	//@After("execution(String CityLife.eat*(String))")
	//@After("execution(String CityLife.eat*(..))")
	public void doGargle() throws Throwable {
		System.out.println("---> 양치한다.");

	}
}
