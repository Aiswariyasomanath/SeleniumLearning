package com.TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class C2TaDataprovider {

	WebDriver driver;
	@Test(dataProvider = "C2TaLogin")
public void c2Talogin(String username,String password) throws Exception  {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://c2ta.co.in/login/");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"post-305\"]/div/div/div/div/div/form/p[1]/label/input")).click();
		driver.findElement(By.xpath("//*[@id=\"post-305\"]/div/div/div/div/div/form/p[2]/button")).click();
		
	}
	@AfterMethod
	public void tearDown() {
	driver.quit();
	}
	
	@DataProvider(name="C2TaLogin")
	public Object[][] passData() {

	Object[][] data=new Object[5][2];
	 		//username
			data[0][0]="Aish";
			//password
			data[0][1]="1234*Xyz";

			data[1][0]="abc";
			data[1][1]="demo123";

			data[2][0]="xyz";
			data[2][1]="demo1234";
			
			data[3][0]="abcx";
			data[3][1]="demo12345";
			
			data[4][0]="xyzabc";
			data[4][1]="demo12345";
			

			return data;
	
	//end
	
	}


		
		
	
}
