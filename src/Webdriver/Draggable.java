package Webdriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Draggable {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:/Users/Pritil/Downloads/chromedriver_win32(1)/chromedriver.exe");	
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("https://demoqa.com/draggable/");
		driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		Actions action = new Actions (driver);
		
		Thread.sleep(3000);
		action.dragAndDropBy(driver.findElement(By.xpath("//div[@id='draggable']")), 175, 0).release().build().perform();
		System.out.println("element dragged");
	}
	

}
