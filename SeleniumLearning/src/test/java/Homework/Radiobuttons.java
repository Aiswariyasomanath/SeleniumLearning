package Homework;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Radiobuttons {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://c2ta.co.in/login/");
		driver.findElement(By.id("username")).sendKeys("Aish");
		driver.findElement(By.id("password")).sendKeys("1234*Xyz");
		driver.findElement(By.xpath("//*[@id=\"post-305\"]/div/div/div/div/div/form/p[1]/label/input")).click();
		driver.findElement(By.xpath("//*[@id=\"post-305\"]/div/div/div/div/div/form/p[2]/button")).click();
		driver.findElement(By.xpath("//*[@id=\"menu-item-995\"]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"post-1398\"]/div/div[2]/h2/a")).click();
		driver.findElement(By.xpath("//*[@id=\"section-form-input-type-learning-37\"]/ul/li[1]/a/span")).click();
		driver.findElement(By.name("radioButton")).click();
		//casting to TakesScreenchot object ie, ts
		TakesScreenshot ts =(TakesScreenshot)driver;
		
		// calling method getScreenshotAs on ts object, which returns a File object, and assigning that 
		// returned object to source
		File source = ts.getScreenshotAs(OutputType.FILE);
		
		// Calling copyFile static method on FileUtils class, which accept 2 File objects as parameters
		// first parameter is the screenshot file object from above
		// second parameter is a File object created on runtime which specifies the location where the screenshot to be copied over
		FileUtils.copyFile(source,new File(("src/test/resources/radiobuttons/page.png")));
		
	}

	}


