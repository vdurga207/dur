package TestScripts;



import org.testng.annotations.Test;


public class Tc1 extends RootTest 
{
	
	
	
	@Test
	public static void verifyorange()throws Exception
	{
	
		brow.startBrowserChrome();
		//verify title
		brow.verifyTitle("OrangeHRM - New Level of HR Management");
		//verify un
		login.setUp();
		login.loginToapp();
		//verify title
		brow.verifyTitle("OrangeHRM");
		login.logout();
		brow.closeBrowser();
		brow.QuitObject();
}
}