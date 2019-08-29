package Webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;



public class FormPractice {

	public static void main(String[] args) {

	System.setProperty("webdriver.chrome.driver", "C:/Users/Pritil/Downloads/chromedriver_win32(1)/chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	
	driver.get("https://www.toolsqa.com/automation-practice-form/");
	
	driver.findElement(By.xpath("//input[contains(@name,'firstname')]")).sendKeys("Tom");
	driver.findElement(By.xpath("//input[@id='lastname']")).sendKeys("Peter");
	//driver.findElement(By.linkText("Link Test")).click();
	//driver.findElement(By.partialLinkText("Partial Link Test")).click();
	//driver.findElement(By.id("buttonwithclass")).click();
	//Thread.sleep(3000);
	driver.findElement(By.xpath(" //input[@id='sex-0']")).click();
	driver.findElement(By.xpath("//input[@id='exp-1']")).click();
	Select select = new Select(driver.findElement(By.cssSelector("#continents")));
	select.selectByVisibleText("Europe");

	//driver.findElement(By.xpath("//div[20]")).click();
	

	
	}

}
