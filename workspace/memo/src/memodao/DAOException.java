package memodao;

// 사용자 Exception 정의
public class DAOException extends RuntimeException{
	public DAOException(Exception e){
		super(e);
	}
	
	public DAOException(String msg){
		super(msg);
	}
}
