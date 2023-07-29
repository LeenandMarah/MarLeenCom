package codes;

import java.util.Scanner;

import java.util.logging.Logger;


import dB.Apartmentinfo;
import dB.BuldingInfo;
import dB.FurnetureInfo;

public class Main {
	static Scanner input = new Scanner(System.in);

	private static final Logger LOGGER = Logger.getLogger(Main.class.getName());

	public static void main(String[] args) {
		  MyData d=new MyData();
		  Apartmentinfo f=new Apartmentinfo();
		  String command;
		  String buldingid;
		  String apID;
		  String answer="";
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
		  int r;
		  boolean studentType;
		  String nc;
           FurnetureInfo fur=new FurnetureInfo();
 

		LOGGER.info("-> -> -> -> -> -> -> -> -> ->Sakan Marlee <- <- <- <- <- <- <- <- <- <-");
		
		
		
		
		while(true) {
		LOGGER.info("Enter username:");
		String username=input.nextLine();
		LOGGER.info("Enter password:");
		String password=input.nextLine();
		User u =new User();
		u.setUsername(username);
		u.setPassword(password);
		 u= d.checkLogin(u.getUsername(),u.getPassword());
		   
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
	    		 if(command.equals("See Request")){
	    			 if(d.requst)
	    			 {
	    				 d.requst=false;
	    				answer= d.sendRequest();
	    				 if (answer.equals("yes"))
	    				 {
	    					Apartment.addApartment(d.buldingid, d.apID, d.photo, d.numofbeds,d.numofbath, d.balcon, d.floor, d.max, d.price);
	    				 }

	    			 }
	    			 else
	    			 {
	    				 LOGGER.info("NO RQUESTS");
	    			 }

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
		    		if(dB.BuldingInfo.IfFound(buldingid))
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

			    		num=Apartmentinfo.apartments.size();
			    	 Apartment.addApartment(buldingid,apID,photo, numofbeds,numofbath, balcon, floor,max,price)	;
			    		num=Apartmentinfo.apartments.size();
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
	    			 if(dB.Apartmentinfo.ifFoundap(apID))
			    		{
	    				 Apartment ap =new Apartment();
	    				ap= dB.Apartmentinfo.findmyapartment(apID);
	    				LOGGER.info("enter new photo");
		    			 photo=input.nextLine();
		    			Apartment.changeApartmentPhoto(apID, photo);

			    		}
	    			 else
			    		{
			    			 LOGGER.info("Opps! no such apartment");
			    		}
	    		 }

	    		 if(command.equals("change apartment price"))
	    		 {
	    			 LOGGER.info("enter Apartment id");
	    			 apID=input.nextLine();
	    			 if(dB.Apartmentinfo.ifFoundap(apID))
			    		{

	    				LOGGER.info("enter new price");
		    			 price=input.nextInt();
		    			Apartment.changeApartmentPrice(apID, price);

			    		}
	    			 else
			    		{
			    			 LOGGER.info("Opps! no such apartment");
			    		}
	    		 }

	    		 if(command.equals("change apartment max"))
	    		 {
	    			 LOGGER.info("enter Apartment id");
	    			 apID=input.nextLine();
	    			 if(dB.Apartmentinfo.ifFoundap(apID))
			    		{

	    				LOGGER.info("enter new max");
		    			max=input.nextInt();
		    			Apartment.changeApartmentMax(apID, max);

			    		}
	    			 else
			    		{
			    			 LOGGER.info("Opps! no such apartment");
			    		}
	    		 }

	    		 if(command.equals("change apartment student Type"))
	    		 {
	    			 LOGGER.info("enter Apartment id");
	    			 apID=input.nextLine();
	    			 if(dB.Apartmentinfo.ifFoundap(apID))
			    		{

	    				LOGGER.info("enter student Type");
	    	             studentType=input.nextBoolean();
		    			Apartment.changeApartmentStudentType(apID,studentType);
	    				
			    		}
	    			 else
			    		{
			    			 LOGGER.info("Opps! no such apartment");
			    		}
	    		 }
	    		 
	    		 
	    		 
	    		 
	    		 
	    	   }
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

		    		 if(command.equals("Dashboard"))
		    		 {
		    			 User user=new User();

		    			 user=d.checkLogin(username, password);
		    			 BuldingInfo.FindBuildingForOwner(user.getpId());
		    			 for (Building b: BuldingInfo.Ownerbuildings)
		    			 {

		    				 System.out.println("building"+b.getbId());


		    			 }
		    			 LOGGER.info("choose the bulding you want");
		    			 buldingid=input.nextLine();

		    			 Building.buildingfloor(buldingid);
		    			 LOGGER.info("choose the Floor you want");
		    			 floor= input.nextInt();
		    			 Apartmentinfo.buldingApartments(buldingid,floor);
		    			 for (Apartment a: Apartmentinfo.BuildingApartments )
		    			 {

		    				 System.out.println("apartment"+a.getaId());


		    			 }


		    		 }

		    		 if(command.equals("Send Request"))
		    		 {
		    			 LOGGER.info("enter bulding id");
			    		 buldingid=input.nextLine();

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
				    	// Apartment.addApartment(buldingid,apID,photo, numofbeds,numofbath, balcon, floor,max,price)	;
				    		d.requst=true;
				    		 d.saveRequest(buldingid,apID,photo, numofbeds,numofbath, balcon, floor,max,price);
				    		 break;


		    		 }
	       }
	    	  
	       }
       
	       if(d.tenantIsLogged){
	    	   Tenants ten=new Tenants();
	    	   for(Tenants t : dB.UserInfo.tenants) {
	    		   if (t.getUsername().equals(username)) {
	    			   ten=t;
	    			   
	    		   }
	    	   }
	    	   LOGGER.info("-> -> -> -> -> -> -> -> -> -> Welcome Tenant "+username+"  <- <- <- <- <- <- <- <- <- <-");
	    	    while(d.tenantIsLogged) {
	    	    	LOGGER.info("* Dashboard"+"* LogOut");
		    		 command=input.nextLine(); 
		    		 if(command.equals("LogOut")){
		    			 d.logOut("Tenant");
		    			 LOGGER.info("Bye Tenant");
		    			
		    			 break;
		    		 }
		    		 
		    		 if(command.equals("Dashboard")) {
		    			
		    	       LOGGER.info("-> -> -> -> -> -> -> -> -> -> Tenant Dashboard  <- <- <- <- <- <- <- <- <- <-");
		    	       LOGGER.info("                   ------------Aviable Houses---------"                            );
		    	       LOGGER.info("\n"+"* view"+"\n"+"* show info"+"\n"+"* book"+"Furneture");
		    	       command = input.nextLine();
		    	       if(command.equals("view")) {
		    	    	   f.viewAvilableAparts();
                            
		    	    	   
		    	       }

		    	       else if(command.equals("show info")) {
		    	    	   LOGGER.info("enter the apartment ID:");
		    	    	   command = input.nextLine();
		    	    	   f.viewInfo(command);

		    	       }

		    	       else if(command.equals("book")) {
			    			 LOGGER.info("enter apartment ID:");
			    			 command = input.nextLine();
			    			  
			    			 r = f.book(command,ten);
			    			 
			    			    
			    			 nc=command;
			    			 
			    			 if(r==1) {
			    			 LOGGER.info("Do you want to see who are your room mates? (y/n)");
			    			 command = input.nextLine();
			    			 if(command.equals("y")) {
			    			    	f.myNighbours(nc);
			    			    	
			    			    	f.showBill(ten,nc);
			    			    }
			    			  
			    			 else {
			    				 f.showBill(ten,nc);
			    			 }
			    			
			    			 
			    			 }
			    			 
			    			 
			    			 
			    			 else {
			    				 LOGGER.info("Faild");
			    				
			    			 }
			    			    
			    		 }
		    	       
		    	       else if(command.equals("Furneture")) {
		    	    	    
		    	    	   LOGGER.info("* Add"+"\n"+"* See");
		    	    	   command=input.nextLine();
		    	    	   if(command.equals("Add")) {
		    	    		   LOGGER.info("Enter a link of photo");
		    	    		   String photo2 =input.nextLine();
		    	    		   LOGGER.info("Enter a price");
		    	    		   int pric=input.nextInt();
		    	    		   
		    	    		  fur.addItem(ten.getpId(),photo2,pric);
		    	    		  
		    	    		  LOGGER.info("added");
		    	    		  
		    	    		   
		    	    	   }
		    	    	   
		    	    	   
		    	    	   else if (command.equals("See")){
		    	    		         fur.show();
		    	    		   
		    	    		   
		    	    	   }
		    	       }

		    		 }

	    		 else {
		    			 LOGGER.info("Please enter valid command");
		    			 break;
		    		 }
	    	    }
	    	 
	       }
	       
		     }  
	    }
}
