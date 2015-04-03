package baedo.baedoDAO;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import baedo.baedoDTO.ManagerDTO;
import baedo.baedoDTO.ManagerSearchParamDTO;

@Repository
public class ManagerDAOImpl implements ManagerDAO {

	@Autowired
	private SqlSession sqlSession;

	private static final String NS = "com.library.mybatis.Manager.";

	@Override
	public ManagerDTO getModify(ManagerDTO manager) {
		System.out.println(manager);
		sqlSession.insert(NS + "getModify", manager);
		return manager;
	}

	
	
	@Override
	public ManagerDTO getReport(String id) {
		String mgr_id = id;
		ManagerDTO manager = sqlSession.selectOne(NS + "getManager", mgr_id);
		return manager;
	}



	@Override
	public List<ManagerDTO> selectList(int pg) {
		int start = pg * 5 - 5 + 1;
		int end = pg * 5;

		System.out.println(start);

		ManagerSearchParamDTO managerSearchParamDTO = new ManagerSearchParamDTO();
		managerSearchParamDTO.setStart(start);
		managerSearchParamDTO.setEnd(end);

		System.out.println(start);

		List<ManagerDTO> selectList = sqlSession.selectList(NS + "selectList",
				managerSearchParamDTO);
		System.out.println(selectList);
		return selectList;
	}

	@Override
	public List<ManagerDTO> selectmsList(int pg) {
		int start = pg * 5 - 5 + 1;
		int end = pg * 5;
		ManagerSearchParamDTO managerSearchParamDTO = new ManagerSearchParamDTO();
		managerSearchParamDTO.setStart(start);
		managerSearchParamDTO.setEnd(end);

		List<ManagerDTO> selectmsList = sqlSession.selectList(NS
				+ "selectmsList", managerSearchParamDTO);
		return selectmsList;
	}

	@Override
	public List<ManagerDTO> selectqcList(int pg) {
		int start = pg * 5 - 5 + 1;
		int end = pg * 5;
		ManagerSearchParamDTO managerSearchParamDTO = new ManagerSearchParamDTO();
		managerSearchParamDTO.setStart(start);
		managerSearchParamDTO.setEnd(end);

		List<ManagerDTO> selectqcList = sqlSession.selectList(NS
				+ "selectqcList", managerSearchParamDTO);
		return selectqcList;
	}

	@Override
	public List<ManagerDTO> selectfmList(int pg) {
		int start = pg * 5 - 5 + 1;
		int end = pg * 5;
		ManagerSearchParamDTO managerSearchParamDTO = new ManagerSearchParamDTO();
		managerSearchParamDTO.setStart(start);
		managerSearchParamDTO.setEnd(end);

		List<ManagerDTO> selectfmList = sqlSession.selectList(NS
				+ "selectfmList", managerSearchParamDTO);
		return selectfmList;
	}

	@Override
	public List<ManagerDTO> selectetcList(int pg) {
		int start = pg * 5 - 5 + 1;
		int end = pg * 5;
		ManagerSearchParamDTO managerSearchParamDTO = new ManagerSearchParamDTO();
		managerSearchParamDTO.setStart(start);
		managerSearchParamDTO.setEnd(end);

		List<ManagerDTO> selectetcList = sqlSession.selectList(NS
				+ "selectetcList", managerSearchParamDTO);
		return selectetcList;
	}

	@Override
	public String idcheck(String id){
		
		String idcheck = sqlSession.selectOne(NS + "idcheck", id);
		System.out.println(id);
		System.out.println(idcheck);
		return idcheck;
		
	}
	
	@Override
	public int selectFmCount() {
		int count = sqlSession.selectOne(NS + "selectFmCount");
		return count;
	}

	@Override
	public int selectEtcCount() {
		int count = sqlSession.selectOne(NS + "selectEtcCount");
		return count;
	}

	@Override
	public int selectQcCount() {
		int count = sqlSession.selectOne(NS + "selectQcCount");
		return count;
	}

	@Override
	public int selectMsCount() {
		int count = sqlSession.selectOne(NS + "selectMsCount");
		return count;
	}

	@Override
	public ManagerDTO addManager(ManagerDTO manager) {
		sqlSession.insert(NS + "addManager", manager);
		return manager;
	}

	@Override
	public int selectCount() {
		int count = sqlSession.selectOne(NS + "selectCount");
		return count;
	}

	@Override
	public int selectSearchCount(String name) {
		String mgr_name = name;
		int count = sqlSession.selectOne(NS + "selectSearchCount" + mgr_name);
		return count;
	}

	@Override
	public void deleteManager(String id) {
		String mgr_id = id;
		System.out.println(mgr_id);
		sqlSession.delete(NS + "deleteManager", mgr_id);
	}

	@Override
	public List<ManagerDTO> selectSearchList(String name) {
		String mgr_name = name;
		List<ManagerDTO> selectSearchList = sqlSession.selectList(NS
				+ "selectnameList", mgr_name);
		System.out.println(name);
		System.out.println(mgr_name);
		return selectSearchList;
	}



	@Override
	public ManagerDTO getManager(String id) {
		String mgr_id = id;
		ManagerDTO manager = sqlSession.selectOne(NS + "getManager", mgr_id);
		return manager;
	}
	
	@Override
	public int getId(String checkid) {
		int count = sqlSession.selectOne(NS + "getId", checkid);
		
		return count;
	}
	/*
	 * @Override public ManagerDTO addManager(ManagerDTO manager) {
	 * sqlSession.insert(NS + "addManager", manager);
	 * System.out.println(manager); return manager; }
	 */

}
