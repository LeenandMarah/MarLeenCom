package Accept;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import io.cucumber.java.en.*;
public class TennantAble {

	@Given("tentant choose {string}")
	public void tentantChoose(String string) {
	    assertEquals("view",string);
	}


	@Then("view done")
	public void viewDone() {
	   assertTrue(db.Apartmentinfo.viewAvilableAparts());
	}

	@Given("tenant wants {string}")
	public void tenantWants(String string) {
		 assertEquals("show info",string);
	}

	@Given("gives apartmentID is {string}")
	public void givesApartmentIDIs(String string) {
	    assertEquals("1",string);
	}

	@Then("view correctly")
	public void viewCorrectly() {
	    assertTrue(db.Apartmentinfo.viewInfo("1"));
	}

	@Given("gives apartmentID is0 {string}")
	public void givesApartmentIDIs0(String string) {
		assertEquals("0",string);
	}

	
	
	@Then("view faild")
	public void viewFaild() {
		assertFalse(db.Apartmentinfo.viewInfo("0"));
	}

}
