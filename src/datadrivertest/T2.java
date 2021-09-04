package datadrivertest;

import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class T2 {

	public static void main(String[] args) throws Throwable   {
		
		String XLFilepath = "./resource/Book1.xlsx";
		FileInputStream fin = new FileInputStream(XLFilepath);
		Workbook workbook = WorkbookFactory.create(fin);
		 Sheet sheet = workbook.getSheet("Sheet1");
		 int rowcount = sheet.getPhysicalNumberOfRows();
		int cellcount = sheet.getRow(0).getPhysicalNumberOfCells();

		for (int i = 0; i <= rowcount-1; i++) {
			for (int j = 0; j <= cellcount-1; j++) {
				//System.out.println(sheet.getRow(i).getCell(j).toString());
				
			}
			
		}
	}

}
