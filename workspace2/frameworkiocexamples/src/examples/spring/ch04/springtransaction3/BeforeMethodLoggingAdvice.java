package examples.spring.ch04.springtransaction3;

import java.lang.reflect.Method;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.aop.MethodBeforeAdvice;


public class BeforeMethodLoggingAdvice implements MethodBeforeAdvice {

	public void before(Method method, Object[] args, Object target) throws Throwable {
		Log log = LogFactory.getLog(target.getClass());
		String className = target.getClass().getName();
		

		if (log.isInfoEnabled()) {
			log.info(className + "." + method.getName() + "()"	+ " start!!");
			if ((args != null) && (args.length > 0)) {
				for (int i = 0; i < args.length; i++) {
					log.info("Argument[" + i + "] : " + args[i]);
				}
			}
		}
	}
   
}
