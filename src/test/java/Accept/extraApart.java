package Accept;

import static org.junit.Assert.*;
import db.Apartmentinfo;
import io.cucumber.java.en.*;

public class extraApart {
	@Given("apartId is {string}")
	public void apart_id_is(String string) {
	   assertEquals(string,"1");
	}

	@Given("apartId iss {string}")
	public void apart_id_iss(String string) {
		  assertEquals(string,"9");
	}
	
	@Then("foundis done")
	public void foundis_done() {
	  assertTrue(Apartmentinfo.ifFoundap("1"));
	}

	@Then("found faild")
	public void found_faild() {
		  assertFalse(Apartmentinfo.ifFoundap("9"));
	}
	
	
	@Given("apartId was {string}")
	public void apart_id_was(String string) {
		 assertEquals(string,"9");
	}

	@Then("found will faild")
	public void found_will_faild() {
		 assertEquals(Apartmentinfo.findmyapartment("9"),null);
	}

	@Given("apartId wass {string}")
	public void apart_id_wass(String string) {
		 assertEquals(string,"1");
	}

	@Then("found willl success")
	public void found_willl_success() {
		 assertTrue(Apartmentinfo.findmyapartment("9")!=null);
	}

	
	@Given("apartId equal {string}")
	public void apart_id_equal(String string) {
		assertEquals(string,"1");
	}

	@Given("floor is {string}")
	public void floor_is(String string) {
		assertEquals(string,"1");
	}

	@Then("found is good")
	public void found_is_good() {
	   assertTrue(Apartmentinfo.buldingApartments("1", 1));
	}



}
