package cucutestscripts;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
@RunWith(Cucumber.class) 
@CucumberOptions(
		//format = {"pretty", "json:target/cucumber.json"},
		//format = {"pretty", "html:target/cucumber.html"},
		//features= {"C:\\Users\\user\\git\\repo1\\orangehrm\\src\\test\\java\\cucu\\Exam.feature"}
		//features= { "cucu" 
	//features= {"src\\test\\java\\cucu\\Exam.feature","src\\test\\java\\cucu\\Exam1.feature"}
		features= {"src\\test\\java\\cucu\\Exam.feature"},
		glue= { "cucutestscripts" },
		tags= {"@addeemp","@para"}
		) 
public class RunTest {
	
}
