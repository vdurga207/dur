package pack1;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;

public class Flipkart {

	public static void main(String[] args) throws InterruptedException, IOException, RowsExceededException, WriteException {
System.setProperty("webdriver.chrome.driver","D:\\selenium_durga\\browser drivers\\chromedriver.exe");
		ChromeDriver x=new ChromeDriver();
		
		//x.manage().window().maximize();
		
		WebDriverWait wait=new WebDriverWait(x,30);
		Actions act=new Actions(x);
		x.get("https://www.flipkart.com");
		Thread.sleep(6000);
		x.findElement(By.xpath("/html/body/div[2]/div/div/button")).click();
		Thread.sleep(3000);
		//focus on electronics
		WebElement electronics=x.findElement(By.cssSelector("#container > div > header > div._1kj1Bn > div > ul > li:nth-child(1) > a > span"));
		act.moveToElement(electronics).perform();
		// click on samsung
x.findElement(By.linkText("Samsung")).click();
Thread.sleep(4000);
//click on view all
x.findElement(By.cssSelector("#container > div > div:nth-child(2) > div > div > div._2H64zk > div > div > div:nth-child(1) > div._2WNbFM > div > div > a > span")).click();
Thread.sleep(4000);
//click on sort by price high to low
x.findElement(By.xpath("//*[@id='container']/div/div[1]/div/div[2]/div/div[2]/div/div[2]/section/ul/li[3]")).click();
Thread.sleep(6000);
WritableWorkbook wb=Workbook.createWorkbook(new File("D:\\res.xls"));
WritableSheet Outputsheet=wb.createSheet("flp",0);
Label l=new Label(0,0,"itemname");
Label l2=new Label(1,0,"price");
Outputsheet.addCell(l);
Outputsheet.addCell(l2);
	}

}
