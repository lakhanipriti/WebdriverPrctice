package Webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class openbrowser {
	
	public static void main(String[] args){
		
		//System.setProperty("webdriver.geckodriver.driver", "C:/Users/Pritil/Downloads/geckodriver-v0.24.0-win64(1)/geckodriver.exe");
		//WebDriver driver = new FirefoxDriver();
		
		System.setProperty("webdriver.chrome.driver", "C:/Users/Pritil/Downloads/chromedriver_win32(1)/chromedriver.exe");
		WebDriver driver	= new ChromeDriver();
		driver.get("http://www.google.com");
		
		String title = driver.getTitle();
		System.out.println(title);
		
		if(title.equals("Google")){
			System.out.println("title is correct");
		}
		else{
			System.out.println("title is incorrect");
		}
	System.out.println(driver.getCurrentUrl());
	System.out.println(driver.getPageSource());
	
	driver.quit();
	}
}
	
