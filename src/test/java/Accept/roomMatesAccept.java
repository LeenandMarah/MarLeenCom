package Accept;

import io.cucumber.java.en.*;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;


public class roomMatesAccept {
	
	
	@Given("tenant  booked correctly")
	public void tenantBookedCorrectly() {
	   assertEquals(1,db.Apartmentinfo.book("2",db.UserInfo.tenants.get(0)));
	}

	@Given("tenant choosed {string}")
	public void tenantChoosed(String string) {
	   
		assertEquals("y",string);
	}

	@Then("show his roomMates done")
	public void showHisRoomMatesDone() {
	   assertEquals( 1,db.Apartmentinfo.myNighbours("2"));
	}
	@Given("tenant  booked correctlyyy")
	public void tenantBookedCorrectlyyy() {
	 assertNotEquals(1,db.Apartmentinfo.book("2",db.UserInfo.tenants.get(0)));
	}


	@Given("tenant choosedn {string}")
	public void tenantChoosedn(String string) {
		assertEquals("n",string);
	}
	@Then("dont show")
	public void dontShow() {
	   assertTrue(true);
	}

	@Given("apart is not studentType")
	public void apartIsNotStudentType() {
		assertFalse(db.Apartmentinfo.apartments.get(2).isStudentType());
	}

	@Then("show failed")
	public void showFailed() {
		 assertNotEquals( 1,db.Apartmentinfo.myNighbours("3"));
	}



}
