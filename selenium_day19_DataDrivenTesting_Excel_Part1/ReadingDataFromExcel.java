package selenium_day19_DataDrivenTesting_Excel_Part1;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadingDataFromExcel {

	public static void main(String[] args) throws IOException {
		
		FileInputStream file =new FileInputStream(System.getProperty("user.dir")+"\\Test Data\\data.xlsx");
		XSSFWorkbook workbook=new XSSFWorkbook(file);
		XSSFSheet sheet=workbook.getSheet("Sheet1"); //XSSFSheet sheet=workbook.getSheetAt(0);
		int totalRows=sheet.getLastRowNum();
		int totalCells=sheet.getRow(1).getLastCellNum();
		
		System.out.println("number of rows:"+totalRows);//5
		System.out.println("number of cells:"+totalCells);//4
		
		System.out.println("");
		
		for(int r = 0; r <= totalRows; r++) {
		    XSSFRow currentRow = sheet.getRow(r);
		    
		    for(int c = 0; c < totalCells; c++) {
		        XSSFCell cell = currentRow.getCell(c);
		        // Adjust the width (20) to fit your data
		        System.out.printf("%-15s", cell.toString());
		    }
		    System.out.println();
		
		}
		workbook.close();
		file.close();
		

	}

}
