package Homework;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Google {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/?gws_rd=ssly&safe=active&ssui=on");
		driver.findElement(By.name("q")).sendKeys("testing" + "\n");
		driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
		List<WebElement> links = driver.findElements(By.tagName("a"));
	      System.out.println("The number of links is "+ links.size());
	      driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
	      driver.close();
		
	}

}
