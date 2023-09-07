package org.sample;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;

import org.helper.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class AdactinHotel extends BaseClass {
	public static void main(String[] args) throws AWTException, IOException, InterruptedException {
		openEdgeBrowser();
		lanuchUrl("https://adactinhotelapp.com/");
		WebElement userName = driver.findElement(By.id("username"));
		fillTextBox(userName, readDataFromExcel("adactin", 1, 0));
		WebElement passwrd = driver.findElement(By.id("password"));
		fillTextBox(passwrd, readDataFromExcel("adactin", 1, 1));
		WebElement loginbtn = driver.findElement(By.id("login"));
		toClickButton(loginbtn);
		WebElement e1 = driver.findElement(By.name("location"));
		selectVisibleText(e1, "London");
		WebElement e2 = driver.findElement(By.id("hotels"));
		selectVisibleText(e2, "Hotel Creek");

		WebElement e3 = driver.findElement(By.id("room_type"));
		selectVisibleText(e3, "Standard");
		WebElement e4 = driver.findElement(By.id("room_nos"));
		selectVisibleText(e4, "1 - One");
		tab();
		for (int i = 0; i < 5; i++) {
			r.keyPress(KeyEvent.VK_TAB);
			r.keyRelease(KeyEvent.VK_TAB);

		}
		driver.findElement(By.id("Submit")).click();
		driver.findElement(By.id("radiobutton_0")).click();
		driver.findElement(By.id("continue")).click();
		WebElement fn = driver.findElement(By.name("first_name"));
		fillTextBox(fn, readDataFromExcel("adactin", 1, 2));
		WebElement ln = driver.findElement(By.name("last_name"));
		fillTextBox(ln, readDataFromExcel("adactin", 1, 3));

		WebElement add = driver.findElement(By.name("address"));
		fillTextBox(add, readDataFromExcel("adactin", 1, 4));
		WebElement card = driver.findElement(By.name("cc_num"));
		fillTextBox(card, readDataFromExcel("adactin", 1, 5));
		WebElement e5 = driver.findElement(By.id("cc_type"));
		selectVisibleText(e5, "VISA");
		WebElement e6 = driver.findElement(By.id("cc_exp_month"));
		selectVisibleText(e6, "April");

		WebElement e7 = driver.findElement(By.id("cc_exp_year"));
		selectVisibleText(e7, "2022");

		WebElement cvv = driver.findElement(By.name("cc_cvv"));
		fillTextBox(cvv, readDataFromExcel("adactin", 1, 6));

		driver.findElement(By.id("book_now")).click();
		Thread.sleep(5000);
		WebElement orderno = driver.findElement(By.id("order_no"));

		String attribute = orderno.getAttribute("value");
		System.out.println(attribute);
		updateExcel("adactin",1, 7, attribute);
	}

}
