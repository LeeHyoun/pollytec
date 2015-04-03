package examples.spring.ch04.springtransaction3;

public interface MemberDAO {

	/**
	 * 회원의 기본정보 등록
	 * @param member
	 */
	public abstract void registMemberInfo(Member member);

	/**
	 * 회원의 주소 등록
	 * @param member
	 * @return
	 */
	public abstract int[] registMemberAddress(final Member member);

	/**
	 * 회원 ID의 최대값 반환
	 * @return
	 */
	public abstract int getNextMemberId();

}