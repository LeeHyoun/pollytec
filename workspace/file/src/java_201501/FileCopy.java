package java_201501;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.security.InvalidParameterException;

/**
 * IO 실습
 * 2015년 01월 22일
 * @author 이현
 *	2) byte[] 로 읽어서 byte[] 쓰는 방법 

InputStream in = null; // 읽기 위한 객체 
OutputStream out = null;  // 쓰기 위한 객체 
try{ 
    // in 을 초기화 
    // out을 초기화 
    int readCount = -1; 
    byte[] buffer = new byte[1024]; 
    // read메소드는 바이트 배열로 읽은다. 최대 1024만큼 
    // 그리고 읽어들인 수를 리턴. 
    // 파일의 끝이라면 읽어들인 수가 -1을 반환한다. 
    while(( readCount = in.read(buffer) ) != -1){ 
            // buffe의 0번째부터 readCount만큼 쓴다. 
        out.write(buffer, 0, readCount); 
    } 

}catch(Exception e){ 
    throw new RuntimeException(e); 
}finally{ 
    if(in != null){ 
        in.close(); 
    } 
    if(out != null){ 
        out.close(); 
    } 
} 
 */


public class FileCopy { 
    public static void main(String[] args) { 
        try{ 
            String src = "C:\\Windows\\explorer.exe"; 
            String dest = "c:\\temp\\e.exe"; 
            long start = System.currentTimeMillis(); 
            fileCopy(src, dest); 
            long end = System.currentTimeMillis(); 
            System.out.println(end - start); 
        }catch(Exception ex){ 
            ex.printStackTrace(); 
        } 
    } 

    public static void fileCopy(String src, String dest)  
        throws Exception{ 
        
    	File srcFile = new File(src); 
        File destFile = new File(dest); 
        
        if(!srcFile.exists()){ //파일이 있는지 없는지
            throw new InvalidParameterException("없는 파일입니다."); 
        } 
         
        // srcFile 의 내용을 읽어서 destFile로 복사하는 코드 
        InputStream in = null; // 읽기 위한 객체 
        OutputStream out = null;  // 쓰기 위한 객체 
        try{ 
        	// 추상클래스로 선언되어있어 자식클래스를 인스턴스로 하여 사용한다.
            // in 을 초기화 
            in = new FileInputStream(srcFile); 
            // out을 초기화 
            out = new FileOutputStream(destFile); 
             
            int readCount = -1; 
            byte[] buffer = new byte[1024]; 
            // read메소드는 바이트 배열로 읽은다. 최대 1024만큼 
            // 그리고 읽어들인 수를 리턴. 
            // 파일의 끝이라면 읽어들인 수가 -1을 반환한다. 
            while(( readCount = in.read(buffer) ) != -1){ 
                    // buffe의 0번째부터 readCount만큼 쓴다. 
                out.write(buffer, 0, readCount); 
            } 
        }catch(Exception e){ 
            throw new RuntimeException(e); 
        }finally{ 
        	// 꼭 사용후 닫기 
            if(in != null){ 
                in.close(); 
            } 
            if(out != null){ 
                out.close(); 
            } 
        } 
    } 
} 



