package examples.spring.ch04.springtransaction3;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Types;

import org.springframework.jdbc.core.BatchPreparedStatementSetter;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

public class MemberDAOImpl extends JdbcDaoSupport implements MemberDAO{
	
	/* (non-Javadoc)
	 * @see examples.spring.ch04.springtransaction3.MemberDAO#registMemberInfo(examples.spring.ch04.springtransaction3.Member)
	 */
	@Override
	public void registMemberInfo(Member member){
		String sql = "insert into member(memberId, name, age, created) values(?, ?, ?, sysdate)";

		member.setMemberId(getNextMemberId());
		Object[] params = {member.getMemberId(), member.getName(), member.getAge()};
		int[] types = {Types.INTEGER, Types.VARCHAR, Types.INTEGER};
				
		getJdbcTemplate().update(sql, params, types);
	}
	
	/* (non-Javadoc)
	 * @see examples.spring.ch04.springtransaction3.MemberDAO#registMemberAddress(examples.spring.ch04.springtransaction3.Member)
	 */
	@Override
	public int[] registMemberAddress(final Member member){
		String sql = "insert into address(addressId, memberId, address) values(seq_address.nextval, ?, ?)";

		// �������� ������ �ѹ��� �����Ű�� ���ؼ� ���
		BatchPreparedStatementSetter setter = new BatchPreparedStatementSetter(){
			/**
			 * �����ų ������ ������ ��ȯ�Ѵ�.
			 */
			public int getBatchSize(){
				return member.getAddress().size();
			}
			
			/**
			 * PreparedStatement �� ���� ä���.
			 * getBatchSize() ȣ�� �����ŭ �ݺ��Ǹ� ȣ��� ������ index�� 0���� �����Ѵ�. 
			 */
			public void setValues(PreparedStatement ps, int index) throws SQLException{
				ps.setInt(1, member.getMemberId());
				ps.setString(2, (String)member.getAddress().get(index));
			}
		};
				
		return getJdbcTemplate().batchUpdate(sql, setter);
	}
	
	/* (non-Javadoc)
	 * @see examples.spring.ch04.springtransaction3.MemberDAO#getNextMemberId()
	 */
	@Override
	public int getNextMemberId(){
		String sql = "select max(memberId) from member";
		return getJdbcTemplate().queryForInt(sql)+1;
	}
}























