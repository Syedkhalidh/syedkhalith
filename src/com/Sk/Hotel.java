package com.Sk;

 import java.util.concurrent.TimeUnit;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hotel {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\eclipse-workspace\\Selenium\\drive\\chromedriver.exe");
		WebDriver k = new ChromeDriver();
		k.manage().window().maximize();
		k.manage().timeouts().implicitlyWait(2, TimeUnit.MINUTES);
		k.get("https://adactinhotelapp.com/");
		JavascriptExecutor js = (JavascriptExecutor) k;

		k.findElement(By.xpath("//html/body/table[2]/tbody/tr/td[2]/form/table/" + "tbody/tr[2]/td[2]/input"))
				.sendKeys("Syedkhalidh");

		k.findElement(By.xpath("//html/body/table[2]/tbody/tr/td[2]/" + "form/table/tbody/tr[3]/td[2]/input"))
				.sendKeys("syed123456789");

		k.findElement(By.id("login")).click();

		WebElement loc = k.findElement(By.id("location"));
		Select loc1 = new Select(loc);
		loc1.selectByIndex(8);

		WebElement loc2 = k.findElement(By.id("hotels"));
		Select loc3 = new Select(loc2);
		loc3.selectByIndex(3);

		WebElement loc4 = k.findElement(By.id("room_type"));
		Select loc5 = new Select(loc4);
		loc5.selectByIndex(2);

		WebElement loc6 = k.findElement(By.id("room_nos"));
		Select loc7 = new Select(loc6);
		loc7.selectByIndex(1);

		js.executeScript("document.getElementById('datepick_in').value='02/12/2022';");
		js.executeScript("document.getElementById('datepick_out').value='07/12/2022';");

		WebElement loc8 = k.findElement(By.id("adult_room"));
		Select loc9 = new Select(loc8);
		loc9.selectByIndex(2);

		WebElement loc10 = k.findElement(By.id("child_room"));
		Select loc11 = new Select(loc10);
		loc11.selectByIndex(1);
	
		k.findElement(By.id("Submit")).click();
		k.findElement(By.id("radiobutton_0")).click();
		k.findElement(By.id("continue")).click();
		k.findElement(By.id("first_name")).sendKeys("Syed");
		k.findElement(By.id("last_name")).sendKeys("Khalidh");
		k.findElement(By.id("address")).sendKeys("Arcot");
		k.findElement(By.id("cc_num")).sendKeys("1234567890123456");
		
		
		WebElement loc12 = k.findElement(By.id("cc_type"));
		Select loc13 = new Select(loc12);
		loc13.selectByIndex(3);
		
		WebElement loc14 = k.findElement(By.id("cc_exp_month"));
		Select loc15 = new Select(loc14);
		loc15.selectByIndex(11);
		
		WebElement loc16 = k.findElement(By.id("cc_exp_year"));
		Select loc17 = new Select(loc16);
		loc17.selectByIndex(12);
		
		k.findElement(By.id("cc_cvv")).sendKeys("123");
		k.findElement(By.id("book_now")).click();
		k.findElement(By.id("my_itinerary")).click();
		
		k.findElement(By.xpath("//input[@value='R3M8NI14P8']")).click();
		k.findElement(By.id("logout")).click();
		
		System.out.println("Hotel Room Booking is successful... :)");
		
	}
}