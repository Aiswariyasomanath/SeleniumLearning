package com.TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.sun.glass.ui.Window;
import com.sun.org.apache.xerces.internal.impl.xpath.XPath;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ClickAndHold {
	WebDriver driver;

@Test
	public void launchApp() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://jqueryui.com/selectable/");
		//JavascriptExecutor js= (JavascriptExecutor)driver;
		//js.executeScript("Window.scrollBy(0,1000)");
		driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
		WebElement item1= driver.findElement(By.xpath("//*[@id=\"selectable\"]/li[1]"));
		//WebElement item2= driver.findElement(By.xpath("//*[@id=\"selectable\"]/li[2]"));
		//WebElement item3= driver.findElement(By.xpath("//*[@id=\"selectable\"]/li[3]"));
		WebElement item4= driver.findElement(By.xpath("//*[@id=\"selectable\"]/li[4]"));
		Thread.sleep(3000);
		//JavascriptExecutor js= (JavascriptExecutor)driver;
		//js.executeScript("Window.scrollBy(0,1000)");
		Actions action = new Actions(driver);
		action.clickAndHold(item1).clickAndHold(item4).build().perform();
		
		
		
		
}
}

