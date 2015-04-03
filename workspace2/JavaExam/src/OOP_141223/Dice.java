package OOP_141223;
/**
 * 내가 만든 주사위
 * @author 이현(전화하십쇼)
 *
 */
public class Dice {
	/**
	 * 1~6사의 랜덤한 값을 리턴한다.
	 * @return 1~6사이의 값
	 */
	public static int get(){
		
		double random = Math.random();
		random = random * 6;  		
		
		int value = (int)random; 
		value = value + 1;
		
		return value;
	}
}
