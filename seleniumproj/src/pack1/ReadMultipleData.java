package pack1;

import java.io.File;
import java.io.IOException;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class ReadMultipleData {

	public static void main(String[] args) throws BiffException, IOException {
		File File=new File("D:\\1234.xls");
		Workbook objWB=Workbook.getWorkbook(File); 
		Sheet s1= objWB.getSheet(1); //1- Means second sheet, index start from 0
		
		//Get row count
		int rows=s1.getRows();	
		
		for (int i=0;i<rows;i++)
		{
			String un=s1.getCell(0, i).getContents();	
			String pwd=s1.getCell(1, i).getContents();	
			String phone=s1.getCell(2, i).getContents();
			System.out.println(un+"\t "+pwd+"\t "+phone);			
		}
	}

	}


