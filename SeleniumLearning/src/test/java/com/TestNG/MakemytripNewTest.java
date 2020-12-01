package com.TestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MakemytripNewTest {
	WebDriver driver;
	
	@BeforeTest
		public void launchApp() 
		{
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
			driver.get("https://www.makemytrip.com/flight/search?itinerary=DEL-BLR-30/11/2020&tripType=O&paxType=A-1_C-0_I-0&intl=false&cabinClass=E&ccde=IN&lang=eng");
			//driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
			//driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[2]/p/a")).click();
		}
	@Test
	public void searchPlaceAndDate() 
	{
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		driver.findElement(By.id("fromCity")).click();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id=\"search-widget\"]/div/div[2]/div[1]/form/div/input")).sendKeys("chennai");
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id=\"react-autowhatever-1-section-0-item-0\"]/p/span[1]")).click();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

		driver.findElement(By.xpath("//*[@id=\"search-widget\"]/div/div[4]/div[1]/form/div/input")).sendKeys("bengaluru");
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id=\"react-autowhatever-1-section-0-item-0\"]/p/span[1]")).click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id=\"search-widget\"]/div/div[5]/div[1]/div/div/div/div/div[2]/div[1]/div[3]/div[5]/div[2]"));
		driver.findElement(By.xpath("//*[@id=\"search-widget\"]/div/div[5]/div[1]/div/div/div/div/div[2]/div[2]/div[3]/div[1]/div[5]")).click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id=\"search-widget\"]/div/button")).click();
		driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
		
		
}
	//@Test(priority=2)
	//public void price()
	//{
		//driver.findElement(By.xpath("//*[@id=\"sorting-togglers\"]/div[5]/span/span[2]")).click();
	//}
	
}
		