package Homework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Redbusdatepicker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();

		WebDriver driver=new ChromeDriver();
		driver.get("https://www.redbus.in/");
		driver.findElement(By.xpath("//*[@id=\"onward_cal\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"rb-calendar_onward_cal\"]/table/tbody/tr[7]/td[5]")).click();
	}

}
