package cucutestscripts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ParameterEx {
	 WebDriver driver = null; 
	  WebDriverWait wait= null;
	  Alert A=null;
	  
	   @Given("^go to url$") 
	   public void openBrowser() 
	   { 
		   System.setProperty("webdriver.chrome.driver","D:\\selenium_durga\\browser drivers\\chromedriver.exe");
		      driver = new ChromeDriver(); 
		      wait=new WebDriverWait(driver, 60);
		   driver.navigate().to("http://apps.qaplanet.in/qahrm/login.php");
		      wait.until(ExpectedConditions.titleIs("OrangeHRM - New Level of HR Management"));   
	   }
	   @When("^enter ur \"([^\"]*)\"$")
		   public void username(String un)
		   {
			   WebElement us=driver.findElement(By.name("txtUserName"));
			   us.clear();
			   us.sendKeys(un);
		   }
	
		@And("^enter pwdd \"([^\"]*)\"$")
		   public void password(String pwd)
		   {
		   WebElement us1=driver.findElement(By.name("txtPassword"));
		   us1.clear();
		   us1.sendKeys(pwd);}
		@And("^sign in$")
		   public void sgnin()
		   {
			   
		   WebElement us11=driver.findElement(By.name("Submit"));
		   us11.click();
		   wait .until(ExpectedConditions.titleIs("OrangeHRM"));
		  
	   }
	   @Then("^logout$")
	   public void logout()
	   {
		   WebElement us=driver.findElement(By.linkText("Logout"));
		   us.click();
		 
		   wait.until(ExpectedConditions.titleIs("OrangeHRM - New Level of HR Management"));
		   driver.close();
		   driver.quit();
}
}