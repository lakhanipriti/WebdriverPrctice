package Webdriver;


import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;




public class Navigation {

	public static void main(String[] args) throws IOException {
	
	System.setProperty("webdriver.chrome.driver", "C:/Users/Pritil/Downloads/chromedriver_win32(1)/chromedriver.exe");
	WebDriver driver=	new ChromeDriver();
	

		
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	
	driver.get("http://google.com");
		
	//driver.navigate().to("https://www.toolsqa.com/automation-practice-form/");
	//driver.navigate().back();
	//driver.navigate().forward();
	//driver.navigate().back();
	
	File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(src, new File("D:/Priti Lakhani/Automation Practice/WebDriverPractice/google.png"));
			
	}

}
