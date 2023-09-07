package org.sample;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;

import org.helper.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test extends BaseClass {
	public static void main(String[] args) throws InterruptedException, AWTException {
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		System.out.println("welcome");
		
//		driver.get("https://www.facebook.com/");
//		
//		
//		WebElement log = driver.findElement(By.name("login"));
//		System.out.println(log.getCssValue("color"));
//		System.out.println(log.getCssValue("font-size"));
//		System.out.println(log.getCssValue("text-align"));
//		System.out.println(log.getCssValue("background-color"));
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript(
//				"arguments[0].setAttribute('style','font-size:50px;color:red;background-color:yellow;text-align:left')",
//				log);

	}
}
