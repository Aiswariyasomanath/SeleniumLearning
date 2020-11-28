package com.TestNG;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Flipcart {
	WebDriver driver;

	@BeforeTest
	public void launchApp() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com/");

	}

	@Test(priority = 1)
	public void searchproduct() {
		System.out.println("--- Starting searchproduct()");
		driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
		driver.findElement(By.xpath("/html/body/div[2]/div/div/button")).click();
		driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[1]/div[1]/div[2]/div[2]/form/div/div/input"))
				.sendKeys("tv" + "\n");

		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		driver.findElement(By.xpath(
				"//*[@id=\"container\"]/div/div[3]/div[2]/div[1]/div[2]/div[3]/div/div/div/a/div[2]/div[1]/div[1]"))
				.click();

		Set<String> windows = driver.getWindowHandles();
		Iterator<String> it = windows.iterator();
		String parent = it.next();
		String child = it.next();
		driver.switchTo().window(child);
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div[1]/div[1]/div[2]/div/ul/li[1]/button"))
				.click();
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		System.out.println("--- Ending searchproduct()");
	}
	
@Test(priority = 2)
public void productName() throws InterruptedException {
	Thread.sleep(4000);
	String actualName=driver.findElement(By.linkText("Mi 4X 108 cm (43) Ultra HD (4K) LED Smart Android TV")).getText();
	String expectedName="Mi 4X 108 cm (43) Ultra HD (4K) LED Smart Android TV";
	Assert.assertEquals(actualName, expectedName);
	String actualPrice=driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[2]/div/div/div[1]/div/div[2]/div/div[1]/div[1]/span[1]")).getText();
	actualPrice=actualPrice.substring(1);
	String expectedPrice="25,999";
	Assert.assertEquals(actualPrice, expectedPrice);
	System.out.println("price matching");
	

	}
@AfterTest
public void tearDown() {
	driver.close();
}


	
}
