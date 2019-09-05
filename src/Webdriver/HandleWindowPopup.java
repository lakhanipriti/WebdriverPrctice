package Webdriver;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class HandleWindowPopup {

	public static void main(String[] args) throws InterruptedException {

	System.setProperty("webdriver.chrome.driver","C:/Users/Pritil/Downloads/chromedriver_win32(1)/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	
	driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	
	driver.get("https://www.toolsqa.com/automation-practice-switch-windows/");
	
	driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[5]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/p[3]/button[1]")).click();
	Thread.sleep(5000);
	
	Set<String> handler = driver.getWindowHandles();
	
	Iterator<String> it = handler.iterator();
	
	String ParentWindowId = it.next();
	System.out.println("Parent winde Id is" + ParentWindowId);
	Thread.sleep(3000);
	
	String ChildWindowId= it.next();
	System.out.println("Child window Id" + ChildWindowId);
	
	driver.switchTo().window(ChildWindowId);
	Thread.sleep(3000);
	
	System.out.println("child Window Popup Title" + driver.getTitle() );
	
	driver.close();
	
	driver.switchTo().window(ParentWindowId);
	System.out.println("Parent Window Popup Title" + driver.getTitle());
	
	
	
	
	
	
	
		

	}

}
