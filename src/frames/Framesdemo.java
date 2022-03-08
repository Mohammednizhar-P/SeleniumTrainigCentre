package frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Framesdemo {


	public static void main(String[] args) throws InterruptedException {


		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\eclipse-workspace\\Selenium_training_centre\\Drivers\\chromedriver.exe");


		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://letcode.in/frame");

		driver.switchTo().frame("firstFr");

		WebElement sendname = driver.findElement(By.name("fname"));
		Thread.sleep(3000);
		sendname.sendKeys("nizharece");
		WebElement sendemail = driver.findElement(By.name("lname"));
		sendemail.sendKeys("nizharece@gmail.com");
		
		WebElement innerframe = driver.findElement(By.xpath("//iframe[@src='innerFrame']"));
		driver.switchTo().frame(innerframe);
		Thread.sleep(3000);
		WebElement mail = driver.findElement(By.name("email"));
		Thread.sleep(3000);
		mail.sendKeys("sfkhskfhkfhks");
		
		
		driver.switchTo().defaultContent();
		
		WebElement defaultt = driver.findElement(By.xpath("//a[@class='card-footer-item']"));
		Thread.sleep(3000);
		defaultt.click();





		Thread.sleep(3000);











		driver.quit();













	}


}
