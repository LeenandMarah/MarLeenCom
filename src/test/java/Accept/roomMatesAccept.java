package Accept;

import io.cucumber.java.en.*;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;


public class roomMatesAccept {
	
	
	@Given("tenant  booked correctly")
	public void tenantBookedCorrectly() {
	   assertTrue(dB.Apartmentinfo.book("2",dB.UserInfo.tenants.get(0))==1);
	}

	@Given("tenant choosed {string}")
	public void tenantChoosed(String string) {
	   
		assertTrue(string.equals("y"));
	}

	@Then("show his roomMates done")
	public void showHisRoomMatesDone() {
	   assertTrue( dB.Apartmentinfo.myNighbours("2")==1);
	}
	@Given("tenant  booked correctlyyy")
	public void tenantBookedCorrectlyyy() {
	 assertFalse(dB.Apartmentinfo.book("2",dB.UserInfo.tenants.get(0))==1);
	}


	@Given("tenant choosedn {string}")
	public void tenantChoosedn(String string) {
		assertTrue(string.equals("n"));
	}
	@Then("dont show")
	public void dontShow() {
	   assertTrue(true);
	}

	@Given("apart is not studentType")
	public void apartIsNotStudentType() {
		assertFalse(dB.Apartmentinfo.apartments.get(2).isStudentType());
	}

	@Then("show failed")
	public void showFailed() {
		 assertFalse( dB.Apartmentinfo.myNighbours("3")==1);
	}



}
