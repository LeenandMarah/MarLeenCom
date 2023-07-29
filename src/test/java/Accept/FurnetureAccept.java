package Accept;

import io.cucumber.java.en.*;

import static org.junit.Assert.assertTrue;

public class FurnetureAccept {

@Given("that tenant wants {string}")
public void thatTenantWants(String string) {
   
	string.equals("Add");
	
}

@Then("add is done")
public void addIsDone() {
   assertTrue(db.FurnetureInfo.addItem("2", "photo", 200)==1);
}

@Given("that tenant wantss {string}")
public void thatTenantWantss(String string) {
    string.equals("view");
}

@Then("view is done")
public void viewIsDone() {
   assertTrue( db.FurnetureInfo.show()==1);
}

}
