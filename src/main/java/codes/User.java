package codes;

import db.UserInfo;

public class User {
	private String username;
	private String password;
	private String pId;
	private String type;
	private String phoneNum;
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getpId() {
		return pId;
	}
	public void setpId(String pId) {
		this.pId = pId;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	public User(String username, String password, String pId, String type,String phoneNum) {
		super();
		this.username = username;
		this.password = password;
		this.pId = pId;
		this.type = type;
		
		this.phoneNum=phoneNum;
	}
	
	public User() {

	}

	public String getPhoneNum() {
		return phoneNum;
	}
	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}
	
		
	
	public static boolean changeOwnerPhoneNumber(String id, String phone2) {
		User u =new User();

			u= User.findMyUser(id);
			u.setPhoneNum(phone2);
			 return true;

	}
	private static User findMyUser(String id) {
		for (User a: UserInfo.users)
		{
			if(a.getpId().equals(id)) {
				 return a;

			}

		}
		return null;
	}

	public User findMyOwner(String id)
	{
		for (User a: UserInfo.users)
		{
			if(a.getpId().equals(id)&&a.getType().equals("Owner")) {
				 return a;

			}

		}
		return null;
	}
	
	
}
