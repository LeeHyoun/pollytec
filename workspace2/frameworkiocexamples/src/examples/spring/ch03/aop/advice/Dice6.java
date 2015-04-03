package examples.spring.ch03.aop.advice;

public class Dice6 implements Dice {
	
	public int getDiceValue() {
		int num = (int) (Math.random() * 6) + 1;
		System.out.println("1~6까지 발생한 수 : " + num);
		return num;
	}
}
