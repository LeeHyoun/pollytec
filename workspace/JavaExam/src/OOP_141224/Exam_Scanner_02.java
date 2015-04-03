package OOP_141224;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import OOP_141223.User;

public class Exam_Scanner_02 {
	
	//getUser
	private static User getUser() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("아이디 입력 ====> ");
		String userId = sc.nextLine();
		System.out.println("비  번 입력 ====> ");
		String password= sc.nextLine();
		System.out.println("이  름 입력 ====> ");
		String name = sc.nextLine();
		System.out.println("주  소 입력 ====> ");
		String address= sc.nextLine();
		
		User user = new User(userId, name, password, address);
		return user;
	}
	
	//MAIN
	public static void main(String[] args) {
		
		List<User> userlist = new ArrayList<User>();
		for (int i = 1; i < 6; i++) {
			System.out.println(i+"]번째 user 입력.------");
			userlist.add(getUser());
		}
		
		System.out.println("\n\n유저 정보 -----------");
		
		int i =1;
		System.out.println("아 이 디|비   번|이   름|주   소");
		for (User user : userlist) {
			System.out.println(user.getUserId()+":"+
							   user.getPassword()+":"+
							   user.getName()+":"+
							   user.getAddress());
		}
		
	}

}

