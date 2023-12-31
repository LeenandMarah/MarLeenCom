package Accept;
import static org.junit.Assert.assertTrue;
import codes.MyData;
import io.cucumber.java.en.*;

public class LogOutCode {
	String type;
	MyData d=new MyData();
	
	@Given("the user is logged in")
	public void theUserIsLoggedIn() {
	     d.logIn();
		assertTrue(d.adminIsLogged||d.ownerIsLogged||d.tenantIsLogged);
	}

	@Given("type is {string}")
	public void typeIs(String string) {
	   type=string;
	}

	@Then("log out succesfully")
	public void logOutSuccesfully() {
	   d.logOut(type);
	   assertTrue(d.adminIsLogged==false||d.ownerIsLogged==false||d.tenantIsLogged==false);
	}
	
	
	
}

