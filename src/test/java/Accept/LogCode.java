package Accept;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import DB.UserInfo;
import codes.MyData;
import codes.User;
public class LogCode {
	
	String username;
	String password;
	String type;
	MyData d;
	Boolean status;
	public LogCode(MyData d) {
		this.d=d;
	}



@Given("that user is not logged in")
public void thatUserIsNotLoggedIn() {
	assertTrue(d.adminIsLogged==false&&d.ownerIsLogged==false&&d.tenantIsLogged==false);
}

@When("username is {string}")
public void usernameIs(String string) {
   this.username=string;
}

@When("password is {string}")
public void passwordIs(String string) {
    this.password=string;
}

@Then("logged in successfully as Admin")
public void loggedInSuccessfullyAsAdmin() {
      d.checkLogin(username, password);
      assertTrue(d.adminIsLogged);
}



@Then("log in faild")
public void logInFaild() {
	 d.checkLogin(username, password);
     assertTrue(d.adminIsLogged==false||d.ownerIsLogged==false||d.tenantIsLogged==false);
}


@Then("logged in successfully as owner")
public void loggedInSuccessfullyAsOwner() {
	 d.checkLogin(username, password);
   
}


@Then("logged in successfully as tenant")
public void loggedInSuccessfullyAsTenant() {
	 d.checkLogin(username, password);
     assertTrue(d.tenantIsLogged);
}
	
	
	



}
