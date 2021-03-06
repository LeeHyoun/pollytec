package ch04;

public class ThreadTest01 {

	public static void main(String[] args) {
		// 3) 인스턴스를 만든다.
		MyThread01 t1 = new MyThread01("*");
		MyThread01 t2 = new MyThread01("+");
		MyThread01 t3 = new MyThread01("-");
		
		// 4) 쓰레드를 실행 한다.
		t1.start();
		t2.start();
		t3.start();
		
		System.out.println("프로그램 종료");
	}
	
}

// 1) 쓰레드 클래스는 Thread를 상속받는다.
class MyThread01 extends Thread{
	String str;
	
	public MyThread01(String str){
		this.str = str;
	}
	
	// 2) 하고 싶은 작업이 있으면 run() 메소드를 오버라이딩한다.  
	public void run(){
		for (int i = 0; i < 100; i++) {
			System.out.print(str);
			
			try {
				Thread.sleep( 300 + (long)Math.random() * 1000);
			} catch (Exception e) {}
		} //for
	} //run
}
