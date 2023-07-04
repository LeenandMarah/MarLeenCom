package DB;

import java.util.ArrayList;
import java.util.List;

import Codes.User;

public class UserInfo {
	
	private UserInfo() {
		throw new IllegalStateException("Hi");
	}
	
	public static List<User> users = new ArrayList<>();
	
	static {
	
	
		
    User u =new User("leen","123marah","1","Admin","123456");
    User s =new User("marah","123leen","2","Owner","1234567");
    User e =new User("fuad","123f","3","Tenant","12345677");
	
	
	
    users.add(u);
    users.add(s);
    users.add(e);
	}
		


}
