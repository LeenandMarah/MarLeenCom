package Accept;


import static org.junit.Assert.*;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import codes.MyData;
public class LogCode {
	
	String username;
	String password;
	String type;

	Boolean status;
	



@Given("that user is not logged in")
public void thatUserIsNotLoggedIn() {
	assertTrue(MyData.adminIsLogged ==false || MyData.ownerIsLogged==false || MyData.tenantIsLogged==false);
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
      MyData.checkLogin(username, password);
      assertTrue(MyData.adminIsLogged);
}



@Then("log in faild")
public void logInFaild() {
	 MyData.checkLogin(username, password);
     assertTrue(MyData.adminIsLogged==false||MyData.ownerIsLogged==false||MyData.tenantIsLogged==false);
}


@Then("logged in successfully as owner")
public void loggedInSuccessfullyAsOwner() {
	MyData.checkLogin(username, password);
   
}


@Then("logged in successfully as tenant")
public void loggedInSuccessfullyAsTenant() {
	MyData.checkLogin(username, password);
     assertTrue(MyData.tenantIsLogged);
}
	
	
	



}
