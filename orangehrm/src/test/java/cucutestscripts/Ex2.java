package cucutestscripts;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Ex2 {
	 WebDriver x = null; 
	  WebDriverWait w= null;
	
	 @Given("^url vtiger$") 
	   public void openowser() 
	   { 
		   System.setProperty("webdriver.chrome.driver","D:\\selenium_durga\\browser drivers\\chromedriver.exe");
	      x = new ChromeDriver(); 
	      w=new WebDriverWait(x, 30);
	   } 
	   @And("^verify title$") 
	   public void opnurl()
	   {
		   x.navigate().to("http://classroom:8888/index.php");
		      w.until(ExpectedConditions.titleIs("vtiger CRM 5 - Commercial Open Source CRM"));   
	   }
	   @When("^enter un$")
	   public void userame()
	   {
		   WebElement us=x.findElement(By.name("user_name"));
		   us.clear();
		   us.sendKeys("qaplanet1");
	   }
	   @When("^enter pwd$")
	   public void pasword()
	   {
		   WebElement us=x.findElement(By.name("user_password"));
		   us.clear();
		   us.sendKeys("user1");
	   }
	   @When("^click on submit$")
	   public void loin()
	   {
		   WebElement us=x.findElement(By.id("submitButton"));
		   us.click();
		   w .until(ExpectedConditions.titleIs("user1 - Home - vtiger CRM 5 - Commercial Open Source CRM"));
		  
	   }
	   @Then("^click on logt$")
	   public void logut()
	   {
		   WebElement objimage=x.findElement(By.xpath("/html/body/table/tbody/tr/td[3]/table/tbody/tr/td[2]/img"));
		   Actions act=new Actions(x);
		   act.moveToElement(objimage).perform();
		   x.findElement(By.linkText("Sign Out")).click();
		  
		  
	   }
	   @And("^verfy page$")
	   public void qut()
	   {
		   w.until(ExpectedConditions.titleIs("vtiger CRM 5 - Commercial Open Source CRM"));
		   x.close();
		   x.quit();
	   }
	 
		   
	   }

