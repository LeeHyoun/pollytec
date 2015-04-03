package ch04;

public class Exception_1 {
    public static void main(String[] args) { 
        TestObj01 obj = new TestObj01(); 
        int value = obj.divide(2, 0); 
        System.out.println(value); 
    } 
}

class TestObj01{ 
    public int divide(int i, int j){ 
        int value = 0; 
        value = i / j; 
       /* try {
        	value = i / j; 
		} catch (Exception e) {
			// TODO: handle exception
		}*/
        return value; 
    } 
} 


/*Exception in thread "main" java.lang.ArithmeticException: / by zero
at ch04.TestObj01.divide(divide_0.java:16)
at ch04.divide_0.main(divide_0.java:8)
*/