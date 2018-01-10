package vtigertc;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Tc4DelLead {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver","D:\\selenium_durga\\browser drivers\\chromedriver.exe");
		ChromeDriver x=new ChromeDriver();
		WebDriverWait wait=new WebDriverWait(x,60);
		//x.manage().window().maximize();
		x.get("http://classroom:8888/");
		if(wait.until(ExpectedConditions.titleIs("vtiger CRM 5 - Commercial Open Source CRM")))
		{
		    System.out.println("Home page is displayed");
		}
		else
		{
		    System.out.println("Home page is not displayed");
		}
		//Verify the Un,pwd,login is displayed
		WebElement objUN=x.findElement(By.name("user_name"));
		WebElement objPD=x.findElement(By.name("user_password"));
		WebElement objlogin=x.findElement(By.id("submitButton"));
				
		if(objUN.isDisplayed()&&objPD.isDisplayed()&&objlogin.isDisplayed())
		{
		    System.out.println("Username,password and login are displayed");
		}
		else
		{
		    System.out.println("Username,password and login not displayed");
		}    
		//Assign username and password to String values
		String strUN="qaplanet1";
		String strPD="user1";
		//Enter valid username and password
		objUN.sendKeys(strUN);
		objPD.sendKeys(strPD);
		objlogin.click();
		Thread.sleep(2000);
		//Verify the admin page is displayed
		if(wait.until(ExpectedConditions.titleIs("user1 - Home - vtiger CRM 5 - Commercial Open Source CRM")))
		{
		    System.out.println("Admin page is displayed");
		}
		else
		{
		    System.out.println("Failed to login");
		    return;
		}
		//Verify the HOME link is displayed
		WebElement home=x.findElement(By.xpath("/html/body/table[3]/tbody/tr/td[1]/a"));
		WebElement cale=x.findElement(By.xpath("//table[@class='hdrTabBg']/tbody/tr/td[2]/table/tbody/tr/td[2]/a"));
		WebElement lead=x.findElement(By.xpath("//table[@class='hdrTabBg']/tbody/tr/td[2]/table/tbody/tr/td[4]/a"));
		WebElement org=x.findElement(By.xpath("//table[@class='hdrTabBg']/tbody/tr/td[2]/table/tbody/tr/td[6]/a"));
		WebElement cont=x.findElement(By.xpath("//table[@class='hdrTabBg']/tbody/tr/td[2]/table/tbody/tr/td[8]/a"));
		WebElement opprt=x.findElement(By.xpath("//table[@class='hdrTabBg']/tbody/tr/td[2]/table/tbody/tr/td[10]/a"));
		WebElement products=x.findElement(By.xpath("//table[@class='hdrTabBg']/tbody/tr/td[2]/table/tbody/tr/td[12]/a"));
		WebElement doc=x.findElement(By.xpath("//table[@class='hdrTabBg']/tbody/tr/td[2]/table/tbody/tr/td[14]/a"));
		WebElement email=x.findElement(By.xpath("//table[@class='hdrTabBg']/tbody/tr/td[2]/table/tbody/tr/td[16]/a"));
		if(home.isDisplayed()&&cale.isDisplayed()&&lead.isDisplayed()&&org.isDisplayed()&&cont.isDisplayed()&&
				opprt.isDisplayed()&&products.isDisplayed()&&doc.isDisplayed()&&email.isDisplayed())
		{
		    System.out.println("Home under Admin page is displayed");
		}
		else
		{
		    System.out.println("Home under Admin page is not displayed");
		}
		//Click on the Lead module link
		lead.click();
		//Verify Lead module page must be displayed
		if(wait.until(ExpectedConditions.presenceOfElementLocated
		        (By.xpath("//table[@class='small']/tbody/tr[2]/td/a"))).isDisplayed())    
		    {
		    System.out.println("Leads module page is displayed");
		    }
		else
		{
			System.out.println("fail to click on lead");
		}
		//click on delete
		WebElement del=x.findElement(By.xpath("//*[@id='massdelete']/table/tbody/tr[1]/td/table[2]/tbody/tr/td/input[1]"));
		del.click();
Alert A1=x.switchTo().alert();
if(A1.getText().equals("Please select at least one entity"))
{
	System.out.println("Please select at least one entity ,,,,,,alert");
	A1.accept();
}
else
{
	System.out.println("no alert");
}
x.findElement(By.xpath
("html/body/table[4]/tbody/tr/td[2]/div[4]/form/table/tbody/tr[1]/td/div/table/tbody/tr[3]/td[1]/input")).click();
String id=x.findElement(By.xpath
		("html/body/table[4]/tbody/tr/td[2]/div[4]/form/table/tbody/tr[1]/td/div/table/tbody/tr[3]/td[2]")).getText();
System.out.println(id);
del.click();
Alert A2=x.switchTo().alert();
if(A2.getText().equals("Are you sure you want to delete the selected 1 records?"))
{
	System.out.println("Alert is present");
	A2.accept();
}
else
{
	System.out.println("no alert");
}
//serach for
WebElement serchnow=x.findElement(By.className("txtBox"));
serchnow.clear();
serchnow.sendKeys(id);
//click on serachnow
x.findElement(By.name("submit")).click();
Thread.sleep(3000);

String nolead=x.findElement(By.xpath("/html/body/table[4]/tbody/tr/td[2]/div[4]/form/table/tbody/tr[1]/td/div/table/tbody/tr[3]/td/div/table/tbody/tr[1]/td[2]/span")).getText();
if(nolead.equals(" No Lead Found ! "))
{
	System.out.println(" No Lead Found !  ====that means successfully deleted");
}
else
{
System.out.println("fail to delete");
}
Thread.sleep(3000);
//Mouse over on signout link
Actions act=new Actions(x);
WebElement objimage=x.findElement(By.xpath("/html/body/table/tbody/tr/td[3]/table/tbody/tr/td[2]/img"));


//Move to image
  act.moveToElement(objimage).perform();
  x.findElement(By.linkText("Sign Out")).click();
  System.out.println("Logout successful");
  Thread.sleep(2000);
  //Wait for home page to be displayed
      if(wait.until(ExpectedConditions.titleIs("vtiger CRM 5 - Commercial Open Source CRM")))
      {
          System.out.println("Home page is displayed");
      }
      else
      {
          System.out.println("Home page is not displayed");
      }
  x.close();
  x.quit();

	}

}
