package Accept;

import static org.junit.Assert.assertTrue;

import io.cucumber.java.en.*;
public class BookAccept {
	
	

	@Given("tenant wants1 {string}")
	public void tenantWants1(String string) {
		 assertTrue(string.equals("book"));
	    
	}
	@Given("apartment id is {string}")
	public void apartmentIdIs(String string) {
		 assertTrue(string.equals("2"));
	}
	@Then("booked done")
	public void bookedDone() {
		
	    assertTrue(dB.Apartmentinfo.book("2",dB.UserInfo.tenants.get(0))==1 );
	}
	
	@Then("bill is showed")
	public void billIsShowed() {
	    assertTrue(dB.Apartmentinfo.showBill(dB.UserInfo.tenants.get(0),"2")==1);
	}
	
	@Given("apartment id is1 {string}")
	public void apartmentIdIs1(String string) {
		assertTrue(string.equals("1"));
	    
	}

	@Then("booked falied")
	public void bookedFalied() {
		 assertTrue(dB.Apartmentinfo.book("1",dB.UserInfo.tenants.get(0))==0 );
	    
	}
}
