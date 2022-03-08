package locaters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NameIdXpath {


	public static void main(String[] args) {


		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\eclipse-workspace\\Selenium_training_centre\\Drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://opensource-demo.orangehrmlive.com/");

		WebElement username = driver.findElement(By.id("txtUsername"));
		username.sendKeys("Admin");

		WebElement password = driver.findElement(By.name("txtPassword"));
		password.sendKeys("admin123");

		WebElement login = driver.findElement(By.xpath("//input[@id='btnLogin']"));
		login.click();

		WebElement forgotpassword =	driver.findElement(By.xpath("//a[text()='Forgot your password?']"));
		forgotpassword.click();

		String currenturl = driver.getCurrentUrl();
		System.out.println(currenturl);

		String currenttitle = driver.getTitle();
		System.out.println(currenttitle);

		driver.quit();

















	}








}
