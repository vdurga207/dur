package testngEx;


import java.io.FileOutputStream;


import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class PoiEx {

	public static void main(String[] args) throws Exception {
		XSSFWorkbook wb=new XSSFWorkbook();
		XSSFSheet sheet=wb.createSheet("sheet1");
		int row=0,column=0;
		Row r1=sheet.createRow(row);
		r1.createCell(column).setCellValue("mobile");
		row++;
		Row r2=sheet.createRow(row);
		r2.createCell(column).setCellValue("nokia");
		column++;
		r1.createCell(column).setCellValue("price");
		r2.createCell(column).setCellValue("4000");
		FileOutputStream fou=new FileOutputStream("D:\\mob.xlsx");
		wb.write(fou);

	}

}
