package testngEx;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class PoiReadEx {

	public static void main(String[] args) throws IOException {
		InputStream ERead=new FileInputStream("D:\\mob.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(ERead);
		XSSFSheet sheet=wb.getSheetAt(0);
		XSSFRow row;
		XSSFCell cell;
		Iterator<Row> rows=sheet.rowIterator();
		while(rows.hasNext())
		{
			row=(XSSFRow)rows.next();
			Iterator<Cell> cells=row.cellIterator();
			while(cells.hasNext())
			{
				cell=(XSSFCell)cells.next();
				System.out.println(cell.getStringCellValue()+"");
			}
		}

	}

}
