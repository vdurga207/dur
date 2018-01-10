package pack1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;


public class PropertiesFiles {

	public static void main(String[] args) throws FileNotFoundException, IOException, InterruptedException {
		Properties obj=new Properties();
		obj.load(new FileInputStream("D:\\sel durga\\seleniumproj\\src\\pack1\\Prop.properties"));
		String strurl=obj.getProperty("URL");
		String strUN=obj.getProperty("username");
		String strPWD=obj.getProperty("password");	
		//************************************
		System.setProperty("webdriver.chrome.driver","D:\\selenium_durga\\browser drivers\\chromedriver.exe");
		
		
		ChromeDriver Br=new ChromeDriver();
		Br.navigate().to(strurl);
		Thread.sleep(2000);
		Br.findElement(By.name("txtUserName")).clear();
		Br.findElement(By.name("txtUserName")).sendKeys(strUN);
		Br.findElement(By.name("txtPassword")).sendKeys(strPWD);
		Br.findElement(By.name("Submit")).click();
		Thread.sleep(2000);
		Br.findElement(By.linkText("Logout")).click();		
		Br.close();
		Br.quit();		

	}

}
