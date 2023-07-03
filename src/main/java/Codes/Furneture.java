package Codes;

public class Furneture {
	
	private String personId;
	private String pic;
	private int price;
	private boolean taken;
	
	

	public Furneture(String personId, String pic, int price, boolean taken) {
		this.personId = personId;
		this.pic = pic;
		this.price = price;
		this.taken = taken;
	}
	public String getPersonId() {
		return personId;
	}
	public void setPersonId(String personId) {
		this.personId = personId;
	}
	public String getPic() {
		return pic;
	}
	public void setPic(String pic) {
		this.pic = pic;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public boolean isTaken() {
		return taken;
	}
	public void setTaken(boolean taken) {
		this.taken = taken;
	}
	
	
	
	

}
