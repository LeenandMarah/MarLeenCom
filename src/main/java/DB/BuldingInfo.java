package DB;

import java.util.ArrayList;
import java.util.List;

import Codes.Building;
import Codes.User;

public class BuldingInfo {
public static List<Building> buildings = new ArrayList<>();
	
	static {
	
	Building b = new Building("1","1",3,"Nablus-Rafidya",6) ;
	Building u = new Building("2","2",3,"Nablus-Rafidya",6) ;
	Building i = new Building("3","1",3,"Nablus-Rafidya",6) ;
		
	buildings.add(b);
	buildings.add(u);
	buildings.add(i);
	
	
	
	
   
	}
}
