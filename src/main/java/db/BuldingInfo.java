package db;

import java.util.ArrayList;
import java.util.logging.Logger;

import codes.Building;
import codes.MyData;

import java.util.List;

public class BuldingInfo {
public static List<Building> buildings = new ArrayList<>();

public static List<Building> Ownerbuildings = new ArrayList<>();
private static final Logger LOGGER = Logger.getLogger(MyData.class.getName());
	static {
	
	Building b = new Building("1","1",3,"Nablus-Rafidya",6) ;
	Building u = new Building("2","2",3,"Ramallah-Irsal",6) ;
	Building i = new Building("3","2",3,"Khalel-doora",6) ;
	
		
	buildings.add(b);
	buildings.add(u);
	buildings.add(i);
	
	
	
	
	
   
	}
	public static boolean ifFound(String buldingid) {
		for(int i=0;i<db.BuldingInfo.buildings.size();i++)
		{
			if(db.BuldingInfo.buildings.get(i).getbId().equals(buldingid))
				return true;
			
		}
		return false;
	}

	public static void findBuildingForOwner(String ownerId) {
		 for (Building b: BuldingInfo.buildings)
		{
			if(b.getOwnerId().equals(ownerId))
			{

				Ownerbuildings.add(b);
			}


		}
			}



}
