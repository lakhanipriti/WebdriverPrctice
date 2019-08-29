package Webdriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleFrames {

	public static void main(String[] args) throws InterruptedException {
		
	System.setProperty("webdriver.chrome.driver", "C:/Users/Pritil/Downloads/chromedriver_win32(1)/chromedriver.exe");	
	WebDriver driver = new ChromeDriver ();
	
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();

	driver.get("https://www.toolsqa.com/iframe-practice-page/");
	
	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("window.scrollBy(0,1050)", "");
	Thread.sleep(2000);

	driver.switchTo().frame("iframe2");

	driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);

	//driver.findElement(By.id("//Frame[@id='IF2']")).click();
	driver.findElement(By.linkText("Sortable")).click();
	JavascriptExecutor js1 = (JavascriptExecutor) driver;
	js1.executeScript("window.scrollBy(0,1050)", "");

	}

}
