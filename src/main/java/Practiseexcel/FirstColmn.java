package Practiseexcel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class FirstColmn {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File f = new File("C:\\Users\\yaswanth\\workspace\\java\\Mavenproject\\src\\main\\java\\com\\crm\\qa\\testdata\\freecrmtestdata.xlsx");
		FileInputStream fis = new FileInputStream(f);
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet st=wb.getSheet("contacts");
	Iterator<Row> rows=	st.iterator();
	while(rows.hasNext()){
	Iterator<Cell> colmn=	rows.next().iterator();
	while(colmn.hasNext()){
		System.out.println(colmn.next().getStringCellValue());
		
	}
	System.out.println("-----------------------");
	}
		

	}

}

