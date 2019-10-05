package Practiseexcel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel {

	public static void main(String[] args) throws InvalidFormatException, IOException {
		File f = new File("C:\\Users\\yaswanth\\workspace\\java\\Mavenproject\\src\\main\\java\\com\\crm\\qa\\testdata\\freecrmtestdata.xlsx");
FileInputStream fis = new FileInputStream(f);
XSSFWorkbook wb = new XSSFWorkbook(fis);
int sheets=wb.getNumberOfSheets();
System.out.println(sheets);
for(int i=0;i<sheets;i++){
	System.out.print(wb.getSheetName(i));
}


		
	
}
	

	}
