package com.Sk;

import java.io.File;
import java.io.IOException;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Myntra {

	public static void main(String[] args) throws IOException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\eclipse-workspace\\Selenium\\drive\\chromedriver.exe");

		WebDriver s = new ChromeDriver();
		s.manage().window().maximize();
		s.get("https://www.myntra.com/");
		JavascriptExecutor sk = (JavascriptExecutor) s;
		WebElement ss = s.findElement(By.xpath("(//p[@class='desktop-gInfoTitle'])[2]"));
		sk.executeScript("arguments[0].scrollIntoView();", ss);
		TakesScreenshot ss1 = (TakesScreenshot) s;
		File src = ss1.getScreenshotAs(OutputType.FILE);
		File loc = new File("C:\\Users\\91814\\eclipse-workspace\\Selenium_Test\\ScreenShot\\Myntra.png");
		FileUtils.copyFile(src, loc);
}
}
