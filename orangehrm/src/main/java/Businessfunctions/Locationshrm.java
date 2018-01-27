package Businessfunctions;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import LIB.Commonn;

public class Locationshrm {
Commonn browser;
	
	//constructor with one argument.
	public Locationshrm(Commonn br)
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
	//Addloc
	public void Addloc()
	{
		browser.startAction();
		browser.MouseOverToElement("linkText", "Admin");
		browser.MouseOverToElement("linkText", "Company Info");
		browser.click("linkText", "Locations");
		browser.click("xpath", "/html/body/div/div[2]/form/div[3]/div[1]/input[1]");
		browser.verifyText("xpath", "/html/body/div/div[3]/div[2]/div/h2", "Company Info : Locations");
		browser.click("id", "editBtn");
		browser.alerts("");
	}
}
