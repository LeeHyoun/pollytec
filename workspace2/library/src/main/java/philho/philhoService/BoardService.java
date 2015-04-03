package philho.philhoService;

import java.util.List;

import philho.philhoDTO.BoardDTO;

public interface BoardService {
	public List<BoardDTO> getList(int page);
	public int getCount();
	public BoardDTO addBoard(BoardDTO board);
	public BoardDTO readBoard(BoardDTO boardDTO);
	public void updateBoard(BoardDTO boardDTO);
	public List<BoardDTO> getList();
	public void boarddelete(int boardSeq);
	public int getCount2(String searchValue);
	public List<BoardDTO> getList(int ipg, String searchValue);
	public List<BoardDTO> getList2(int ipg, String searchValue);
	public int getCount3(String searchValue);

}
