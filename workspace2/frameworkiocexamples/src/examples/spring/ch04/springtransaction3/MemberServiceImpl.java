package examples.spring.ch04.springtransaction3;


public class MemberServiceImpl implements MemberService {

	private MemberDAO mdao;
	
	public void setMemberDAO(MemberDAO mdao){
		this.mdao = mdao;
	}

	public void registMember(final Member member){
		mdao.registMemberInfo(member);
		mdao.registMemberAddress(member);
	}

}
