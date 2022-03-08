package alert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.TargetLocator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertDemotrainingcentre {


	public static void main(String[] args) throws InterruptedException {


		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\eclipse-workspace\\Selenium_training_centre\\Drivers\\chromedriver.exe" );

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();


		driver.get("http://demo.automationtesting.in/Alerts.html");

		// simplealert

		WebElement simplealert = driver.findElement(By.xpath("//button[@class='btn btn-danger']"));
		simplealert.click();
		TargetLocator switchTo = driver.switchTo();
		switchTo.alert().accept();
		Thread.sleep(3000);

		//conformalert

		WebElement confirmalert = driver.findElement(By.xpath("(//a[@class='analystic'])[2]"));
		confirmalert.click();
		WebElement clickconformbox = driver.findElement(By.xpath("//button[@class='btn btn-primary']"));
		clickconformbox.click();
		Thread.sleep(5000);
		Alert alert = driver.switchTo().alert();
		alert.accept();

		//promptalert


		WebElement promptalert = driver.findElement(By.xpath("(//a[@class='analystic'])[3]"));
		promptalert.click();
		WebElement promptalert1 = driver.findElement(By.xpath("//button[@class='btn btn-info']"));
		promptalert1.click();
		Thread.sleep(5000);
		Alert alert2 = driver.switchTo().alert();
		alert2.sendKeys("mohammednizhar");
		Thread.sleep(3000);
		alert2.accept();
		Thread.sleep(5000);
		
		WebElement findElement = driver.findElement(By.id("demo1"));
		System.out.println(findElement.getText());

		driver.quit();

















	}	
















}
