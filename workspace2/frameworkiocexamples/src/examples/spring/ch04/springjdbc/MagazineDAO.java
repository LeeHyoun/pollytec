package examples.spring.ch04.springjdbc;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

public class MagazineDAO extends JdbcDaoSupport {

	private RowMapper magazineRowMapper;

	public void setMagazineRowMapper(RowMapper magazineRowMapper) {
		this.magazineRowMapper = magazineRowMapper;
	}

	public Magazine findMagazine(int magazineId) {
		String sql = "select magazineId, title, price, created from MAGAZINE where magazineId = ?";
		return (Magazine) getJdbcTemplate().queryForObject(sql, new Object[] { magazineId }, magazineRowMapper);
	}
}
