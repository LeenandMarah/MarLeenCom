package Accept;



import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import Codes.Admin;
import Codes.User;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LogCode {
	Admin a = new Admin("leen","123marah","1","", 0,"1234567");
	@Given("that user is not logged in")
	public void thatUserIsNotLoggedIn() {
	
	    assertTrue("hi",a.getLogged()==0);
	
		
	     
	}

	@When("username is {string} which type is admin")
	public void usernameIsWhichTypeIsAdmin(String string) {
	    assertTrue( a.getUsername().equals(string));
	    assertTrue(a.getType().equals("Admin"));
	}

	@When("password is correct {string}")
	public void passwordIsCorrect(String string) {
	    // Write code here that turns the phrase above into concrete actions
	     assertTrue(a.getPassword().equalsIgnoreCase(string));
	}

	@Then("logged in successfully")
	public void loggedInSuccessfully() {
	       a.setLogged(1);
	}

	@When("password is false {string}")
	public void passwordIsFalse(String string) {
		 assertFalse(a.getPassword().equalsIgnoreCase(string));
	}

	@Then("log in faild")
	public void logInFaild() {
	    // Write code here that turns the phrase above into concrete actions
	   
	}

	@When("username is not found which type is admin")
	public void usernameIsNotFoundWhichTypeIsAdmin() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
	}

	@Then("logged in faild")
	public void loggedInFaild() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
	}

	
	
	
	


}
