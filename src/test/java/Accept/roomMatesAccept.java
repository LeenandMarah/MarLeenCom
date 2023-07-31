package Accept;

import io.cucumber.java.en.*;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;


public class roomMatesAccept {
	
	
	@Given("tenant  booked correctly")
	public void tenantBookedCorrectly() {
	   assertTrue(db.Apartmentinfo.book("2",db.UserInfo.tenants.get(0))==1);
	}

	@Given("tenant choosed {string}")
	public void tenantChoosed(String string) {
	   
		assertEquals(string,"y");
	}

	@Then("show his roomMates done")
	public void showHisRoomMatesDone() {
	   assertEquals( db.Apartmentinfo.myNighbours("2"),1);
	}
	@Given("tenant  booked correctlyyy")
	public void tenantBookedCorrectlyyy() {
	 assertFalse(db.Apartmentinfo.book("2",db.UserInfo.tenants.get(0))==1);
	}


	@Given("tenant choosedn {string}")
	public void tenantChoosedn(String string) {
		assertEquals(string,"n");
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
		 assertFalse( db.Apartmentinfo.myNighbours("3")==1);
	}



}
