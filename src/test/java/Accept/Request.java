package Accept;

import static org.junit.Assert.assertTrue;

import codes.Apartment;
import codes.MyData;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class Request {
	
	
	MyData d=new MyData();
	String answer;
	@Given("Owner sent request {string}")
	public void ownerSentRequest(String string) {
		assertTrue(string.equals("Send Request"));
		d.saveRequest("1", "1", "1", 2, 2, 1, 1, 1, 1);
		 answer=d.sendRequest();
		
	}

	@Given("Admin Accepted is {string}")
	public void adminAcceptedIs(String string) {
		assertTrue(answer.equals("yes"));
		
		
	    
	}

	@Then("offer added succesfully")
	public void offerAddedSuccesfully() {
		int size = Apartment.addApartment(d.buldingid, d.apID, d.photo, d.numofbeds,d.numofbath, d.balcon, d.floor, d.max, d.price); 
		assertTrue(size>0);
	}

	@Given("Admin Accepted1 is {string}")
	public void adminAccepted1Is(String string) {
		assertTrue(answer.equals("no"));
	}
	@Then("offer is rejected")
	public void offerIsRejected() {
	    
	}


}
