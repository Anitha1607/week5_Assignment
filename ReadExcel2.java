package week5;

import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormat;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel2 {

	public static String[][] getdata(String excelFilePath) throws IOException {
		XSSFWorkbook book =new XSSFWorkbook(excelFilePath);
		XSSFSheet sheet =book.getSheetAt(1);
		int rowcount = sheet.getLastRowNum();
		System.out.println("Row count:"+rowcount);
		short colcount = sheet.getRow(0).getLastCellNum();
		System.out.println("Column count:"+colcount);
		
		
		String[][] data =new String[rowcount][colcount];
		for(int i=1;i<=rowcount;i++) {
			XSSFRow eachrow = sheet.getRow(i);
			for(int j=0;j<colcount;j++) {
				XSSFCell cell = eachrow.getCell(j);
				//changes number formate cell to string format
				
				DataFormatter dtf=new DataFormatter();
				String value = dtf.formatCellValue(cell);
				//String value = cell.getStringCellValue();
				data[i-1][j]=value;
				System.out.println(value);
			}
			
		}
	book.close();
	return data;

	}

}
