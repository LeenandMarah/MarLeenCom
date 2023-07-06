package Codes;
import java.util.ArrayList;

import DB.apartmentinfo;
public class Apartment {
	private String buildId;
	private int price;
	private String photo;
	private String aId;
	private int numPeople;
	private String information;
	private int bedrooms;
	private int bathrooms;
	private int balcon;
	private int floorNum;
	private int max;
	private boolean full;
	private boolean studentType;
	
	
	
	
	
	
	
	
	
	
	public Apartment()
	{
		
	}
	
	
	
	
	public boolean isStudentType() {
		return studentType;
	}







	public void setStudentType(boolean studentType) {
		this.studentType = studentType;
	}







	public Apartment(String buildId, int price, String aId, int floorNum, int max) {
		super();
		this.buildId = buildId;
		this.price = price;
		this.aId = aId;
		this.floorNum = floorNum;
		this.max = max;

	}
	
	public Apartment(String buildId, String aId, String photo, int bedrooms, int Bathrooms,int balcon) {
		
		this.buildId = buildId;
		this.bedrooms = bedrooms;
		this.aId = aId;
		this.bathrooms = Bathrooms;
		this.balcon = balcon;
		this.floorNum = 0;
		this.max = 0;
		this.studentType = false;
		this.full= false;
		this.information="";
		this.numPeople=0;
		this.price=0;
		this.floorNum=0;


	}
	
	
	
	
	
	
	
	public Apartment(String photo, int numPeople,  int bedrooms, int bathrooms, int balcon) {
		super();
		this.photo = photo;
		this.numPeople = numPeople;
		this.bedrooms = bedrooms;
		this.bathrooms = bathrooms;
		this.balcon = balcon;
	}







	public Apartment(String information, boolean full, boolean studentType) {
		super();
		this.information = information;
		this.full = full;
		this.studentType = studentType;
	}







	public String getBuildId() {
		return buildId;
	}
	public void setBuildId(String buildId) {
		this.buildId = buildId;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getPhoto() {
		return photo;
	}
	public void setPhoto(String photo) {
		this.photo = photo;
	}
	public String getaId() {
		return aId;
	}
	public void setaId(String aId) {
		this.aId = aId;
	}
	public int getNumPeople() {
		return numPeople;
	}
	public void setNumPeople(int numPeople) {
		this.numPeople = numPeople;
	}
	public String getInformation() {
		return information;
	}
	public void setInformation(String information) {
		this.information = information;
	}
	public int getBedrooms() {
		return bedrooms;
	}
	public void setBedrooms(int bedrooms) {
		this.bedrooms = bedrooms;
	}
	public int getBathrooms() {
		return bathrooms;
	}
	public void setBathrooms(int bathrooms) {
		this.bathrooms = bathrooms;
	}
	public int isBalcon() {
		return balcon;
	}
	public void setBalcon(int balcon) {
		this.balcon = balcon;
	}
	public int getFloorNum() {
		return floorNum;
	}
	public void setFloorNum(int floorNum) {
		this.floorNum = floorNum;
	}
	public int getMax() {
		return max;
	}
	public void setMax(int max) {
		this.max = max;
	}
	public boolean isFull() {
		return full;
	}
	public void setFull(boolean full) {
		this.full = full;
	}




	public static int addApartment(String buldingid, String apID, String photo2, int numofbeds, int numofbath, int balcon2,
			int floor, int max2, int price2) {
		     
		  
		
		Apartment p =new Apartment(buldingid,apID,photo2,numofbeds,numofbath,balcon2);
		p.setFloorNum(floor);
		p.setMax(max2);
		p.setPrice(price2);
		
		
		 DB.apartmentinfo.apartments.add(p);
		return  DB.apartmentinfo.apartments.size();
		
	}
	
	
	
  public static  int sizeOfApartments() {
	  return  DB.apartmentinfo.apartments.size();
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
				return DB.apartmentinfo.apartments.get(i);
			
		}
		return null;
	}
	
	
	
	

}
