package Businessfunctions;


import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.WebElement;

import LIB.Commonn;
public class Login {
	Commonn browser;
	
	//constructor with one argument.
	public Login(Commonn br)
	{
		browser=br;
	}
	//initialization and assigning of properties file 
	Properties locators =new Properties();
	File locfile= new File("D:\\sel durga\\orangehrm\\src\\main\\java\\ElementLocators\\Login.properties");
	//Setup for properties file
	
	public void setUp() throws Exception
	{	browser.startBrowserChrome();	
		locators.load(new FileInputStream(locfile));		
	}
	public String ae;
	
	//login to application (method for login to application)
	public void loginToapp()
	{
		String usernameloc=locators.getProperty("username.textfield.loc");
		String passwordloc =locators.getProperty("password.textfield.loc");
		String loginbtnloc=locators.getProperty("login.button.loc");
		String un=locators.getProperty("usename");
		String pwd=locators.getProperty("password");
		
		
		browser.verifyTitle("OrangeHRM - New Level of HR Management");
		//verify username
		browser.verifyElementPresent("name", usernameloc);
		browser.ClearTextField("name", usernameloc);
		browser.sendKeys("name", usernameloc,un);
		//verify password
		browser.verifyElementPresent("xpath",passwordloc);
		browser.ClearTextField("xpath", passwordloc);
		browser.sendKeys("xpath", passwordloc,pwd);
		browser.sleepThread(1000);
		browser.verifyElementPresent("xpath", loginbtnloc);
		browser.click("xpath", loginbtnloc);
		browser.waitForPageToLoad();
		browser.verifyTitle("OrangeHRM");
	}
	//Method for logout
	public void logout()
	{
		//select frame
		browser.selectFrameDefault();
		browser.click("linkText","Logout");
	}
	public void clos()
	{
		browser.closeBrowser();
		browser.QuitObject();
	}
	public void addEmp(String firstname,String lastname) throws Exception
	{
		String sv=locators.getProperty("sav");
		String adem=locators.getProperty("Addemp");
		String fm=locators.getProperty("frame");
		String pm=locators.getProperty("pim");
		String ln=locators.getProperty("lastnam");
		String fn=locators.getProperty("frxtname");
		String iod=locators.getProperty("id");
		String psd=locators.getProperty("pd");
		browser.startAction();
	    //focus on pim,click on add employee
		browser.MouseOverToElement("linkText", pm);
		browser.click("linkText",adem);
		//selecting frame
		browser.selectFrameById(fm);	
		//Wait until PIM : Add Employee displayed
		browser.waitUntilElementPresent(locators.getProperty("AddEmployeeText"));
		//Verify PIM : Add Employee text
		browser.verifyText("xpath", locators.getProperty("AddEmployeeText"), "PIM : Add Employee");
		//get emp code
		ae=browser.getattribute("id", iod,"value");
		System.out.println(ae);
		// keep all fields blank and click on save
		browser.click("id", sv);
		//Alert verify
		browser.alerts("Last Name Empty!");
		//enter first and last name
		browser.sendKeys("id", ln,lastname);
		// click on save
		browser.click("id",sv);
		//alert
		browser.alerts("First Name Empty!");
		browser.sendKeys("name", fn, firstname);
		//click on save button
		browser.click("id", sv);
		//wait for Personal Details 
		browser.waitUntilElementPresent(psd);
	}
	
	public void verifyItemInEmpList(String firstname,String lastname)throws Exception
	{
		//select frame
		browser.selectFrameDefault();
		//focus on pim,click on  employee list
		browser.MouseOverToElement("linkText", "PIM");
		browser.click("linkText","Employee List");
		//select frame
		browser.selectFrameById("rightMenu");
		//Wait for Employee info element
		browser.waitUntilElementPresent("//*[@id='standardView']/div[1]/h2");
		//verify Employee information
		browser.verifyText("xpath", "//*[@id='standardView']/div[1]/h2", "Employee Information");
		//wait for 2 sec
		browser.sleepThread(2000);
		//select drop box(id)
		browser.SelectItemFromDroopdrown("name", "loc_code");
		//enter id on search for
		browser.sendKeys("name", "loc_name", ae);
		//click on search
		browser.click("xpath", "//*[@id='standardView']/div[2]/input[2]");
		String itemname=firstname+" "+lastname;
		browser.verifyElementInTable("//table[@class='data-table']/tbody/tr/td[3]",itemname);
		System.out.println(ae+"   "+itemname);
}
	public void editEmployee(String firstname,String lastname) throws Exception
	{
		browser.sleepThread(2000);
		//click on name in table
		browser.click("xpath", "//*[@id='standardView']/table/tbody/tr/td[3]/a");
		browser.sleepThread(2000);
		//click on edit
		browser.click("id","btnEditPers");
		//clear first name
		browser.ClearTextField("name", "txtEmpFirstName");
		//clear last name
		browser.ClearTextField("name", "txtEmpLastName");
		//click on first name
		browser.sendKeys("name", "txtEmpFirstName", firstname);
		//edit lastname
		browser.sendKeys("name", "txtEmpLastName",lastname);
		//click on save
		browser.click("id", "btnEditPers");
		browser.sleepThread(1000);
	}
	public void deleteemp()
	{
	
		//String fm=locators.getProperty("frame");
		String del=locators.getProperty("delete");
		//browser.selectFrameById(fm);
		//click on delete
		browser.click("xpath",del);
		browser.alerts("Select at least one record to delete");
		//select check box
		browser.click("xpath", "//*[@id='standardView']/table/tbody/tr[1]/td[1]/input");
		String a=browser.getText("xpath", "//*[@id='standardView']/table/tbody/tr[1]/td[2]");
		//System.out.println(a);
		// click on delete
		browser.click("xpath",del);
		//select drop box(id)
		browser.SelectItemFromDroopdrown("name", "loc_code");
		//enter id on search for
		browser.sendKeys("name", "loc_name", a);
		//click on search
		browser.click("xpath", "//*[@id='standardView']/div[3]/input[2]");
		String x=browser.getText("xpath", "//*[@id='standardView']/div[2]");
		//System.out.println(x);
		browser.verifyText("className", "noresultsbar", "No Records to Display");
	}
	
			
}