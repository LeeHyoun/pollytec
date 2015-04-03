package examples.spring.ch04.springtransaction3;

import java.lang.reflect.Method;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.aop.AfterReturningAdvice;


public class AfterMethodReturnLoggingAdvice implements AfterReturningAdvice {

	public void afterReturning(Object returnValue, Method method,
			Object[] args, Object target) throws Throwable {
		Log log = LogFactory.getLog(target.getClass());

		String className = target.getClass().getName();

		if (log.isInfoEnabled()) {
			log.info(className + "." + method.getName() + "()" + " end");
			if ((args != null) && (args.length > 0)) {
				for (int i = 0; i < args.length; i++) {
					log.info("Argument[" + i + "] : " + args[i]);
				}
			}
			if(returnValue!=null)log.info(returnValue.getClass().getName()+" null return.");
			
		}
	}
    
}
