 package locaters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Name_id_xpath {

	public static void main(String[] args) throws InterruptedException {


		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\eclipse-workspace\\Selenium_training_centre\\Drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/");

		WebElement search = driver.findElement(By.name("q"));
		search.sendKeys("facebook");

		Thread.sleep(3000);
		WebElement clickfb = driver.findElement(By.name("btnK"));
		clickfb.click();

		WebElement gotologin = driver.findElement(By.xpath("//h3[text()='Facebook - Log In or Sign Up']"));
		gotologin.click();

		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("niz");

		WebElement password = driver.findElement(By.name("pass"));
		password.sendKeys("123445");
		Thread.sleep(3000);
		
//		WebElement login = driver.findElement(By.xpath("//button[contains(@class,'selected ')]"));
//		login.click();
//		Thread.sleep(3000);

		//WebElement forgotpswd = driver.findElement(By.xpath("//a[text()='Forgotten password?']"));
		//forgotpswd.click();
		
		WebElement createaccount = driver.findElement(By.xpath("(//a[contains(@class,'selected ')])[2]"));
		createaccount.click();
		Thread.sleep(3000);
		
		System.out.println(driver.getTitle());
		
		String pagesourse = driver.getPageSource();
		System.out.println(pagesourse);
		
		
		
		//WebElement text = driver.findElement(By.xpath("//h2[contains(.,'connect ')]"));
      // System.out.println(text.getText());
        
		driver.quit();
























	}




}
