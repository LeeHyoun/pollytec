package sinsung.sinsungDAO;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import sinsung.sinsungDTO.MgrUsrStDTO;
import sinsung.sinsungDTO.StConditionDTO;
import sinsung.sinsungDTO.UsrRentDueDTO;

@Repository
public class MgrStDAOImpl implements MgrStDAO{
	
	@Autowired
	private SqlSession sqlSession;
	
	private static final String NS = "com.library.mybatis.mgrUsrSt.";
	
	@Override
	public List<MgrUsrStDTO> UsrStList(int ipg) {
		
		int start = ipg * 10 - 10 + 1;
		int end = ipg * 10;
		
		philho.philhoDTO.BoardSearchParamDTO boardSearchParamDTO = new philho.philhoDTO.BoardSearchParamDTO();
		boardSearchParamDTO.setStart(start);
		boardSearchParamDTO.setEnd(end);
		
		List<MgrUsrStDTO> usrStList = sqlSession.selectList(NS + "UsrStList", boardSearchParamDTO);
		//System.out.println(usrStList);
		return usrStList;
	}
	
	@Override
	public List<UsrRentDueDTO> UsrRent5List(String usrId) {
		List<UsrRentDueDTO> rent5List = sqlSession.selectList(NS + "RentList5", usrId);
		//System.out.println(rent5List);
		return rent5List;
	}
	
	@Override
	public List<UsrRentDueDTO> UsrRentList(String usrId){
		List<UsrRentDueDTO> rentList = sqlSession.selectList(NS + "RentList", usrId);
		System.out.println(rentList);
		return rentList;
	}

	@Override
	public MgrUsrStDTO UsrSt(String usrId) {
		MgrUsrStDTO usrSt = sqlSession.selectOne(NS + "getUsrSt", usrId);
		return usrSt;
	}

	@Override
	public List<UsrRentDueDTO> UsrDue5List(String usrId) {
		List<UsrRentDueDTO> due5List = sqlSession.selectList(NS + "DueList5", usrId);
		return due5List;
	}

	@Override
	public List<UsrRentDueDTO> UsrDueList(String usrId) {
		List<UsrRentDueDTO> dueList = sqlSession.selectList(NS + "DueList", usrId);
		return dueList;
	}

	@Override
	public List<UsrRentDueDTO> UsrOverDue5List(String usrId) {
		List<UsrRentDueDTO> overdue5List = sqlSession.selectList(NS + "OverDueList5", usrId);
		return overdue5List;
	}

	@Override
	public List<UsrRentDueDTO> UsrOverDueList(String usrId) {
		List<UsrRentDueDTO> overdueList = sqlSession.selectList(NS + "OverDueList", usrId);
		return overdueList;
	}

	@Override
	public List<UsrRentDueDTO> UsrHarm5List(String usrId) {
		List<UsrRentDueDTO> harm5List = sqlSession.selectList(NS + "HarmList5", usrId);
		return harm5List;
	}

	@Override
	public List<UsrRentDueDTO> UsrHarmList(String usrId) {
		List<UsrRentDueDTO> harmList = sqlSession.selectList(NS + "HarmList", usrId);
		
		return harmList;
	}

	@Override
	public List<UsrRentDueDTO> UsrMiss5List(String usrId) {
		List<UsrRentDueDTO> miss5List = sqlSession.selectList(NS + "MissList5", usrId);
		return miss5List;
	}

	@Override
	public List<UsrRentDueDTO> UsrMissList(String usrId) {
		List<UsrRentDueDTO> missList = sqlSession.selectList(NS + "MissList", usrId);
		return missList;
	}

	@Override
	public List<UsrRentDueDTO> UsrNotReturn5List(String usrId) {
		List<UsrRentDueDTO> notReturnList5 = sqlSession.selectList(NS + "NotReturnList5", usrId);
		return notReturnList5;
	}

	@Override
	public List<UsrRentDueDTO> UsrNotReturnList(String usrId) {
		List<UsrRentDueDTO> notReturnList = sqlSession.selectList(NS + "NotReturnList", usrId);
		return notReturnList;
	}
	
	@Override
	public int selectCount() {
		int count = sqlSession.selectOne(NS + "selectCount");
		return count;
	}

	@Override
	public List<MgrUsrStDTO> SortStList(StConditionDTO stconDTO, int ipg) {
		int start = ipg * 10 - 10 + 1;
		int end = ipg * 10;
		
		philho.philhoDTO.BoardSearchParamDTO boardSearchParamDTO = new philho.philhoDTO.BoardSearchParamDTO();
		boardSearchParamDTO.setStart(start);
		boardSearchParamDTO.setEnd(end);
		
		HashMap<String, Object> map = new HashMap<String, Object>();
		map.put("BoardSearchParam", boardSearchParamDTO);
		map.put("StCondition", stconDTO);
		
		
		List<MgrUsrStDTO> usrStList = sqlSession.selectList(NS + "sortSearch", map);
		
		return usrStList;
	}

	@Override
	public List<MgrUsrStDTO> WordStList(StConditionDTO stconDTO) {
		List<MgrUsrStDTO> usrStList = sqlSession.selectList(NS + "wordSearch", stconDTO);
		return usrStList;
	}

	

}
