package Accept;

import io.cucumber.java.en.*;
import DB.UserInfo;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import DB.Apartmentinfo;

public class roomMatesAccept {
	
	
	@Given("tenant  booked correctly")
	public void tenantBookedCorrectly() {
	   assertTrue(DB.Apartmentinfo.book("2",DB.UserInfo.tenants.get(0))==1);
	}

	@Given("tenant choosed {string}")
	public void tenantChoosed(String string) {
	   
		assertTrue(string.equals("y"));
	}

	@Then("show his roomMates done")
	public void showHisRoomMatesDone() {
	   assertTrue( DB.Apartmentinfo.myNighbours("2")==1);
	}
	@Given("tenant  booked correctlyyy")
	public void tenantBookedCorrectlyyy() {
	 assertFalse(DB.Apartmentinfo.book("2",DB.UserInfo.tenants.get(0))==1);
	}


	@Given("tenant choosedn {string}")
	public void tenantChoosedn(String string) {
		assertTrue(string.equals("n"));
	}
	@Then("dont show")
	public void dontShow() {
	   assertTrue(5==5);
	}

	@Given("apart is not studentType")
	public void apartIsNotStudentType() {
		assertFalse(DB.Apartmentinfo.apartments.get(2).isStudentType());
	}

	@Then("show failed")
	public void showFailed() {
		 assertFalse( DB.Apartmentinfo.myNighbours("3")==1);
	}



}
