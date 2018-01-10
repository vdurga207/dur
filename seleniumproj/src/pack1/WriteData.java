package pack1;


import java.io.File;

import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;

public class WriteData {

	public static void main(String[] args)throws Exception {

		WritableWorkbook wwb=Workbook.createWorkbook(new File("D:\\Login_Results.xls"));
		WritableSheet ws=wwb.createSheet("HRM", 0);
		WritableSheet ws1=wwb.createSheet("RES", 1);
		Label l=new Label(0,0,"Username");
		Label l1=new Label(1,0,"password");	
		Label l2=new Label(2,0,"password1");	
		Label r1=new Label(0,1,"qaplanet");
		Label r2=new Label(1,1,"admin");
		Label r3=new Label(2,1,"admin12");
		ws.addCell(l);
		ws.addCell(l1);
		ws.addCell(r1);
		ws.addCell(r2);
		ws.addCell(l2);
		ws.addCell(r3);
		wwb.write();
		wwb.close();
	}

	}


