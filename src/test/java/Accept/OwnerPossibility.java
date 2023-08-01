package Accept;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import codes.Apartment;
import codes.Building;
import codes.User;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class OwnerPossibility {

	boolean result;
	@Given("Owner wants {string}")
	public void ownerWants(String string) {
		assertEquals("Add photo",string);
	}

	@Given("AID id is {string}")
	public void aidIdIs(String string) {
		assertEquals("1",string);
	}

	@Then("added succesfully")
	public void addedSuccesfully() {
		 result = Apartment.changeApartmentPhoto("1","new photo");
		assertEquals(true,result);
	}
	
	@Given("Owner wants2 {string}")
	public void ownerWants2(String string) {
		assertEquals("Available services",string);
	}

	@Then("printed succesfully")
	public void printedSuccesfully() {
	    assertTrue(Apartment.printservices("2", "new"));
	}

	@Given("Owner wants3 {string}")
	public void ownerWants3(String string) {
		assertEquals("change price",string);
	}

	@Then("price is changed succesfully")
	public void priceIsChangedSuccesfully() {
		 result =Apartment.changeApartmentPrice("1",100);
			assertEquals(true,result);
	}

	@Given("Owner wants4 {string}")
	public void ownerWants4(String string) {
		assertEquals("change phone number",string);
	}

	@Given("Owner id is {string}")
	public void ownerIdIs(String string) {
	    
		assertEquals("1",string);
	}
	@Then("phone number is changed succesfully")
	public void phoneNumberIsChangedSuccesfully() {
		
		result =User.changeOwnerPhoneNumber("1", "0599765");
		assertEquals(true,result);
	}

	@Given("Owner wants5 {string}")
	public void ownerWants5(String string) {
		assertEquals("change location",string);
	}

	@Given("Building id is {string}")
	public void buildingIdIs(String string) {
		assertEquals("1",string);
	}

	@Then("location is changed succesfully")
	public void locationIsChangedSuccesfully() {
	    Building.changeLocation("1", "nablus");
	}


}


