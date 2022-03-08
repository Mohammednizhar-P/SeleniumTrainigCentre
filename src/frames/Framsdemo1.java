package frames;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Framsdemo1 {

	public static void main(String[] args) throws InterruptedException {


		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\eclipse-workspace\\Selenium_training_centre\\Drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leafground.com/pages/frame.html");

		driver.switchTo().frame(0);

		WebElement clickframe = driver.findElement(By.id("Click"));
		clickframe.click();
		System.out.println(clickframe.getText());

		driver.switchTo().defaultContent();

		driver.switchTo().frame(1);
		driver.switchTo().frame("frame2");
		WebElement nestedframe = driver.findElement(By.id("Click1"));
		Thread.sleep(3000);
		nestedframe.click();
		Thread.sleep(3000);
		
		driver.switchTo().defaultContent();
		
		List<WebElement> iframesize = driver.findElements(By.tagName("iframe"));
		int size = iframesize.size();
		System.out.println(size);
		
		
		
		





		driver.quit();		
	}





}
