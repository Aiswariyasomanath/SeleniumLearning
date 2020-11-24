package com.Testcase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();

		WebDriver driver=new ChromeDriver();
		driver.get("http://output.jsbin.com/osebed/2");
		
		WebElement fruits = driver.findElement(By.id("fruits"));
		Select obj = new Select(fruits);
		obj.selectByValue("orange");
		obj.selectByVisibleText("Banana");

	}

}
