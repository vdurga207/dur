package TestScripts;

import org.testng.annotations.Test;

public class Tc4 extends RootTest {
@Test
public void DeleteEmp() throws Exception
{
	login.setUp();
	login.loginToapp();
    login.addEmp("po", "or");
	login.verifyItemInEmpList("po", "or");
	login.deleteemp();
	login .logout();
	brow.closeBrowser();
	brow.QuitObject();
	
	
	
}
}
