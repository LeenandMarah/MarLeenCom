package Accept;

import static org.junit.Assert.assertTrue;

import Codes.Apartment;
import Codes.User;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class OwnerPossibility {

	boolean result;
	@Given("Owner wants {string}")
	public void ownerWants(String string) {
		assertTrue(string.equals("Add photo"));
	}

	@Given("AID id is {string}")
	public void aidIdIs(String string) {
		assertTrue(string.equals("1"));
	}

	@Then("added succesfully")
	public void addedSuccesfully() {
		 result = Apartment.ChangeApartmentPhoto("1","new photo");
		assertTrue(result==true);
	}
	
	@Given("Owner wants2 {string}")
	public void ownerWants2(String string) {
		assertTrue(string.equals("Available services"));
	}

	@Then("printed succesfully")
	public void printedSuccesfully() {
	    
	}

	@Given("Owner wants3 {string}")
	public void ownerWants3(String string) {
		assertTrue(string.equals("change price"));
	}

	@Then("price is changed succesfully")
	public void priceIsChangedSuccesfully() {
		 result =Apartment.ChangeApartmentPrice("1",100);
			assertTrue(result==true);
	}

	@Given("Owner wants4 {string}")
	public void ownerWants4(String string) {
		assertTrue(string.equals("change phone number"));
	}

	@Given("Owner id is {string}")
	public void ownerIdIs(String string) {
	    
		assertTrue(string.equals("1"));
	}
	@Then("phone number is changed succesfully")
	public void phoneNumberIsChangedSuccesfully() {
		
		result =User.ChangeOwnerPhoneNumber("1", "0599765");
		assertTrue(result==true);
	}



}
