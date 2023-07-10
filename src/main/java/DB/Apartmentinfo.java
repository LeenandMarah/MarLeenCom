package DB;

import java.util.ArrayList;
import java.util.List;

import Codes.Apartment;
import Codes.Building;

public class Apartmentinfo {
public static List<Apartment> apartments = new ArrayList<>();
public static List<Apartment> BuildingApartments = new ArrayList<>();
	
	static {
	
		Apartment a = new Apartment("1","1","photo",3,2,0) ;
		 a.setFloorNum(2);
		 a.setMax(3);
		 a.setPrice(200);
		 
		 Apartment b = new Apartment("2","2","photo",3,2,0) ;
		 b.setFloorNum(3);
		 b.setMax(3);
		 b.setPrice(200);
		 
		 Apartment c = new Apartment("2","3","photo",3,2,0) ;
		 c.setFloorNum(3);
		 c.setMax(3);
		 c.setPrice(200);
	
		 
		 apartments.add(a);
		 apartments.add(b);
		 apartments.add(c);
		 
		 
	
	
	
	
	
   
	}
	public static boolean IfFoundap(String apid) {
		for(int i=0;i<DB.Apartmentinfo.apartments.size();i++)
		{
			if(Apartmentinfo.apartments.get(i).getaId().equals(apid))
				return true;
			
		}
		return false;
	}
	public static Apartment findmyapartment(String apid) {
		for(int i=0;i<DB.Apartmentinfo.apartments.size();i++)
		{
			if(Apartmentinfo.apartments.get(i).getaId().equals(apid))
				return apartments.get(i);
			
		}
		return null;
	}
	
	public static void BuldingApartments(String bid,int floor) {
		for (Apartment a: Apartmentinfo.apartments)
		{
			if(a.getBuildId().equals(bid)&& (a.getFloorNum()==floor)) {
				BuildingApartments.add(a);
			
			}
			
		}
		
	}

}
