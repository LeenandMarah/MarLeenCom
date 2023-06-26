package Accept;

import org.junit.runner.RunWith;
import io.cucumber.junit.*;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(features="Features",
     plugin= {"summary","html:target/output.html"},
     monochrome=true,
     snippets = SnippetType.CAMELCASE,
     glue="Accept")

public class AcceptLog {

}
