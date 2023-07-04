package Codes;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

import DB.UserInfo;

public class MyData {
	private static final Logger LOGGER = Logger.getLogger(MyData.class.getName());
	  public  boolean adminIsLogged;
	public   boolean ownerIsLogged;
	public   boolean tenantIsLogged;
	public String type;
	

	public void showError() {
	    
		LOGGER.info("You must Enter  a Real user");
		
	}
	
	
	
   
    public  void checkLogin(String username,String password) {
    	
         for (User u : UserInfo.users) {
        	 if(u.getUsername().equals(username)&&u.getPassword().equals(password)) {
        		
        		 if(u.getType().equals("Admin")) {
        			 adminIsLogged=true;
        			
        			 
        		 }
        		 
        		 if(u.getType().equals("Owner")) {
        			 ownerIsLogged = true;
        		 }
        		 
        		 if(u.getType().equals("Tenant")) {
        			 tenantIsLogged=true;
        		 }
        		 
        		 
        		 
        		 
        	 }
         }
        	 
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
    
    
	


	
}
