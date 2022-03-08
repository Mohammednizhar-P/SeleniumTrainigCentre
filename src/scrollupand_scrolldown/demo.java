package scrollupand_scrolldown;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo {
	
	
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://echoecho.com/htmlforms.htm");
		
		
		JavascriptExecutor execute =(JavascriptExecutor) driver;
//		execute.executeScript("window.scroll(0,2345)","");
//		Thread.sleep(3000);
//		execute.executeScript("window.scroll(0,-2345)","");
//		
	execute.executeScript("window.scrollTo(0,document.body.scrollHeight)","");
//		Thread.sleep(3000);
	//	execute.executeScript("window.scrollTo(0,0)","");

		
		
		WebElement scrollToElement = driver.findElement(By.xpath("//span[@class='link']"));
		Thread.sleep(3000);
		execute.executeScript("arguments[0].scrollIntoView();", scrollToElement );
		scrollToElement.click();
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
