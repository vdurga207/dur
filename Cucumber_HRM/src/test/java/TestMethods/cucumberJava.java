package TestMethods;

import org.openqa.selenium.By; 
import org.openqa.selenium.WebDriver; 
import org.openqa.selenium.firefox.FirefoxDriver; 

import cucumber.api.java.en.Given; 
import cucumber.api.java.en.Then; 
import cucumber.api.java.en.When; 

public class cucumberJava
{ 
   WebDriver driver = null; 
	
   @Given("^I have open the browser$") 
   public void openBrowser() 
   { 
	   System.setProperty("webdriver.gecko.driver", "F:\\D-Drive\\FromC\\geckodriver-v0.11.1-win64\\geckodriver.exe");
      driver = new FirefoxDriver(); 
   } 
	
   @When("^I open Facebook website$") 
   public void goToFacebook()
   { 
      driver.navigate().to("https://www.facebook.com/"); 
   } 
	
   @Then("^Login button should exits$") 
   public void loginButton()
   { 
      if(driver.findElement(By.xpath("//input[@value='Log In']")).isDisplayed()) 
      { 
         System.out.println("Test 1 Pass"); 
      } else { 
         System.out.println("Test 1 Fail"); 
      } 
      driver.close(); 
   } 
}