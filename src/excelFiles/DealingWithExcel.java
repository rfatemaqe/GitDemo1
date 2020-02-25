package excelFiles;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class DealingWithExcel {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		/*String path = "C:\\Users\\Fatema\\eclipse-workspace\\Excel\\data\\students.xlsx";
		File xl = new File(path);
		FileInputStream fis = new FileInputStream(xl);
		
		Workbook wb = WorkbookFactory.create(fis);
		Sheet wbs = wb.getSheet("tf");
		Row r0 = wbs.getRow(6);
		Cell c0 = r0.getCell(1);
		System.out.println(c0);
		
		
		fis.close();
		*/
		
		
		/*String path= "C:\\Users\\Fatema\\eclipse-workspace\\Excel\\data\\students.xlsx";
		File xl = new File(path);
		FileInputStream fis = new FileInputStream(xl);
		
		Workbook wb = WorkbookFactory.create(fis);
		Sheet wbs = wb.getSheet("tf");
		Row r0 = wbs.getRow(6);
		Cell c0 = r0.getCell(1);
		System.out.println(c0);
		fis.close();
		
		*/
		
		
		
		String path = "C:\\Users\\Fatema\\eclipse-workspace\\Excel\\data\\students.xlsx";
		File xl = new File(path);
		FileInputStream fis = new FileInputStream(xl);
		
		Workbook wb = WorkbookFactory.create(fis);
		Sheet wbs = wb.getSheet("tf");
		Row r0 = wbs.getRow(6);
		Cell c0 = r0.getCell(1);
		System.out.println(c0);
		fis.close();
		
		System.out.println("jira1");
		
		System.out.println("for develop branch");
		System.out.println("for develp branch");
		System.out.println("for develop branch");
		System.out.println("for devlop branc");
		System.out.println("FOR DEVELOP");
		System.out.println("for develp branch");
		System.out.println("for develop branch");
		System.out.println("for devlop branc");
		System.out.println("FOR DEVELOP");
		System.out.println("FOR DEVELOP");
		
		
		
	
		
	}
public void name() {
	
}


public void email() {
	
}


public void namee() {
	
}


public void emaile() {
	
}
}
