package org.helper;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookHotelPojo extends BaseClass {
	public BookHotelPojo() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "first_name")
	private WebElement firstname;
	
	@FindBy(id = "last_name")
	private WebElement lastname;

	@FindBy(id = "address")
	private WebElement address;

	@FindBy(id = "cc_num")
	private WebElement cardno;

	public WebElement getFirstname() {
		return firstname;
	}

	public void setFirstname(WebElement firstname) {
		this.firstname = firstname;
	}

	public WebElement getLastname() {
		return lastname;
	}

	public void setLastname(WebElement lastname) {
		this.lastname = lastname;
	}

	public WebElement getAddress() {
		return address;
	}

	public void setAddress(WebElement address) {
		this.address = address;
	}

	public WebElement getCardno() {
		return cardno;
	}

	public void setCardno(WebElement cardno) {
		this.cardno = cardno;
	}

	public WebElement getCardtype() {
		return cardtype;
	}

	public void setCardtype(WebElement cardtype) {
		this.cardtype = cardtype;
	}

	public WebElement getMonth() {
		return month;
	}

	public void setMonth(WebElement month) {
		this.month = month;
	}

	public WebElement getYear() {
		return year;
	}

	public void setYear(WebElement year) {
		this.year = year;
	}

	public WebElement getCvv() {
		return cvv;
	}

	public void setCvv(WebElement cvv) {
		this.cvv = cvv;
	}

	public WebElement getBooknow() {
		return booknow;
	}

	public void setBooknow(WebElement booknow) {
		this.booknow = booknow;
	}

	@FindBy(id = "cc_type")
	private WebElement cardtype;

	@FindBy(id = "cc_exp_month")
	private WebElement month;

	@FindBy(id = "cc_exp_year")
	private WebElement year;

	@FindBy(id="cc_cvv")
	private WebElement cvv;
	
	@FindBy(id="book_now")
	private WebElement booknow;
	


}
