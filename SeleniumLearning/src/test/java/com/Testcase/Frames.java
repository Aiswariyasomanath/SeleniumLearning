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
		
		// From the current web page, identify the elements having a tag name <iframe>
		// That will return a list of WebElements, and hold that into a list object
		List<WebElement> iFramesInThePage = driver.findElements(By.tagName("iframe"));
		
		// The list size is the number of iframes in the page
		System.out.println(iFramesInThePage.size());
		
		int i = 1;
		// Loop through the web elements list and print the id of each iframe
		// The for loop will specify the list on the right side and the object to hold each element will be specified on the left side
		// iFramesInThePage object is a list of WebElement objects as per the declaration, so the variable inside the for loop should be an object of WebElement
		for (WebElement iFrameObject : iFramesInThePage) {
			// iFrameObject will hold the current object in the list at the time of looping
			// Getting id of iFrameObject will print the id of current iframe in the loop
			System.out.println("Id of frame " + i + " is " +iFrameObject.getAttribute("id"));
			i++;
		}
		
		// Goto the first iFrame in this page. This is not from the list above
		driver.switchTo().frame(0);
		
		driver.findElement(By.id("tinymce")).clear();
		driver.findElement(By.id("tinymce")).sendKeys("hello");
	}
}
