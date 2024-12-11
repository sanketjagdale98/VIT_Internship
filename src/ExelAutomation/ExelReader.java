package ExelAutomation;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class ExelReader {

	public static void main(String[] args) throws InvalidFormatException, IOException {
		
		File fs = new File("./TESTDATA/TestData.xlsx");
		FileInputStream fins = new FileInputStream(fs);
		
		XSSFWorkbook workbook = new XSSFWorkbook(fs);
		XSSFSheet sheet = workbook.getSheet("STUDENT_DATA");
		
		int rows = sheet.getLastRowNum();
		System.out.println("Total number of rows are "+rows);
		
		short cols = sheet.getRow(0).getLastCellNum();
		System.out.println("Total number of column are" +cols);
		
		String lastname = sheet.getRow(1).getCell(1).getStringCellValue();
		String passward = sheet.getRow(1).getCell(2).getStringCellValue();
		
		System.out.println(lastname);
		System.out.println(passward);
		
//		double number = sheet.getRow(2).getCell(1).getNumericCellValue();
//		System.out.println(number);
//		
//		int number1 = (int)sheet.getRow(1).getCell(2).getNumericCellValue();
//		System.out.println(number1);
		
		for (int i = 0; i<rows+1; i++) {
			for(int j=0;j<cols; j++)
				
			{
				String data = sheet.getRow(i).getCell(j).toString();
				System.out.println(data+"    ");
				
			}
			System.out.println();
		}
		
		workbook.close();
		fins.close();
	}
}
