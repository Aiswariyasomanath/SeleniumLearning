package com.Testcase;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Frames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();

		WebDriver driver=new ChromeDriver();
		driver.get("http://the-internet.herokuapp.com/iframe" );
		List<WebElement> frame = driver.findElements(By.tagName("iframe"));
		System.out.println(frame.size());
		for (WebElement webElement : frame) {
			System.out.println(webElement.getAttribute("id"));
		}
		driver.switchTo().frame(0);
		
		
		driver.findElement(By.id("tinymce")).clear();
		driver.findElement(By.id("tinymce")).sendKeys("hello");
		
		

	}

}
