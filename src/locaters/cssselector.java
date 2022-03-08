package locaters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class cssselector {
	
	public static void main(String[] args) {
		
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\eclipse-workspace\\Selenium_training_centre\\Drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		
		WebElement cssselector = driver.findElement(By.cssSelector("h2[class=_8eso]"));
		
	    System.out.println(cssselector.getText());
		
		WebElement tagname = driver.findElement(By.cssSelector("input[type=text]"));
		tagname.sendKeys("iuwuwwuwiwi");
		
		
		
		
	}
	
	
	

}
