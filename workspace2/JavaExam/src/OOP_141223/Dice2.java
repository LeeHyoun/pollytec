package OOP_141223;
/**
 * 주사위 프로그램
 * @author 이현2
 *
 */
public class Dice2 {
	/**
	 * 1~6사이의 주사위 값을 보여준다.
	 * @return 주사위 값
	 */
	public static int get(){
		double random = Math.random();
		random = random * 6;
		int value = (int)random + 1;
		return value;
	}
}
