package codes;



import DB.Apartmentinfo;
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







	public Apartment(String buildId, String aId, String photo, int bedrooms, int bathrooms,int balcon) {
		
		this.buildId = buildId;
		this.bedrooms = bedrooms;
		this.aId = aId;
		this.photo=photo;
		this.bathrooms = bathrooms;
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
		
		
		 DB.Apartmentinfo.apartments.add(p);
		return  DB.Apartmentinfo.apartments.size();
		
	}
	
	
	


  @Override
	public String toString() {
		return "Apartment [buildId=" + buildId + ", price=" + price + ", photo=" + photo + ", aId=" + aId
				+ ", numPeople=" + numPeople + ", information=" + information + ", bedrooms=" + bedrooms
				+ ", bathrooms=" + bathrooms + ", balcon=" + balcon + ", floorNum=" + floorNum + ", max=" + max
				+ ", full=" + full + ", studentType=" + studentType +"\n" +"]";
	}




public static  int sizeOfApartments() {
	  return  DB.Apartmentinfo.apartments.size();
  }
	
	

  public static boolean ifFoundap(String apid) {
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
				return DB.Apartmentinfo.apartments.get(i);
			
		}
		return null;
	}
	
	public static boolean changeApartmentPhoto(String apid,String photo)
	{
		Apartment p =new Apartment("1","1","ff",2,2,0);
			p= Apartment.findmyapartment(apid);
			 p.setPhoto(photo);
			 return true;



	}




	public static boolean changeApartmentPrice(String apID, int price2) {
		Apartment p =new Apartment("1","1","ff",2,2,0);
			p= Apartment.findmyapartment(apID);
			 p.setPrice(price2);
			 return true;

	}




	public static boolean changeApartmentMax(String apID, int max2) {
		Apartment p =new Apartment("1","1","ff",2,2,0);
		p= Apartment.findmyapartment(apID);
		 p.setMax(max2);
		 return true;
	}




	public static boolean ChangeApartmentStudentType(String apID, boolean studentType2) {
      Apartment p =new Apartment("1","1","ff",2,2,0);

		p= Apartment.findmyapartment(apID);
		 p.setStudentType(studentType2);
		 return true;

	}

	public static boolean printservices(String apID) {
		Apartment p =new Apartment("1","1","ff",2,2,0);
		p= Apartment.findmyapartment(apID);
		p.setInformation(apID);
		 return true;
	}


	
	

}
