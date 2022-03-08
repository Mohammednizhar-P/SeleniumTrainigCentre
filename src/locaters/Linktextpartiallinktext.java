package locaters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Linktextpartiallinktext {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\eclipse-workspace\\Selenium_training_centre\\Drivers\\chromedriver.exe");
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		
		driver.get("https://www.amazon.in/");
		
		WebElement linktext = driver.findElement(By.linkText("Mobiles"));
		linktext.click();
		
		WebElement partiallinktext = driver.findElement(By.partialLinkText("Customer "));
		partiallinktext.click();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	

}
