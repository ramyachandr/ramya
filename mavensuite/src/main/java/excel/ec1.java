package excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ec1 {
	
	@Test
	public void e1() throws IOException
	{
		File f = new File("C:\\Users\\LOVE\\Desktop\\Ramya.xlsx");
		FileInputStream fis=new FileInputStream(f);
		XSSFWorkbook y=new XSSFWorkbook(fis);
		XSSFSheet sheet=y.getSheetAt(0);
		
		int row=sheet.getLastRowNum();
		System.out.println("Number of rows "+row);
		int col=sheet.getRow(0).getLastCellNum();
		System.out.println("Number of columns in the first row "+col);
		//read cmd
		XSSFCell data = sheet.getRow(5).getCell(2);
		System.out.println(data);
		//write cmd
		sheet.getRow(5).createCell(3).setCellValue("Raghu");
		FileOutputStream k=new FileOutputStream(f);
		y.write(k);
	}

}

