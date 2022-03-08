package frames;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {



	public static void main(String[] args) throws InterruptedException {


		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+("\\Drivers\\chromedriver.exe"));

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("http://www.leafground.com/pages/frame.html");
		//WebElement findElement = driver.findElement(By.xpath("//*[@id=\"wrapframe\"]/iframe"));
		WebElement findElement2 = driver.findElement(By.xpath("//iframe[@src='default.html']"));
		
		driver.switchTo().frame(findElement2);
		WebElement frame1 = driver.findElement(By.id("Click"));
		frame1.click();
		System.out.println(frame1.getText());

		driver.switchTo().defaultContent();
		WebElement findElement = driver.findElement(By.xpath("//iframe[@src='page.html']"));
		driver.switchTo().frame(findElement);
		driver.switchTo().frame("frame2");
		//driver.switchTo().frame(1);
		//driver.switchTo().frame(0);
		WebElement frame2 = driver.findElement(By.id("Click1"));
		frame2.click();
		Thread.sleep(3000);
	//	driver.switchTo().parentFrame();
		//driver.switchTo().parentFrame();
		
		driver.switchTo().defaultContent();
		

		List<WebElement> size = driver.findElements(By.tagName("iframe"));
		System.out.println(size.size());






	}
















}
