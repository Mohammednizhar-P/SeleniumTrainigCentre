package scrollupand_scrolldown;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrollupanddown {
	
	
	public static void main(String[] args) throws InterruptedException {
		
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\eclipse-workspace\\Selenium_training_centre\\Drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.co.in/");
		
		WebElement search = driver.findElement(By.name("q"));
		search.sendKeys("google"+Keys.ENTER);
		
		JavascriptExecutor scroll = (JavascriptExecutor) driver;
		
		// it is a scrooll some position
		
		
		
		 scroll.executeScript("window.scroll(0,500)", ""); Thread.sleep(3000);
		 scroll.executeScript("window.scroll(0,-500)", ""); Thread.sleep(3000);
		 
		
		
		// page full down and full up 
		
		
		 scroll.executeScript("window.scrollTo(0,document.body.scrollHeight)", "");
		 Thread.sleep(3000); 
		 scroll.executeScript("window.scrollTo(0,0)","");
		 
		
		
	//	go to aspecified element position
		
		
		WebElement element = driver.findElement(By.xpath("(//h3[@class='LC20lb MBeuO DKV0Md'])[5]"));
		Thread.sleep(3000);
		scroll.executeScript("arguments[0].scrollIntoView();", element);
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
