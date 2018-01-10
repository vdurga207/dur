package pack1;

import java.io.File;
import java.io.IOException;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;


public class ReadSingleRowData {

	public static void main(String[] args) throws BiffException, IOException {
	
		//To Take files as input, use file 
				File f1=new File("D:\\1234.xls");
				//Load work book
				Workbook WB=Workbook.getWorkbook(f1);
				//Get specific sheet
				Sheet s1= WB.getSheet("QAP"); 
				
				int i=1;
				//sheet.getCell(column index, row index)
				String gBrow=s1.getCell(0, i).getContents();			
				String gURL=s1.getCell(1, i).getContents();
				String gUN=s1.getCell(2, i).getContents();			
				String gPWD=s1.getCell(3, i).getContents();
				String gEMAIL=s1.getCell(4, i).getContents();	
				
				System.out.println(gBrow);		
				System.out.println(gURL);
				System.out.println(gUN);
				System.out.println(gPWD);
				System.out.println(gEMAIL);
				System.out.print(gBrow+"\t"+gURL+"\t"+gUN+"\t"+gPWD+"\t"+gEMAIL);

	}

}
