package TestScripts;

import org.testng.annotations.Test;



public class Tc2 extends RootTest{
	//static Login login=new Login(brow);
	@Test
	public static void AddEmployee() throws Exception
	{
		
		login.setUp();
		login.loginToapp();
		login.addEmp("u","v");
		login.verifyItemInEmpList("u","v");
		login.logout();
		brow.closeBrowser();
		brow.QuitObject();
}
}