package OOP_141224;

import java.util.ArrayList;
import java.util.List;

import OOP_141223.User;

public class Test_List_01 {

	public static void main(String[] args) {
		List<User> userlist = new ArrayList<User>();
		
		User u1 = new User("u001");
		userlist.add(u1);
		
		User u2 = userlist.get(0);
		
		if(u1 == u2){
			System.out.println("같은 레퍼런스이다.");
		}
	}

}
