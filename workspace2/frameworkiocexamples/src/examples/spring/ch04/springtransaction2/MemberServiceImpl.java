package examples.spring.ch04.springtransaction2;

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
	

	@Override
	public void registMember(
			examples.spring.ch04.springtransaction2.Member member) {
		mdao.registMemberInfo(member);
		mdao.registMemberAddress(member);
	}

}
