package examples.spring.ch04.springjdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MagazineTest {

	public static void main(String[] args){
		ApplicationContext context = new ClassPathXmlApplicationContext("/examples/spring/ch04/springjdbc/applicationContext.xml");
		MagazineDAO mdao = (MagazineDAO)context.getBean("magazine");

		System.out.println(mdao.findMagazine(2));
	}
}
