package chap02;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

// 라이브러리에서 JUnit4 를 추가해야한다.
public class UserService02Test {
	// ApplicationContext를 사용하는 것이 BeanFactory를 사용하는 것보다 훨씬 유리하다.
	// ApplicationContext를 이용하면 Spring이 제공하는 대부분의 중요기능을 사용할 수 있다. (AOP등)
	private ApplicationContext cxt;
	
	@Before
	public void setUp(){
		System.out.println("Container 초기화 전");
		
		// 경량컨테이너: ClassPathXmlApplicationContext
		// 인스턴스 관리, IoC, AOP, 더욱 많은 기능 
		// * 더 많이 쓰인다.
		// 컨테이너가 초기화 될때 관리하는 모든 인스턴스를 생성
		// 컨테이너는 인스턴스를 기본적으로 싱글턴으로 관리한다. !!!!!  필드 사용시 조심. 쓰지마
		// 싱글턴으로 만들어진다.
		cxt = new ClassPathXmlApplicationContext("applicationContextPage37.xml");
		System.out.println("Container 초기화 후");
	}
	
	@Test
	public void AddUser(){
		System.out.println("Bean 이용");;
		UserService a1 = (UserService)cxt.getBean("userService49");
		a1.addUser();
	}
}
