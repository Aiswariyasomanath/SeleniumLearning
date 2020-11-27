package com.TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class C2TaCrossbrowser {
WebDriver driver;
	
	@BeforeTest
	@Parameters("browserName")
		public void setup(String browserName) {
	
		if (browserName.equalsIgnoreCase("chrome")){
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			System.out.println("Driver is Chrome");
		} else if (browserName.equalsIgnoreCase("firefox")){
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			System.out.println("Driver is Firefox");
		}
	}
	
	@Test
	public void c2Talogin() throws Exception {
		driver.get("https://c2ta.co.in/login/");
		Thread.sleep(1000);
		driver.findElement(By.id("username")).sendKeys("Aish");
		driver.findElement(By.id("password")).sendKeys("1234*Xyz");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"post-305\"]/div/div/div/div/div/form/p[1]/label/input")).click();
		driver.findElement(By.xpath("//*[@id=\"post-305\"]/div/div/div/div/div/form/p[2]/button")).click();
		Thread.sleep(4000);
	}
	
	@AfterTest
	public void tearDown() {
		driver.close();
	}
}
