package cucutestscripts;

import Businessfunctions.Login;
import LIB.Commonn;
import cucumber.api.java.en.And;

public class EditEmp {
	Commonn x =new Commonn();
	Login l =new Login(x); 
@And("^editemp$")
public  void editemp() throws Exception
{

	l.editEmployee("po", "lo");
/*	x.click("xpath", "//*[@id='standardView']/table/tbody/tr/td[3]/a");
	x.sleepThread(2000);
	//click on edit
	x.click("id","btnEditPers");
	//clear first name
	x.ClearTextField("name", "txtEmpFirstName");
	//clear last name
	x.ClearTextField("name", "txtEmpLastName");
	//click on first name
	x.sendKeys("name", "txtEmpFirstName", "po");
	//edit lastname
	x.sendKeys("name", "txtEmpLastName","po");
	//click on save
	x.click("id", "btnEditPers");
	x.sleepThread(1000);
	//l.verifyItemInEmpList("po", "lo");
*/}

}
