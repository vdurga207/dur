package TestScripts;


import org.testng.annotations.Test;



public class Tc3 extends RootTest {

	//static Login login=new Login(brow);
	
	@Test
	public static void EditEmp() throws Exception
	{
		
		login.setUp();
		login.loginToapp();
		login.addEmp("kj", "pj");
		login.verifyItemInEmpList("kj", "pj");
		login.editEmployee("v","d");
		login.verifyItemInEmpList("v", "d");
		login .logout();
		brow.closeBrowser();
		brow.QuitObject();
}
}