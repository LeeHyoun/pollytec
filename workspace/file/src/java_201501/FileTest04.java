package java_201501;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.PrintWriter;


public class FileTest04 { 

    public static void main(String[] args) throws Exception{
    	int i = 5;
    	double d = 20.4;
    	boolean b = true;
    	
    	FileOutputStream fos = new FileOutputStream("c://Temp//a.dat");
    	DataOutputStream dos = new DataOutputStream(fos);
    	
    	dos.writeInt(i);
    	dos.writeDouble(d);
    	dos.writeBoolean(b);
    	dos.close();
    	
    	FileInputStream fis = new FileInputStream("c://Temp//a.dat");
    	DataInputStream dis = new DataInputStream(fis);
    	
    	// 저장순서와 똑같이 읽어온다.
    	i = dis.readInt();
    	d = dis.readDouble();
    	b = dis.readBoolean();
    	
    	System.out.println("int i = " +i);
    	System.out.println("double d = " +d);
    	System.out.println("boolean b = " +b);
    	
    	dis.close();
    } 

} 