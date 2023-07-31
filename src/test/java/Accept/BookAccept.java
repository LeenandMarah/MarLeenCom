package Accept;

import static org.junit.Assert.*;

import io.cucumber.java.en.*;
public class BookAccept {
	
	

	@Given("tenant wants1 {string}")
	public void tenantWants1(String string) {
		 assertEquals(string,"book");
	    
	}
	@Given("apartment id is {string}")
	public void apartmentIdIs(String string) {
		 assertEquals(string,"2");
	}
	@Then("booked done")
	public void bookedDone() {
		
	    assertEquals(db.Apartmentinfo.book("2",db.UserInfo.tenants.get(0)),1 );
	}
	
	@Then("bill is showed")
	public void billIsShowed() {
	    assertEquals(db.Apartmentinfo.showBill(db.UserInfo.tenants.get(0),"2"),1);
	}
	
	@Given("apartment id is1 {string}")
	public void apartmentIdIs1(String string) {
		assertEquals(string,"1");
	    
	}

	@Then("booked falied")
	public void bookedFalied() {
		 assertEquals(db.Apartmentinfo.book("1",db.UserInfo.tenants.get(0)),0);
	    
	}
}
