package chap02;

import org.junit.Before;
import org.junit.Test;

public class BeanTest {
	
	int i = 0;
	
	@Before //@Test 메소드 실행전 무조건 먼저 실행 후 메소드를 실행하여 i = 5; 로 계속 초기화 된다.
	public void init(){
		
		System.out.println("init()");
		i = 5;
	}
	
	@Test
	public void a(){
		
		System.out.println("a : "+ i);
		i= i + 5;
		
		System.out.println("before -> a : "+ i);
	}
	
	@Test
	public void b(){
		
		System.out.println("b : "+ i);
	}
}
