package ch04;

public class ThreadTest03 { 

    public static void main(String[] args) { 
        MyObj obj = new MyObj(); 
         
        MyThread03 t1 = new MyThread03(1, obj); 
        MyThread03 t2 = new MyThread03(2, obj); 
        MyThread03 t3 = new MyThread03(3, obj); 
  
      t1.start(); 
        t2.start(); 
        t3.start(); 
    } 

} 

class MyThread03 extends Thread{ 
    int flag; 
    MyObj obj; 
    public MyThread03(int flag, MyObj obj){ 
        this.flag = flag; 
        this.obj = obj; 
    } 
    public void run(){ 
        if(flag == 1){ 
            obj.printA(); 
        }else if(flag == 2){ 
            obj.printB(); 
        }else if(flag == 3){ 
            obj.printC(); 
        } 
    } 
} 


class MyObj{ 
    public synchronized void printA(){ 
        for(int i =0; i < 10; i++){ 
            System.out.print("*"); 
            try{ 
                Thread.sleep(300 + (long)Math.random() * 1000); 
            }catch(Exception ex){} 
        } 
    } 
    public synchronized  void printB(){ 
        for(int i =0; i < 10; i++){ 
            System.out.print("+"); 
            try{ 
                Thread.sleep(300 + (long)Math.random() * 1000); 
            }catch(Exception ex){} 
        } 
    } 
    public void printC(){ 
        for(int i =0; i < 10; i++){ 
            System.out.print("-"); 
            try{ 
                Thread.sleep(300 + (long)Math.random() * 1000); 
            }catch(Exception ex){} 
        } 
    }     
} 