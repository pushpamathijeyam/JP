package org.j.unit;

import java.io.IOException;

import org.helper.BaseClass;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebElement;
import org.sample.LoginPojo;

public class Sample extends BaseClass {
	@Test
	public void tc1() throws IOException {
		LoginPojo l = new LoginPojo();
		WebElement email = l.getTxtEmail();
		fillTextBox(email, readDataFromExcel("Details", 1, 1));
		String att1 = email.getAttribute("value");
		Assert.assertEquals("check user", "jeyamamu90", att1);
		WebElement pwd = l.getTxtPwd();
		fillTextBox(pwd, readDataFromExcel("Details", 1, 2));
		Assert.assertEquals("check password", "Mar 31,1990", pwd.getAttribute("value"));
		System.out.println("email and password are verified");

		
	}

	@Test
	public void tc2() {
		String title = fetchUrl();
		Assert.assertTrue("check title", title.contains("face"));

		System.out.println(title);
	}

}
