package excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class fwr {
	public static void main(String[] args) throws IOException {
		
		// apache poi, apache poi ooxml, apache poi ooxml schema 
		File f= new File("C:\\Users\\hp\\Desktop\\My Contact Form - Copy 2.xlsx");
		FileInputStream fis= new FileInputStream(f);
		XSSFWorkbook x= new XSSFWorkbook(fis);
		XSSFSheet sheet = x.getSheetAt(0);
		//read
		int row=sheet.getLastRowNum();
		System.out.println("Number of rows "+ row);
		
		// row index
		int col=sheet.getRow(0).getLastCellNum();
		System.out.println("Number of columns in first row "+ col);
		
		//5,2
		XSSFCell data = sheet.getRow(5).getCell(2);
		System.out.println(data);
		
		//24,5
		sheet.getRow(24).createCell(5).setCellValue("Vassim");
		FileOutputStream fos= new FileOutputStream(f);
		x.write(fos);
	}

}
