package org.j.unit;

import java.time.Duration;
import java.util.Date;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Example {
	public static WebDriver driver;

	@BeforeClass
	public static void beforeAllTc() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	@AfterClass
	public static void afterAllTc() {
		driver.quit();
	}

	@Before
	public void beforeTc() {
		Date d = new Date();
		System.out.println(d);
	}

	@After
	public void afterTc() {
		Date d = new Date();
		System.out.println(d);
	}

	@Test
	public void tc1() {
		WebElement txtemail = driver.findElement(By.id("email"));
		txtemail.sendKeys("pushpamathi");
		WebElement txtpwd = driver.findElement(By.id("pass"));
		txtpwd.sendKeys("897654");
		WebElement loginbtn = driver.findElement(By.name("login"));
		loginbtn.click();
	}

	@Test
	public void tc2() {
		String titleName = driver.getTitle();
		System.out.println(titleName);
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
	}

}