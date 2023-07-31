package codes;



import java.util.Scanner;


import java.util.logging.Logger;



import db.BuldingInfo;
import db.FurnetureInfo;
import db.UserInfo;
import db.Apartmentinfo;

public class Main {
	static Scanner input = new Scanner(System.in);
	static Scanner inputt = new Scanner(System.in);
	private static final Logger LOGGER = Logger.getLogger(Main.class.getName());

	public static void main(String[] args) {
		  MyData d=new MyData();
		  Apartment p;
		  Apartmentinfo f=new Apartmentinfo();
		  String command;
		  String buldingid;
		  String apID;
		  String apID2;
		  String answer="";
		  String phone;
		  String information;
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
		  int r;
		  boolean studentType;
		  String nc;
           FurnetureInfo fur=new FurnetureInfo();
 

		LOGGER.info("-> -> -> -> -> -> -> -> -> ->Sakan Marlee <- <- <- <- <- <- <- <- <- <-");
		
		
		
		
		while(true) {
		LOGGER.info("Enter username:");
		
		String username=input.nextLine();
		LOGGER.info("Enter password :");
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
	    					Apartment.addApartment(d.buldingid, d.apID, d.photo, d.numofbeds,d.numofbath, d.balcon, d.floor);
	    				 }
	    				 LOGGER.info("Done!");

	    			 }
	    			 else
	    			 {
	    				 LOGGER.info("NO RQUESTS");
	    			 }

	    			
	    		 }
	    		 
	    		 
	    
	       }
	       }
	       
	       if(d.ownerIsLogged){
	    	   LOGGER.info("-> -> -> -> -> -> -> -> -> -> Welcome Owner "+username+"  <- <- <- <- <- <- <- <- <- <-");
	    	   while(d.ownerIsLogged) {
	    		   LOGGER.info("what would you like to do \n"+"Dashboard *** Send Request *** change apartment photo *** change apartment price *** change  phone number *** Available services");
	    		   
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
		    			 BuldingInfo.findBuildingForOwner(user.getpId());
		    			 for (Building b: BuldingInfo.Ownerbuildings)
		    			 {

		    				 System.out.println("building"+b.getbId());
		    				


		    			 }
		    			 BuldingInfo.Ownerbuildings.clear();
		    			 LOGGER.info("choose the bulding you want");
		    			 buldingid=input.nextLine();

		    			 Building.buildingfloor(buldingid);
		    			 LOGGER.info("choose the Floor you want");
		    			 floor= input.nextInt();
		    			 Apartmentinfo.buldingApartments(buldingid,floor);
		    			 for (Apartment a: Apartmentinfo.BuildingApartments )
		    			 {

		    				 LOGGER.info("apartment"+a.getaId());
		    				 

		    			 }
		    			 Apartmentinfo.BuildingApartments.clear();
		    			 
		    			 LOGGER.info("choose the apartment you want");
		    			 apID2=inputt.nextLine();
		    			 
		    			 
		    			 UserInfo.findTenentForApartment(apID2);
		    			 for(Tenants t: UserInfo.apartmentTenants)
		    			 {
		    				 System.out.println("Tenant "+t.getName()+" "+t.getPhoneNum());
		    			 }
		    			 UserInfo.apartmentTenants.clear();


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
				    		 LOGGER.info("Done!");


		    		 }
		    		 
		    		 if(command.equals("change apartment photo")) 
		    		 {
		    			 LOGGER.info("enter Apartment id");
		    			 apID=input.nextLine();
		    			 if(db.Apartmentinfo.ifFoundap(apID))
				    		{
		    				 Apartment ap =new Apartment();
		    				ap= db.Apartmentinfo.findmyapartment(apID);
		    				LOGGER.info("enter new photo");
			    			 photo=input.nextLine();
			    			Apartment.changeApartmentPhoto(apID, photo);
			    			LOGGER.info("Done!");

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
		    			 if(db.Apartmentinfo.ifFoundap(apID))
				    		{

		    				LOGGER.info("enter new price");
			    			 price=input.nextInt();
			    			Apartment.changeApartmentPrice(apID, price);
			    			LOGGER.info("Done!");

				    		}
		    			 else
				    		{
				    			 LOGGER.info("Opps! no such apartment");
				    		}
		    		 }

		    		 if(command.equals("change Location"))
		    		 {
		    			 LOGGER.info("enter bulding id");
			    		 buldingid=input.nextLine();
		    			 if(Building.ifFound(buldingid))
				    		{

		    				LOGGER.info("enter new Location");
			    			String Location = input.nextLine();
			    			Building.changeLocation(buldingid, Location);
			    			LOGGER.info("Done!");

				    		}
		    			 else
				    		{
				    			 LOGGER.info("Opps! no such apartment");
				    		}
		    		 }
		    		 

		    		 if(command.equals("change phone number"))
		    		 {
		    			 User user=new User();

		    			 user=d.checkLogin(username, password);
		    			 phone=inputt.nextLine();
		    			 User.changeOwnerPhoneNumber(user.getpId(), phone);
		    			 LOGGER.info("Done!");
		    		 }


		    		 if(command.equals("Available services"))
		    		 {
		    			 LOGGER.info("enter Apartment id");
		    			 apID=input.nextLine();
		    			 if(db.Apartmentinfo.ifFoundap(apID))
				    		{
		    				 LOGGER.info("enter new information");
			    			 information=inputt.nextLine();

		    				 Apartment.printservices(apID,information);
		    				 LOGGER.info("Done!");
		    				
				    		}
		    			 else
				    		{
				    			 LOGGER.info("Opps! no such apartment");
				    		}
		    		 }
		    		 
		    		 
		    		 
		    		 
		    		 
		    	   }
	       }
	       
	    	  
	       
       
	       if(d.tenantIsLogged){
	    	   Tenants ten=new Tenants();
	    	   for(Tenants t : db.UserInfo.tenants) {
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
		    			 
		    		 }
	    	    }
	    	 
	       }
	       
		     }  
	    }
}