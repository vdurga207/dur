package TestMethods;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CucumberAlerts
{
	   WebDriver driver = null; 
	  WebDriverWait wait= null;
	  Alert A=null;
	   @Given("^I have open the browser$") 
	   public void openBrowser() 
	   { 
		   System.setProperty("webdriver.chrome.driver","D:\\selenium_durga\\browser drivers\\chromedriver.exe");
		      driver = new ChromeDriver(); 
	      wait=new WebDriverWait(driver, 30);
	   } 
		
	   @When("^I open Alert website$") 
	   public void goToAlertPage()
	   { 
	      driver.navigate().to("http://classroom:90/webapp/AgeProb.html");
	      wait.until(ExpectedConditions.titleIs("Age Problem"));
	   } 
		
	   @And("^Enter Age$")
	   public void EnterAge()
	   {
		   driver.findElement(By.id("idAge")).sendKeys("10");
	   }
	   @And("^Click on Submit$")
	   public void ClickonSubmit()
	   {
		   driver.findElement(By.id("idSubGo")).click();
		   wait.until(ExpectedConditions.alertIsPresent());
	   }
	   
	   @Then("^Alert should exits$") 
	   public void VerifyAlert()
	   { 
		   A=driver.switchTo().alert();
	      if(A.getText().equals("Kid") )
	      { 
	        System.out.println("Kid alert displayed");	 
	      } 
	      driver.close(); 
	   } 
	   @And("^Accept Alert$")
	   public void AcceptAlert()
	   {
		   A.accept();
		   driver.close();
		   driver.quit();
	   }
	   
}
