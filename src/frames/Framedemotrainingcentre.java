package frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Framedemotrainingcentre {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+("\\Drivers\\chromedriver.exe"));

		//System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\eclipse-workspace\\Selenium_training_centre\\Drivers\\chromedriver.exe")

		WebDriver driver = new ChromeDriver();

		driver.get("http://demo.automationtesting.in/Frames.html");

		//driver.switchTo().frame(0);   // index used
		//WebElement webelement = driver.findElement(By.xpath("//iframe[@id='singleframe']"));// it is using webelement name or id also use xpath
		driver.switchTo().frame("singleframe");  // it is used to string id or name


		WebElement byindex = driver.findElement(By.xpath("(//input[@type='text'])[1]"));
		byindex.sendKeys("hai iam here");

		//driver.switchTo().parentFrame();// the parent frame is used for one step backfrom current frame

		driver.switchTo().defaultContent();// in this method s used to straigt away come to native html


		WebElement clicknestedframe = driver.findElement(By.linkText("Iframe with in an Iframe"));
		clicknestedframe.click();
		Thread.sleep(3000);

		driver.switchTo().frame(1);
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("finish");

		driver.switchTo().defaultContent();

		WebElement click = driver.findElement(By.linkText("SwitchTo"));
		click.click();









	}




}
