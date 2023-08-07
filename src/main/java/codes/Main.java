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
		 
		 
		
		  String left="-> -> -> -> -> -> -> -> -> ->";
		  String right="<- <- <- <- <- <- <- <- <- <-";
		  String o="Opps! no such apartment";
		  String c="enter Apartment id";
		  String i ="enter the apartment ID:";
		  String logO="LogOut";
		  String done="Done";
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
		  String photo;
		  int floor;
		  String nc;
		  int r;
		
          String head=left+"Sakan Marlee "+right;

		LOGGER.info(head);
		
		
		
		// start here
		while(true) {
		LOGGER.info("Enter username:");
		
		String username=input.nextLine();
		LOGGER.info("Enter password :");
		String password=input.nextLine();
		User u =new User();
		u.setUsername(username);
		u.setPassword(password);
		 u= MyData.checkLogin(u.getUsername(),u.getPassword());
		   
	       if(!MyData.adminIsLogged&&!MyData.ownerIsLogged&&!MyData.tenantIsLogged) {
	    	   MyData.showError();
	    	  
	       }
		
	       if(MyData.adminIsLogged){
	    	   String c2=left+" Welcome Admin "+username+right;
	    	   LOGGER.info(c2);
	    	    
	    	   while(MyData.adminIsLogged) {
	    		 command=input.nextLine(); 
	    		 if(command.equals(logO)){
	    			 MyData.logOut("Admin");
	    			 LOGGER.info("Bye Admin");	    			 
	    			
	    			 break;
	    		 }
	    		 if(command.equals("See Request")){
	    			 if(MyData.requst)
	    			 {
	    				 MyData.requst=false;
	    				answer= MyData.sendRequest();
	    				 if (answer.equals("yes"))
	    				 {
	    					Apartment.addApartment(MyData.buldingid, MyData.apID, MyData.photo, MyData.numofbeds,MyData.numofbath, MyData.balcon, MyData.floor);
	    				 }
	    				 LOGGER.info(done);

	    			 }
	    			 else
	    			 {
	    				 LOGGER.info("NO RQUESTS");
	    			 }

	    			
	    		 }
	    		 
	    		 
	    
	       }
	       }
	       
	       if(MyData.ownerIsLogged){
	    	 String c1=left+" Welcome Owner "+username+right;
	    	   LOGGER.info(c1);
	    	   
	    	   String info="what would you like to do \n"+"Dashboard *** Send Request *** change apartment photo *** change apartment price *** change  phone number *** Available services";
	    	   while(MyData.ownerIsLogged) {
	    		   LOGGER.info(info);
	    		   
		    		 command=input.nextLine(); 
		    		 if(command.equals(logO)){
		    			 MyData.logOut("Owner");
		    			 LOGGER.info("Bye Owner");
		    			
		    			 break;
		    		 }

		    		 if(command.equals("Dashboard"))
		    		 {
		    			 User user=new User();

		    			 user=MyData.checkLogin(username, password);
		    			 BuldingInfo.findBuildingForOwner(user.getpId());
		    			 for (Building b: BuldingInfo.ownerbuildings)
		    			 {
                             String p="building"+b.getbId();
		    				LOGGER.info(p);
		    				


		    			 }
		    			 BuldingInfo.ownerbuildings.clear();
		    			 LOGGER.info("choose the bulding you want");
		    			 buldingid=input.nextLine();

		    			 Building.buildingfloor(buldingid);
		    			 LOGGER.info("choose the Floor you want");
		    			 floor= input.nextInt();
		    			 Apartmentinfo.buldingApartments(buldingid,floor);
		    			 for (Apartment a: Apartmentinfo.buildingApartments )
		    			 {

		    				 LOGGER.info("apartment"+a.getaId());
		    				 

		    			 }
		    			 Apartmentinfo.buildingApartments.clear();
		    			 
		    			 LOGGER.info("choose the apartment you want");
		    			 apID2=inputt.nextLine();
		    			 
		    			 
		    			 UserInfo.findTenentForApartment(apID2);
		    			 for(Tenants t: UserInfo.apartmentTenants)
		    			 {
		    				 LOGGER.info("Tenant "+t.getName()+" "+t.getPhoneNum());
		    			 }
		    			 UserInfo.apartmentTenants.clear();


		    		 }

		    		 if(command.equals("Send Request"))
		    		 {
		    			 LOGGER.info("enter bulding id");
			    		 buldingid=input.nextLine();

			    			 LOGGER.info(c);
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
				    		 
				    						    
				    		 MyData.requst=true;
				    		 MyData.saveRequest(buldingid,apID,photo, numofbeds,numofbath, balcon, floor);
				    		 LOGGER.info(done);


		    		 }
		    		 
		    		 if(command.equals("change apartment photo")) 
		    		 {
		    			 LOGGER.info(c);
		    			 apID=input.nextLine();
		    			 if(db.Apartmentinfo.ifFoundap(apID))
				    		{
		    				
		    				 db.Apartmentinfo.findmyapartment(apID);
		    				LOGGER.info("enter new photo");
			    			 photo=input.nextLine();
			    			Apartment.changeApartmentPhoto(apID, photo);
			    			LOGGER.info(done);

				    		}
		    			 else
				    		{
				    			 LOGGER.info(o);
				    		}
		    		 }

		    		 if(command.equals("change apartment price"))
		    		 {
		    			 LOGGER.info(c);
		    			 apID=input.nextLine();
		    			 if(db.Apartmentinfo.ifFoundap(apID))
				    		{

		    				LOGGER.info("enter new price");
			    			 price=input.nextInt();
			    			Apartment.changeApartmentPrice(apID, price);
			    			LOGGER.info(done);

				    		}
		    			 else
				    		{
				    			 LOGGER.info(o);
				    		}
		    		 }

		    		 if(command.equals("change Location"))
		    		 {
		    			 LOGGER.info("enter bulding id");
			    		 buldingid=input.nextLine();
		    			 if(Building.ifFound(buldingid))
				    		{

		    				LOGGER.info("enter new Location");
			    			String location = input.nextLine();
			    			Building.changeLocation(buldingid, location);
			    			LOGGER.info("Done!");

				    		}
		    			 else
				    		{
				    			 LOGGER.info(o);
				    		}
		    		 }
		    		 

		    		 if(command.equals("change phone number"))
		    		 {
		    			 User user=new User();

		    			 user=MyData.checkLogin(username, password);
		    			 phone=inputt.nextLine();
		    			 User.changeOwnerPhoneNumber(user.getpId(), phone);
		    			 LOGGER.info(done);
		    		 }


		    		 if(command.equals("Available services"))
		    		 {
		    			 LOGGER.info(c);
		    			 apID=input.nextLine();
		    			 if(db.Apartmentinfo.ifFoundap(apID))
				    		{
		    				 LOGGER.info("enter new information");
			    			 information=inputt.nextLine();

		    				 Apartment.printservices(apID,information);
		    				 LOGGER.info(done);
		    				
				    		}
		    			 else
				    		{
				    			 LOGGER.info(o);
				    		}
		    		 }
		    		 
		    		 
		    		 
		    		 
		    		 
		    	   }
	       }
	       
	    	  
	       
       
	       if(MyData.tenantIsLogged){
	    	   String c3=left+" Welcome Tenant "+username+right;
	    	   Tenants ten=new Tenants();
	    	   for(Tenants t : db.UserInfo.tenants) {
	    		   if (t.getUsername().equals(username)) {
	    			   ten=t;
	    			   
	    		   }
	    	   }
	    	   LOGGER.info(c3);
	    	    while(MyData.tenantIsLogged) {
	    	    	LOGGER.info("* Dashboard"+"* LogOut");
		    		 command=input.nextLine(); 
		    		 if(command.equals("LogOut")){
		    			 MyData.logOut("Tenant");
		    			 LOGGER.info("Bye Tenant");
		    			
		    			 break;
		    		 }
		    		 
		    		 if(command.equals("Dashboard")) {
		    			String dd = left+" Tenant Dashboard "+right;
		    	       LOGGER.info(dd);
		    	       LOGGER.info("                   ------------Aviable Houses---------"                            );
		    	       LOGGER.info("\n"+"* view"+"\n"+"* show info"+"\n"+"* book"+"Furneture");
		    	       command = input.nextLine();
		    	       if(command.equals("view")) {
		    	    	   Apartmentinfo.viewAvilableAparts();
                            
		    	    	   
		    	       }

		    	       else if(command.equals("show info")) {
		    	    	   LOGGER.info(i);
		    	    	   command = input.nextLine();
		    	    	   Apartmentinfo.viewInfo(command);

		    	       }

		    	       else if(command.equals("book")) {
			    			 LOGGER.info(i);
			    			 command = input.nextLine();
			    			  
			    			 r =  Apartmentinfo.book(command,ten);
			    			 
			    			    
			    			 nc=command;
			    			 
			    			 if(r==1) {
			    			 LOGGER.info("Do you want to see who are your room mates? (y/n)");
			    			 command = input.nextLine();
			    			 if(command.equals("y")) {
			    				 Apartmentinfo.myNighbours(nc);
			    			    	
			    			    	 Apartmentinfo.showBill(ten,nc);
			    			    }
			    			  
			    			 else {
			    				 Apartmentinfo.showBill(ten,nc);
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
		    	    		   
		    	    		   FurnetureInfo.addItem(ten.getpId(),photo2,pric);
		    	    		  
		    	    		  LOGGER.info("added");
		    	    		  
		    	    		   
		    	    	   }
		    	    	   
		    	    	   
		    	    	   else if (command.equals("See")){
		    	    		   FurnetureInfo.show();
		    	    		   
		    	    		   
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