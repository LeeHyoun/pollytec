package examples.spring.ch04.nontransaction;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Types;

import org.springframework.jdbc.core.BatchPreparedStatementSetter;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

public class MemberDAO extends JdbcDaoSupport{
	
	/**
	 * 회원의 기본정보 등록
	 * @param member
	 */
	public void registMemberInfo(Member member){
		String sql = "insert into member(memberId, name, age, created) values(?, ?, ?, sysdate)";

		member.setMemberId(getNextMemberId());
		Object[] params = {member.getMemberId(), member.getName(), member.getAge()};
		int[] types = {Types.INTEGER, Types.VARCHAR, Types.INTEGER};
				
		getJdbcTemplate().update(sql, params, types);
	}
	
	/**
	 * 회원의 주소 등록
	 * @param member
	 * @return
	 */
	public int[] registMemberAddress(final Member member){
		String sql = "insert into address(addressId, memberId, address) values(seq_address.nextval, ?, ?)";

		// 여러개의 쿼리를 한번에 실행시키기 위해서 사용
		BatchPreparedStatementSetter setter = new BatchPreparedStatementSetter(){
			/**
			 * 실행시킬 쿼리의 개수를 반환한다.
			 */
			public int getBatchSize(){
				return member.getAddress().size();
			}
			
			/**
			 * PreparedStatement 에 값을 채운다.
			 * getBatchSize() 호출 결과만큼 반복되며 호출될 때마다 index가 0부터 증가한다. 
			 */
			public void setValues(PreparedStatement ps, int index) throws SQLException{
				ps.setInt(1, member.getMemberId());
				ps.setString(2, (String)member.getAddress().get(index));
			}
		};
				
		return getJdbcTemplate().batchUpdate(sql, setter);
	}
	
	/**
	 * 회원 ID의 최대값 반환
	 * @return
	 */
	public int getNextMemberId(){
		String sql = "select max(memberId) from member";
		return getJdbcTemplate().queryForInt(sql)+1;
	}
}























