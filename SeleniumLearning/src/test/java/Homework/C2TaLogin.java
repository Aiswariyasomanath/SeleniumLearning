package Homework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class C2TaLogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://c2ta.co.in/register/");
		driver.findElement(By.id("reg_username")).sendKeys("Aish");
		driver.findElement(By.id("reg_email")).sendKeys("aish.somanath@gmail.com");
		driver.findElement(By.id("reg_password")).sendKeys("1234*Xyz");
		driver.findElement(By.xpath("//*[@id=\"post-306\"]/div/div/div/div/div/form/p/button")).click();
		
	}

}
