package Codes;

import java.util.Scanner;

import java.util.logging.*;
import java.util.logging.Logger;

import jdk.jfr.internal.*;
import Codes.MyData;
import DB.BuldingInfo;
import DB.apartmentinfo;

public class Main {
	static Scanner input = new Scanner(System.in);

	private static final Logger LOGGER = Logger.getLogger(Main.class.getName());

	public static void main(String[] args) {
		  MyData d=new MyData();
		  Apartment p;
		  String command;
		  String buldingid;
		  String apID;
		  int price;
		  int numofbeds;
		  int numofbath;
		  int balcon;
		  int max;
		  String photo;
		  int floor;
		  String bowner;
		  int floors;
		  int apnum;
		  String location;
		  int num;
		  int i;
		  
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
	    		 if(command.equals("add Building")) {
	    		 LOGGER.info("enter bulding id");
	    		 buldingid=input.nextLine();
	    		 LOGGER.info("enter owner id");
	    		 bowner=input.nextLine();
	    		 LOGGER.info("enter number of floors");
	    		 floors=input.nextInt();
	    		 LOGGER.info("enter bulding location");
	    		 location=input.nextLine();
	    		 LOGGER.info("enter number of apartments");
	    		 apnum=input.nextInt();
	    		 Building b=new Building(buldingid, bowner, floors, location, apnum);
	    		 BuldingInfo.buildings.add(b);
	    		num=BuldingInfo.buildings.size();
	    		 
	    		 
	    		 LOGGER.info(Integer.toString(num)+"hiiiiiii");
	    		 break;
	    		 }
	    		 if(command.equals("add Apartment")) 
	    		 {
	    			 LOGGER.info("enter bulding id");
		    		 buldingid=input.nextLine();
		    		if(DB.BuldingInfo.IfFound(buldingid))
		    		{
		    			 LOGGER.info("enter Apartment id");
		    			 apID=input.nextLine();
			    		 LOGGER.info("enter photo");
			    		 photo=input.nextLine();
			    		 LOGGER.info("enter number of bedrooms");
			    		 numofbeds=input.nextInt();
			    		 LOGGER.info("enter number of Bathrooms");
			    		 numofbath=input.nextInt();
			    		 LOGGER.info("enter enter number of Balcons");
			    		 balcon=input.nextInt();
			    		 LOGGER.info("enter number of floor");		    		 
			    		 floor=input.nextInt();
			    		 LOGGER.info("enter number of people");
			    		 max=input.nextInt();
			    		 LOGGER.info("enter price");
			    		 price=input.nextInt();
			    		// p.addApartment(buldingid,apID,photo, numofbeds,numofbath, balcon, floor,max,price)	;		
			    		num=apartmentinfo.apartments.size();
			    		 LOGGER.info(Integer.toString(num)+"hiiiiiii");
			    		 break;
			    		 
		    		}
		    		else
		    		{
		    			 LOGGER.info("Opps! no such building");
		    		}
		    		 
	    		 }
	    		 if(command.equals("change apartment photo")) 
	    		 {
	    			 LOGGER.info("enter Apartment id");
	    			 apID=input.nextLine();
	    			 if(DB.apartmentinfo.IfFoundap(apID))
			    		{
	    				 Apartment ap =new Apartment();
	    				ap= DB.apartmentinfo.findmyapartment(apID);
	    				LOGGER.info("enter new photo");
		    			 photo=input.nextLine();
		    			 ap.setPhoto(photo);
		    			 LOGGER.info(ap.getPhoto());
	    				
			    		}
	    			 else
			    		{
			    			 LOGGER.info("Opps! no such apartment");
			    		}
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
