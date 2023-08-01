package Accept;

import static org.junit.Assert.*;

import io.cucumber.java.en.*;
public class BookAccept {
	
	

	@Given("tenant wants1 {string}")
	public void tenantWants1(String string) {
		 assertEquals("book",string);
	    
	}
	@Given("apartment id is {string}")
	public void apartmentIdIs(String string) {
		 assertEquals("2",string);
	}
	@Then("booked done")
	public void bookedDone() {
		
	    assertEquals(1,db.Apartmentinfo.book("2",db.UserInfo.tenants.get(0)) );
	}
	
	@Then("bill is showed")
	public void billIsShowed() {
	    assertEquals(1,db.Apartmentinfo.showBill(db.UserInfo.tenants.get(0),"2"));
	}
	
	@Given("apartment id is1 {string}")
	public void apartmentIdIs1(String string) {
		assertEquals("1",string);
	    
	}

	@Then("booked falied")
	public void bookedFalied() {
		 assertEquals(0,db.Apartmentinfo.book("1",db.UserInfo.tenants.get(0)));
	    
	}
}
