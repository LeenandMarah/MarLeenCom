package Accept;



import static org.junit.Assert.assertTrue;

import Codes.User;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class LogCode {
	User u;
	
	
	
	
	
	
	public LogCode(User u) {
		super();
		this.u = u;
	}

	@Given("Adminstator is not logged in yet")
	public void adminstatorIsNotLoggedInYet() {
		
	    // Write code here that turns the phrase above into concrete actions
	      u.logged=false;
	}

	@Given("password={string}")
	public void password(String string) {
	    // Write code here that turns the phrase above into concrete actions
	      assertTrue(u.pass.equals(string));
	}

	@Given("username={string}")
	public void username(String string) {
	    // Write code here that turns the phrase above into concrete actions
	      assertTrue(u.username.equals(string));
	}

	@Then("login succeeds")
	public void loginSucceeds() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
	}


}
