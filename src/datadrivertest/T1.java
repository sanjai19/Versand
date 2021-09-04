package datadrivertest;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class T1 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		String XLFilepath = "./resource/Book1.xlsx";
		FileInputStream fin = new FileInputStream(XLFilepath);
		Workbook workbook = WorkbookFactory.create(fin);
		
		String sheet = workbook.getSheet("sheet1").getRow(1).getCell(2).getStringCellValue();
		System.out.println(sheet);

	}

}