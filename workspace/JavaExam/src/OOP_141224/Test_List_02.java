package OOP_141224;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import OOP_141223.User;


public class Test_List_02 {

	public static void main(String[] args) {
		List<User> userlist = new ArrayList<User>();
		
		User u1 = new User("u001");
		User u2 = new User("u002");
		User u3 = new User("u003");
		User u4 = new User("u004");
		User u5 = new User("u005");
		
		userlist.add(u1);
		userlist.add(u2);
		userlist.add(u3);
		userlist.add(u4);
		userlist.add(u5);
		
		Iterator<User> iterator = userlist.iterator();
		
		while(iterator.hasNext()){
			User str = iterator.next();
			String userid = str.getUserId();
			System.out.println(userid);
		}
		System.out.println("---------");
		
		for (User user : userlist) {
			System.out.println(user.getUserId());
		}
		
		System.out.println("------");
		System.out.println(u1);
		System.out.println(u2);
		System.out.println(u3);
		System.out.println(u4);
		System.out.println(u5);
		
		System.out.println("-----");
		System.out.println(userlist);
	}

}
