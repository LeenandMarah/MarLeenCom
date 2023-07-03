package Codes;

public class Apartment {
	private String buildId;
	private int price;
	private String photo;
	private String aId;
	private String numPeople;
	private String information;
	private int bedrooms;
	private int bathrooms;
	private boolean balcon;
	private int floorNum;
	private int max;
	private boolean full;
	private boolean studentType;
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
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
	
	
	
	
	
	
	
	public Apartment(String photo, String numPeople,  int bedrooms, int bathrooms, boolean balcon) {
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
	public String getNumPeople() {
		return numPeople;
	}
	public void setNumPeople(String numPeople) {
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
	public boolean isBalcon() {
		return balcon;
	}
	public void setBalcon(boolean balcon) {
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
	
	
	
	
	
	
	
	
	
	
	

}
