package TestMethods;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber; 

@RunWith(Cucumber.class) 
@CucumberOptions(
		//format = {"pretty", "json:target/cucumber.json"},
		format = {"pretty", "html:target/cucumber.html"},
		features= {"src/test/java/FeaturesFiles"}
		) 

public class runTest {

}
