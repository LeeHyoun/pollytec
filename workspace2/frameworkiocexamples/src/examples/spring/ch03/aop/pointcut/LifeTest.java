package examples.spring.ch03.aop.pointcut;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LifeTest {

	public static void main(String[] args) {
		ApplicationContext context
			= new ClassPathXmlApplicationContext("examples/spring/ch03/aop/pointcut/player.xml");

		ItMan itMan = (ItMan) context.getBean("itMan");
		itMan.myLife();
	}
}
