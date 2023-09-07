package org.sample;

import org.helper.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPojo extends BaseClass{
	public LoginPojo() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="email")
	private WebElement txtEmail;
	@FindBy(id="pass")
	private WebElement txtPwd;
	@FindBy(name="login")
	private WebElement btnlogin;
	public WebElement getTxtEmail() {
		return txtEmail;
	}
	public WebElement getTxtPwd() {
		return txtPwd;
	}
	public WebElement getBtnlogin() {
		return btnlogin;
	}
	
	
	
	

}
