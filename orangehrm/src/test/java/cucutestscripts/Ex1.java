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

public class Ex1 {
	  WebDriver driver = null; 
	  WebDriverWait wait= null;
	  Alert A=null;
	  
	   @Given("^open the browser$") 
	   public void openBrowser() 
	   { 
		   System.setProperty("webdriver.chrome.driver","D:\\selenium_durga\\browser drivers\\chromedriver.exe");
		      driver = new ChromeDriver(); 
		      wait=new WebDriverWait(driver, 30);
	   } 
	   @And("^navigate to the app$") 
	   public void openurl()
	   {

		   driver.navigate().to("http://apps.qaplanet.in/qahrm/login.php");
		      wait.until(ExpectedConditions.titleIs("OrangeHRM - New Level of HR Management"));   
	   }
	   @When("^enter username$")
	   public void username()
	   {
		   WebElement us=driver.findElement(By.name("txtUserName"));
		   us.clear();
		   us.sendKeys("qaplanet1");
	   }
	   @When("^enter password$")
	   public void password()
	   {
		   WebElement us=driver.findElement(By.name("txtPassword"));
		   us.clear();
		   us.sendKeys("lab1");
	   }
	   @When("^click on login$")
	   public void login()
	   {
		   WebElement us=driver.findElement(By.name("Submit"));
		   us.click();
		   wait .until(ExpectedConditions.titleIs("OrangeHRM"));
		  
	   }
	   @Then("^click on logout$")
	   public void logout()
	   {
		   WebElement us=driver.findElement(By.linkText("Logout"));
		   us.click();
		  
	   }
	   @And("^verify home page$")
	   public void quit()
	   {
		   wait.until(ExpectedConditions.titleIs("OrangeHRM - New Level of HR Management"));
		   driver.close();
		   driver.quit();
	   }
}
