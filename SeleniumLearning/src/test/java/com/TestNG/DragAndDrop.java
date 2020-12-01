package com.TestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragAndDrop {
WebDriver driver;
	
	@BeforeTest
	public void launchApp() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://jqueryui.com/droppable/");
		driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
		Thread.sleep(3000);
		WebElement dragelement = driver.findElement(By.id("draggable"));
		Thread.sleep(3000);
		WebElement droplement = driver.findElement(By.id("droppable"));
		Thread.sleep(3000);
		Actions actions = new Actions(driver);
		actions.dragAndDrop(dragelement, droplement).build().perform();
}
}

