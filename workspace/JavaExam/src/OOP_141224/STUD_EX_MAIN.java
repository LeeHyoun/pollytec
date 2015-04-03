package OOP_141224;
/**
 * 입출금관리
 * @author 이현
 *
 */
public class STUD_EX_MAIN {
	/**
	 * 통장잔액 5000 에서의 입출금
	 * @param 잔액에 대한 입출금 관리
	 */
	public static void main(String[] args) {
		STUD_EX account = new STUD_EX(5000);
        
		account.deposit(1000);
        System.out.println(account.toString()); 
        
        account.withdraw(5000); 
        System.out.println(account); 
        
        account.withdraw(3000); 
        System.out.println(account.toString()); 

	}

}
