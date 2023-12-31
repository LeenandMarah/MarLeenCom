package Accept;

import io.cucumber.java.en.*;

import static org.junit.Assert.*;

import db.BuldingInfo;
public class generalInfoAccept {
	
	

	
	@Given("building id isss {string}")
	public void building_id_isss(String string) {
	    assertEquals("1",string);
	}

	@Then("building search done")
	public void building_search_done() {
	   assertTrue(BuldingInfo.ifFound("1"));
	}

	@Given("aId iss {string}")
	public void a_id_iss(String string) {
		 assertEquals("9",string);
	}

	@Then("building search faild")
	public void building_search_faild() {
	   assertFalse(BuldingInfo.ifFound("9"));
	}

	@Given("aId was {string}")
	public void a_id_was(String string) {
		  assertEquals("1",string);
	}


	@Then("found done")
	public void found_done() {
		assertTrue(BuldingInfo.findBuildingForOwner("1"));
	}


}
