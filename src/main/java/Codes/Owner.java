package Codes;

public class Owner extends User {

	public Owner(String username, String password, String pId, String type, int logged, String phoneNum) {
		super(username, password, pId, type, logged, phoneNum);
		 this.setType("Owner");
	}
	
  private String name;

  
  
  
 
  
public Owner(String username, String password, String pId, String type, int logged, String phoneNum, String name) {
	super(username, password, pId, type, logged, phoneNum);
	this.name = name;

}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}

  
	
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
