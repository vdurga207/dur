package pack1;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
@RunWith(Cucumber.class) 
@CucumberOptions(
		//format = {"pretty", "json:target/cucumber.json"},
		//format = {"pretty", "html:target/cucumber.html"},
		features= {"D:\\sel durga\\bbbbb\\Antony\\First.feature"}
		//features= { "cucu" }
		//features= {"src\\test\\java\\cucu\\Exam.feature:13"}
		//glue= { "pack1" }
		
		
		) 
public class Run {
	
}
