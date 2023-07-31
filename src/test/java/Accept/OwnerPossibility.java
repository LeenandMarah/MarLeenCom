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
		assertEquals(string,"Add photo");
	}

	@Given("AID id is {string}")
	public void aidIdIs(String string) {
		assertEquals(string,"1");
	}

	@Then("added succesfully")
	public void addedSuccesfully() {
		 result = Apartment.changeApartmentPhoto("1","new photo");
		assertEquals(result,true);
	}
	
	@Given("Owner wants2 {string}")
	public void ownerWants2(String string) {
		assertEquals(string,"Available services");
	}

	@Then("printed succesfully")
	public void printedSuccesfully() {
	    assertTrue(Apartment.printservices("2", "new"));
	}

	@Given("Owner wants3 {string}")
	public void ownerWants3(String string) {
		assertEquals(string,"change price");
	}

	@Then("price is changed succesfully")
	public void priceIsChangedSuccesfully() {
		 result =Apartment.changeApartmentPrice("1",100);
			assertEquals(result,true);
	}

	@Given("Owner wants4 {string}")
	public void ownerWants4(String string) {
		assertEquals(string,"change phone number");
	}

	@Given("Owner id is {string}")
	public void ownerIdIs(String string) {
	    
		assertEquals(string,"1");
	}
	@Then("phone number is changed succesfully")
	public void phoneNumberIsChangedSuccesfully() {
		
		result =User.changeOwnerPhoneNumber("1", "0599765");
		assertEquals(result,true);
	}

	@Given("Owner wants5 {string}")
	public void ownerWants5(String string) {
		assertEquals(string,"change location");
	}

	@Given("Building id is {string}")
	public void buildingIdIs(String string) {
		assertEquals(string,"1");
	}

	@Then("location is changed succesfully")
	public void locationIsChangedSuccesfully() {
	    Building.changeLocation("1", "nablus");
	}


}


