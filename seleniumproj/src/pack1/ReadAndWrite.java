package pack1;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;

public class ReadAndWrite {

	public static void main(String[] args) throws BiffException, IOException, RowsExceededException, WriteException, InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","D:\\selenium_durga\\browser drivers\\chromedriver.exe");
		//Create object for webdriver
		WebDriver Brow = new ChromeDriver();
		//Brow.manage().window().maximize();
		WebDriverWait wait = new WebDriverWait(Brow, 20);
		//open Application
		Brow.get("http://apps.qaplanet.in/qahrm/login.php");
		
		//Read data objects
		File fis = new File("D:\\1234.xls");
		Workbook objwb = Workbook.getWorkbook(fis);
		Sheet InputSheet = objwb.getSheet(2);
		
		//Write data objects
		WritableWorkbook wwb = Workbook.createWorkbook(new File("D:\\Res.xls"));
		WritableSheet Outputsheet = wwb.createSheet("HRM", 0);
	
		Label l = new Label(0, 0, "Username");
		Label l1 = new Label(1, 0, "Password");
		Label l2 = new Label(2, 0, "Result");
		
		
		Outputsheet.addCell(l);
		Outputsheet.addCell(l1);
		Outputsheet.addCell(l2);
		
		Label r1; 
		Label r2;
		Label r3;
		//Get row count
		int Rcount = InputSheet.getRows();
		System.out.println(Rcount);
		for (int i = 1; i < Rcount; i++) 
		{
			System.out.println("Iteration no: "+i);
			
		//Create object for Username
		WebElement objun = wait.until(ExpectedConditions.presenceOfElementLocated(By.name("txtUserName")));
		objun.clear();
		objun.sendKeys(InputSheet.getCell(0, i).getContents());
			
		//Create object for Password
		WebElement objpwd = wait.until(ExpectedConditions.presenceOfElementLocated(By.name("txtPassword")));
		objpwd.clear();
		objpwd.sendKeys(InputSheet.getCell(1, i).getContents());	
			
		//Click on login
		WebElement objlogin = wait.until(ExpectedConditions.presenceOfElementLocated(By.name("Submit")));
		objlogin.click();
			
			Thread.sleep(4000);
			
			String res = "Passed1";
			String res1 = "Failed2";
			
			//Verify Orange HRM home page			
			if(Brow.getTitle().equals("OrangeHRM"))
			{
				System.out.println("Login successfully");
				r1 = new Label(0, i, InputSheet.getCell(0, i).getContents());
				r2 = new Label(1, i, InputSheet.getCell(1, i).getContents());
				r3 = new Label(2, i, res);								
				Outputsheet.addCell(r1);
				Outputsheet.addCell(r2);
				Outputsheet.addCell(r3);				
				//Click on logout
				Brow.findElement(By.linkText("Logout")).click();
				Thread.sleep(4000);
			}			
			else
			{
				System.out.println("Login failed");
				r1 = new Label(0, i, InputSheet.getCell(0, i).getContents());
				r2 = new Label(1, i, InputSheet.getCell(1, i).getContents());
				r3 = new Label(2, i, res1);											
				Outputsheet.addCell(r1);
				Outputsheet.addCell(r2);
				Outputsheet.addCell(r3);
				
				Thread.sleep(4000);
				Brow.findElement(By.name("clear")).click();
			}			
		}
		wwb.write();
		wwb.close();		
		Brow.close();
		Brow.quit();
	}

}
