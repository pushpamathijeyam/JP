package org.sample;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.helper.BaseClass;

public class WriteFile extends BaseClass {
	public static void main(String[] args) throws IOException {
		File f = new File("C:\\Users\\Akila\\eclipse-workspace\\Maven\\excel\\hello.xlsx");
		Workbook book = new XSSFWorkbook();
		Sheet sh0 = book.createSheet("login");
		Sheet sh1 = book.createSheet("Frgtpwd");
		Row r0 = sh0.createRow(0);
		Row r1 = sh0.createRow(1);
		// Row r20 = sh1.createRow(0);
		// Row r21 = sh1.createRow(1);
		Cell c00 = r0.createCell(0);
		Cell c01 = r0.createCell(1);
		Cell c10 = r1.createCell(0);
		Cell c11 = r1.createCell(1);
		c00.setCellValue("email id");
		c01.setCellValue("password");
		c10.setCellValue("pushpamathi@gmail.com");
		c11.setCellValue("123456");
		String input = c10.getStringCellValue();
		String input1 = c01.getStringCellValue();

		if (input.startsWith("push")) {
			c10.setCellValue("ammu@gmail.com");
			if (input1.startsWith("pass")) {
				c01.setCellValue("pin");
			}
		}

		else {
			c10.setCellValue("pushpamathi@gmail.com");
		}
		FileOutputStream fos = new FileOutputStream(f);
		book.write(fos);

	}

}
