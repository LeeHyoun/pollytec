package baedo.baedoDAO;

import java.util.List;

import baedo.baedoDTO.ManagerDTO;


public interface ManagerDAO {
	public List<ManagerDTO> selectList(int pg);
	public List<ManagerDTO> selectmsList(int pg);
	public List<ManagerDTO> selectqcList(int pg);
	public List<ManagerDTO> selectfmList(int pg);
	public List<ManagerDTO> selectetcList(int pg);
	public int selectCount();
	public int selectFmCount();
	public int selectEtcCount();
	public int selectMsCount();
	public int selectQcCount();
	public int selectSearchCount(String name);
	public ManagerDTO getManager(String id);
	public ManagerDTO getReport(String id);
	public void deleteManager(String id);
	public String idcheck(String id);
	public int getId(String checkid);
	public List<ManagerDTO> selectSearchList(String name);
	public ManagerDTO addManager(ManagerDTO manager);
	public ManagerDTO getModify(ManagerDTO manager);
}
