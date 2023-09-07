package org.sample;

import java.awt.AWTException;

import org.helper.BaseClass;
import org.helper.SearchPojo;
import org.openqa.selenium.WebElement;

public class SearchHotel extends BaseClass{
	public static void main(String[] args) throws AWTException {

	openChromeBrowser();
	lanuchUrl("https://adactinhotelapp.com/");
	maxWindow();
	SearchPojo sp = new SearchPojo();
	WebElement location = sp.getLocation();
	selectVisibleText(location, "London");
	WebElement hotel = sp.getHotel();
	selectVisibleText(hotel, "Hotel Creek");
	WebElement room = sp.getRoom();
	selectVisibleText(room, "Standard");
	WebElement nos = sp.getNos();
	selectVisibleText(nos, "1 - One");
	WebElement date = sp.getDate();
	tab();
	WebElement dateOut = sp.getDateOut();
	tab();
	WebElement adult = sp.getAdult();
	selectValue(adult, "adult_room");
	WebElement child = sp.getChild();
	selectValue(child, "1 - One");
	
	}
}
