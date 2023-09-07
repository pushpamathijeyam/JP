package org.helper;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;



public class Details extends BaseClass{
	public static void main(String[] args) throws IOException {

		File f = new File("C:\\Users\\Akila\\eclipse-workspace\\Maven\\excel\\ammu.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook book = new XSSFWorkbook(fis);
		Sheet sheet = book.getSheet("Details");
		Row row = sheet.getRow(1);
		Cell cell = row.getCell(3);
		System.out.println(cell);
		int rowsCount = sheet.getPhysicalNumberOfRows();
		System.out.println("number of row presented in the details sheet:"+rowsCount);
		Row row2 = sheet.getRow(3);
		int cellscount = row2.getPhysicalNumberOfCells();
		System.out.println("number of cells in particular row:" + cellscount);
		System.out.println("get all data from the particular row:");
		for(int i=0;i<row2.getPhysicalNumberOfCells();i++)
		{
			Cell cell2 = row2.getCell(i);
			System.out.println(cell2);
		}
		System.out.println("get all data from the all row:");
		for(int i=0;i<sheet.getPhysicalNumberOfRows();i++)
		{
			Row row3 = sheet.getRow(i);
			for(int j=0;j<row3.getPhysicalNumberOfCells();j++)
			{
				Cell cell3 = row3.getCell(j);
				//System.out.println(cell3);
				int cellType = cell3.getCellType();
				if(cellType==1)
				{
					String input = cell3.getStringCellValue();
					System.out.println(input);
					
				}
				else if (DateUtil.isCellDateFormatted(cell3)) {
					Date da = cell3.getDateCellValue();
					System.out.println(da);
					SimpleDateFormat sim= new SimpleDateFormat("dd-MM-yyyy");
					String input = sim.format(da);
					System.out.println(input);
				}
				else
				{
					double d = cell3.getNumericCellValue();
					long l=(long)d;
					String input = String.valueOf(l);
					System.out.println(input);
				}
			}
				
		}
	}


}
