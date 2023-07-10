package Accept;

import io.cucumber.java.en.Given;

import io.cucumber.java.en.Then;


import static org.junit.Assert.assertTrue;

import Codes.*;
public class ApatmentforAdmin {
	   
	public  ApatmentforAdmin() {
		Admin a;
		
	    
	}
	int oldsize;
	int newsize;
	boolean result;
	String newphoto="new photo";
	@Given("admin wants {string}")
	public void adminWants(String string) {
	    assertTrue(string.equals("AddApartment"));
	}



	@Given("building id is {string}")
	public void buildingIdIs(String string) {
		assertTrue(string.equals("1"));
	    
	}

	@Then("add succesfully")
	public void addSuccesfully() {
	    // Write code here that turns the phrase above into concrete actions
		oldsize=Apartment.sizeOfApartments();
		newsize=Apartment.addApartment("1", "1", "phohpo",2, 3, 1,2,4,200);
		assertTrue((oldsize+1)==(newsize));
		
		
				
	    
	}
	
	@Given("admin wants2 {string}")
	public void adminWants2(String string) {
		assertTrue(string.equals("change Apartment photo"));
	    
	}
	
	@Given("aId is {string}")
	public void aIdIs(String string) {
		assertTrue(string.equals("1"));
	    
	}

	@Then("changed succesfully")
	public void changedSuccesfully() {
		 result =Apartment.ChangeApartmentPhoto("1","new photo");
		assertTrue(result==true);
	   
	}
	@Given("admin wants3 {string}")
	public void adminWants3(String string) {
		assertTrue(string.equals("change Apartment price"));
	}

	@Then("price changed succesfully")
	public void priceChangedSuccesfully() {
		 result =Apartment.ChangeApartmentPrice("1",100);
			assertTrue(result==true);
		
	}
	
	@Given("admin wants4 {string}")
	public void adminWants4(String string) {
		assertTrue(string.equals("change Apartment max"));
	}

	@Then("max changed succesfully")
	public void maxChangedSuccesfully() {
		
		result =Apartment.ChangeApartmentMax("1",3);
		assertTrue(result==true);
	   
	}
	
	@Given("admin wants5 {string}")
	public void adminWants5(String string) {
		assertTrue(string.equals("change Apartment student Type"));
	}
	   

	@Then("student Type changed succesfully")
	public void studentTypeChangedSuccesfully() {
		

		result =Apartment.ChangeApartmentStudentType("1",true);
		assertTrue(result==true);
	    
	}







}
