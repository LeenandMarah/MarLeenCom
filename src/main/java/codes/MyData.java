package codes;
import java.util.Scanner;
import java.util.logging.Logger;

import db.UserInfo;

public class MyData {
	static Scanner input = new Scanner(System.in);
	private static final Logger LOGGER = Logger.getLogger(MyData.class.getName());
	public static   boolean adminIsLogged;
	public static   boolean ownerIsLogged;
	public  static  boolean tenantIsLogged;
	public String type;
	public static boolean requst=false;
	public static String answer;
	
	public void showError() {
	    
		LOGGER.info("You must Enter  a Real user");
		
		
	}
	String userName;
	String password;
	
	public static String buldingid;
	
	public static String apID;
	public static String photo;
	public static int numofbeds;
	public static int numofbath;
	public static int balcon;
	public static int floor;
	public static int max;
	public static int price;
	
	
   
    public  User checkLogin(String username,String password) {
    	
         for (User u : UserInfo.users) {
        	 if(u.getUsername().equals(username)&&u.getPassword().equals(password)) {
        		
        		 if(u.getType().equals("Admin")) {
        			 adminIsLogged=true;
        			 return u;
        			
        			 
        		 }
        		 
        		 if(u.getType().equals("Owner")) {
        			 
        			 ownerIsLogged = true;
        			 return u;
        		 }
        		 
        		 if(u.getType().equals("Tenant")) {
        			 tenantIsLogged=true;
        			 return u;
        		 }
        		 
        		 
        		 
        		 
        	 }
         }
         return null;
        	 
         }

    public void logIn() {
    	 adminIsLogged=true;
    	 ownerIsLogged = true;
    	 tenantIsLogged=true;
    	
    }


	public void logOut(String type) {
		if(type.equals("Admin")) {
			 adminIsLogged=false;
		}
		if(type.equals("Owner")) {
			 ownerIsLogged=false;
		}
		if(type.equals("Tenant")) {
			 tenantIsLogged=false;
		}
		
		
		
		
		
	}




	public static String sendRequest() {
		
		LOGGER.info("you have new request "+"\n"+apID+" "+ photo+" " +numofbeds+" "+numofbath+" "+balcon+" "+floor+" "+max+" "+price);
		
		LOGGER.info("Accept ? yes or no");
		answer=input.next();
		return answer;
		
		
	}




	public static void saveRequest(String buldingid1, String apID1, String photo1, int numofbeds1, int numofbath1, int balcon1,
			int floor1, int max1, int price1) {
		
		buldingid=buldingid1;
		apID=apID1;
		photo=photo1;
		numofbeds=numofbeds1;
		numofbath=numofbath1;
		balcon= balcon1;
		floor=floor1;
		max=max1;
		price=price1;
		
	}




	
    
	


	
}
