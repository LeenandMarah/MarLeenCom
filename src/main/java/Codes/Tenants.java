package Codes;

public class Tenants extends User {

	public Tenants(String username, String password, String pId, String type, int logged, String phoneNum) {
		super(username, password, pId, type, logged, phoneNum);
		   this.setType("Tenant");
	}
	
	private String name;
	private String major;
	private String age;
	private boolean student;
	private String date;
	private String apartId;
	
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public boolean isStudent() {
		return student;
	}
	public void setStudent(boolean student) {
		this.student = student;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getApartId() {
		return apartId;
	}
	public void setApartId(String apartId) {
		this.apartId = apartId;
	}
	
	
	
	
	
	
	
	

}
