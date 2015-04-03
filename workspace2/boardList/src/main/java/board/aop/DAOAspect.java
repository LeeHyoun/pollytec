package board.aop;

import java.util.List;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

import board.dto.BoardDTO;

@Aspect
public class DAOAspect {

	@Before("execution(public * board.dao.*.*(..))") // --- pointcut (위치정보)
    public void before(JoinPoint joinPoint) // ----- 기능
    {
        System.out.println("Before " + joinPoint.getSignature().getName());
    }

	@AfterReturning(pointcut="execution(public * board.dao.BoardDAO.selectList(..))", returning="list")
    public void afterReturning(JoinPoint joinPoint, List<BoardDTO> list)
    {
		
        System.out.println("!!!AfterReturning : " + list.size());
    }

 

    @AfterThrowing(pointcut="execution(public * board.dao.*.*(..))", throwing="ex")
    public void afterThrowing(JoinPoint joinPoint, Exception ex)
    {
        System.out.println("!!!!AfterThrowing :" + ex.toString());
    }

    @After("execution(public * board.dao.*.*(..))")
    public void after(JoinPoint joinPoint)
    {
        System.out.println("After!!!!!!!!!!!!!!!!!!!!");
    }

    @Around("execution(public * board.dao.BoardDAO.selectList(..))")
    public Object around(ProceedingJoinPoint joinPoint)
    {
    	Object ret = null;
        System.out.println("Around 1");
        try {
			ret = joinPoint.proceed();
			
		} catch (Throwable e) {
			e.printStackTrace();
		}
        System.out.println("Around 2");
        return ret;
    }
}
