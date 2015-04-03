package sinsung.sinsungDAO;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import sinsung.sinsungDTO.MgrUsrDTO;
import sinsung.sinsungDTO.MgrUsrStDTO;
import sinsung.sinsungDTO.UsrRentDueDTO;

@Repository
public class MgrDAOImpl implements MgrDAO{
	
	@Autowired
	private SqlSession sqlSession;
	
	private static final String NS = "com.library.mybatis.mgrUsr.";

	@Override
	public List<MgrUsrDTO> UsrList(int ipg) {
		
		int start = ipg * 10 - 10 + 1;
		int end = ipg * 10;
		
		philho.philhoDTO.BoardSearchParamDTO boardSearchParamDTO = new philho.philhoDTO.BoardSearchParamDTO();
		boardSearchParamDTO.setStart(start);
		boardSearchParamDTO.setEnd(end);

		List<MgrUsrDTO> usrList = sqlSession.selectList(NS + "getUsrList", boardSearchParamDTO);
		//System.out.println(usrList);
		return usrList;
	}

	@Override
	public MgrUsrDTO getUsr(String usrId) {
		MgrUsrDTO usrDTO = sqlSession.selectOne(NS + "getUsr", usrId);
		return usrDTO;
	}


	@Override
	public MgrUsrDTO updateUsr(MgrUsrDTO usrDTO) {
		sqlSession.update(NS + "updateUsr", usrDTO);
		return usrDTO;
	}

	@Override
	public List<MgrUsrDTO> getUsrName(String usrName) {
		List<MgrUsrDTO> usrList = sqlSession.selectList(NS + "getUsrName", usrName);
		return usrList;
	}

	@Override
	public List<MgrUsrDTO> getUsrId(String usrId) {
		List<MgrUsrDTO> usrList = sqlSession.selectList(NS + "getUsr", usrId);
		return usrList;
	}
	
	@Override
	public int selectCount() {
		int count = sqlSession.selectOne(NS + "selectCount");
		return count;
	}

}
