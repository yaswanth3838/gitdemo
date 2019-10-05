package Practiseexcel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hslf.model.Sheet;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.google.common.collect.Table.Cell;

public class Writeexcel {

	public static void main(String[] args) throws IOException {
		File f = new File("C:\\Users\\yaswanth\\workspace\\java\\Mavenproject\\src\\main\\java\\com\\crm\\qa\\testdata\\freecrmtestdata.xlsx");
		FileInputStream fis = new FileInputStream(f);
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet st=wb.getSheet("tasks");
		XSSFRow r=st.getRow(1);
		XSSFCell c=r.getCell(1);
		c.setCellValue("gmail");
		FileOutputStream fos = new FileOutputStream(f);
wb.write(fos);		
		}

}
