package vtigertc;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Tc2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\selenium_durga\\browser drivers\\chromedriver.exe");
ChromeDriver x=new ChromeDriver();
WebDriverWait wait=new WebDriverWait(x,30);
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
//Click on Create Lead(+)icon
wait.until(ExpectedConditions.presenceOfElementLocated
        (By.xpath("//table[@class='small']/tbody/tr[2]/td[2]/table/tbody/tr/td[2]/table/tbody/tr/td/table/tbody/tr/td[1]/a/img"))).click();
Thread.sleep(2000);
//Verify Creating New Lead page is displayed
if(wait.until(ExpectedConditions.textToBePresentInElementLocated
            (By.xpath("/html/body/table[4]/tbody/tr/td[2]/div/span"),"Creating New Lead")))
{
    System.out.println("Creating New Lead page is displayed");
}
else
{
    System.out.println("Creating New Lead page is not displayed");
}
//Create Strings for Last name and Company
String strLname="TestLname";
String strComp="EY-gss";
//Create webelement for Last Name
WebElement objLastName=x.findElement(By.name("lastname"));
//Create Webelement for Company
WebElement objComp=x.findElement(By.name("company"));
//Create Webelement for Save button
    WebElement objSav=x.findElement(By.name("button"));
    //Click on save
    objSav.click();
    //Creating Alert message handling
    Alert Alert1=wait.until(ExpectedConditions.alertIsPresent());
    	
 if(Alert1.getText().equals("Last Name cannot be empty"))
            {
                System.out.println("Last Name can not be empty message is displayed");
                Alert1.accept();
            }
            else
            {
                System.out.println("Last Name can not be empty message is not displayed");
            }
            //Enter 
            objLastName.sendKeys(strLname);
            objSav.click();
            
            Alert Alert2=wait.until(ExpectedConditions.alertIsPresent());
          
            if(Alert2.getText().equals("Company cannot be empty"))
            {
                System.out.println("Company can not be empty message is displayed");
                Alert2.accept();
            }
            else
            {
                System.out.println("Company can not be empty message is not displayed");
            }
            //Enter company name and click on save
            objComp.sendKeys(strComp);
            objSav.click();
            //Verify Lead information Page must be displayed
    if(wait.until(ExpectedConditions.textToBePresentInElementLocated(By.xpath
            ("/html/body/table[3]/tbody/tr[1]/td/table[2]/tbody/tr/td[2]/div/table[2]/tbody/tr[1]/td/table/tbody/tr/td[2]"),
            "Lead Information")))
    {
        System.out.println("Lead information Page is displayed");
    }
    else
    {
        System.out.println("Lead information Page is not displayed");
    }
    //Getting the attribute value of ID created//THE AUTO GENERATED LEADID 
    String strId=x.findElement(By.xpath("//*[@id='tblLeadInformation']/table/tbody/tr[1]/td[4]")).getText();
    System.out.println(strId);

    //Verify Lead module page must be displayed
    WebElement objLead1=x.findElement(By.xpath("/html/body/table[3]/tbody/tr[1]/td/table[1]/tbody/tr[2]/td[1]/a"));
    objLead1.click();
    ////Verify Lead module page must be displayed
    if(wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/table[3]/tbody/tr[2]/td[1]/a"))).isDisplayed())
    {
    	  System.out.println("Lead module page is displayed");
    }
else
{
System.out.println("Lead module page is not displayed");
}
/*int rc1=driver.findElements(By.xpath("//table[@class='lvt small']/tbody/tr")).size();
System.out.println("first row count is"+ rc1);
int i;
for(i=1;i<=rc1;i++)
{
//Get second column data
//String strEmpID=driver.findElement(By.xpath("//table[@class='data-table']/tbody/tr["+i+"]/td[2]")).getText();
//Get third column data
String strLead_Sibling=driver.findElement(By.xpath("//table[@class='lvt small']/tbody/tr["+i+"]/td[3]/a")).getText();
if(strLead_Sibling.equals(strLname))
{
    System.out.println(strLead_Sibling);
    break;
}}
*/
Thread.sleep(5000);
/*String strLead_Sibling=driver.findElement(By.xpath("//table[@class='lvtBg']/descendant::td[contains(text(),"+strId+")]/following-sibling::td/a")).getText();
Thread.sleep(10000);
if(strLead_Sibling.equals(strLname))
{
    System.out.println(strLead_Sibling);
}*/
//Create webelements for search for and search now
WebElement objSearchfor=x.findElement(By.name("search_text"));
WebElement objSearchnow=x.findElement(By.name("submit"));
//Enter strId value in search box
objSearchfor.sendKeys(strId);
//Click on search  now
objSearchnow.click();
Thread.sleep(2000);
String strLeadId=x.findElement(By.xpath("//table[@class='lvt small']/tbody/tr[3]/td[2]")).getText();
System.out.println(strLeadId);
if((" "+strLeadId).equals(strId))
{
    System.out.println("Lead info is displayed");
}
else
{
    System.out.println("Not displayed");
}

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


