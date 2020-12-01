package com.TestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;


public class MakeMyTrip {
	WebDriver driver;
	
@BeforeTest
public void launchApp() {
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	//driver.manage().window().maximize();
	//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.get("https://www.kayak.com/flights");
	
}
	
public void closePopOut() {
	try {
		System.out.print("Clearing from textbox...");
		driver.findElement(By.xpath("//*[@id=\"dNRr-origin-airport-display-multi-container\"]/div/div[2]")).click();
	} catch (Exception e) {
		System.out.println("Not found");
	}
}

@Test
public void searchPlace() throws Exception {
	driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	closePopOut();
	driver.findElement(By.xpath("//*[@id=\"UAYI-origin-airport\"]")).click();
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	
}

}
