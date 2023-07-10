package Codes;

public class Building {
	private String bId;
    private String ownerId;
    private int floors;
    private String location;
    private int apartsNum;
	public Building(String bId,String ownerId, int floors, String location, int apartsNum) {
		this.bId=bId;
		this.ownerId = ownerId;
		this.floors = floors;
		this.location = location;
		this.apartsNum = apartsNum;
	}
	static int floor;
	public Building() {
		// TODO Auto-generated constructor stub
	}
	public String getbId() {
		return bId;
	}
	public void setbId(String bId) {
		this.bId = bId;
	}
	public String getOwnerId() {
		return ownerId;
	}
	public void setOwnerId(String ownerId) {
		this.ownerId = ownerId;
	}
	public int getFloors() {
		return floors;
	}
	public void setFloors(int floors) {
		this.floors = floors;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public int getApartsNum() {
		return apartsNum;
	}
	public void setApartsNum(int apartsNum) {
		this.apartsNum = apartsNum;
	}
	
	
	public static boolean IfFound(String buldingid) {
		for(int i=0;i<DB.BuldingInfo.buildings.size();i++)
		{
			if(DB.BuldingInfo.buildings.get(i).getbId().equals(buldingid))
				return true;
			
		}
		return false;
	}
	
	public static Building FindBuilding(String buldingid) {
		for(int i=0;i<DB.BuldingInfo.buildings.size();i++)
		{
			if(DB.BuldingInfo.buildings.get(i).getbId().equals(buldingid))
				return DB.BuldingInfo.buildings.get(i);
			
		}
		return null;
	}
	
	public static void buildingfloor(String buldingid) {
		Building b=new Building();
		
		b=FindBuilding(buldingid);
		floor=b.getFloors();
		for(int i=floor; i>0;i--)
		{
			System.out.println("Floor"+i);
		}
		
		
		
	}
	
	
	
    
    
    
	

}
