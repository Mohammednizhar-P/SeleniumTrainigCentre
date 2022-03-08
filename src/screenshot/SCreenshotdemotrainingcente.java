package screenshot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class SCreenshotdemotrainingcente {
	
	
	public static void main(String[] args) throws IOException {
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\eclipse-workspace\\Selenium_training_centre\\Drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.leafground.com/pages/Edit.html");
		WebElement sendemail = driver.findElement(By.id("email"));
		sendemail.sendKeys("nizhar123");
		
		WebElement parelementscreen = driver.findElement(By.xpath("(//input[@type='text'])[2]"));  // particular element
		
		WebElement portionscreenshot = driver.findElement(By.xpath("//section[@class='innerblock']")); // particular portion
		
		TakesScreenshot screenshot =(TakesScreenshot) driver;
		
		File snap = portionscreenshot.getScreenshotAs(OutputType.FILE);
		
		File file = new File("C:\\Users\\hp\\eclipse-workspace\\Selenium_training_centre\\screensnap\\por.png");
		
		FileUtils.copyFile(snap, file); // and we can take fullpage
		FileHandler.copy(snap, file);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
