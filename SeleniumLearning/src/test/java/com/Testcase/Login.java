package com.Testcase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {
	WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Login test = new Login();
		test.initialize();
	}

	private void initialize() {
		System.setProperty("webdriver.chrome.driver","C:\\Install\\ChromeDriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.amazon.com");
	}
}
