package db;

import java.util.ArrayList;
import java.util.List;

import codes.*;

public class UserInfo {
	
	private UserInfo() {
		throw new IllegalStateException("Hi");
	}
	
	public static List<User> users = new ArrayList<>();
	public static List<Tenants> tenants = new ArrayList<>();
	
	
	static {
	
	
		
    User u =new User("leen","123marah","1","Admin","123456");
    User s =new User("marah","123leen","2","Owner","1234567");
    
    
    
    User e =new User("fuad","123f","3","Tenant","12345677");

   
	
    User t =new User("toto","123f","4","Tenant","12345677");
    Tenants tt=new Tenants("fuad","123f","3","Tenant","12345677");
    tt.setAge("19");
    tt.setMajor("CE");
    tt.setName("fuad fuad");
    tt.setApartId("");
    Tenants ttt=new Tenants ("toto","123f","4","Tenant","12345677");
     
    ttt.setAge("20");
    ttt.setMajor("CEE");
    ttt.setName("Tala");
    ttt.setApartId("2");
   
 		   
   tenants.add(tt);
   tenants.add(ttt);
   
    users.add(u);
    users.add(s);
    users.add(e);
    users.add(t);
	}
		


}
