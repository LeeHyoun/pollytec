package examples.spring.ch04.springtransaction;

import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.TransactionCallback;
import org.springframework.transaction.support.TransactionTemplate;

public class MemberServiceImpl implements MemberService {
	
	private MemberDAO mdao;
	private TransactionTemplate transactionTemplate;

	public void setMemberDAO(MemberDAO mdao){
		this.mdao = mdao;
	}
	
	public void setTransactionTemplate(TransactionTemplate transactionTemplate) {
		this.transactionTemplate = transactionTemplate;
	}
	
	public void registMember(final Member member){
		// 프로그램에 의한 트랜잭션 관리
		transactionTemplate.execute(
			new TransactionCallback(){

				public Object doInTransaction(TransactionStatus status) {
					try{
						mdao.registMemberInfo(member);
						mdao.registMemberAddress(member);
							
						// 모두 성골할 경우 자동으로 커밋
					}catch(Exception e){
						e.printStackTrace();
						// 실패시 롤백
						status.setRollbackOnly();
					}
					
					return null;
				}					
			}			
		);
	}

}
