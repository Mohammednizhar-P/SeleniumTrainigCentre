package screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshotdemo1 {
	
	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\eclipse-workspace\\Selenium_training_centre\\Drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		WebElement findElement = driver.findElement(By.xpath("//div[@class='_8esn']")); // section or portion element
		WebElement findElement2 = driver.findElement(By.xpath("(//div[@class='_6lux'])[2]")); // single element
		
	    TakesScreenshot screen =(TakesScreenshot) driver;  // full web page
	    
		File screenshotAs = findElement2.getScreenshotAs(OutputType.FILE);
		
		File store = new File("C:\\Users\\hp\\eclipse-workspace\\Selenium_training_centre\\exception snap\\imgn.png");
		
	    FileHandler.copy(screenshotAs, store);
	
		
		driver.quit();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	

}
