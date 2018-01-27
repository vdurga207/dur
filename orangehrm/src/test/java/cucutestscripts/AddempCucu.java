package cucutestscripts;

import Businessfunctions.Login;
import LIB.Commonn;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AddempCucu {
Commonn x=new Commonn();
Login l =new Login(x); 
	public String Fn="kk";
	public String Ln="pp";
	public String ae;
	@Given("^login$")
	public void log() throws Exception
	{
		l.setUp();
		l.loginToapp();
		
		
	/*x.startBrowserChrome();
	x.verifyTitle("OrangeHRM - New Level of HR Management");
	//verify username
	x.verifyElementPresent("name","txtUserName");
	x.ClearTextField("name","txtUserName");
	x.sendKeys("name", "txtUserName","qaplanet1");
	//verify password
	x.verifyElementPresent("name","txtPassword");
	x.ClearTextField("name", "txtPassword");
	x.sendKeys("name", "txtPassword","lab1");
	x.sleepThread(1000);
	x.verifyElementPresent("name", "Submit");
	x.click("name", "Submit");
	x.waitForPageToLoad();
	x.verifyTitle("OrangeHRM");*/
	}
	@When("^add emp$")
	public void addemp() throws Exception
	{
		l.addEmp("QA", "PLANET");
		
		/*x.startAction();
	    //focus on pim,click on add employee
		x.MouseOverToElement("linkText", "PIM");
		x.click("linkText","Add Employee");
		//selecting frame
		x.selectFrameById("rightMenu");	
		//Verify PIM : Add Employee text
		x.verifyText("xpath","//*[@id='frmEmp']/div/div[1]/div[2]/div[1]/h2", "PIM : Add Employee");
		//get emp code
		ae=x.getattribute("id", "txtEmployeeId","value");
		System.out.println(ae);
		// keep all fields blank and click on save
		x.click("id", "btnEdit");
		//Alert verify
		x.alerts("Last Name Empty!");
		//enter first and last name
		x.sendKeys("id", "txtEmpLastName",Fn);
		// click on save
		x.click("id","btnEdit");
		//alert
		x.alerts("First Name Empty!");
		x.sendKeys("name", "txtEmpFirstName", Ln);
		//click on save button
		x.click("id", "btnEdit");
		//wait for Personal Details 
		x.waitUntilElementPresent("//*[@id='personal']/div[1]/div[2]/div[1]/h2");*/
	}
	@And("^verify amp$")
	public void verifyEmpList()throws Exception
	{
		l.verifyItemInEmpList("QA", "PLANET");
		
		/*//select frame
		x.selectFrameDefault();
		//focus on pim,click on  employee list
		x.MouseOverToElement("linkText", "PIM");
		x.click("linkText","Employee List");
		//select frame
		x.selectFrameById("rightMenu");
		//Wait for Employee info element
		x.waitUntilElementPresent("//*[@id='standardView']/div[1]/h2");
		//verify Employee information
		x.verifyText("xpath", "//*[@id='standardView']/div[1]/h2", "Employee Information");
		//wait for 2 sec
		x.sleepThread(2000);
		//select drop box(id)
		x.SelectItemFromDroopdrown("name", "loc_code");
		//enter id on search for
		x.sendKeys("name", "loc_name", ae);
		//click on search
		x.click("xpath", "//*[@id='standardView']/div[2]/input[2]");
		String itemname=Fn+" "+Ln;
		x.verifyElementInTable("//table[@class='data-table']/tbody/tr/td[3]",itemname);
		System.out.println(ae+"   "+itemname);*/
	}
	
	/*@And("^editemp$")
	public  void editemp() throws Exception
	{
		l.editEmployee("po", "lo");
	}*/
	@And("^verfy amp$")
	public void verifyEpList()throws Exception
	{
		l.verifyItemInEmpList("po", "lo");
	}
	
	@Then("^clck on logt$")
	public void logout()
	{
		l.logout();
		/*//select frame
		x.selectFrameDefault();
		x.click("linkText","Logout");
		x.closeBrowser();
		x.QuitObject();*/
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
