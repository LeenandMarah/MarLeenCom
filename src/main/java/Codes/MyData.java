package Codes;
import java.util.Scanner;

import java.util.ArrayList;

import java.util.List;
import java.util.logging.Logger;

import DB.BuldingInfo;
import DB.UserInfo;

public class MyData {
	static Scanner input = new Scanner(System.in);
	private static final Logger LOGGER = Logger.getLogger(MyData.class.getName());
	  public  boolean adminIsLogged;
	public   boolean ownerIsLogged;
	public   boolean tenantIsLogged;
	public String type;
	public static boolean requst=false;
	public static String answer;
	
	public void showError() {
	    
		LOGGER.info("You must Enter  a Real user");
		
		
	}
	
	public String buldingid;
	
	public String apID;
	public String photo;
	public int numofbeds;
	public int numofbath;
	public int balcon;
	public int floor;
	public int max;
	public int price;
	
	
	
   
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




	public String sendRequest() {
		
		System.out.println("you have new request "+"\n"+apID+" "+ (String) photo+" " +numofbeds+" "+numofbath+" "+balcon+" "+floor+" "+max+" "+price);
		// TODO Auto-generated method stub
		System.out.println("Accept ? yes or no");
		answer=input.next();
		return answer;
		
		
	}




	public void saveRequest(String buldingid1, String apID1, String photo1, int numofbeds1, int numofbath1, int balcon1,
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
		 
		
		
		// TODO Auto-generated method stub
		
	}




	
    
	


	
}
