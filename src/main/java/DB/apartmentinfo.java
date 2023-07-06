package DB;

import java.util.ArrayList;
import java.util.List;

import Codes.Apartment;

public class apartmentinfo {
public static List<Apartment> apartments = new ArrayList<>();
	
	static {
	
		Apartment a = new Apartment("1","1","photo",3,2,0) ;
		 a.setFloorNum(2);
		 a.setMax(3);
		 a.setPrice(200);
	
		 
		 apartments.add(a);
		 
		 
	
	
	
	
	
   
	}
	public static boolean IfFoundap(String apid) {
		for(int i=0;i<DB.apartmentinfo.apartments.size();i++)
		{
			if(apartmentinfo.apartments.get(i).getaId().equals(apid))
				return true;
			
		}
		return false;
	}
	public static Apartment findmyapartment(String apid) {
		for(int i=0;i<DB.apartmentinfo.apartments.size();i++)
		{
			if(apartmentinfo.apartments.get(i).getaId().equals(apid))
				return apartments.get(i);
			
		}
		return null;
	}

}
