package Accept;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import io.cucumber.java.en.*;
public class TennantAble {

	@Given("tentant choose {string}")
	public void tentantChoose(String string) {
	    assertTrue(string.equals("view"));
	}


	@Then("view done")
	public void viewDone() {
	   assertTrue(dB.Apartmentinfo.viewAvilableAparts());
	}

	@Given("tenant wants {string}")
	public void tenantWants(String string) {
		 assertTrue(string.equals("show info"));
	}

	@Given("gives apartmentID is {string}")
	public void givesApartmentIDIs(String string) {
	    assertTrue(string.equals("1"));
	}

	@Then("view correctly")
	public void viewCorrectly() {
	    assertTrue(dB.Apartmentinfo.viewInfo("1"));
	}

	@Given("gives apartmentID is0 {string}")
	public void givesApartmentIDIs0(String string) {
		assertTrue(string.equals("0"));
	}

	
	
	@Then("view faild")
	public void viewFaild() {
		assertFalse(dB.Apartmentinfo.viewInfo("0"));
	}

}
