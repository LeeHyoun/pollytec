package examples.spring.ch03.aop.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LifeTest2 {

	public static void main(String[] args) {
		ApplicationContext context
			= new ClassPathXmlApplicationContext("examples/spring/ch03/aop/annotation/player2.xml");

		ItMan itMan = (ItMan) context.getBean("itMan");
		itMan.myLife();
	}
}
