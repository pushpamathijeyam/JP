package org.helper;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPojo extends BaseClass {
	public SearchPojo() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "location")
	private WebElement location;
	
	@FindBy(id = "hotels")
	private WebElement hotel;
	
	@FindBy(id = "room_type")
	private WebElement room;
	
	@FindBy(id = "room_nos")
	private WebElement nos;
	
	
	@FindBy(id = "datepick_in")
	private WebElement date;
	
	@FindBy(id = "datepick_out")
	private WebElement dateOut;
	
	@FindBy(id = "adult_room")
	private WebElement adult;
	
	@FindBy(id = "child_room")
	private WebElement child;
	
	@FindBy(id = "Submit")
	private WebElement Submit;

	public WebElement getLocation() {
		return location;
	}

	public WebElement getHotel() {
		return hotel;
	}

	public WebElement getRoom() {
		return room;
	}

	public WebElement getNos() {
		return nos;
	}

	public WebElement getDate() {
		return date;
	}

	public WebElement getDateOut() {
		return dateOut;
	}

	public WebElement getAdult() {
		return adult;
	}

	public WebElement getChild() {
		return child;
	}

	public WebElement getSubmit() {
		return Submit;
	}
	

	
}
