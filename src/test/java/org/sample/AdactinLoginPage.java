package org.sample;

import java.awt.AWTException;
import java.io.IOException;

import org.helper.BaseClass;
import org.helper.BookHotelPojo;
import org.helper.BookingConformPojo;
import org.helper.SearchPojo;
import org.helper.SelectHotelPojo;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class AdactinLoginPage extends BaseClass {
	public static void main(String[] args) throws IOException, AWTException, InterruptedException {
		openChromeBrowser();
		lanuchUrl("https://adactinhotelapp.com/");
		maxWindow();
		LoginPojo l1 = new LoginPojo();
		WebElement userName = l1.getTxtEmail();
		fillTextBox(userName, readDataFromExcel("adactin", 1, 0));
		WebElement password = l1.getTxtPwd();
		fillTextBox(password, readDataFromExcel("adactin", 1, 1));
		WebElement loginbtn = l1.getBtnlogin();
		toClickButton(loginbtn);
		takeScreenShot("		img1");
		SearchPojo sp = new SearchPojo();
		WebElement location = sp.getLocation();
		selectVisibleText(location, "London");
		WebElement hotel = sp.getHotel();
		selectVisibleText(hotel, "Hotel Creek");
		WebElement room = sp.getRoom();
		selectVisibleText(room, "Standard");
		WebElement nos = sp.getNos();
		selectValue(nos, "2");
		WebElement date = sp.getDate();
		tab();
		// selectValue(date, "15/04/2023");
		WebElement dateOut = sp.getDateOut();
		tab();
		// selectValue(dateOut, "16/04/2023");
		WebElement adult = sp.getAdult();
		selectVisibleText(adult, "2 - Two");
		WebElement child = sp.getChild();
		selectVisibleText(child, "1 - One");
		WebElement submit = sp.getSubmit();
		toClickButton(submit);
		takeScreenShot("img2");
		SelectHotelPojo shp = new SelectHotelPojo();
		WebElement radiobtn = shp.getRadiobtn();
		toClickButton(radiobtn);
		WebElement contin = shp.getContin();
		toClickButton(contin);
		takeScreenShot("img3");
		BookHotelPojo bhp = new BookHotelPojo();
		WebElement firstname = bhp.getFirstname();
		fillTextBox(firstname, readDataFromExcel("adactin", 1, 2));
		WebElement lastname = bhp.getLastname();
		fillTextBox(lastname, readDataFromExcel("adactin", 1, 3));
		WebElement address = bhp.getAddress();
		fillTextBox(address, readDataFromExcel("adactin", 1, 4));
		WebElement cardno = bhp.getCardno();
		fillTextBox(cardno, readDataFromExcel("adactin", 1, 5));
		WebElement cardtype = bhp.getCardtype();
		fillTextBox(cardtype, readDataFromExcel("adactin", 1, 8));
		WebElement month = bhp.getMonth();
		selectVisibleText(month, "April");
		WebElement year = bhp.getYear();
		selectVisibleText(year, "2022");
		WebElement cvv = bhp.getCvv();
		fillTextBox(cvv, readDataFromExcel("adactin", 1, 6));
		WebElement booknow = bhp.getBooknow();
		toClickButton(booknow);
		holdExecution(5000);
		takeScreenShot("img4");
		BookingConformPojo bcp = new BookingConformPojo();
		WebElement orderno = bcp.getOrderno();
		String attribute = orderno.getAttribute("value");
		output(attribute);
		updateExcel("adactin", 1, 7, attribute);
		takeScreenShot("img5");

	}
}
