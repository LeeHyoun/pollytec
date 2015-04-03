package examples.spring.ch04.nativejdbc;

public class MagazineTest {
	
	public static void main(String[] args){
		MagazineDAO mdao = new MagazineDAO();
		System.out.println(mdao.findMagazine(2));
	}
}
