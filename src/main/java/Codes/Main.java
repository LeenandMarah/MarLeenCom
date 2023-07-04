package Codes;

import java.util.Scanner;
import java.util.logging.*;
import java.util.logging.Logger;

import jdk.jfr.internal.*;
import Codes.MyData;

public class Main {
	static Scanner input = new Scanner(System.in);

	private static final Logger LOGGER = Logger.getLogger(Main.class.getName());

	public static void main(String[] args) {
		  MyData d=new MyData();
		  String command;
		  
		LOGGER.info("-> -> -> -> -> -> -> -> -> ->Sakan Marlee <- <- <- <- <- <- <- <- <- <-");
		
		
		
		
		while(true) {
		LOGGER.info("Enter username:");
		String username=input.nextLine();
		LOGGER.info("Enter password:");
		String password=input.nextLine();
		 d.checkLogin(username,password);
		   
	       if(!d.adminIsLogged&&!d.ownerIsLogged&&!d.tenantIsLogged) {
	    	   d.showError();
	    	  
	       }
		
	       if(d.adminIsLogged){
	    	   LOGGER.info("-> -> -> -> -> -> -> -> -> -> Welcome Admin "+username+"  <- <- <- <- <- <- <- <- <- <-");
	    	    
	    	   while(d.adminIsLogged) {
	    		 command=input.nextLine(); 
	    		 if(command.equals("LogOut")){
	    			 d.logOut("Admin");
	    			 LOGGER.info("Bye Admin");
	    			
	    			 break;
	    		 }
	    	   }
	    	   LOGGER.info("hi");
	     // continue;
	       }
	       
	       if(d.ownerIsLogged){
	    	   LOGGER.info("-> -> -> -> -> -> -> -> -> -> Welcome Owner "+username+"  <- <- <- <- <- <- <- <- <- <-");
	    	   while(d.ownerIsLogged) {
		    		 command=input.nextLine(); 
		    		 if(command.equals("LogOut")){
		    			 d.logOut("Owner");
		    			 LOGGER.info("Bye Owner");
		    			
		    			 break;
		    		 }
	       }
	    	  
	       }
       
	       if(d.tenantIsLogged){
	    	   LOGGER.info("-> -> -> -> -> -> -> -> -> -> Welcome Tenant "+username+"  <- <- <- <- <- <- <- <- <- <-");
	    	    while(d.tenantIsLogged) {
		    		 command=input.nextLine(); 
		    		 if(command.equals("LogOut")){
		    			 d.logOut("Tenant");
		    			 LOGGER.info("Bye Tenant");
		    			
		    			 break;
		    		 }
		    		 
		    		 if(command.equals("Dashboard")) {
		    	       LOGGER.info("-> -> -> -> -> -> -> -> -> -> Tenant Dashboard  <- <- <- <- <- <- <- <- <- <-");
		    	       LOGGER.info("                   ------------Aviable Houses---------"                            );
		    	       
		    	       
		    		 }
	    	    }
	    	 
	       }
	       
		     }  
	    }
}
