package java_201501;

import java.io.File;

/**
 * IO 실습
 * 2015년 01월 22일
 * @author 이현
 *
 */
public class FileTest {

	public static void main(String[] args) {
		// JAVA파일 이하의 파일 목록을 보여라
			
	    File f = new File("c:\\"); // \\ -> \ 
	    if(f.isDirectory()){ 
	        System.out.println("directory"); 
	        File[] listFiles = f.listFiles(); 
	        for (File file : listFiles) { 
	            System.out.println(file.getName()); 
	        } 
	    }else if(f.isFile()){ 
	        System.out.println("file"); 
	        long length = f.length(); 
	        System.out.println(length); 
	    } 
	     
		
    } // main 

}
