package Webdriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SubWindowMousehover {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:/Users/Pritil/Downloads/chromedriver_win32(1)/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("https://demoqa.com/menu/");
		
		driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		
		driver.findElement(By.xpath("//a[contains(text(),'Menu')]")).click();
		Thread.sleep(3000);
		
		//Actions action = new Actions(driver);
		
		//action.moveToElement(driver.findElement(By.xpath("//div[@id='ui-id-9']"))).click();
		//Thread.sleep(3000);
		
		//action.moveToElement(driver.findElement(By.xpath("//div[@id='ui-id-13']"))).build().perform();
		
		//Thread.sleep(3000);
		//driver.findElement(By.xpath("//div[@id='ui-id-14']")).click();
		
		WebElement menu = driver.findElement(By.xpath("//div[@id='ui-id-9']"));
		WebElement Submenu = driver.findElement(By.xpath("//div[@id='ui-id-13']"));
		
		Actions action = new Actions(driver);
		action.moveToElement(menu).build().perform();
		Thread.sleep(3000);
		action.moveToElement(Submenu).build().perform();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@id='ui-id-14']")).click();
		
		//Submenu.click();
		
		

	}

}
