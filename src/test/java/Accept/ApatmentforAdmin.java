package Accept;

import io.cucumber.java.en.Given;

import io.cucumber.java.en.Then;


import static org.junit.Assert.*;

import codes.*;
public class ApatmentforAdmin {
	   
	public  ApatmentforAdmin() {
		
	    
	}
	int oldsize;
	int newsize;
	boolean result;
	String newphoto="new photo";
	@Given("admin wants {string}")
	public void adminWants(String string) {
	    assertEquals("AddApartment",string);
	}



	@Given("building id is {string}")
	public void buildingIdIs(String string) {
		assertEquals("1",string);
	    
	}

	@Then("add succesfully")
	public void addSuccesfully() {
		oldsize=Apartment.sizeOfApartments();
		newsize=Apartment.addApartment("1", "1", "phohpo",2, 3, 1,2);
		assertEquals((oldsize+1),(newsize));
		
		
				
	    
	}
	
	@Given("admin wants2 {string}")
	public void adminWants2(String string) {
		assertEquals("change Apartment photo",string);
	    
	}
	
	@Given("aId is {string}")
	public void aIdIs(String string) {
		assertEquals("1",string);
	    
	}

	@Then("changed succesfully")
	public void changedSuccesfully() {
		 result =Apartment.changeApartmentPhoto("1","new photo");
		assertEquals(true,result);
	   
	}
	@Given("admin wants3 {string}")
	public void adminWants3(String string) {
		assertEquals("change Apartment price",string);
	}

	@Then("price changed succesfully")
	public void priceChangedSuccesfully() {
		 result =Apartment.changeApartmentPrice("1",100);
			assertEquals(true,result);
		
	}
	
	@Given("admin wants4 {string}")
	public void adminWants4(String string) {
		assertEquals("change Apartment max",string);
	}

	@Then("max changed succesfully")
	public void maxChangedSuccesfully() {
		
		result =Apartment.changeApartmentMax("1",3);
		assertEquals(true,result);
	   
	}
	
	@Given("admin wants5 {string}")
	public void adminWants5(String string) {
		assertEquals("change Apartment student Type",string);
	}
	   

	@Then("student Type changed succesfully")
	public void studentTypeChangedSuccesfully() {

		result =Apartment.changeApartmentStudentType("1",true);
		assertEquals(true,result);
	    
	}







}
