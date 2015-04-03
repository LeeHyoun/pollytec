package examples.spring.ch03.aop.advice;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

public class Test {
	public static void main(String[] args) {
		BeanFactory context
			= new XmlBeanFactory(new FileSystemResource("bin/examples/spring/ch03/aop/advice/player.xml"));

		System.out.println("컨테이너 생성 완료.");

		Player p = (Player) context.getBean("player");
		p.play();
		System.out.println("세번 굴린 주사위의 합 : " + p.getTotalValue());
	}
}
