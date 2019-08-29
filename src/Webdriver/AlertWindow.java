package Webdriver;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class AlertWindow {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:/Users/Pritil/Downloads/chromedriver_win32(1)/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.toolsqa.com/handling-alerts-using-selenium-webdriver/");
		
		WebElement element = driver.findElement(By.xpath("//button[contains(text(),'Simple Alert')]"));
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", element);	
	
		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		
		String text =alert.getText();
		if(text.equals("A simple Alert")){
			System.out.println("correct alert message");
		}
		else{
			System.out.println("incorrect alert message");
			
			alert.accept();
		}
	
	}

}
