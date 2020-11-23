package com.Testcase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class chromebrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriverManager.chromedriver().setup();

WebDriver driver=new ChromeDriver();
driver.get("https://opensource-demo.orangehrmlive.com/");
String title= driver.getTitle();
System.out.println(title);

	}

}
