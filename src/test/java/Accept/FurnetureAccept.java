package Accept;

import io.cucumber.java.en.*;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class FurnetureAccept {

@Given("that tenant wants {string}")
public void thatTenantWants(String string) {
   
	string.equals("Add");
	
}

@Then("add is done")
public void addIsDone() {
   assertEquals(1,db.FurnetureInfo.addItem("2", "photo", 200));
}

@Given("that tenant wantss {string}")
public void thatTenantWantss(String string) {
    string.equals("view");
}

@Then("view is done")
public void viewIsDone() {
   assertEquals( 1,db.FurnetureInfo.show());
}

}
