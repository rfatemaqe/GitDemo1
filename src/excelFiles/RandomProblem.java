package excelFiles;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class RandomProblem {

	public static void main(String[] args) throws IOException, InterruptedException {
		/*System.out.println("How many unique random numbers do you want?");
		Scanner myObj = new Scanner(System.in);
		int N = myObj.nextInt();
		
		Random rand = new Random();
		Set<Integer>randomSet = new TreeSet<Integer>();
		
		while(randomSet.size()<N) {
		randomSet.add(rand.nextInt(1000));	
		}
		System.out.println(randomSet);
		System.out.println(randomSet.size());
		
        String path = "C:\\Users\\Fatema\\eclipse-workspace\\Excel\\data\\random.xlsx";
		File xl = new File(path);
		FileOutputStream fos = new FileOutputStream(xl);
		
		XSSFWorkbook wb =new XSSFWorkbook();
		XSSFSheet wbs = wb.createSheet("random");
		
		Object[] dataArray = randomSet.toArray();
		
		
		for(int i =0;i<N;i++) {
		wbs.createRow(i).createCell(0).setCellValue(dataArray[i].toString());
		}
		
		//String path = "C:\\w19\\random.xlsx";
		
		
		wb.write(fos);
		fos.close();
		*/
		
		System.out.println("How many unique random numbers do you want?");
		Scanner userInput = new Scanner (System.in);
		int N = userInput.nextInt();
		
		Random rand = new Random();
		rand.nextInt();
		Set<Integer>randomSet = new TreeSet<Integer>();
		
		while(randomSet.size()<N){
			randomSet.add(rand.nextInt(100));
		}
		
		System.out.println(randomSet);
		System.out.println(randomSet.size());
		
		
		String path = "C:\\Users\\Fatema\\eclipse-workspace\\Excel\\data\\random.xlsx";
		File xl = new File(path);
		FileOutputStream fos = new FileOutputStream(xl);
		
		XSSFWorkbook wb = new XSSFWorkbook();
		XSSFSheet wbs = wb.createSheet("random");
		
		Object[] dataArray = randomSet.toArray();
		
		for(int i =0; i<N; i++) {
			wbs.createRow(i).createCell(0).setCellValue(dataArray[i].toString());
			
			System.out.println("jira3 from american zone");
			
			
		}
		
		wb.write(fos);
		fos.close();
		
		
		
		
		}

}
