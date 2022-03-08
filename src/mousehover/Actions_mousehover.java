 package mousehover;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actions_mousehover {
	
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+("\\Drivers\\chromedriver.exe"));
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		
		WebElement xclick = driver.findElement(By.xpath("//button[.='✕']"));
		xclick.click();
		
		
		Actions mousehover = new Actions(driver);
		
		WebElement mouse = driver.findElement(By.xpath("(//div[.='Electronics'])[2]"));
		
		mousehover.moveToElement(mouse).perform();
		
		WebElement findElement = driver.findElement(By.linkText("Cameras & Accessories"));
		findElement.click();
		Thread.sleep(3000);
		
		WebElement mouse2 = driver.findElement(By.xpath("//span[.='Electronics']"));
		mousehover.moveToElement(mouse2).perform();
		
		Thread.sleep(3000);
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	

}
