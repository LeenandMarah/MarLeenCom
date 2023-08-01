package Accept;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import codes.Apartment;
import codes.MyData;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class Request {
	
	
	
	String answer;
	@Given("Owner sent request {string}")
	public void ownerSentRequest(String string) {
		assertTrue(string.equals("Send Request"));
		MyData.saveRequest("1", "1", "1", 2, 2, 1, 1, 1, 1);
		 answer=MyData.sendRequest();
		
	}

	@Given("Admin Accepted is {string}")
	public void adminAcceptedIs(String string) {
		assertEquals("yes",answer);
		
		
	    
	}

	@Then("offer added succesfully")
	public void offerAddedSuccesfully() {
		int size = Apartment.addApartment(MyData.buldingid, MyData.apID, MyData.photo, MyData.numofbeds,MyData.numofbath, MyData.balcon, MyData.floor); 
		assertTrue(size>0);
	}

	@Given("Admin Accepted1 is {string}")
	public void adminAccepted1Is(String string) {
	 	assertEquals("no",answer);
	}
	@Then("offer is rejected")
	public void offerIsRejected() {
	    
	}


}
