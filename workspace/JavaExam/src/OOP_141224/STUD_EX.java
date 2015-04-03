package OOP_141224;

public class STUD_EX {
	//멤버변수 (프로퍼티)
	private int balance; //잔액
	    
    
	//생성자.
    public STUD_EX(int amount){  
        this.balance = amount; 
    };
    
    
    //예금하는 메소드
    public void deposit(int amount) {
        this.balance += amount;        
    }    
    
    //인출하는 메소드
    public void withdraw(int amount) {
        
        if(amount <= this.balance) {
            this.balance -= amount;
            System.out.println(amount+"원 출금 되었습니다.");
        } else { //(amount > this.balance)
            System.out.println("잔액이 부족합니다.");
        }        
    }
    
    //객체를 문자열로 표현하는 메소드. 여기서는 잔액을 표시
    public String toString() {        
        return "잔액 : " + this.balance;
    }
}
