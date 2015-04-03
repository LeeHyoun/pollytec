package examples.spring.ch04.springtransaction3;


import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.aop.ThrowsAdvice;


public class ExceptionHandleThrowsAdvice implements ThrowsAdvice {

	protected final Log log = LogFactory.getLog(getClass());


	public void afterThrowing(RuntimeException ex) throws Throwable {
		if (log.isErrorEnabled()) {
			log.error("##### RuntimeException afterThrowing() !!");
			log.error("Caught : " + ex.getClass().getName());
			log.error(ex.getMessage());
		}

		//ex.printStackTrace();

		if (log.isErrorEnabled()) {
			log.error("##### afterThrowing()");
		}
	}
	

	public void afterThrowing(Exception ex) throws Throwable {
		if (log.isErrorEnabled()) {
			log.error("##### Exception afterThrowing() !!");
			log.error("Caught : " + ex.getClass().getName());
			log.error(ex.getMessage());
		}

		//ex.printStackTrace();

		if (log.isErrorEnabled()) {
			log.error("##### afterThrowing()");
		}
	}

		
}
