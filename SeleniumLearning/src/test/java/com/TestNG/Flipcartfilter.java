package com.TestNG;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Flipcartfilter {
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
	public void searchproduct() throws InterruptedException {
		System.out.println("--- Starting searchproduct()");
		driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
		driver.findElement(By.xpath("/html/body/div[2]/div/div/button")).click();
		driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[1]/div[1]/div[2]/div[2]/form/div/div/input"))
				.sendKeys("tv" + "\n");

		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div[2]/div[1]/div[1]/div[2]/div[1]/div/section[4]/div[2]/div[1]/div[6]/div/div/label/div[1]")).click();
		Thread.sleep(3000);
		
		
	}
	@Test(priority=2)
	public void printDetails(){
		//driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		String productName= driver.findElement(By.partialLinkText("Sony 80cm (32 inch) HD Ready LED Smart TV")).getText();
		System.out.println(productName);
		List<WebElement>list= driver.findElements(By.xpath("//*[@id=\"container\"]/div/div[3]/div[2]/div/div[2]/div[2]/div/div/div/a/div[2]/div[1]/div[3]/ul"));
		for(WebElement mylist:list) {
			System.out.println(mylist.getText());
		}
	}
}
