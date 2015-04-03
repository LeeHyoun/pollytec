package examples.spring.ch04.springtransaction3;

public interface MemberDAO {

	/**
	 * ȸ���� �⺻���� ���
	 * @param member
	 */
	public abstract void registMemberInfo(Member member);

	/**
	 * ȸ���� �ּ� ���
	 * @param member
	 * @return
	 */
	public abstract int[] registMemberAddress(final Member member);

	/**
	 * ȸ�� ID�� �ִ밪 ��ȯ
	 * @return
	 */
	public abstract int getNextMemberId();

}