package board.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:/spring/dbpool-context.xml","classpath:/spring/root-context.xml"})
@TransactionConfiguration(defaultRollback=true)
public class ConfigInitTest {
	
	@Test
	public void test() throws Exception{
		// 셋팅이 잘 되어있는지 테스트 ..
		// 오타 하나라도 난다면 실행되지 않는다.
	}
}