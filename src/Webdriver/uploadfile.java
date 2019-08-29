package Webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class uploadfile {

	public static void main(String[] args) throws InterruptedException {
				
		System.setProperty("webdriver.chrome.driver", "C:/Users/Pritil/Downloads/chromedriver_win32(1)/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://www.toolsqa.com/automation-practice-form/");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@id='photo']")).sendKeys("D:/PritiLakhani/priti/tikona pay.png");

	}

}
