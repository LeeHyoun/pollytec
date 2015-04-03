package kr.co.datastreams.board2.dao;

public class DAOException extends RuntimeException{
	public DAOException(Exception e){
		super(e);
	}
	
	public DAOException(String msg){
		super(msg);
	}
}
