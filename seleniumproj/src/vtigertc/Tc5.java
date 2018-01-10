package vtigertc;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Tc5 {

	public static void main(String[] args) throws Exception{
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
		// click on org
		org.click();
		WebElement plus=x.findElement(By.xpath("/html/body/table[3]/tbody/tr[2]/td[2]/table/tbody/tr/td[2]/table/tbody/tr/td/table/tbody/tr/td[1]/a/img"));
		WebElement searchfor=x.findElement(By.className("txtBox"));
		WebElement  serch=x.findElement(By.name("submit"));
		//verify org page
		if(plus.isDisplayed()&&searchfor.isDisplayed()&&serch.isDisplayed())
		{
			System.out.println("org page is verified");
		}
		else
		{
			System.out.println("fail to verify org page");
		}
		//click on plus
		plus.click();
		//verify add org
		if(wait.until(ExpectedConditions.textToBePresentInElementLocated(By.xpath("/html/body/table[4]/tbody/tr/td[2]/div/span"),"Creating New Organization")))
		{
			System.out.println("Creating New Organization ...is verified");
		}
		else
		{
			System.out.println("fail to verify plus");
		}
		JavascriptExecutor js= (JavascriptExecutor)x;
		js.executeScript("window.scrollBy(0,250)", "");
		//click on save
		WebElement save=x.findElement(By.xpath
		("/html/body/table[4]/tbody/tr/td[2]/div/form/table/tbody/tr[2]/td/table/tbody/tr/td/table/tbody/tr[2]/td/table/tbody/tr[22]/td/div/input[1]"));
		save.click();
		Alert Al=x.switchTo().alert();
		if(Al.getText().equals("Organization Name cannot be empty"))
		{
			System.out.println("alert is present");
			Al.accept();
		}
		else
		{
			System.out.println("no alert");
		}
		//enter name
x.findElement(By.xpath
("/html/body/table[4]/tbody/tr/td[2]/div/form/table/tbody/tr[2]/td/table/tbody/tr/td/table/tbody/tr[2]/td/table/tbody/tr[3]/td[2]/input"))
.sendKeys("hiiiiiiiiii");
js.executeScript("window.scrollBy(0,250)", "");
save.click();
//verify
String name=x.findElement(By.xpath("/html/body/table[3]/tbody/tr[1]/td/table[2]/tbody/tr/td[2]/div/table[1]/tbody/tr/td/span[1]")).getText();
System.out.println(name);
	}

}
