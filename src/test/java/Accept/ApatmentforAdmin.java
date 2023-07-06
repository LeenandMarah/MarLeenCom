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


}
