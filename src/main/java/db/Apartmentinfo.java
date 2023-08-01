package db;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;
import codes.*;

public class Apartmentinfo {
public static List<Apartment> apartments = new ArrayList<>();
public static List<Apartment> buildingApartments = new ArrayList<>();
private static final Logger LOGGER = Logger.getLogger(Apartmentinfo.class.getName());
private static String photo="https://images.search.yahoo.com/search/images;_ylt=AwrEo5D.T6hkDTULrBhXNyoA;_ylu=Y29sbwNiZjEEcG9zAzEEdnRpZANMT0NVSTA1OFRfMQRzZWMDcGl2cw--?p=apartments+for+students&fr2=piv-web&type=E210US91215G0&fr=mcafee#id=68&iurl=https%3A%2F%2Fnyunews.com%2Fwp-content%2Fuploads%2F2017%2F04%2F033017_Housing_Alex-Muhawi-Ho_.jpg&action=click";
	static {


		Apartment a = new Apartment("1","1",photo,3,2,0) ;
		 a.setFloorNum(2);
		 a.setMax(3);
		 a.setPrice(200);
		 a.setNumPeople(3);
	     a.setInformation("Hi test test test");
	     a.setStudentType(true);


	     Apartment b =new Apartment ("2","2","photo2",3,2,0);
	     b.setFloorNum(2);
		 b.setMax(5);
		 b.setPrice(200);
	     b.setInformation("Hi test testtest");
	     b.setStudentType(true);
	     b.setNumPeople(1);

	     
	     Apartment c =new Apartment ("3","3","photo3",3,2,0);
	     c.setFloorNum(1);
		 c.setMax(3);
		 c.setPrice(200);
	     c.setFull(false);
	     c.setInformation("Hi test testtest");
	     c.setStudentType(false);
	     c.setNumPeople(2);

		 apartments.add(a);
		 apartments.add(b);
		 apartments.add(c);
		 
		 

	
	
	
	
	
   
	}
	public static boolean ifFoundap(String apid) {
		for(int i=0;i<db.Apartmentinfo.apartments.size();i++)
		{
			if(Apartmentinfo.apartments.get(i).getaId().equals(apid))
				return true;
			
		}
		return false;
	}
	public static Apartment findmyapartment(String apid) {
		for(int i=0;i<db.Apartmentinfo.apartments.size();i++)
		{
			if(Apartmentinfo.apartments.get(i).getaId().equals(apid))
				return apartments.get(i);
			
		}
		return null;
	}
	
	public static boolean viewAvilableAparts() {

		for(int i=0;i<apartments.size();i++) {
			if(apartments.get(i).isFull()==false) {
				LOGGER.info(apartments.get(i).toString());
			}
		}

      return true;
}

	public static boolean isFull(String id) {
       
		for(Apartment a:Apartmentinfo.apartments) {
			
			if(a.getaId().equals(id)&&(a.getMax()==a.getNumPeople())) {
				
				
				
				return true;
			}
		
		}






		return false;

	}


	public static boolean viewInfo(String x) {
		for(int i=0;i<apartments.size();i++) {
			if(apartments.get(i).getaId().equals(x)) {
				Building b = codes.Building.findBuilding(x);
				
				LOGGER.info("\n"+"Price:"+apartments.get(i).getPrice()+"\n"+"Location:"+b.getLocation()+"\n"+"Services:"+apartments.get(i).getInformation()+"\n"+"Photo -> Go to link;"+apartments.get(i).getPhoto());
				return true;
			}
		}
       return false;
	}
	
	public static  int book(String command,Tenants t) { 
		   LocalDateTime now = LocalDateTime.now();  
		
		if(isFull(command)) {
		
		    LOGGER.info("Sorry, it's full!");
				return 0;
			}

	else {

		for(int i=0;i<apartments.size();i++) {
			if(apartments.get(i).getaId().equals(command)) {
				int num=apartments.get(i).getNumPeople();
				num++;
				  t.setApartId(command);
				  t.setDate(now.toString());
				apartments.get(i).setNumPeople(num);
				LOGGER.info("Done,Congrats!");
				
				
				if(apartments.get(i).getMax()==apartments.get(i).getNumPeople())
					{apartments.get(i).setFull(true);}
				
				
				return 1;
			}
		}
	}

	 
	return 0;
	}




	public static int myNighbours(String id) {
		
		  for(Apartment a:apartments) {
			  if(a.isStudentType()) {
			 
				  if(a.getaId().equals(id)) {
					  for(Tenants t:db.UserInfo.tenants ) {
						  if(t.getApartId().equals(id)) {
								LOGGER.info("------->  Your Room mates are:");
								LOGGER.info("Name:"+t.getName()+","+"Age:"+t.getAge()+","+"Major:"+t.getMajor()+"\n");
						  }
					  }
					  
					  return 1;
				  }
				  
				  else {
					  LOGGER.info("Invalid id");
				  }
				  
				  
				  
				  
			  }
			  
			  else {
				  LOGGER.info("Sorry This feature is for Student type apartment only");
				  return 0;
			  }
			  
	
			  
		  }
		
		
		
	
		  
		  return 0;
	}












	public static boolean buldingApartments(String bid,int floor) {
		for (Apartment a: Apartmentinfo.apartments)
		{
			if(a.getBuildId().equals(bid)&& (a.getFloorNum()==floor)) {
				buildingApartments.add(a);

			}

		}
        return true;
	}
	
	public static int showBill(Tenants ten, String nc) {
		
		 
		  Building k=null;
		  
		  for(Apartment i:apartments) {
			  if(i.getaId().equals(nc)){
				  k=Building.findBuilding(nc);
			  }
		  }
        
		  User r;
		  User s =new User();
		  r=s.findMyOwner(k.getOwnerId());
		  
          String str="-------------------------------------------"+"\n"+"Tenant:"+ten.toString()+"Owner:"+r.toString();
		LOGGER.info(str);
		
		return 1;
	}

}
