package Accept;

import static org.junit.Assert.assertTrue;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class Request {
	
	
	
	@Given("Owner sent request {string}")
	public void ownerSentRequest(String string) {
		assertTrue(string.equals("Send Request"));
		
	}

	@Given("Admin Accepted is {string}")
	public void adminAcceptedIs(String string) {
	    
	}

	@Then("offer added succesfully")
	public void offerAddedSuccesfully() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Given("Admin Accepted1 is {string}")
	public void adminAccepted1Is(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	@Then("offer is rejected")
	public void offerIsRejected() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}


}
